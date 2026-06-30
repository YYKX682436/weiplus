package rp4;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 f480196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 activityC18823xd24cb2c2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480196d = activityC18823xd24cb2c2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rp4.g0(this.f480196d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rp4.g0 g0Var = (rp4.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402796d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.ActivityC18823xd24cb2c2 activityC18823xd24cb2c2 = this.f480196d;
        rect.set(activityC18823xd24cb2c2.f257636g.f480235g);
        java.lang.String str = activityC18823xd24cb2c2.f257634e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startRemux in main");
        rp4.x xVar = activityC18823xd24cb2c2.f257636g;
        if (!xVar.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "size is not valid,return this click");
        } else if (xVar.f480238j.f257130c.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "composition track is empty");
        } else {
            ct0.b bVar = activityC18823xd24cb2c2.f257638i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
            int i17 = bVar.f303740d;
            ct0.b bVar2 = activityC18823xd24cb2c2.f257638i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
            st3.s sVar = new st3.s(false, null, null, null, new float[]{0.0f, 0.0f, vt3.q.f521570a, vt3.q.f521571b}, i17, bVar2.f303741e, null, null, new float[]{rect.left, rect.top, rect.right, rect.bottom}, 399, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "edit config: " + sVar);
            rp4.f0 f0Var = activityC18823xd24cb2c2.f257635f;
            if (f0Var != null) {
                ct0.b bVar3 = activityC18823xd24cb2c2.f257638i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = activityC18823xd24cb2c2.f257637h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
                f0Var.d(bVar3, c16993xacc19624);
            }
            rp4.f0 f0Var2 = activityC18823xd24cb2c2.f257635f;
            if (f0Var2 != null) {
                f0Var2.f(sVar, xVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
