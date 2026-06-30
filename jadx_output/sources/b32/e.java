package b32;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f17633d;

    public e(com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer) {
        this.f17633d = captureEditorContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = this.f17633d;
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = captureEditorContainer.f98695f;
        if (emojiCaptureReporter == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter2 = captureEditorContainer.f98695f;
        if (emojiCaptureReporter2 == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        emojiCaptureReporter.f98591o = currentTimeMillis - emojiCaptureReporter2.f98586g;
        if (emojiCaptureReporter2 == null) {
            kotlin.jvm.internal.o.o("reporter");
            throw null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15982, 17, java.lang.Long.valueOf(emojiCaptureReporter2.f98583d), 0, 0, java.lang.Long.valueOf(emojiCaptureReporter2.f98591o), 0, 0, 0, 0, java.lang.Integer.valueOf(emojiCaptureReporter2.G), emojiCaptureReporter2.A, java.lang.Integer.valueOf(emojiCaptureReporter2.B), 0, java.lang.Integer.valueOf(emojiCaptureReporter2.C), emojiCaptureReporter2.D, java.lang.Integer.valueOf(emojiCaptureReporter2.E), java.lang.Integer.valueOf(emojiCaptureReporter2.F));
        com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(3, 1);
        r22.c presenter = captureEditorContainer.getPresenter();
        if (presenter != null) {
            w22.v vVar = (w22.v) presenter;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(vVar.f442583d)) {
                s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_IMITATE_SAVED_BOOLEAN;
                if (!((java.lang.Boolean) Bi.l(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                    com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(vVar.f442580a);
                    i0Var.d(com.tencent.mm.R.string.bpr);
                    i0Var.f(com.tencent.mm.R.string.bpq);
                    i0Var.f211821b.H = new w22.m(vVar);
                    i0Var.h();
                    ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().u(u3Var, java.lang.Boolean.TRUE);
                }
            }
            vVar.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
