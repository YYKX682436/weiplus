package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f265967f;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, int i17, java.lang.String str) {
        this.f265967f = activityC19366xa1004627;
        this.f265965d = i17;
        this.f265966e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f265967f;
        if (activityC19366xa1004627.s9() != null) {
            activityC19366xa1004627.s9().c0(this.f265965d, this.f265966e);
        }
    }
}
