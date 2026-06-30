package a32;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        super(0);
        this.f1042d = captureContainer;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1042d;
        captureContainer.f98644g.e();
        r22.a presenter = captureContainer.getPresenter();
        if (presenter != null) {
            w22.g gVar = (w22.g) presenter;
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "stop record " + gVar.f442534e);
            w22.b bVar = gVar.f442534e;
            w22.b bVar2 = w22.b.f442524g;
            if (bVar != bVar2) {
                gVar.f442534e = bVar2;
                long j17 = gVar.f442535f;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                x22.f fVar = gVar.f442541l;
                if (elapsedRealtime < 600) {
                    if (fVar != null) {
                        z21.w wVar = x22.f.f451564b;
                        if (wVar != null) {
                            wVar.stop(true);
                        }
                        x22.f.f451564b = null;
                    }
                    gVar.f442534e = w22.b.f442522e;
                } else {
                    android.content.Context context = gVar.f442530a;
                    java.lang.String string = context.getString(com.tencent.mm.R.string.ggc);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    ((y22.m) gVar.f442532c).f(context, string, true, 0, new w22.d(gVar));
                    com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration f98650p = gVar.f442531b.getF98650p();
                    f98650p.f98661v.b();
                    com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView fontAnimTextView = f98650p.f98662w;
                    fontAnimTextView.removeCallbacks(fontAnimTextView.f98780g);
                    if (gVar.f442536g) {
                        if (fVar != null) {
                            z21.w wVar2 = x22.f.f451564b;
                            if (wVar2 != null) {
                                wVar2.stop(true);
                            }
                            x22.f.f451564b = null;
                        }
                        gVar.f442542m.d();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = gVar.f442533d;
                    emojiCaptureReporter.f98585f = currentTimeMillis;
                    long j18 = currentTimeMillis - emojiCaptureReporter.f98584e;
                    emojiCaptureReporter.f98590n = j18;
                    com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(4, emojiCaptureReporter.f98583d, 0L, j18, 0L, 0L, 0L, 0, 0, emojiCaptureReporter.G);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
