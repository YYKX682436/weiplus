package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 f265901f;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357, int i17, java.lang.String str) {
        this.f265901f = activityC19379x488a6357;
        this.f265899d = i17;
        this.f265900e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f265901f.f265377p0;
        if (nVar != null) {
            nVar.c0(this.f265899d, this.f265900e);
        }
    }
}
