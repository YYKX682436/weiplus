package a32;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f1026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer, android.content.Context context) {
        super(2);
        this.f1026d = captureContainer;
        this.f1027e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.v75 v75Var;
        t85.j jVar = (t85.j) obj;
        r45.p64 p64Var = (r45.p64) obj2;
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f1026d;
        r22.a presenter = captureContainer.getPresenter();
        if (presenter != null) {
            w22.g gVar = (w22.g) presenter;
            com.tencent.mars.xlog.Log.i("MicroMsg.CapturePresenter", "changeSticker:" + jVar);
            gVar.f442539j.f423978e = jVar;
            com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer2 = (com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer) gVar.f442531b;
            captureContainer2.f98650p.setStickerInfo(jVar);
            captureContainer2.f98643f.l(new a32.n(captureContainer2, jVar));
        }
        java.lang.String str = (p64Var == null || (v75Var = p64Var.f382795g) == null) ? null : v75Var.f387965e;
        android.widget.TextView textView = captureContainer.f98653s;
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setText((java.lang.CharSequence) null);
        } else {
            java.lang.String string = this.f1027e.getString(com.tencent.mm.R.string.f491089bv5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string.concat(str));
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(captureContainer.getResources().getColor(com.tencent.mm.R.color.f479308vo)), string.length(), spannableString.length(), 33);
            textView.setText(spannableString);
        }
        captureContainer.f98656v = p64Var;
        return jz5.f0.f302826a;
    }
}
