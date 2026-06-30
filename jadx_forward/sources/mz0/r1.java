package mz0;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414564d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c f414566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414568h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar, java.lang.String str, mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414566f = cVar;
        this.f414567g = str;
        this.f414568h = b2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mz0.r1 r1Var = new mz0.r1(this.f414566f, this.f414567g, this.f414568h, interfaceC29045xdcb5ca57);
        r1Var.f414565e = obj;
        return r1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.r1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414564d;
        mz0.b2 b2Var = this.f414568h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.c cVar = this.f414566f;
        java.lang.String str = this.f414567g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f414565e;
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1) cVar).a(new cw3.g(0.0f), str);
            }
            android.app.Activity context = b2Var.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dz0.l lVar = (dz0.l) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(dz0.l.class);
            this.f414565e = y0Var;
            this.f414564d = 1;
            obj = ((com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b) lVar).g7(str, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f414565e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j) obj;
        if (jVar != null) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.l0 l0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.l0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(jVar, new mz0.o1(b2Var, str, cVar, null)), new mz0.p1(cVar, str, null));
            mz0.q1 q1Var = new mz0.q1(cVar, str);
            this.f414565e = y0Var;
            this.f414564d = 2;
            if (l0Var.a(q1Var, this) == aVar) {
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Template.TemplateControlUIC", "recreateWithMusicID return null, musicId:" + str);
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.k1) cVar).a(new cw3.e(null, 1, null), str);
            }
        }
        return jz5.f0.f384359a;
    }
}
