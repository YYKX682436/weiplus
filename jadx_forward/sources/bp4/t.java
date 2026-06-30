package bp4;

/* loaded from: classes5.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final eb5.d f104909a;

    /* renamed from: b, reason: collision with root package name */
    public int f104910b;

    /* renamed from: c, reason: collision with root package name */
    public int f104911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.x f104912d;

    public t(bp4.x xVar, eb5.d adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f104912d = xVar;
        this.f104909a = adapter;
        this.f104910b = -1;
        this.f104911c = -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: clearView */
    public void mo8113xb4407692(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8113xb4407692(recyclerView, viewHolder);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(recyclerView.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559370cv);
        loadAnimation.setAnimationListener(new bp4.r(viewHolder, this, this.f104912d));
        viewHolder.f3639x46306858.startAnimation(loadAnimation);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMoveThreshold */
    public float mo8118xbee83fe4(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        return 0.295858f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        return p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(51, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isItemViewSwipeEnabled */
    public boolean mo8126x5b4a2f69() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onChildDraw */
    public void mo8128xf876e561(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        super.mo8128xf876e561(c17, recyclerView, viewHolder, f17 / 1.3f, f18 / 1.3f, i17, z17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int m8183xf806b362 = viewHolder.m8183xf806b362();
        int m8183xf806b3622 = target.m8183xf806b362();
        j33.d0.r(this.f104912d.f104950g, m8183xf806b362, m8183xf806b3622);
        this.f104909a.m8150x87567217(m8183xf806b362, m8183xf806b3622);
        this.f104911c = m8183xf806b3622;
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSelectedChanged */
    public void mo8134xb54743ba(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var != null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(k3Var.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559371cw);
            loadAnimation.setAnimationListener(new bp4.s(k3Var, i17, this));
            k3Var.f3639x46306858.startAnimation(loadAnimation);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
