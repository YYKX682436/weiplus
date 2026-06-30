package rg0;

/* loaded from: classes15.dex */
public final class m extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5677x6d1cb2fe) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ti tiVar = event.f136003g;
        if (tiVar != null) {
            rg0.t tVar = rg0.t.f476724a;
            boolean z17 = tiVar.f89546a;
            java.lang.String str = tiVar.f89547b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = tiVar.f89549d;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = tiVar.f89548c;
            java.lang.String str4 = str3 != null ? str3 : "";
            if ((str.compareTo("wxalite3315c0ca15ac6d9bb2ba2a4d8feb0e5a@pay") == 0 || str.compareTo("wxalited990fc783e5711cc47206cf5dd6d45a8@pay") == 0) && z17) {
                if (!(str4.length() == 0) && (str.compareTo("wxalite3315c0ca15ac6d9bb2ba2a4d8feb0e5a@pay") != 0 || tVar.a(str2, rg0.t.f476729f) > 0)) {
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new rg0.q(str4, str2, null), 3, null);
                }
            }
        }
        return false;
    }
}
