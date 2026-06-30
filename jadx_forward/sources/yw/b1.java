package yw;

/* loaded from: classes4.dex */
public final class b1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.b1 f547813a = new yw.b1();

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetUserContactListResp");
            java.util.LinkedList<r45.q80> contact_list = ((r45.kq3) fVar2).f460434d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contact_list, "contact_list");
            for (r45.q80 q80Var : contact_list) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(q80Var.f465287d, true);
                if (n17 != null) {
                    n17.u1(q80Var.f465288e);
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                yw.h1 h1Var = yw.h1.f547865a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed update contact:" + q80Var.f465287d + " createtime:" + q80Var.f465288e);
            }
            yw.h1.f547865a.m().B("key_biz_fetch_contact_create_time_fetch_last_time", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        } else {
            yw.h1 h1Var2 = yw.h1.f547865a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizFlutterHelper", "fetchContactCreateTimeIfNeed error:" + fVar.f152148a + ' ' + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
