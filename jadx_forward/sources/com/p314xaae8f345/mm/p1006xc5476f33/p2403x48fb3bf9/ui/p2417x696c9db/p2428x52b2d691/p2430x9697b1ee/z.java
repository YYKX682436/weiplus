package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class z implements u53.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267737a;

    public z(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267737a = rVar;
    }

    @Override // u53.d0
    public final void a(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267737a;
        if (z17) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19470xbfb98b7("", "get sessionId fail", false));
            }
        } else if (rVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19470xbfb98b7(str, "get sessionId ok", true));
        }
    }
}
