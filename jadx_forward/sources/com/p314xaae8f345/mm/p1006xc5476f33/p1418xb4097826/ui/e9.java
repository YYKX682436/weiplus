package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class e9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f210629d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4) {
        super(1);
        this.f210629d = activityC15041xa4ea2f4;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f210629d;
        if (booleanValue) {
            android.content.Intent intent = new android.content.Intent();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PRECHECK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            ae2.in.f85221a.C0(1);
            intent.putExtra("PRECHECK_RESULT", 1);
            activityC15041xa4ea2f4.setResult(-1, intent);
        }
        activityC15041xa4ea2f4.finish();
        return jz5.f0.f384359a;
    }
}
