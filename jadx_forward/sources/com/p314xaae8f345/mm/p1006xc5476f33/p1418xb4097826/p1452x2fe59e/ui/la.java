package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class la extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 f191795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191797f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256, int i17, int i18) {
        super(0);
        this.f191795d = activityC14003xac416256;
        this.f191796e = i17;
        this.f191797f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256 = this.f191795d;
        android.widget.TextView textView = activityC14003xac416256.A;
        int i18 = this.f191796e;
        int i19 = this.f191797f;
        if (textView != null) {
            textView.setText(activityC14003xac416256.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ot9, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        int i27 = (i18 * 100) / i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14401x37eb3b44 c14401x37eb3b44 = activityC14003xac416256.f190914z;
        if (c14401x37eb3b44 != null) {
            c14401x37eb3b44.m57910x3ae760af(i27);
        }
        return jz5.f0.f384359a;
    }
}
