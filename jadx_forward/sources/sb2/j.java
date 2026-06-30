package sb2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f486951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f486952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f486953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f486954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sb2.k f486955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, sb2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f486952e = context;
        this.f486953f = c19792x256d2725;
        this.f486954g = zfVar;
        this.f486955h = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sb2.j(this.f486952e, this.f486953f, this.f486954g, this.f486955h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sb2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.lang.Object Q6;
        r45.nw1 m76794xd0557130;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f486951d;
        long j17 = 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f486953f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Context context = this.f486952e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.b8 b8Var = (zy2.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.b8.class);
            long m76784x5db1b11 = c19792x256d27252.m76784x5db1b11();
            java.lang.String m76803x6c285d75 = c19792x256d27252.m76803x6c285d75();
            r45.nw1 m76794xd05571302 = c19792x256d27252.m76794xd0557130();
            long m75942xfb822ef2 = m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L;
            r45.dm2 m76806xdef68064 = c19792x256d27252.m76806xdef68064();
            java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
            android.content.Context context2 = this.f486952e;
            this.f486951d = 1;
            c19792x256d2725 = c19792x256d27252;
            Q6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) b8Var).Q6(m76784x5db1b11, m76803x6c285d75, m75942xfb822ef2, m75945x2fec8307, context2, this);
            if (Q6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Q6 = obj;
            c19792x256d2725 = c19792x256d27252;
        }
        jz5.l lVar = (jz5.l) Q6;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384367e).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f384366d;
        if (booleanValue || ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.F2).mo141623x754a37bb()).r()).intValue() == 1) {
            in5.s0 s0Var = this.f486955h.f498674d.f498682i;
            java.lang.Integer num = s0Var != null ? new java.lang.Integer(s0Var.m8183xf806b362()) : null;
            if (c19792x256d2725 != null && (m76794xd0557130 = c19792x256d2725.m76794xd0557130()) != null) {
                j17 = m76794xd0557130.m75942xfb822ef2(0);
            }
            java.lang.Long l17 = new java.lang.Long(j17);
            java.lang.Integer num2 = new java.lang.Integer(6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f486954g;
            zfVar.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lf(num, zfVar, l17, num2, str));
        }
        return jz5.f0.f384359a;
    }
}
