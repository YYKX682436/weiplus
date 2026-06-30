package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class nd implements ab0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.od f267930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f267931c;

    public nd(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.od odVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f267929a = rVar;
        this.f267930b = odVar;
        this.f267931c = u3Var;
    }

    @Override // ab0.f0
    /* renamed from: onResult */
    public final void mo952x57429edc(boolean z17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (z17) {
            str3 = "ok";
        } else {
            str3 = "fail_" + str;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267929a;
        if (rVar != null) {
            rVar.a(this.f267930b.a(str3, str2));
        }
        this.f267931c.dismiss();
    }
}
