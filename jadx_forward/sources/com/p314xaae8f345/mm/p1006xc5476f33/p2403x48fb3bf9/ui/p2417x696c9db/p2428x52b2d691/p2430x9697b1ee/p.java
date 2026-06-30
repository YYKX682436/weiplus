package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/p;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/AddConversationParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
final class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19463xcf89124a c19463xcf89124a = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19463xcf89124a) obj;
        if (c19463xcf89124a == null) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(false, "system err"));
                return;
            }
            return;
        }
        z53.t Di = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Di();
        java.lang.String str = c19463xcf89124a.f267652d;
        z53.i z07 = Di.z0(str);
        if (z07.f72763xa3c65b86 != -1 && rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(false, "conversation already exist"));
        }
        z07.f67663xf66fcca9 = "";
        z07.f67669xbed8694c = str;
        z07.f67670x114ef53e = c19463xcf89124a.f267654f;
        z07.f67668x5568d387 = c19463xcf89124a.f267653e;
        Di.mo880xb970c2b9(z07);
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19467x7ab4d1e3(true, "add conversation"));
        }
    }
}
