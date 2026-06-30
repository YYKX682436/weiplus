package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/SelectLocalFileRouterUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SelectLocalFileRouterUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f109628p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f109629d;

    /* renamed from: h, reason: collision with root package name */
    public long f109633h;

    /* renamed from: i, reason: collision with root package name */
    public long f109634i;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f109630e = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.mq(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f109631f = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.kq(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f109632g = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.lq(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f109635m = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.gq(this));

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f109636n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109637o = "";

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
    
        r0 = (java.lang.String) ((jz5.n) r0).getValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:8:0x000d, B:10:0x0017, B:13:0x001e, B:15:0x0023, B:17:0x0077, B:21:0x0083, B:23:0x0089, B:29:0x009c, B:32:0x00a3, B:35:0x00cd, B:37:0x00d8, B:42:0x00e2, B:43:0x00f6, B:45:0x00eb), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.U6(java.lang.String):void");
    }

    public final int V6() {
        return ((java.lang.Number) ((jz5.n) this.f109631f).getValue()).intValue();
    }

    public final long W6() {
        return ((java.lang.Number) ((jz5.n) this.f109630e).getValue()).longValue();
    }

    public final void X6(android.net.Uri uri) {
        if (!com.tencent.mm.sdk.platformtools.t8.W0(uri)) {
            Y6(-201);
            com.tencent.mars.xlog.Log.e("FinderSelectLocalFileUI", "onActivityResult fail uri not safe");
            return;
        }
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.o.f(uri2, "toString(...)");
        boolean j17 = com.tencent.mm.vfs.w6.j(uri2);
        if (j17) {
            U6(uri2);
        } else {
            Y6(-201);
        }
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "onActivityResult: exists=" + j17 + ", uri=" + uri + ", path=" + uri2);
    }

    public final void Y6(int i17) {
        com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent = new com.tencent.mm.autogen.events.MusicPostSelectEvent();
        am.kk kkVar = musicPostSelectEvent.f54513g;
        kkVar.f7160a = "";
        kkVar.f7162c = false;
        kkVar.f7163d = i17;
        musicPostSelectEvent.e();
        finish();
    }

    public final void Z6(java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "startUpload filePath null");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f109629d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f109629d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.feed.ui.qq.f110470d);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("FinderSelectLocalFileUI", "uploadAudioTrack: audio track " + str + " is not file");
        }
        pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.ui.rq(str, this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "onActivityResult: requestCode=" + i17 + ", resultCode=" + i18);
        if (i17 != 88889 || i18 != -1) {
            if (i17 == 88889) {
                com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent = new com.tencent.mm.autogen.events.MusicPostSelectEvent();
                am.kk kkVar = musicPostSelectEvent.f54513g;
                kkVar.f7160a = "";
                kkVar.f7162c = true;
                musicPostSelectEvent.e();
                finish();
                return;
            }
            return;
        }
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        boolean e17 = com.tencent.mm.sdk.platformtools.t8.e1(getContext(), data);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean h17 = j35.u.h(getContext(), "android.permission.READ_EXTERNAL_STORAGE");
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", "onActivityResult: needRequestPermission=" + e17 + " hasStoragePermission " + h17);
        if (!e17 || h17) {
            X6(data);
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        java.lang.String string = getString(com.tencent.mm.R.string.hht);
        java.lang.String string2 = getString(com.tencent.mm.R.string.f0k);
        java.lang.String string3 = getString(com.tencent.mm.R.string.f0k);
        ((sb0.f) jVar).getClass();
        j35.u.k(getContext(), 0, new com.tencent.mm.plugin.finder.feed.ui.pq(this, data), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, string, string2, string3, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17 = true;
        supportRequestWindowFeature(1);
        setTheme(com.tencent.mm.R.style.f494372la);
        vj5.o.e(getWindow());
        super.onCreate(bundle);
        if (getIntent().getIntExtra("PICKER_TYPE", 1) != 1) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.GET_CONTENT");
            intent.setType("audio/*");
            intent.addCategory("android.intent.category.OPENABLE");
            startActivityForResult(intent, 88889);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("PICKER_FILE_TYPE");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            stringExtra = "file";
        }
        java.lang.String str = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("PICKER_FILE_EXTENSION");
        if (stringExtra2 != null && !r26.n0.N(stringExtra2)) {
            z17 = false;
        }
        if (z17) {
            stringExtra2 = "[mp3]";
        }
        ((uv1.d) ((lo.k) i95.n0.c(lo.k.class))).Ai(getContext(), str, 1, stringExtra2, new com.tencent.mm.plugin.finder.feed.ui.iq(this));
    }
}
