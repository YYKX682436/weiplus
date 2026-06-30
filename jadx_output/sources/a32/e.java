package a32;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.plugin.mmsight.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1011a;

    public e(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer) {
        this.f1011a = captureContainer;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void a() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1011a;
        captureContainer.f98645h.i(0, 100, t22.o.f415102c * 1000, y22.n.c(captureContainer), new a32.b(captureContainer));
        captureContainer.f98648n.setShow(false);
        r22.a aVar = captureContainer.presenter;
        if (aVar != null) {
            w22.g gVar = (w22.g) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "start record " + gVar.f442534e);
            u22.b bVar = gVar.f442539j;
            bVar.getClass();
            bVar.f423976c = "";
            bVar.f423977d = "";
            r22.b bVar2 = gVar.f442531b;
            gVar.f442538i = bVar2.getF98650p().getText();
            bVar2.getF98650p().getClass();
            java.lang.String str = gVar.f442538i;
            gVar.f442536g = str == null || str.length() == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "startRecord: useVoiceInput " + gVar.f442536g);
            if (gVar.f442536g && (!kotlin.jvm.internal.o.b("NON_NETWORK", com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a)))) {
                x22.f fVar = gVar.f442541l;
                if (fVar != null) {
                    z21.w wVar = new z21.w(1, 9, new x22.e(fVar));
                    x22.f.f451564b = wVar;
                    wVar.start();
                }
                gVar.f442542m.c(50L, 50L);
            }
            gVar.f442537h = false;
            gVar.f442534e = w22.b.f442523f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            gVar.f442535f = android.os.SystemClock.elapsedRealtime();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = gVar.f442533d;
            emojiCaptureReporter.f98584e = currentTimeMillis;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 3, java.lang.Long.valueOf(emojiCaptureReporter.f98583d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(emojiCaptureReporter.G), emojiCaptureReporter.A, java.lang.Integer.valueOf(emojiCaptureReporter.B), 0, java.lang.Integer.valueOf(emojiCaptureReporter.C), emojiCaptureReporter.D, java.lang.Integer.valueOf(emojiCaptureReporter.E), java.lang.Integer.valueOf(emojiCaptureReporter.F));
        }
        if (!captureContainer.f98659y.j(false, 0)) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(33, 1);
        }
        captureContainer.f98646i.setEnabled(false);
        captureContainer.f98646i.animate().alpha(0.0f).start();
        captureContainer.e(false, 0);
        android.view.View view = captureContainer.f98647m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", if1.m.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", if1.m.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void b() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1011a;
        com.tencent.mars.xlog.Log.i(captureContainer.f98641d, "onPressDown");
        int[] iArr = new int[2];
        captureContainer.f98645h.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        at0.n nVar = captureContainer.f98659y;
        if (nVar.f13604l == 0) {
            nVar.f13594b.u(i17, 10);
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.h0
    public void c() {
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1011a;
        com.tencent.mars.xlog.Log.i(captureContainer.f98641d, "onLongPressFinish");
        a32.c cVar = new a32.c(captureContainer);
        captureContainer.f98643f.l(new a32.t(captureContainer));
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer.b(captureContainer, captureContainer.f98659y.l(cVar));
    }
}
