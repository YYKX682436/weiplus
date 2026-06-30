package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f f265924d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f fVar) {
        this.f265924d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.f fVar = this.f265924d;
        if (fVar.f265938h.s9() != null) {
            android.os.Bundle bundle = fVar.f265934d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || fVar.f265934d.getString("widgetId") == null) {
                fVar.f265938h.s9().b0(fVar.f265935e, fVar.f265936f, fVar.f265937g);
            } else {
                fVar.f265938h.s9().g0(fVar.f265934d.getString("widgetId"), fVar.f265935e);
            }
        }
    }
}
