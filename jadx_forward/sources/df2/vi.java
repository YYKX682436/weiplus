package df2;

/* loaded from: classes3.dex */
public final class vi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f313143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 f313144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(df2.wi wiVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313143e = wiVar;
        this.f313144f = c19793xceab7f56;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.vi(this.f313143e, this.f313144f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.vi) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.s63 s63Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313142d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.wi wiVar = this.f313143e;
            ((mm2.e1) wiVar.m56788xbba4bfc0(mm2.e1.class)).f410524u = this.f313144f;
            mm2.c1 c1Var = (mm2.c1) wiVar.m56788xbba4bfc0(mm2.c1.class);
            java.lang.String str = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) wiVar.a7().f410609q).mo144003x754a37bb();
            if (str == null) {
                r45.n73 c76 = wiVar.c7();
                str = (c76 == null || (s63Var = (r45.s63) c76.m75936x14adae67(3)) == null) ? null : s63Var.m75945x2fec8307(0);
                if (str == null) {
                    str = "";
                }
            }
            c1Var.V1 = str;
            dk2.ef efVar = dk2.ef.f314905a;
            boolean z17 = ((mm2.s1) wiVar.m56788xbba4bfc0(mm2.s1.class)).f410931u;
            df2.ui uiVar = new df2.ui(wiVar);
            this.f313142d = 1;
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (obj2 = zl2.r4.f555483a.s2(eVar, new dk2.le(eVar, z17, uiVar), this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
