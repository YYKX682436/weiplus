package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class q1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 f211248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f211249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f211250c;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        this.f211248a = activityC15014x7ce71a81;
        this.f211249b = i17;
        this.f211250c = f2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81 = this.f211248a;
        if (!z17) {
            db5.t7.m123883x26a183b(activityC15014x7ce71a81.mo55332x76847179(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, 0).show();
            return;
        }
        java.util.ArrayList arrayList = activityC15014x7ce71a81.f210057v;
        int i17 = this.f211249b;
        arrayList.remove(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f211250c;
        f2Var.m8155x27702c4(((in5.n0) f2Var).a0() + i17);
    }
}
