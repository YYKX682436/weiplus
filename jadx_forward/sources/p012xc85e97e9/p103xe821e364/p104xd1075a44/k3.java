package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class k3 {

    /* renamed from: FLAG_ADAPTER_FULLUPDATE */
    static final int f3623xf26a62db = 1024;

    /* renamed from: FLAG_ADAPTER_POSITION_UNKNOWN */
    static final int f3624xafc25397 = 512;

    /* renamed from: FLAG_APPEARED_IN_PRE_LAYOUT */
    static final int f3625xf22d9de8 = 4096;

    /* renamed from: FLAG_BOUNCED_FROM_HIDDEN_LIST */
    static final int f3626x8d2ee194 = 8192;

    /* renamed from: FLAG_BOUND */
    static final int f3627x82505acb = 1;

    /* renamed from: FLAG_IGNORE */
    static final int f3628xd3390605 = 128;

    /* renamed from: FLAG_INVALID */
    static final int f3629xa043f004 = 4;

    /* renamed from: FLAG_MOVED */
    static final int f3630x82eb6000 = 2048;

    /* renamed from: FLAG_NOT_RECYCLABLE */
    static final int f3631x6ea6f2ab = 16;

    /* renamed from: FLAG_REMOVED */
    static final int f3632x6c88166d = 8;

    /* renamed from: FLAG_RETURNED_FROM_SCRAP */
    static final int f3633xdb6bb1f9 = 32;

    /* renamed from: FLAG_SET_A11Y_ITEM_DELEGATE */
    static final int f3634xab060cda = 16384;

    /* renamed from: FLAG_TMP_DETACHED */
    static final int f3635x15edefad = 256;

    /* renamed from: FLAG_UPDATE */
    static final int f3636xe82d40fc = 2;

    /* renamed from: FULLUPDATE_PAYLOADS */
    private static final java.util.List<java.lang.Object> f3637x5e162cec = java.util.Collections.emptyList();

    /* renamed from: PENDING_ACCESSIBILITY_STATE_NOT_SET */
    static final int f3638xba570acf = -1;

    /* renamed from: itemView */
    public final android.view.View f3639x46306858;

    /* renamed from: mFlags */
    int f3640xbe0d3a1a;

    /* renamed from: mNestedRecyclerView */
    java.lang.ref.WeakReference<p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4> f3645x8e83ad68;

    /* renamed from: mOwnerRecyclerView */
    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f3647x5256b0ea;

    /* renamed from: mPosition */
    int f3650x519040b6 = -1;

    /* renamed from: mOldPosition */
    int f3646x635aa5c3 = -1;

    /* renamed from: mItemId */
    long f3643x92b325b = -1;

    /* renamed from: mItemViewType */
    int f3644x45198bf = -1;

    /* renamed from: mPreLayoutPosition */
    int f3651x72565b09 = -1;

    /* renamed from: mShadowedHolder */
    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f3653x74cdf618 = null;

    /* renamed from: mShadowingHolder */
    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f3654xaa505ae1 = null;

    /* renamed from: mPayloads */
    java.util.List<java.lang.Object> f3648x775df832 = null;

    /* renamed from: mUnmodifiedPayloads */
    java.util.List<java.lang.Object> f3655x531cf674 = null;

    /* renamed from: mIsRecyclableCount */
    private int f3642x626c708c = 0;

    /* renamed from: mScrapContainer */
    p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 f3652xd0d8697d = null;

    /* renamed from: mInChangeScrap */
    boolean f3641x7d3c7c2f = false;

    /* renamed from: mWasImportantForAccessibilityBeforeHidden */
    private int f3656x6e507114 = 0;

    /* renamed from: mPendingAccessibilityState */
    int f3649x172925ed = -1;

    public k3(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.f3639x46306858 = view;
    }

    /* renamed from: addChangePayload */
    public void m8175x92fd649d(java.lang.Object obj) {
        if (obj == null) {
            m8176xb4f2c266(1024);
            return;
        }
        if ((1024 & this.f3640xbe0d3a1a) == 0) {
            if (this.f3648x775df832 == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.f3648x775df832 = arrayList;
                this.f3655x531cf674 = java.util.Collections.unmodifiableList(arrayList);
            }
            this.f3648x775df832.add(obj);
        }
    }

    /* renamed from: addFlags */
    public void m8176xb4f2c266(int i17) {
        this.f3640xbe0d3a1a = i17 | this.f3640xbe0d3a1a;
    }

    /* renamed from: clearOldPosition */
    public void m8177x29f283e3() {
        this.f3646x635aa5c3 = -1;
        this.f3651x72565b09 = -1;
    }

    /* renamed from: clearPayload */
    public void m8178xcfb08281() {
        java.util.List<java.lang.Object> list = this.f3648x775df832;
        if (list != null) {
            list.clear();
        }
        this.f3640xbe0d3a1a &= -1025;
    }

    /* renamed from: clearReturnedFromScrapFlag */
    public void m8179x969a8877() {
        this.f3640xbe0d3a1a &= -33;
    }

    /* renamed from: clearTmpDetachFlag */
    public void m8180x87c8d4c9() {
        this.f3640xbe0d3a1a &= -257;
    }

    /* renamed from: doesTransientStatePreventRecycling */
    public boolean m8181x4121b6b8() {
        if ((this.f3640xbe0d3a1a & 16) == 0) {
            android.view.View view = this.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.u0.i(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: flagRemovedAndOffsetPosition */
    public void m8182x627c739f(int i17, int i18, boolean z17) {
        m8176xb4f2c266(8);
        m8200xab4c1edc(i18, z17);
        this.f3650x519040b6 = i17;
    }

    /* renamed from: getAdapterPosition */
    public final int m8183xf806b362() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f3647x5256b0ea;
        if (c1163xf1deaba4 == null) {
            return -1;
        }
        return c1163xf1deaba4.s0(this);
    }

    /* renamed from: getItemId */
    public final long m8184x1ed62e84() {
        return this.f3643x92b325b;
    }

    /* renamed from: getItemViewType */
    public final int m8185xcdaf1228() {
        return this.f3644x45198bf;
    }

    /* renamed from: getLayoutPosition */
    public final int m8186xceeefb69() {
        int i17 = this.f3651x72565b09;
        return i17 == -1 ? this.f3650x519040b6 : i17;
    }

    /* renamed from: getOldPosition */
    public final int m8187x9323db3a() {
        return this.f3646x635aa5c3;
    }

    @java.lang.Deprecated
    /* renamed from: getPosition */
    public final int m8188xa86cd69f() {
        int i17 = this.f3651x72565b09;
        return i17 == -1 ? this.f3650x519040b6 : i17;
    }

    /* renamed from: getUnmodifiedPayloads */
    public java.util.List<java.lang.Object> m8189x6729fd1d() {
        if ((this.f3640xbe0d3a1a & 1024) != 0) {
            return f3637x5e162cec;
        }
        java.util.List<java.lang.Object> list = this.f3648x775df832;
        return (list == null || list.size() == 0) ? f3637x5e162cec : this.f3655x531cf674;
    }

    /* renamed from: hasAnyOfTheFlags */
    public boolean m8190x1d788e1f(int i17) {
        return (i17 & this.f3640xbe0d3a1a) != 0;
    }

    /* renamed from: isAdapterPositionUnknown */
    public boolean m8191x1471055c() {
        return (this.f3640xbe0d3a1a & 512) != 0 || m8193x5241396d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isBound */
    public boolean m8192x7a81e674() {
        return (this.f3640xbe0d3a1a & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isInvalid */
    public boolean m8193x5241396d() {
        return (this.f3640xbe0d3a1a & 4) != 0;
    }

    /* renamed from: isRecyclable */
    public final boolean m8194xa514c936() {
        if ((this.f3640xbe0d3a1a & 16) == 0) {
            android.view.View view = this.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.u0.i(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isRemoved */
    public boolean m8195x1e855fd6() {
        return (this.f3640xbe0d3a1a & 8) != 0;
    }

    /* renamed from: isScrap */
    public boolean m8196x7b6bf4c7() {
        return this.f3652xd0d8697d != null;
    }

    /* renamed from: isTmpDetached */
    public boolean m8197x46e8461f() {
        return (this.f3640xbe0d3a1a & 256) != 0;
    }

    /* renamed from: isUpdated */
    public boolean m8198xcf782831() {
        return (this.f3640xbe0d3a1a & 2) != 0;
    }

    /* renamed from: needsUpdate */
    public boolean m8199xc90585c6() {
        return (this.f3640xbe0d3a1a & 2) != 0;
    }

    /* renamed from: offsetPosition */
    public void m8200xab4c1edc(int i17, boolean z17) {
        if (this.f3646x635aa5c3 == -1) {
            this.f3646x635aa5c3 = this.f3650x519040b6;
        }
        if (this.f3651x72565b09 == -1) {
            this.f3651x72565b09 = this.f3650x519040b6;
        }
        if (z17) {
            this.f3651x72565b09 += i17;
        }
        this.f3650x519040b6 += i17;
        if (this.f3639x46306858.getLayoutParams() != null) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) this.f3639x46306858.getLayoutParams()).f93450f = true;
        }
    }

    /* renamed from: onEnteredHiddenState */
    public void m8201xfca98b4f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        int i17 = this.f3649x172925ed;
        if (i17 != -1) {
            this.f3656x6e507114 = i17;
        } else {
            android.view.View view = this.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            this.f3656x6e507114 = n3.u0.c(view);
        }
        if (c1163xf1deaba4.E0()) {
            this.f3649x172925ed = 4;
            ((java.util.ArrayList) c1163xf1deaba4.U1).add(this);
        } else {
            android.view.View view2 = this.f3639x46306858;
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.s(view2, 4);
        }
    }

    /* renamed from: onLeftHiddenState */
    public void m8202x65210ea1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        int i17 = this.f3656x6e507114;
        if (c1163xf1deaba4.E0()) {
            this.f3649x172925ed = i17;
            ((java.util.ArrayList) c1163xf1deaba4.U1).add(this);
        } else {
            android.view.View view = this.f3639x46306858;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(view, i17);
        }
        this.f3656x6e507114 = 0;
    }

    /* renamed from: resetInternal */
    public void m8203xd801892c() {
        this.f3640xbe0d3a1a = 0;
        this.f3650x519040b6 = -1;
        this.f3646x635aa5c3 = -1;
        this.f3643x92b325b = -1L;
        this.f3651x72565b09 = -1;
        this.f3642x626c708c = 0;
        this.f3653x74cdf618 = null;
        this.f3654xaa505ae1 = null;
        m8178xcfb08281();
        this.f3656x6e507114 = 0;
        this.f3649x172925ed = -1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.R(this);
    }

    /* renamed from: saveOldPosition */
    public void m8204x8cc9ab3() {
        if (this.f3646x635aa5c3 == -1) {
            this.f3646x635aa5c3 = this.f3650x519040b6;
        }
    }

    /* renamed from: setFlags */
    public void m8205x52fbaf45(int i17, int i18) {
        this.f3640xbe0d3a1a = (i17 & i18) | (this.f3640xbe0d3a1a & (~i18));
    }

    /* renamed from: setIsRecyclable */
    public final void m8206x3c5056b8(boolean z17) {
        int i17 = this.f3642x626c708c;
        int i18 = z17 ? i17 - 1 : i17 + 1;
        this.f3642x626c708c = i18;
        if (i18 < 0) {
            this.f3642x626c708c = 0;
            m8211x9616526c();
        } else if (!z17 && i18 == 1) {
            this.f3640xbe0d3a1a |= 16;
        } else if (z17 && i18 == 0) {
            this.f3640xbe0d3a1a &= -17;
        }
    }

    /* renamed from: setScrapContainer */
    public void m8207x80b394b2(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, boolean z17) {
        this.f3652xd0d8697d = z2Var;
        this.f3641x7d3c7c2f = z17;
    }

    /* renamed from: shouldBeKeptAsChild */
    public boolean m8208x20b73616() {
        return (this.f3640xbe0d3a1a & 16) != 0;
    }

    /* renamed from: shouldIgnore */
    public boolean m8209xa033ad65() {
        return (this.f3640xbe0d3a1a & 128) != 0;
    }

    /* renamed from: stopIgnoring */
    public void m8210x60153831() {
        this.f3640xbe0d3a1a &= -129;
    }

    /* renamed from: toString */
    public java.lang.String m8211x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ViewHolder{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.f3650x519040b6 + " id=" + this.f3643x92b325b + ", oldPos=" + this.f3646x635aa5c3 + ", pLpos:" + this.f3651x72565b09);
        if (m8196x7b6bf4c7()) {
            sb6.append(" scrap ");
            sb6.append(this.f3641x7d3c7c2f ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m8193x5241396d()) {
            sb6.append(" invalid");
        }
        if (!m8192x7a81e674()) {
            sb6.append(" unbound");
        }
        if (m8199xc90585c6()) {
            sb6.append(" update");
        }
        if (m8195x1e855fd6()) {
            sb6.append(" removed");
        }
        if (m8209xa033ad65()) {
            sb6.append(" ignored");
        }
        if (m8197x46e8461f()) {
            sb6.append(" tmpDetached");
        }
        if (!m8194xa514c936()) {
            sb6.append(" not recyclable(" + this.f3642x626c708c + ")");
        }
        if (m8191x1471055c()) {
            sb6.append(" undefined adapter position");
        }
        if (this.f3639x46306858.getParent() == null) {
            sb6.append(" no parent");
        }
        sb6.append("}");
        return sb6.toString();
    }

    /* renamed from: unScrap */
    public void m8212xedae80b8() {
        this.f3652xd0d8697d.n(this);
    }

    /* renamed from: wasReturnedFromScrap */
    public boolean m8213xd93a794f() {
        return (this.f3640xbe0d3a1a & 32) != 0;
    }
}
