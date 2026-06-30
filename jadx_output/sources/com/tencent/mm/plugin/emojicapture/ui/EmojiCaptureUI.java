package com.tencent.mm.plugin.emojicapture.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "y22/h", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiCaptureUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f98605u = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer f98607e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer f98608f;

    /* renamed from: g, reason: collision with root package name */
    public r22.a f98609g;

    /* renamed from: h, reason: collision with root package name */
    public r22.c f98610h;

    /* renamed from: i, reason: collision with root package name */
    public int f98611i;

    /* renamed from: m, reason: collision with root package name */
    public long f98612m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98614o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f98615p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureReceiver f98616q;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1 f98619t;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98606d = "MicroMsg.EmojiCaptureUI";

    /* renamed from: n, reason: collision with root package name */
    public int f98613n = 2;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter f98617r = new com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter();

    /* renamed from: s, reason: collision with root package name */
    public final y22.m f98618s = new y22.m(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1] */
    public EmojiCaptureUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f98619t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HardCoderSystemEvent>(a0Var) { // from class: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1
            {
                this.__eventId = -637576831;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HardCoderSystemEvent hardCoderSystemEvent) {
                com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI;
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer;
                com.tencent.mm.autogen.events.HardCoderSystemEvent event = hardCoderSystemEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.hh hhVar = event.f54432g;
                if (hhVar == null || (captureContainer = (emojiCaptureUI = com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.this).f98607e) == null) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(emojiCaptureUI.f98606d, "summerhardcoder system event [%s] BackCamera[%s]", java.lang.Integer.valueOf(hhVar.f6834a), java.lang.Boolean.valueOf(captureContainer.f98660z));
                if (hhVar.f6834a != 1 || !captureContainer.f98660z) {
                    return false;
                }
                captureContainer.d();
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477726n);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return wo.v1.f447822b.O ? 7 : 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a6a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (((w22.v) r0).f() == true) goto L8;
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBackPressed() {
        /*
            r4 = this;
            r22.c r0 = r4.f98610h
            r1 = 0
            if (r0 == 0) goto Lf
            w22.v r0 = (w22.v) r0
            boolean r0 = r0.f()
            r2 = 1
            if (r0 != r2) goto Lf
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 != 0) goto L19
            y22.m r0 = r4.f98618s
            r2 = 2
            r3 = 0
            y22.h.a(r0, r1, r3, r2, r3)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.onBackPressed():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0495  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f98606d, "onDestroy");
        dead();
        super.onDestroy();
        r22.a aVar = this.f98609g;
        if (aVar != null) {
            w22.g gVar = (w22.g) aVar;
            gVar.f442540k.d();
            x22.f fVar = gVar.f442541l;
            if (fVar != null) {
                fVar.f451565a = null;
            }
        }
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f98607e;
        if (captureContainer != null) {
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = captureContainer.f98648n;
            editorStickerView.getClass();
            u85.i.f425707a.f(editorStickerView.f98681v);
            editorStickerView.f98673n.getClass();
            v85.e.f434110h = null;
        }
        r22.c cVar = this.f98610h;
        if (cVar != null) {
            w22.v vVar = (w22.v) cVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "destroy");
            r22.d dVar = vVar.f442581b;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
            if (f98697h != null) {
                f98697h.stop();
            }
            dVar.getF98698i().b();
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = (com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) dVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy ");
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = captureEditorContainer.f98707u;
            sb6.append(chatFooterPanel);
            com.tencent.mars.xlog.Log.i(captureEditorContainer.f98693d, sb6.toString());
            chatFooterPanel.a();
            vVar.f442591l.getClass();
            qr.e.f366008a.b(vVar.f442592m.f423975b, vVar.f442594o);
        }
        com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureReceiver emojiCaptureReceiver = this.f98616q;
        if (emojiCaptureReceiver != null) {
            unregisterReceiver(emojiCaptureReceiver);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markEmojiCaptureUIOnDestroy");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 1L, 1L);
        is0.b.f294391a.c();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (wo.v1.f447822b.f447661f == 1 && i17 == 700) {
            com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f98607e;
            if ((captureContainer != null && captureContainer.f98660z) && captureContainer != null) {
                captureContainer.d();
            }
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f98611i != 0) {
            r22.c cVar = this.f98610h;
            if (cVar != null) {
                ((w22.v) cVar).g();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f98607e;
        if (captureContainer != null) {
            com.tencent.mars.xlog.Log.i(captureContainer.f98641d, "PauseCapture");
            com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration f98650p = captureContainer.getF98650p();
            f98650p.f98661v.b();
            com.tencent.mm.plugin.emojicapture.ui.editor.text.FontAnimTextView fontAnimTextView = f98650p.f98662w;
            fontAnimTextView.removeCallbacks(fontAnimTextView.f98780g);
            captureContainer.f98659y.k();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f98611i != 0) {
            r22.c cVar = this.f98610h;
            if (cVar != null) {
                ((w22.v) cVar).h();
                return;
            }
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (!j35.u.h(this, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
            com.tencent.mars.xlog.Log.i(this.f98606d, "initOnCreateAfterConnected: no permission");
            return;
        }
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = this.f98607e;
        if (captureContainer != null) {
            captureContainer.c();
        }
    }
}
