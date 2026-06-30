package com.tencent.mm.plugin.emojicapture.proxy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureService;", "Lcom/tencent/mm/service/MMService;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EmojiCaptureService extends com.tencent.mm.service.MMService {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f98604i = "MicroMsg.EmojiCaptureService";

    @Override // com.tencent.mm.service.MMService
    public void d() {
        super.d();
        com.tencent.mars.xlog.Log.i(this.f98604i, "onCreate: ");
        if (fp.h.c(26)) {
            z2.k0 k0Var = new z2.k0(com.tencent.mm.sdk.platformtools.x2.f193071a, "reminder_channel_id");
            k0Var.D.icon = com.tencent.mm.R.drawable.c7v;
            k0Var.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491088bv4));
            android.app.Notification b17 = k0Var.b();
            kotlin.jvm.internal.o.f(b17, "build(...)");
            z2.y1.a(this.f193206f, -2564, b17, android.os.Build.VERSION.SDK_INT >= 30 ? 64 : 0);
        }
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        super.e();
        com.tencent.mars.xlog.Log.i(this.f98604i, "onDestroy: ");
        this.f193206f.stopForeground(true);
    }
}
