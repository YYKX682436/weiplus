package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 f151605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 f151606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(int i17, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f151604e = i17;
        this.f151605f = c1Var;
        this.f151606g = m5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m3(this.f151604e, this.f151605f, this.f151606g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f151603d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c1 c1Var = this.f151605f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f151604e;
            f0.r1 r1Var = c1Var.f151418p;
            this.f151603d = 1;
            w0.x xVar = f0.r1.f339739t;
            int i19 = r1Var.f339744e;
            float f17 = f0.f1.f339605a;
            if (!(((float) i18) >= 0.0f)) {
                throw new java.lang.IllegalArgumentException(("Index should be non-negative (" + i18 + ')').toString());
            }
            java.lang.Object a17 = b0.e3.a(r1Var, null, new f0.e1(r1Var, i18, i19, 0, null), this, 1, null);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c1Var.getClass();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 data = this.f151606g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!data.f151612c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onMoreTemplateItemSelected: click unselectable item");
        }
        if (data instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5) {
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.c7 c7Var = c1Var.f151428z;
            java.lang.String str = data.f151610a;
            if (c7Var != null) {
                c7Var.a(this.f151604e, str);
            }
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5 e5Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e5) data;
            java.lang.String m33907x3bfa570b = e5Var.f151480p.m33907x3bfa570b();
            com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var = c1Var.f151417o;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m33907x3bfa570b, m5Var != null ? m5Var.f151610a : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onMoreTemplateItemSelected: no need to select " + str);
            } else if (c1Var.f151405c) {
                c1Var.a(e5Var, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.z0(c1Var, e5Var));
            } else {
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.m5 m5Var2 = c1Var.f151417o;
                com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.r rVar = m5Var2 != null ? m5Var2.f151611b : null;
                if (rVar != null) {
                    rVar.b(false);
                }
                data.f151611b.b(true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.MoreTemplateBottomSheetState", "onTemplateSelected: id=" + e5Var.f151610a);
                p3325xe03a0797.p3326xc267989b.l.d(c1Var.f151403a, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.a1(c1Var, e5Var, null), 3, null);
            }
        }
        return f0Var;
    }
}
