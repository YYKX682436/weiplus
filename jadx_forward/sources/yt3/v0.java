package yt3;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f547228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f547229e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de f547230f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f547231g;

    public v0(android.view.ViewGroup viewGroup, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547228d = status;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de) findViewById;
        this.f547230f = c17001x433744de;
        c17001x433744de.m67922x231a26f4(status);
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f547231g = imageView;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
        imageView.setOnClickListener(this);
    }

    public final void a() {
        boolean z17 = this.f547229e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1992xb0f4c919.C17001x433744de c17001x433744de = this.f547230f;
        if (z17) {
            c17001x433744de.mo9067x901b6914(0);
        } else {
            c17001x433744de.mo9067x901b6914(4);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f547229e;
        this.f547229e = z17;
        ju3.d0 d0Var = this.f547228d;
        android.widget.ImageView imageView = this.f547231g;
        if (z17) {
            nu3.i iVar = nu3.i.f421751a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, imageView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)));
            ju3.d0.k(d0Var, ju3.c0.I1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.M1, null, 2, null);
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
        }
        a();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f547229e = false;
        a();
        ju3.d0.k(this.f547228d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f547231g;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547231g.setVisibility(i17);
    }
}
