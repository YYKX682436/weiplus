package bp4;

/* loaded from: classes5.dex */
public final class t extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final eb5.d f23376a;

    /* renamed from: b, reason: collision with root package name */
    public int f23377b;

    /* renamed from: c, reason: collision with root package name */
    public int f23378c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.x f23379d;

    public t(bp4.x xVar, eb5.d adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f23379d = xVar;
        this.f23376a = adapter;
        this.f23377b = -1;
        this.f23378c = -1;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(recyclerView.getContext(), com.tencent.mm.R.anim.f477837cv);
        loadAnimation.setAnimationListener(new bp4.r(viewHolder, this, this.f23379d));
        viewHolder.itemView.startAnimation(loadAnimation);
    }

    @Override // androidx.recyclerview.widget.a1
    public float getMoveThreshold(androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return 0.295858f;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return androidx.recyclerview.widget.a1.makeMovementFlags(51, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isLongPressDragEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onChildDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.onChildDraw(c17, recyclerView, viewHolder, f17 / 1.3f, f18 / 1.3f, i17, z17);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        j33.d0.r(this.f23379d.f23417g, adapterPosition, adapterPosition2);
        this.f23376a.notifyItemMoved(adapterPosition, adapterPosition2);
        this.f23378c = adapterPosition2;
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var != null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(k3Var.itemView.getContext(), com.tencent.mm.R.anim.f477838cw);
            loadAnimation.setAnimationListener(new bp4.s(k3Var, i17, this));
            k3Var.itemView.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
