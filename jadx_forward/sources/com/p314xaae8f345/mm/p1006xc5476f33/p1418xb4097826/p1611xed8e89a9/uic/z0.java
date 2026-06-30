package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f205936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 f205937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205937e = c14881xed239a47;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.z0(this.f205937e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f205936d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47 c14881xed239a47 = this.f205937e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity context = c14881xed239a47.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
            if (p2Var != null) {
                p2Var.O6(11847, 10, 1);
            }
            int intExtra = c14881xed239a47.m158359x1e885992().getIntExtra("finder_from_feed_type", 0);
            java.lang.String stringExtra = c14881xed239a47.m158359x1e885992().getStringExtra("finder_from_feed_dup_flag");
            boolean hasExtra = c14881xed239a47.m158359x1e885992().hasExtra("finder_from_session_buffer");
            jz5.g gVar = c14881xed239a47.f204947d;
            java.lang.String stringExtra2 = hasExtra ? c14881xed239a47.m158359x1e885992().getStringExtra("finder_from_session_buffer") : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(c14881xed239a47.U6(), stringExtra, ((r45.qt2) ((jz5.n) gVar).mo141623x754a37bb()).m75939xb282bd08(7));
            java.lang.String m58635x6c03c64c = c14881xed239a47.m58635x6c03c64c();
            java.lang.String str = m58635x6c03c64c == null ? "" : m58635x6c03c64c;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c14881xed239a47.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            db2.v1 v1Var = new db2.v1(str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(8), c14881xed239a47.U6(), intExtra == 1 ? ((java.lang.Number) ((jz5.n) c14881xed239a47.f204954n).mo141623x754a37bb()).longValue() : 0L, stringExtra2 == null ? "" : stringExtra2, (r45.qt2) ((jz5.n) gVar).mo141623x754a37bb());
            this.f205936d = 1;
            b17 = rm0.h.b(v1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar3 = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        android.app.Activity context2 = c14881xed239a47.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var2 != null) {
            int i18 = fVar3.f152149b;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar3.f152153f;
            java.lang.Integer num = null;
            java.lang.Integer num2 = (iVar == null || (oVar2 = iVar.f152179f) == null || (fVar2 = oVar2.f152243a.f152217a) == null) ? null : new java.lang.Integer(fVar2.mo75928xcd1e8d8());
            com.p314xaae8f345.mm.p944x882e457a.i iVar2 = fVar3.f152153f;
            if (iVar2 != null && (oVar = iVar2.f152179f) != null && (fVar = oVar.f152244b.f152233a) != null) {
                num = new java.lang.Integer(fVar.mo75928xcd1e8d8());
            }
            p2Var2.Q6(11847, i18, new az2.g(num2, num, az2.j.f97666r.a(fVar3)));
        }
        if (fVar3.f152148a == 0 && fVar3.f152149b == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileAllLayoutUIC", "homePage success");
            c14881xed239a47.Y6((r45.nb1) fVar3.f152151d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileAllLayoutUIC", "homePage errCode: " + fVar3.f152149b + ", errType: " + fVar3.f152148a + ", errMsg: " + fVar3.f152150c);
            c14881xed239a47.X6(false);
        }
        return jz5.f0.f384359a;
    }
}
