package af5;

/* loaded from: classes9.dex */
public final class f0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22083xfb22b3f0 f86107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f86108f;

    public f0(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22083xfb22b3f0 c22083xfb22b3f0, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f86106d = view;
        this.f86107e = c22083xfb22b3f0;
        this.f86108f = f9Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f86106d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22083xfb22b3f0 c22083xfb22b3f0 = this.f86107e;
        af5.c0 c0Var = c22083xfb22b3f0.f286161f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        int width = ((af5.d0) c0Var).b().getWidth();
        af5.c0 c0Var2 = c22083xfb22b3f0.f286161f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        int height = ((af5.d0) c0Var2).b().getHeight();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5624x5afcc802 c5624x5afcc802 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5624x5afcc802();
        am.tg tgVar = c5624x5afcc802.f135951g;
        tgVar.f89537a = this.f86108f;
        tgVar.f89541e = width;
        tgVar.f89542f = height;
        af5.c0 c0Var3 = c22083xfb22b3f0.f286161f;
        if (c0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        tgVar.f89538b = ((af5.d0) c0Var3).b();
        af5.c0 c0Var4 = c22083xfb22b3f0.f286161f;
        if (c0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        em.r rVar = ((af5.d0) c0Var4).f86095a;
        if (rVar.f336270e == null) {
            rVar.f336270e = (android.widget.ProgressBar) rVar.f336266a.findViewById(com.p314xaae8f345.mm.R.id.ucs);
        }
        android.widget.ProgressBar progressBar = rVar.f336270e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(progressBar, "getLocationMapProgressBar(...)");
        tgVar.f89540d = progressBar;
        af5.c0 c0Var5 = c22083xfb22b3f0.f286161f;
        if (c0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        em.r rVar2 = ((af5.d0) c0Var5).f86095a;
        if (rVar2.f336269d == null) {
            rVar2.f336269d = (android.widget.ImageView) rVar2.f336266a.findViewById(com.p314xaae8f345.mm.R.id.ucr);
        }
        android.widget.ImageView imageView = rVar2.f336269d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getLocationMapPinMark(...)");
        tgVar.f89539c = imageView;
        c5624x5afcc802.e();
        return true;
    }
}
