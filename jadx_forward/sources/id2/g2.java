package id2;

/* loaded from: classes3.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f372117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f372119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, id2.u3 u3Var, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372117d = hVar;
        this.f372118e = u3Var;
        this.f372119f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.g2(this.f372117d, interfaceC29045xdcb5ca57, this.f372118e, this.f372119f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        id2.g2 g2Var = (id2.g2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f372117d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNotice: cgi success, username=");
        id2.u3 u3Var = this.f372118e;
        sb6.append(xy2.c.e(u3Var.m80379x76847179()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(u3Var.m80379x76847179()));
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.app.Activity m80379x76847179 = u3Var.m80379x76847179();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", pk2.l2.f437472n);
            str = "AnchorMoreLiveNoticeOption";
            c61.ub.A3((c61.ub) c17, m80379x76847179, intent, i17, 0, true, java.lang.Boolean.FALSE, null, false, j01Var, id2.e2.f372080a, 192, null);
            f0Var = f0Var2;
        } else {
            str = "AnchorMoreLiveNoticeOption";
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "createNotice: finder contact is null, username=" + xy2.c.e(u3Var.m80379x76847179()));
        }
        return f0Var2;
    }
}
