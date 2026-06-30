package df2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f311458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.g f311459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f311460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.g gVar, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311458d = hVar;
        this.f311459e = gVar;
        this.f311460f = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.d(this.f311458d, interfaceC29045xdcb5ca57, this.f311459e, this.f311460f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.d dVar = (df2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f311458d).f535926b;
        ya2.g gVar = ya2.h.f542017a;
        df2.g gVar2 = this.f311459e;
        ya2.b2 b17 = gVar.b(((mm2.c1) gVar2.getStore().m56796xbba4bfc0(mm2.c1.class)).f410385o);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
            java.lang.String valueOf = java.lang.String.valueOf(c01.id.c());
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            ml2.l1 l1Var = ml2.l1.f409219m;
            y4Var.getClass();
            y4Var.f409828e0 = l1Var;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Ij(ml2.y2.f409786f, "", "", valueOf);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.app.Activity activity = (android.app.Activity) gVar2.O6();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", valueOf);
            obj2 = mm2.c1.class;
            c61.ub.A3((c61.ub) c17, activity, intent, i17, 1012, true, java.lang.Boolean.TRUE, null, false, j01Var, null, 704, null);
            gVar2.m7("ClickBtn", false);
            f0Var = f0Var2;
        } else {
            obj2 = mm2.c1.class;
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CreateNextNoticeGuide", "showBubble: finder contact is null, username=" + ((mm2.c1) gVar2.getStore().m56796xbba4bfc0(obj2)).f410385o);
        }
        return f0Var2;
    }
}
