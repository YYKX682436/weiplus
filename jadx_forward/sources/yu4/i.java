package yu4;

/* loaded from: classes8.dex */
public final class i implements o25.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f547411c;

    public i(yu4.k kVar, java.lang.String str, r45.sn3 sn3Var) {
        this.f547409a = kVar;
        this.f547410b = str;
        this.f547411c = sn3Var;
    }

    @Override // o25.p1
    public final void a(java.lang.String str, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17, long j17) {
        yu4.k kVar = this.f547409a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f547416h, "share: " + interfaceC4987x84e327cb.mo42933xb5885648() + ", " + z17 + ", shareId:" + j17 + ", currentShareId:" + kVar.f547422q);
        if (j17 == kVar.f547422q) {
            java.lang.String str2 = this.f547410b;
            if (z17) {
                interfaceC4987x84e327cb.K0(interfaceC4987x84e327cb.mo42933xb5885648(), str2 == null ? "" : str2);
                ((com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.e) kVar.f547415g).a(str, interfaceC4987x84e327cb);
            }
            r45.sn3 shareContent = this.f547411c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = kVar.f547423r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            kVar.dismiss();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3 c7062x716a67f3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7062x716a67f3();
            c7062x716a67f3.f143702e = c01.id.e();
            c7062x716a67f3.f143701d = 2L;
            c7062x716a67f3.f143703f = 2L;
            if (str2 == null) {
                str2 = "";
            }
            c7062x716a67f3.f143704g = c7062x716a67f3.b("ResultQuery", str2, true);
            r45.xi0 xi0Var = kVar.f547414f;
            c7062x716a67f3.f143705h = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(xi0Var.f471656o) ? 2L : 1L;
            c7062x716a67f3.f143706i = c7062x716a67f3.b("ShareSceneId", xi0Var.f471656o, true);
            java.lang.String str3 = shareContent.f467389d.f461483d;
            if (str3 == null) {
                str3 = "";
            }
            c7062x716a67f3.f143707j = c7062x716a67f3.b("ShareSessionId", str3, true);
            java.lang.String str4 = shareContent.f467389d.f461484e;
            if (str4 == null) {
                str4 = "";
            }
            c7062x716a67f3.f143708k = c7062x716a67f3.b("ShareSearchId", str4, true);
            java.lang.String str5 = shareContent.f467389d.f461485f;
            if (str5 == null) {
                str5 = "";
            }
            c7062x716a67f3.f143709l = c7062x716a67f3.b("ShareRequestId", str5, true);
            java.lang.String str6 = shareContent.f467389d.f461488i;
            c7062x716a67f3.f143710m = c7062x716a67f3.b("ShareDocId", str6 != null ? str6 : "", true);
            r45.lx5 lx5Var = shareContent.f467389d;
            c7062x716a67f3.f143712o = lx5Var.f461487h;
            c7062x716a67f3.f143711n = lx5Var.f461486g;
            c7062x716a67f3.k();
            su4.k3.m(c7062x716a67f3);
        }
    }
}
