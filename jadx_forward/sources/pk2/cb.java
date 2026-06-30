package pk2;

/* loaded from: classes3.dex */
public final class cb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(pk2.o9 o9Var) {
        super(1);
        this.f437172d = o9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        if (((java.lang.Boolean) obj).booleanValue()) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.f409609q;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("share_scene", java.lang.String.valueOf(zl2.r4.f555483a.Z0()));
            pk2.o9 o9Var = this.f437172d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            hashMap.put("liveid", pm0.v.u((c19792x256d2725 == null || (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) == null) ? 0L : m76794xd0557130.m75942xfb822ef2(0)));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            hashMap.put("feedid", pm0.v.u(c19792x256d27252 != null ? c19792x256d27252.m76784x5db1b11() : 0L));
            zy2.zb.I8(zbVar, u1Var, hashMap, null, null, null, null, false, 124, null);
        }
        return jz5.f0.f384359a;
    }
}
