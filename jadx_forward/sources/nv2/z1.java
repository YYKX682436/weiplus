package nv2;

/* loaded from: classes2.dex */
public final class z1 extends nv2.g1 {

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f422175n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, long j17, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, nv2.i1 i1Var, r45.qt2 contextObj, byte[] bArr) {
        super(finderObject, j17, objectNonceId, z17, z18, i17, i18, i1Var, contextObj, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f422175n = bArr;
    }

    @Override // nv2.g1, nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f422024d;
        r45.nw1 m59258xd0557130 = c14994x9b99c079.m59258xd0557130();
        long m75942xfb822ef2 = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
        int i17 = this.f422027g ? 1 : 2;
        long m76784x5db1b11 = c14994x9b99c079.getFeedObject().m76784x5db1b11();
        java.lang.String nonceId = c14994x9b99c079.m59276x6c285d75();
        java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
        java.lang.String m76829x97edf6c0 = c14994x9b99c079.getFeedObject().m76829x97edf6c0();
        if (m76829x97edf6c0 == null) {
            m76829x97edf6c0 = "";
        }
        java.lang.String str = m76829x97edf6c0;
        byte[] bArr = this.f422175n;
        ((b92.d1) zbVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        r45.qt2 contextObj = this.f422031k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        new ek2.f0(db2.t4.f309704a.b(564, contextObj), bArr, m75942xfb822ef2, 0, m76784x5db1b11, 3, nonceId, m59229xb5af1dd5, xy2.c.f(contextObj), contextObj, i17, 3, 0L, null, str, 8192, null).l().K(new nv2.y1(this, callback));
    }
}
