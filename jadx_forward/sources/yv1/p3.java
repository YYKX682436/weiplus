package yv1;

/* loaded from: classes12.dex */
public final class p3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public p3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5297xfbfc3e84) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.y3 y3Var = event.f135619g;
        long j17 = y3Var.f89958a;
        java.lang.String str = y3Var.f89960c;
        if (j17 > 0) {
            if (str == null) {
                str = "talker-ignore";
            }
            mt1.b0.f412724a.r(j17, str);
        } else if (str != null) {
            yv1.a0.a(new yv1.n3(str));
        } else {
            yv1.a0.a(yv1.o3.f547664d);
        }
        yv1.f1 f1Var = yv1.g1.f547573p;
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412735l = java.lang.System.currentTimeMillis();
        return true;
    }
}
