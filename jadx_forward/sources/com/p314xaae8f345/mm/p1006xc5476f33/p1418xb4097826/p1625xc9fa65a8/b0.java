package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 f207156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f207157b;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56, int i17) {
        this.f207156a = activityC14942x98a58d56;
        this.f207157b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14942x98a58d56 activityC14942x98a58d56 = this.f207156a;
        if (!z17) {
            db5.t7.m123883x26a183b(activityC14942x98a58d56.mo55332x76847179(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d, 0).show();
            return;
        }
        java.util.ArrayList arrayList = activityC14942x98a58d56.f207067z;
        int i17 = this.f207157b;
        arrayList.remove(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC14942x98a58d56.I;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8155x27702c4(i17);
        }
    }
}
