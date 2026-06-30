package yx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class v5 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public v5(java.lang.Object obj) {
        super(2, obj, yx0.b8.class, "onReceiveAudioFrame", "onReceiveAudioFrame([BI)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        byte[] p07 = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        yx0.b8 b8Var = (yx0.b8) this.f72685xcfcbe9ef;
        int ordinal = b8Var.f548725s.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            switch (ordinal) {
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    hu3.s0 s0Var = b8Var.f548735y1;
                    if (s0Var != null) {
                        b8Var.f548737z1.a(intValue);
                        yx0.c8 c8Var = b8Var.f548737z1;
                        java.util.ArrayList arrayList = c8Var.f548765a;
                        int i17 = c8Var.f548766b;
                        c8Var.f548766b = i17 + 1;
                        java.lang.Object obj3 = arrayList.get(i17 % arrayList.size());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj3;
                        byteBuffer.clear();
                        byteBuffer.put(p07, 0, intValue);
                        byteBuffer.position(0);
                        hu3.a aVar = s0Var.f366727a;
                        int i18 = aVar.f366616b;
                        int i19 = (intValue / i18) / 2;
                        int i27 = aVar.f366615a;
                        int i28 = ((aVar.f366617c * i27) * i18) / 1000;
                        long j17 = 1411200000 / i27;
                        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = b8Var.A1;
                        b8Var.A1 = c4128x879fba0a == null ? com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33968x369d1f41(android.os.SystemClock.elapsedRealtimeNanos()) : c4128x879fba0a.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(i19 * j17));
                        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(b8Var.A1, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33968x369d1f41(s0Var.f366727a.f366617c * 1000000));
                        jg.b bVar = jg.b.I16;
                        hu3.a aVar2 = s0Var.f366727a;
                        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4 c3977x2c5458b4 = new com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3977x2c5458b4(bVar, aVar2.f366615a, aVar2.f366616b == 1 ? jg.a.Mono : jg.a.Stereo, i19, c4129xdee64553, byteBuffer);
                        pp0.p0 p0Var = b8Var.K;
                        if (p0Var != null) {
                            p0Var.B0(c3977x2c5458b4);
                            break;
                        }
                    }
                    break;
            }
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "onReceiveAudioFrame >> isRelease");
        return jz5.f0.f384359a;
    }
}
