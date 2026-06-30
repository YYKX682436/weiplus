package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.g f246933a;

    public p0(int i17, long j17, int i18, java.lang.String str, int i19, long j18, int i27) {
        cl0.g gVar = new cl0.g();
        this.f246933a = gVar;
        try {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("cid", str);
            gVar2.o(dm.n.f67499xab3e7a9, i19);
            gVar2.p("stayTime", j18);
            gVar2.o("clickCount", i27);
            gVar.o(dm.n.f67499xab3e7a9, i17);
            gVar.p("stayTime", j17);
            gVar.o("clickCount", i18);
            gVar.h("btnInfo", gVar2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFullScreenFloatBarComp", th6.toString());
        }
    }
}
