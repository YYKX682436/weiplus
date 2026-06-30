package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class k3 {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = java.util.Collections.emptyList();
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final android.view.View itemView;
    int mFlags;
    java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
    androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    androidx.recyclerview.widget.k3 mShadowedHolder = null;
    androidx.recyclerview.widget.k3 mShadowingHolder = null;
    java.util.List<java.lang.Object> mPayloads = null;
    java.util.List<java.lang.Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    androidx.recyclerview.widget.z2 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public k3(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.itemView = view;
    }

    public void addChangePayload(java.lang.Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = java.util.Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i17) {
        this.mFlags = i17 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        java.util.List<java.lang.Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) == 0) {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.u0.i(view)) {
                return true;
            }
        }
        return false;
    }

    public void flagRemovedAndOffsetPosition(int i17, int i18, boolean z17) {
        addFlags(8);
        offsetPosition(i18, z17);
        this.mPosition = i17;
    }

    public final int getAdapterPosition() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.s0(this);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i17 = this.mPreLayoutPosition;
        return i17 == -1 ? this.mPosition : i17;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @java.lang.Deprecated
    public final int getPosition() {
        int i17 = this.mPreLayoutPosition;
        return i17 == -1 ? this.mPosition : i17;
    }

    public java.util.List<java.lang.Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        java.util.List<java.lang.Object> list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i17) {
        return (i17 & this.mFlags) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) == 0) {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.u0.i(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i17, boolean z17) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z17) {
            this.mPreLayoutPosition += i17;
        }
        this.mPosition += i17;
        if (this.itemView.getLayoutParams() != null) {
            ((androidx.recyclerview.widget.RecyclerView.LayoutParams) this.itemView.getLayoutParams()).f11917f = true;
        }
    }

    public void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i17 = this.mPendingAccessibilityState;
        if (i17 != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i17;
        } else {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            this.mWasImportantForAccessibilityBeforeHidden = n3.u0.c(view);
        }
        if (recyclerView.E0()) {
            this.mPendingAccessibilityState = 4;
            ((java.util.ArrayList) recyclerView.U1).add(this);
        } else {
            android.view.View view2 = this.itemView;
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.s(view2, 4);
        }
    }

    public void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView recyclerView) {
        int i17 = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.E0()) {
            this.mPendingAccessibilityState = i17;
            ((java.util.ArrayList) recyclerView.U1).add(this);
        } else {
            android.view.View view = this.itemView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.s(view, i17);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        androidx.recyclerview.widget.RecyclerView.R(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i17, int i18) {
        this.mFlags = (i17 & i18) | (this.mFlags & (~i18));
    }

    public final void setIsRecyclable(boolean z17) {
        int i17 = this.mIsRecyclableCount;
        int i18 = z17 ? i17 - 1 : i17 + 1;
        this.mIsRecyclableCount = i18;
        if (i18 < 0) {
            this.mIsRecyclableCount = 0;
            toString();
        } else if (!z17 && i18 == 1) {
            this.mFlags |= 16;
        } else if (z17 && i18 == 0) {
            this.mFlags &= -17;
        }
    }

    public void setScrapContainer(androidx.recyclerview.widget.z2 z2Var, boolean z17) {
        this.mScrapContainer = z2Var;
        this.mInChangeScrap = z17;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ViewHolder{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
        if (isScrap()) {
            sb6.append(" scrap ");
            sb6.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb6.append(" invalid");
        }
        if (!isBound()) {
            sb6.append(" unbound");
        }
        if (needsUpdate()) {
            sb6.append(" update");
        }
        if (isRemoved()) {
            sb6.append(" removed");
        }
        if (shouldIgnore()) {
            sb6.append(" ignored");
        }
        if (isTmpDetached()) {
            sb6.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb6.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb6.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb6.append(" no parent");
        }
        sb6.append("}");
        return sb6.toString();
    }

    public void unScrap() {
        this.mScrapContainer.n(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
