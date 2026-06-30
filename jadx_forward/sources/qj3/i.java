package qj3;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f445433d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f445434e;

    /* renamed from: f, reason: collision with root package name */
    public final bu3.f f445435f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f445436g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f445437h;

    public i(android.view.ViewGroup viewGroup, ju3.d0 status) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f445433d = status;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f445436g = relativeLayout;
        sj3.n3 n3Var = sj3.o3.f490199e;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (n3Var.a(context) != 90) {
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            if (n3Var.a(context2) != 270) {
                z17 = false;
                bu3.f fVar = new bu3.f(z17, relativeLayout);
                this.f445435f = fVar;
                fVar.f106129f = status;
                android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d7o);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
                this.f445437h = imageView;
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
                imageView.setOnClickListener(this);
            }
        }
        z17 = true;
        bu3.f fVar2 = new bu3.f(z17, relativeLayout);
        this.f445435f = fVar2;
        fVar2.f106129f = status;
        android.view.View findViewById22 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.d7o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById22, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById22;
        this.f445437h = imageView2;
        imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView2.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
        imageView2.setOnClickListener(this);
    }

    public final void a() {
        boolean z17 = this.f445434e;
        bu3.f fVar = this.f445435f;
        if (z17) {
            if (fVar == null) {
                return;
            }
            fVar.c(0);
        } else {
            if (fVar == null) {
                return;
            }
            fVar.c(4);
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
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f445434e;
        this.f445434e = z17;
        ju3.d0 d0Var = this.f445433d;
        android.widget.ImageView imageView = this.f445437h;
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
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f445434e = false;
        a();
        ju3.d0.k(this.f445433d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f445437h;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79713xe9b1e322, -1));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f445437h.setVisibility(i17);
        android.widget.RelativeLayout relativeLayout = this.f445436g;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(i17);
    }
}
