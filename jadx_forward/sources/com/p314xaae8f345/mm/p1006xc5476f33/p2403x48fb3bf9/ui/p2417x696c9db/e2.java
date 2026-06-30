package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 f265658f;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211, java.lang.String str, boolean z17) {
        this.f265658f = activityC19323xcd93a211;
        this.f265656d = str;
        this.f265657e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211 = this.f265658f;
        if (!activityC19323xcd93a211.f265267w) {
            activityC19323xcd93a211.V6(-1, this.f265656d);
        }
        if (this.f265657e) {
            activityC19323xcd93a211.finish();
        }
    }
}
