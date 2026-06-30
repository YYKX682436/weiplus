package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class eq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        super(0);
        this.f191525d = str;
        this.f191526e = activityC14125xe2977688;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579 c5723x5d13c579 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5723x5d13c579();
        am.kk kkVar = c5723x5d13c579.f136046g;
        kkVar.f88693a = this.f191525d;
        kkVar.f88695c = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191526e;
        kkVar.f88697e = (int) (activityC14125xe2977688.f191166h / 1000);
        kkVar.f88698f = (int) activityC14125xe2977688.f191167i;
        c5723x5d13c579.e();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC14125xe2977688.f191162d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC14125xe2977688.f191162d = null;
        activityC14125xe2977688.finish();
        return jz5.f0.f384359a;
    }
}
