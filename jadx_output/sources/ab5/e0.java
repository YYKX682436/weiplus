package ab5;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab5.i0 f2928a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ab5.i0 i0Var, android.os.Looper looper) {
        super(looper);
        this.f2928a = i0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        android.view.View view;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        ab5.i0 i0Var = this.f2928a;
        if (i0Var.f2955h == null || i0Var.f2953f == null || (view = i0Var.f2952e) == null || (chatFooter = i0Var.f2959o) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceImageBubble", "these references include null reference");
            return;
        }
        android.graphics.Bitmap bitmap = i0Var.f2958n;
        if (bitmap != null) {
            i0Var.onBitmapLoaded(bitmap);
        } else {
            i0Var.d();
        }
        boolean z17 = i0Var.f2960p;
        int i17 = z17 ? 83 : 85;
        int i18 = z17 ? 0 : 10;
        int yFromBottom = chatFooter.getYFromBottom();
        android.graphics.Rect rect = com.tencent.mm.ui.bk.f197978a;
        int i19 = i0Var.f2960p ? 0 : i18 + rect.right;
        int i27 = yFromBottom + rect.bottom;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceImageBubble", "bubble navbar height %s %s", java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
        try {
            i0Var.f2953f.showAtLocation(view, i17, i19, i27);
            new com.tencent.mm.sdk.platformtools.b4(new ab5.f0(i0Var), false).c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        } catch (android.view.WindowManager.BadTokenException unused) {
        }
    }
}
