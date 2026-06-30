package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes5.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f176685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176686e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf, java.lang.String str) {
        this.f176686e = activityC13052x7242bfaf;
        this.f176685d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176686e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13052x7242bfaf.f176377f)) {
            activityC13052x7242bfaf.f176382n.setVisibility(0);
            o11.f fVar = new o11.f();
            fVar.f423616g = lp0.b.D();
            java.lang.String str = this.f176685d;
            fVar.f423615f = xt1.q.m(str);
            fVar.f423618i = 1;
            fVar.f423611b = true;
            fVar.f423610a = true;
            n11.a.b().h(str, activityC13052x7242bfaf.f176382n, fVar.a());
        }
    }
}
