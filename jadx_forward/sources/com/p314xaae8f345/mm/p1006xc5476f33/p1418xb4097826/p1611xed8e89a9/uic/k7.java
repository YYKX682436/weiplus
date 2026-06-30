package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class k7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f205424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205425e = obVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k7(this.f205425e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f205424d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205425e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.r13 r13Var = new r45.r13();
            r13Var.f465950d = obVar.m58741x6c03c64c();
            db2.t4 t4Var = db2.t4.f309704a;
            r45.kv0 b17 = t4Var.b(9037, obVar.m58738xfe9224be());
            r13Var.f465951e = b17;
            r45.qt2 m58738xfe9224be = obVar.m58738xfe9224be();
            b17.set(1, java.lang.Integer.valueOf(m58738xfe9224be != null ? m58738xfe9224be.m75939xb282bd08(7) : 0));
            long j17 = 0;
            if (t4Var.q()) {
                j17 = obVar.m158359x1e885992().getLongExtra("finder_from_feed_id", 0L);
                str = obVar.m158359x1e885992().getStringExtra("finder_from_feed_dup_flag");
            } else {
                str = null;
            }
            r45.kv0 kv0Var = r13Var.f465951e;
            r45.qt2 m58738xfe9224be2 = obVar.m58738xfe9224be();
            r45.kv0 kv0Var2 = r13Var.f465951e;
            t4Var.h(kv0Var, m58738xfe9224be2, kz5.b0.c(new jz5.o(new java.lang.Integer(kv0Var2 != null ? kv0Var2.m75939xb282bd08(1) : 0), new java.lang.Long(j17), str)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileHeaderUIC", "doSceneForUserInfo param, username: " + r13Var.f465950d);
            com.p314xaae8f345.mm.p944x882e457a.i b18 = r13Var.b();
            this.f205424d = 1;
            obj = rm0.h.b(b18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        obVar.H7((r45.s13) resp, true);
        return jz5.f0.f384359a;
    }
}
