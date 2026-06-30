package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19464x952eaadc f267728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f267730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19464x952eaadc c19464x952eaadc, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f267728d = c19464x952eaadc;
        this.f267729e = arrayList;
        this.f267730f = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.HashMap item = (java.util.HashMap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = (java.lang.String) item.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.Object obj2 = item.get("localMsgId");
        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null);
        if (!this.f267728d.f267655d.equals(str) || E1 < 0) {
            this.f267730f.f391645d = true;
        } else {
            this.f267729e.add(java.lang.Long.valueOf(E1));
        }
        return jz5.f0.f384359a;
    }
}
