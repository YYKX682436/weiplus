package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class dq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f191490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        super(0);
        this.f191490d = i17;
        this.f191491e = i18;
        this.f191492f = activityC14125xe2977688;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f191490d;
        if (i17 == 0 || i17 == -21005) {
            i17 = this.f191491e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191492f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC14125xe2977688.f191162d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC14125xe2977688.f191162d = null;
        activityC14125xe2977688.Y6(i17);
        return jz5.f0.f384359a;
    }
}
