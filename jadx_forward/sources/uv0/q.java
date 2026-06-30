package uv0;

/* loaded from: classes5.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f512878e;

    public q(uv0.u uVar, java.util.ArrayList arrayList) {
        this.f512877d = uVar;
        this.f512878e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uv0.f m170582xf939df19;
        uv0.u uVar = this.f512877d;
        m170582xf939df19 = uVar.m170582xf939df19();
        m170582xf939df19.y(this.f512878e);
        java.util.ArrayList arrayList = uVar.W;
        int i17 = uVar.f512884J.f521921d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = uVar.Q;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.n();
            int i18 = 0;
            for (java.lang.Object obj : arrayList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                vv0.j jVar = (vv0.j) obj;
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(uVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dg8, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.View");
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.q8e)).setText(jVar.f521914a);
                oa.i l17 = c2718xca2902ff.l();
                l17.d(inflate);
                c2718xca2902ff.d(l17, jVar.f521915b == i17);
                i18 = i19;
            }
        }
        uVar.S(uVar.f512884J, true);
    }
}
