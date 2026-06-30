package cb1;

/* loaded from: classes7.dex */
public final class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f40288c;

    public q(com.tencent.mm.plugin.appbrand.page.v5 v5Var, cb1.j0 j0Var, fl1.g1 g1Var) {
        this.f40286a = v5Var;
        this.f40287b = j0Var;
        this.f40288c = g1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        eb1.d bf6;
        r45.pw6 pw6Var;
        java.lang.String str;
        r45.jv5 jv5Var;
        java.lang.String str2;
        r45.jv5 jv5Var2;
        java.lang.String str3;
        nm5.b bVar = (nm5.b) obj;
        com.tencent.mm.plugin.appbrand.page.v5 component = this.f40286a;
        kotlin.jvm.internal.o.g(component, "component");
        eb1.c cVar = (eb1.c) component.q(eb1.c.class);
        if (cVar == null || (bf6 = cVar.bf(component)) == null) {
            bf6 = eb1.b.f250707a.bf(component);
        }
        eb1.d dVar = bf6;
        vi1.l2 l2Var = vi1.l2.f437401a;
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(appId);
        cb1.p pVar = new cb1.p(component);
        cb1.j0 j0Var = this.f40287b;
        j0Var.getClass();
        java.util.Collection collection = bVar != null ? (java.util.List) bVar.a(0) : null;
        cb1.i iVar = bVar != null ? (cb1.i) bVar.a(1) : null;
        km5.b c17 = km5.u.c();
        fl1.g2 dialogContainer = component.getDialogContainer();
        if (dialogContainer != null) {
            dialogContainer.a(this.f40288c);
        }
        java.lang.String str4 = ((k91.z0) component.b(k91.z0.class)).f305841d;
        if (str4 == null) {
            str4 = "";
        }
        dVar.setAppBrandName(str4);
        java.lang.String str5 = ((k91.z0) component.b(k91.z0.class)).f305843f;
        dVar.setIconUrl(str5 != null ? str5 : "");
        if (iVar != null && (jv5Var2 = iVar.f40252a) != null && (str3 = jv5Var2.f378136i) != null) {
            dVar.setDialogSubDesc(str3);
        }
        if (iVar != null && (jv5Var = iVar.f40252a) != null && (str2 = jv5Var.f378132e) != null) {
            dVar.setDialogRequestDesc(str2);
        }
        if (iVar != null && (str = iVar.f40254c) != null) {
            dVar.setDialogApplyWording(str);
        }
        dVar.setOnDeny(new cb1.x(a17, c17));
        dVar.setOnCancel(new cb1.y(a17, c17));
        dVar.setOnAccept(new cb1.z(pVar));
        dVar.setOnAddPhoneNumber(new cb1.c0(a17, component, dVar));
        dVar.setOnManagePhoneNumber(new cb1.f0(a17, component, dVar));
        dVar.setOnPhoneItemSelect(new cb1.h0(a17, dVar, component, iVar, c17));
        if (j0Var.C(component, iVar)) {
            dVar.f(true);
            dVar.setOnExplain(new cb1.w(a17, dVar, component, iVar));
        } else {
            dVar.f(false);
        }
        java.util.ArrayList arrayList = collection instanceof java.util.ArrayList ? (java.util.ArrayList) collection : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        dVar.setPhoneItems(arrayList);
        if (iVar != null && (pw6Var = iVar.f40255d) != null && pw6Var.f383440d) {
            java.lang.String wording = pw6Var.f383441e;
            kotlin.jvm.internal.o.f(wording, "wording");
            if (!r26.n0.N(wording)) {
                java.lang.String wording2 = pw6Var.f383441e;
                kotlin.jvm.internal.o.f(wording2, "wording");
                dVar.setUserAgreementCheckBoxWording(wording2);
                dVar.setIExternalToolsHelper((com.tencent.mm.plugin.appbrand.jsapi.r1) component.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class));
            }
        }
        dVar.r(component);
        return new com.tencent.mm.plugin.appbrand.jsapi.j0("ok", new java.lang.Object[0]);
    }
}
