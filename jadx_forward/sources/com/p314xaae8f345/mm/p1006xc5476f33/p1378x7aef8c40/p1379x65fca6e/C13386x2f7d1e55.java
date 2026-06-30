package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.p1379x65fca6e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureService;", "Lcom/tencent/mm/service/MMService;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureService */
/* loaded from: classes11.dex */
public final class C13386x2f7d1e55 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f180137i = "MicroMsg.EmojiCaptureService";

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        super.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180137i, "onCreate: ");
        if (fp.h.c(26)) {
            z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
            k0Var.D.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
            k0Var.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572621bv4));
            android.app.Notification b17 = k0Var.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
            z2.y1.a(this.f274739f, -2564, b17, android.os.Build.VERSION.SDK_INT >= 30 ? 64 : 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        super.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180137i, "onDestroy: ");
        this.f274739f.stopForeground(true);
    }
}
