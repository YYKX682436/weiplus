package gx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f358552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f358553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cv0.e f358554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ au0.b f358555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db f358556i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(boolean z17, gx0.x4 x4Var, cv0.e eVar, au0.b bVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358552e = z17;
        this.f358553f = x4Var;
        this.f358554g = eVar;
        this.f358555h = bVar;
        this.f358556i = c4152x8b3cf7db;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.u4(this.f358552e, this.f358553f, this.f358554g, this.f358555h, this.f358556i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.u4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999> list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358551d;
        gx0.x4 x4Var = this.f358553f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (this.f358552e && x4Var.t7().m132411xc00617a4()) {
                gx0.bf t76 = x4Var.t7();
                this.f358551d = 1;
                if (gx0.bf.t7(t76, false, this, 1, null) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        cv0.e showOption = this.f358554g;
        java.util.Objects.toString(showOption);
        x4Var.Y6().e();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e renderScale = x4Var.b7();
        au0.b bVar = this.f358555h;
        java.util.List<com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4053x47710492> Z6 = x4Var.Z6(bVar.b());
        android.app.Activity context = x4Var.m80379x76847179();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713) bVar.f95586a;
        cv0.l lVar = cv0.h.f304071a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358556i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4152x8b3cf7db, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderScale, "renderScale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showOption, "showOption");
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f e17 = (segment.y() && segment.x()) ? cv0.h.e(context) : new com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4050x944e439f(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(0.0f, 0.0f, 0.0f, 0.0f), 0.0f, new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4110x6b6aafc6(0.0f, 0.0f, 0.0f, 0.1f), 0.0f);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4111x4a556090 b17 = cv0.h.b(segment, context);
        if (segment.y() && segment.x()) {
            ug.m C = segment.C();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
            list = cv0.h.f(context, av0.a.a(C), showOption, renderScale);
        } else {
            list = kz5.p0.f395529d;
        }
        c4152x8b3cf7db.m34144x7f3d8440();
        c4152x8b3cf7db.m34172xdd985806(segment.f130065a, list, Z6, b17, e17);
        x4Var.f358689y = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) bVar.f95586a).B();
        return jz5.f0.f384359a;
    }
}
