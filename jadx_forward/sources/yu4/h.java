package yu4;

/* loaded from: classes8.dex */
public final class h implements o25.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.rn3 f547408b;

    public h(yu4.k kVar, r45.rn3 rn3Var) {
        this.f547407a = kVar;
        this.f547408b = rn3Var;
    }

    @Override // o25.p1
    public final void a(java.lang.String str, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17, long j17) {
        yu4.k kVar = this.f547407a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f547416h, "share: " + interfaceC4987x84e327cb.mo42933xb5885648() + ", " + z17 + ", shareId:" + j17 + ", currentShareId:" + kVar.f547422q);
        if (j17 == kVar.f547422q) {
            if (z17) {
                java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
                java.lang.String str2 = this.f547408b.f466560i;
                if (str2 == null) {
                    str2 = "";
                }
                interfaceC4987x84e327cb.K0(mo42933xb5885648, str2);
                ((com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.e) kVar.f547415g).a(str, interfaceC4987x84e327cb);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = kVar.f547423r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            kVar.dismiss();
        }
    }
}
