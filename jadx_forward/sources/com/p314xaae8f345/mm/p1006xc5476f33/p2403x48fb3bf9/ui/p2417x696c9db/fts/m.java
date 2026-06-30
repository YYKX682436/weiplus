package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f266047f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, java.lang.String str, int i17) {
        this.f266047f = activityC19366xa1004627;
        this.f266045d = str;
        this.f266046e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f266047f;
        if (activityC19366xa1004627.s9() != null) {
            activityC19366xa1004627.s9().V(this.f266045d, this.f266046e);
        }
    }
}
