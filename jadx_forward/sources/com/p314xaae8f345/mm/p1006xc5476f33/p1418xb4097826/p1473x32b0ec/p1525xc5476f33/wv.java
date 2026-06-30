package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wv implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f196528d;

    public wv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar) {
        this.f196528d = owVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = it.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f196528d;
        if (i17 == owVar.B) {
            owVar.E = false;
        } else if (i17 == owVar.C) {
            if (!owVar.F) {
                owVar.F = true;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) owVar.Y).mo141623x754a37bb()).d();
                if (!owVar.V) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) ((jz5.n) owVar.Y).mo141623x754a37bb();
                    long j17 = owVar.G;
                    b4Var.c(j17, j17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.t1(this.f196528d);
            java.lang.Object obj = it.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
            this.f196528d.R += ((java.lang.Long) obj).longValue();
        } else if (i17 == owVar.D) {
            owVar.W = false;
        }
        return true;
    }
}
