package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class uf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f205801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f205802e = c14900x9bf524dd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.uf(this.f205802e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.uf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f205801d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205802e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String F7 = c14900x9bf524dd.F7();
            this.f205801d = 1;
            obj = rm0.h.b(new bq.x0(null, F7, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar3 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        android.app.Activity context = c14900x9bf524dd.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var != null) {
            int i18 = fVar3.f152149b;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar3.f152153f;
            java.lang.Integer num = (iVar == null || (oVar2 = iVar.f152179f) == null || (fVar2 = oVar2.f152243a.f152217a) == null) ? null : new java.lang.Integer(fVar2.mo75928xcd1e8d8());
            com.p314xaae8f345.mm.p944x882e457a.i iVar2 = fVar3.f152153f;
            p2Var.Q6(10923, i18, new az2.g(num, (iVar2 == null || (oVar = iVar2.f152179f) == null || (fVar = oVar.f152244b.f152233a) == null) ? null : new java.lang.Integer(fVar.mo75928xcd1e8d8()), az2.j.f97666r.a(fVar3)));
        }
        r45.cp3 cp3Var = (r45.cp3) fVar3.f152151d;
        if (fVar3.b() && cp3Var != null) {
            java.util.LinkedList m75941xfb821914 = cp3Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTopic_list(...)");
            if (true ^ m75941xfb821914.isEmpty()) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.rf rfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.rf(cp3Var, c14900x9bf524dd, null);
                this.f205801d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, rfVar, this) == aVar) {
                    return aVar;
                }
                return jz5.f0.f384359a;
            }
        }
        if (c14900x9bf524dd.m58692x17be6422()) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.sf sfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.sf(c14900x9bf524dd, null);
            this.f205801d = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, sfVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderProfileTabUIC", "requestFinderGetTemplateList errType=" + fVar3.f152148a + ", errCode=" + fVar3.f152149b + ", errMsg=" + fVar3.f152150c + ", resp=" + cp3Var);
            p3325xe03a0797.p3326xc267989b.p0 p0Var3 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var3 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.tf tfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.tf(c14900x9bf524dd, null);
            this.f205801d = 4;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var3, tfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
