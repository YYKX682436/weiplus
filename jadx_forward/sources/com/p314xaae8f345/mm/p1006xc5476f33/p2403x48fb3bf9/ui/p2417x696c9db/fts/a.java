package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 f265864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f265865e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var) {
        this.f265865e = activityC19366xa1004627;
        this.f265864d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f265865e;
        if (activityC19366xa1004627.s9() != null) {
            activityC19366xa1004627.pa();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b0 b0Var = this.f265864d;
            activityC19366xa1004627.f265778b4 = b0Var.f265879d;
            activityC19366xa1004627.ra();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isBackButtonClick", "1");
            hashMap.put("custom", activityC19366xa1004627.N9());
            activityC19366xa1004627.s9().d0(activityC19366xa1004627.P9(), activityC19366xa1004627.N9(), activityC19366xa1004627.O9(), 1, b0Var.f265880e);
            if (android.text.TextUtils.isEmpty(activityC19366xa1004627.N9())) {
                return;
            }
            su4.k2.k(activityC19366xa1004627.Y3, activityC19366xa1004627.B3, activityC19366xa1004627.C3, true, activityC19366xa1004627.N9(), activityC19366xa1004627.f265777a4);
        }
    }
}
