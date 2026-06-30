package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes5.dex */
public final class o implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f161862a;

    public o(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f161862a = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = event.f152636a;
        java.util.Objects.toString(m1Var);
        int ordinal = m1Var.ordinal();
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f161862a;
        if (ordinal != 3) {
            if (ordinal == 4) {
                dn.h hVar = event.f152641f;
                if (hVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var + ", result is null");
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a(-1, "", "")));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var + " result:" + event.f152641f + " fieldId:" + hVar.f69522xf9dbbe9c + " aesKey:" + hVar.f69502xf11df5f5);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.String field_fileId = hVar.f69522xf9dbbe9c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileId, "field_fileId");
                java.lang.String field_aesKey = hVar.f69502xf11df5f5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_aesKey, "field_aesKey");
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a(0, field_fileId, field_aesKey)));
                return;
            }
            if (ordinal != 16 && ordinal != 17) {
                switch (ordinal) {
                    case 12:
                    case 13:
                    case 14:
                        break;
                    default:
                        return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "uploadToCdn: onEnd action:" + m1Var);
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.a(-1, "", "")));
    }
}
