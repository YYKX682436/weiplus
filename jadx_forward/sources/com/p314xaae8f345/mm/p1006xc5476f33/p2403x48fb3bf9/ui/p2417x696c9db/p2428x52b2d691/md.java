package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class md implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab0.a f267899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.od f267901f;

    public md(ab0.a aVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.od odVar) {
        this.f267899d = aVar;
        this.f267900e = rVar;
        this.f267901f = odVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ((cb0.d) this.f267899d).a();
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267900e;
        if (rVar != null) {
            rVar.a(this.f267901f.a("fail_cancel", null));
        }
    }
}
