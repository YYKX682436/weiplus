package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes15.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f211541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, java.lang.String str) {
        super(1);
        this.f211540d = i17;
        this.f211541e = activityC15041xa4ea2f4;
        this.f211542f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            boolean z17 = true;
            int i17 = this.f211540d;
            if (i17 != 1 && i17 != 4 && i17 != 5) {
                z17 = false;
            }
            java.lang.String str = this.f211542f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f211541e;
            if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.d7(activityC15041xa4ea2f4)) {
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a m67438x827fa4bb = activityC15041xa4ea2f4.m67438x827fa4bb();
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(m67438x827fa4bb, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j9(activityC15041xa4ea2f4, i17, str, null), 2, null);
            } else {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.C;
                activityC15041xa4ea2f4.r7(str, i17);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.o7(this.f211541e, false, 0, null, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
