package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class x2 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f243255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f243256b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e.C, 8);
        this.f243256b = activityC17388xa7b1222e;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null || i17 != 8) {
            return;
        }
        java.lang.String str2 = this.f243255a;
        if (str2 == null || !str.equalsIgnoreCase(str2)) {
            this.f243255a = str;
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e.C + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f243256b;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(activityC17388xa7b1222e.mo55332x76847179(), r6Var);
            activityC17388xa7b1222e.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 14L, 1L, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI$ScreenshotObserver", "Send event to listener.");
        }
    }
}
