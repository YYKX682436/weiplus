package hu3;

/* loaded from: classes5.dex */
public final /* synthetic */ class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public f0(java.lang.Object obj) {
        super(2, obj, hu3.n0.class, "onReceiveAudioFrame", "onReceiveAudioFrame([BI)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        byte[] p07 = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        hu3.n0 n0Var = (hu3.n0) this.f72685xcfcbe9ef;
        hu3.s0 s0Var = n0Var.f366709w;
        if (s0Var != null) {
            hu3.b bVar = n0Var.f366710x;
            bVar.a(intValue);
            java.util.ArrayList arrayList = bVar.f366621a;
            int i17 = bVar.f366622b;
            bVar.f366622b = i17 + 1;
            java.lang.Object obj3 = arrayList.get(i17 % arrayList.size());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj3;
            byteBuffer.clear();
            byteBuffer.put(p07, 0, intValue);
            byteBuffer.position(0);
            hu3.a aVar = s0Var.f366727a;
            int i18 = aVar.f366616b;
            int i19 = (intValue / i18) / 2;
            int i27 = aVar.f366617c;
            int i28 = aVar.f366615a;
            int i29 = ((i27 * i28) * i18) / 1000;
            long j17 = 1411200000 / i28;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = n0Var.f366711y;
            n0Var.f366711y = c4128x879fba0a == null ? com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33968x369d1f41(android.os.SystemClock.elapsedRealtimeNanos()) : c4128x879fba0a.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(i19 * j17));
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 c3977x2c5458b4 = new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4(jg.b.I16, aVar.f366615a, aVar.f366616b == 1 ? jg.a.Mono : jg.a.Stereo, i19, new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(n0Var.f366711y, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33968x369d1f41(aVar.f366617c * 1000000)), byteBuffer);
            pp0.p0 p0Var = n0Var.f366695f;
            if (p0Var != null) {
                p0Var.B0(c3977x2c5458b4);
            }
        }
        return jz5.f0.f384359a;
    }
}
