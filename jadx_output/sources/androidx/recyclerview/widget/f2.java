package androidx.recyclerview.widget;

/* loaded from: classes10.dex */
public abstract class f2 {
    private final androidx.recyclerview.widget.g2 mObservable = new androidx.recyclerview.widget.g2();
    private boolean mHasStableIds = false;

    public final void bindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        k3Var.mPosition = i17;
        if (hasStableIds()) {
            k3Var.mItemId = getItemId(i17);
        }
        k3Var.setFlags(1, md1.e1.CTRL_INDEX);
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a("RV OnBindView");
        onBindViewHolder(k3Var, i17, k3Var.getUnmodifiedPayloads());
        k3Var.clearPayload();
        android.view.ViewGroup.LayoutParams layoutParams = k3Var.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams) {
            ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams).f11917f = true;
        }
        j3.t.b();
    }

    public final androidx.recyclerview.widget.k3 createViewHolder(android.view.ViewGroup viewGroup, int i17) {
        try {
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a("RV CreateView");
            androidx.recyclerview.widget.k3 onCreateViewHolder = onCreateViewHolder(viewGroup, i17);
            if (onCreateViewHolder.itemView.getParent() != null) {
                throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            onCreateViewHolder.mItemViewType = i17;
            j3.t.b();
            return onCreateViewHolder;
        } catch (java.lang.Throwable th6) {
            java.lang.reflect.Method method2 = j3.v.f297343b;
            j3.t.b();
            throw th6;
        }
    }

    public int getCount() {
        return getItemCount();
    }

    public abstract int getItemCount();

    public long getItemId(int i17) {
        return -1L;
    }

    public int getItemViewType(int i17) {
        return 0;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i17) {
        this.mObservable.d(i17, 1, null);
    }

    public final void notifyItemInserted(int i17) {
        this.mObservable.e(i17, 1);
    }

    public final void notifyItemMoved(int i17, int i18) {
        this.mObservable.c(i17, i18);
    }

    public final void notifyItemRangeChanged(int i17, int i18) {
        this.mObservable.d(i17, i18, null);
    }

    public final void notifyItemRangeInserted(int i17, int i18) {
        this.mObservable.e(i17, i18);
    }

    public final void notifyItemRangeRemoved(int i17, int i18) {
        this.mObservable.f(i17, i18);
    }

    public final void notifyItemRemoved(int i17) {
        this.mObservable.f(i17, 1);
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17);

    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List<java.lang.Object> list) {
        onBindViewHolder(k3Var, i17);
    }

    public abstract androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17);

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(androidx.recyclerview.widget.k3 k3Var) {
        return false;
    }

    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
    }

    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
    }

    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
    }

    public void p(int i17) {
        notifyItemChanged(i17);
    }

    public void q(int i17) {
        notifyItemInserted(i17);
    }

    public void r(int i17, int i18) {
        notifyItemRangeInserted(i17, i18);
    }

    public void registerAdapterDataObserver(androidx.recyclerview.widget.h2 h2Var) {
        this.mObservable.registerObserver(h2Var);
    }

    public void setHasStableIds(boolean z17) {
        if (hasObservers()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z17;
    }

    public void unregisterAdapterDataObserver(androidx.recyclerview.widget.h2 h2Var) {
        this.mObservable.unregisterObserver(h2Var);
    }

    public void w(int i17) {
        notifyItemRemoved(i17);
    }

    public final void notifyItemChanged(int i17, java.lang.Object obj) {
        this.mObservable.d(i17, 1, obj);
    }

    public final void notifyItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        this.mObservable.d(i17, i18, obj);
    }
}
