package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLivePostSecurityUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public long E;
    public final com.tencent.mm.sdk.event.IListener F;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109396v = "FinderLivePostSecurityUI";

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109397w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.jb(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109398x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.nb(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109399y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ib(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109400z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.hb(this));
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.gb(this));
    public final int B = 10000;
    public final int C = 10001;
    public int D = -1;

    public FinderLivePostSecurityUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.F = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI$exWindowCloseEventIListener$1
            {
                this.__eventId = 1684674094;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent) {
                com.tencent.mm.autogen.events.WebViewExWindowCloseEvent event = webViewExWindowCloseEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (!kotlin.jvm.internal.o.b(event.f54984g.f7220a, "next_continue_open_live")) {
                    return false;
                }
                com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI = com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.this;
                com.tencent.mars.xlog.Log.i(finderLivePostSecurityUI.f109396v, "face verify success,and next");
                finderLivePostSecurityUI.setResult(-1);
                finderLivePostSecurityUI.finish();
                return false;
            }
        };
    }

    public static final void d7(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI, java.lang.String str) {
        finderLivePostSecurityUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        if (zl2.q4.f473933a.E()) {
            db5.t7.makeText(finderLivePostSecurityUI.getContext(), "url: " + str, 0).show();
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("forceHideShare", true);
        j45.l.o(finderLivePostSecurityUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, finderLivePostSecurityUI.C, true);
    }

    public static /* synthetic */ java.lang.String g7(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI, java.lang.Boolean bool, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        if ((i17 & 2) != 0) {
            l17 = 0L;
        }
        return finderLivePostSecurityUI.e7(bool, l17);
    }

    public final java.lang.String e7(java.lang.Boolean bool, java.lang.Long l17) {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar2.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i : 0L;
        try {
            cl0.g gVar = new cl0.g();
            gVar.h("finder_username", xy2.c.e(this));
            gVar.o("entrance_type", i17);
            gVar.p("entrance_id", j17);
            if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                gVar.h("staytime", l17);
            }
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.d(gVar2);
            return gVar2;
        } catch (java.lang.Exception unused) {
            return "{}";
        }
    }

    public final java.util.HashMap f7(java.lang.String str) {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar2.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", xy2.c.e(this));
        hashMap.put("entrance_type", java.lang.String.valueOf(i17));
        hashMap.put("entrance_id", java.lang.String.valueOf(j17));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.axb;
    }

    public final com.tencent.mm.ui.widget.MMNeat7extView h7() {
        return (com.tencent.mm.ui.widget.MMNeat7extView) ((jz5.n) this.f109399y).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str = this.f109396v;
        com.tencent.mars.xlog.Log.i(str, "onActivityResult requestCode:" + i17 + " , resultCode:" + i18);
        if (i17 != this.B) {
            if (i17 == this.C) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("161", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
                return;
            }
            return;
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("159", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
        if (i18 != -1 || bundleExtra == null) {
            return;
        }
        java.lang.String string = bundleExtra.getString("result_json");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        int i19 = new cl0.g(string).getInt("code");
        com.tencent.mars.xlog.Log.i(str, "onFaceVertifyResult, code:" + i19);
        if (i19 == 0) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0216  */
    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        int i17 = this.D;
        if (i17 == 2) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("157", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        } else if (i17 == 3) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("158", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        } else if (i17 == 4) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ok("160", e7(java.lang.Boolean.TRUE, java.lang.Long.valueOf(c01.id.c() - this.E)));
        }
        this.F.dead();
        super.onDestroy();
    }
}
