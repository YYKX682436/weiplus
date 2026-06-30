package zv;

/* loaded from: classes9.dex */
public final class m4 extends com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.AbstractC23536x33e89ece {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f557588a = "MicroMsg.FlutterBrandEcsResidentPlugin";

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f557589b = jz5.h.b(zv.l4.f557560d);

    public final e31.k a() {
        return (e31.k) ((jz5.n) this.f557589b).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23579xa766ac7c
    /* renamed from: checkAndShowPushPermissionTipsDialog */
    public boolean mo87283x8c23af75() {
        android.content.Context context;
        java.lang.ref.WeakReference i17 = com.p314xaae8f345.mm.app.w.INSTANCE.i();
        if (i17 == null || (context = (android.app.Activity) i17.get()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        uw.p pVar = uw.p.f513034a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        return pVar.c(context);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23579xa766ac7c
    /* renamed from: getContactInfo */
    public void mo87284xdc4133b8(java.lang.String userName, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23516x65d494ce d17 = zv.q.f557612a.d(userName);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557588a, "ContactInfo(userName='" + d17.m86814x6bf53a6c() + "', nickName='" + d17.m86813x80025a04() + "', isContact=" + d17.m86816x16286b96() + ", isPlaceTop=" + d17.m86818x3f84a618() + ')');
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23537x6234dfdd(d17.m86814x6bf53a6c(), d17.m86813x80025a04(), d17.m86816x16286b96(), d17.m86818x3f84a618(), d17.m86817xb9a62e63()))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23579xa766ac7c
    /* renamed from: getStrategyConfig */
    public com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23601xf4acfbe8 mo87285xc5b23d8b() {
        x20.a aVar = x20.a.f533017a;
        aVar.getClass();
        f06.v[] vVarArr = x20.a.f533018b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(1 == ((java.lang.Number) x20.a.f533038v.b(aVar, vVarArr[18])).intValue());
        e31.k a17 = a();
        return new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23601xf4acfbe8(valueOf, null, java.lang.Boolean.valueOf(a17 != null ? ((g31.l) a17).f349627g : false), java.lang.Boolean.valueOf(((java.lang.Number) x20.a.f533021e.b(aVar, vVarArr[2])).intValue() == 1), java.lang.Boolean.valueOf(((java.lang.Boolean) x20.a.B.b(aVar, vVarArr[24])).booleanValue()), 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23579xa766ac7c
    /* renamed from: getTemplateMsgScope */
    public com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23602xc2134880 mo87286x66cead63(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        e31.k a17 = a();
        boolean n17 = a17 != null ? ((g31.l) a17).n(username) : false;
        if (!n17) {
            e31.k a18 = a();
            if (a18 != null) {
                ((g31.l) a18).m(username, null);
            }
            e31.k a19 = a();
            n17 = a19 != null ? ((g31.l) a19).n(username) : false;
        }
        return new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23602xc2134880(username, java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(n17), null, 8, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.InterfaceC23579xa766ac7c
    /* renamed from: getTemplateMsgScopeItem */
    public com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23603x7e5df7b3 mo87287xdb463316(java.lang.String username, java.lang.String scopeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeId, "scopeId");
        java.lang.String str = this.f557588a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[BRS] getTemplateMsgScopeItem username=" + username + ", scopeId=" + scopeId);
        e31.k a17 = a();
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 o17 = a17 != null ? ((g31.l) a17).o(username, scopeId) : null;
        if (o17 != null) {
            return new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23603x7e5df7b3(o17.f153336f, java.lang.Long.valueOf(o17.f153352y), java.lang.Boolean.valueOf(o17.f153340m == 1), java.lang.Boolean.valueOf(o17.B), java.lang.Boolean.valueOf(o17.C));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[BRS] getTemplateMsgScopeItem: templateItem not found for scopeId=".concat(scopeId));
        return null;
    }
}
