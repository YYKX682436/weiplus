package tl4;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl4.l f501846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.tp0 f501848f;

    public i(tl4.l lVar, java.lang.String str, bw5.tp0 tp0Var) {
        this.f501846d = lVar;
        this.f501847e = str;
        this.f501848f = tp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qk.b9 b9Var = (qk.b9) i95.n0.c(qk.b9.class);
        com.p314xaae8f345.p3118xeeebfacc.C26845xac206036 c26845xac206036 = this.f501846d.f501854e;
        ef0.q3 q3Var = (ef0.q3) b9Var;
        q3Var.getClass();
        java.lang.String listenId = this.f501847e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenId, "listenId");
        java.util.Iterator it = q3Var.f333840e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83 serviceC18717xf3b2cd83 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2291x62f6fe4.ServiceC18717xf3b2cd83) ((rl4.a) it.next());
            serviceC18717xf3b2cd83.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(serviceC18717xf3b2cd83.f256233w, c26845xac206036)) {
                serviceC18717xf3b2cd83.B = listenId;
                bw5.tp0 tp0Var = this.f501848f;
                serviceC18717xf3b2cd83.C = tp0Var;
                java.lang.String str = serviceC18717xf3b2cd83.D;
                java.lang.String str2 = serviceC18717xf3b2cd83.E;
                if (tp0Var != null) {
                    str = serviceC18717xf3b2cd83.D + " - " + serviceC18717xf3b2cd83.E;
                    bw5.tp0 tp0Var2 = serviceC18717xf3b2cd83.C;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tp0Var2);
                    str2 = tp0Var2.f115107h[3] ? tp0Var2.f115105f : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getText(...)");
                }
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r rVar = serviceC18717xf3b2cd83.F;
                rVar.e("android.media.metadata.DISPLAY_TITLE", str);
                rVar.d("android.media.metadata.TITLE", str);
                rVar.d("android.media.metadata.ARTIST", str2);
                rVar.e("android.media.metadata.DISPLAY_SUBTITLE", str2);
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = serviceC18717xf3b2cd83.f256225o;
                if (f0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSession");
                    throw null;
                }
                f0Var.g(serviceC18717xf3b2cd83.F.a());
                serviceC18717xf3b2cd83.k(serviceC18717xf3b2cd83.f256235y, serviceC18717xf3b2cd83.f256234x);
            }
        }
    }
}
