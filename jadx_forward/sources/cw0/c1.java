package cw0;

/* loaded from: classes5.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f304152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.d1 f304153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f304154f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, cw0.d1 d1Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f304152d = c4128x879fba0a;
        this.f304153e = d1Var;
        this.f304154f = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw0.c1(this.f304152d, this.f304153e, this.f304154f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw0.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        java.nio.FloatBuffer floatBuffer;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cw0.d1 d1Var = this.f304153e;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = d1Var.f304156a;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f304152d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = c4128x879fba0a2.m33971xf922bec1(c4128x879fba0a) ? new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, d1Var.f304156a) : new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, c4128x879fba0a2);
        dx0.o.c(c4129xdee64553);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f304154f;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4135x3d421c24 c4135x3d421c24 = new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4135x3d421c24(c4181x2248e1a3);
            c4135x3d421c24.c(50.0f, 0);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.a a17 = c4135x3d421c24.a(c4129xdee64553, 0);
            if (a17 != null && (floatBuffer = a17.f129992a) != null) {
                new java.lang.Integer(floatBuffer.capacity());
            }
            c4135x3d421c24.b();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(a17);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.a aVar2 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.a) m143895xf1229813;
        if (aVar2 == null) {
            return new float[0];
        }
        java.nio.FloatBuffer a18 = d1Var.f304157b.a(aVar2.f129992a);
        if (a18 == null) {
            return new float[0];
        }
        int capacity = a18.capacity();
        float[] fArr = new float[capacity];
        a18.get(fArr);
        return kz5.v.r(fArr, 1, capacity);
    }
}
