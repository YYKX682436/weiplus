package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f182294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d f182296f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d, float f17, java.lang.String str) {
        this.f182296f = activityC13590x9555381d;
        this.f182294d = f17;
        this.f182295e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = this.f182296f;
        activityC13590x9555381d.f182152v.setProgress((int) this.f182294d);
        activityC13590x9555381d.f182153w.setText(this.f182295e);
    }
}
