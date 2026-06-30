package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class EditorFileUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final long f96457z = ip.c.k();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f96458d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f96459e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f96460f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f96461g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f96462h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f96463i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f96464m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f96465n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f96466o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f96467p;

    /* renamed from: s, reason: collision with root package name */
    public r45.gp0 f96470s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile f96471t;

    /* renamed from: y, reason: collision with root package name */
    public boolean f96476y;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f96468q = null;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f96469r = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: u, reason: collision with root package name */
    public boolean f96472u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f96473v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f96474w = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.e f96475x = new com.tencent.mm.plugin.component.editor.r(this);

    public final int T6() {
        int i17 = this.f96470s.I;
        if (i17 == 15) {
            return 4;
        }
        if (i17 == 10130) {
            return 8;
        }
        return i17;
    }

    public final void U6() {
        r45.jp0 jp0Var;
        if (this.f96471t.getFileStatus() != 1) {
            this.f96471t.setFileStatus(1);
            com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = this.f96471t;
            java.lang.String c17 = hx1.b.c(this.f96470s);
            if (c17 == null) {
                c17 = "";
            }
            absHandOffFile.setFullPath(c17);
            ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f96471t);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f96471t);
        }
        if (T6() == 15 && (jp0Var = this.f96470s.O1) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.O1.f378001g)) {
            this.f96473v = true;
            this.f96461g.setVisibility(8);
            android.view.View view = this.f96466o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f96460f.setVisibility(8);
            this.f96458d.setVisibility(8);
            this.f96459e.setVisibility(8);
            this.f96463i.setVisibility(8);
            java.lang.String c18 = hx1.b.c(this.f96470s);
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
            this.f96468q = com.tencent.mm.pluginsdk.ui.tools.n8.a(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f96468q, 0, layoutParams);
            this.f96468q.setVideoCallback(new com.tencent.mm.plugin.component.editor.w(this));
            fp.k.b();
            if (c18 != null) {
                this.f96468q.stop();
                this.f96468q.setVideoPath(c18);
            }
            fp.k.b();
        }
        if (T6() != 15 && T6() != 4) {
            android.view.View view2 = this.f96466o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f96460f.setVisibility(4);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.A)) {
                this.f96458d.setVisibility(8);
            } else {
                this.f96458d.setVisibility(0);
            }
            this.f96459e.setVisibility(0);
            this.f96463i.setVisibility(0);
            return;
        }
        if (this.f96473v) {
            return;
        }
        android.view.View view3 = this.f96466o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f96460f.setVisibility(8);
        this.f96458d.setVisibility(8);
        this.f96459e.setVisibility(0);
        this.f96459e.setText(com.tencent.mm.R.string.cb9);
        this.f96463i.setVisibility(8);
        X6();
    }

    public final void V6() {
        this.f96460f.setVisibility(8);
        this.f96458d.setVisibility(8);
        this.f96459e.setVisibility(8);
        android.view.View view = this.f96466o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f96463i.setVisibility(0);
        if (this.f96470s.I == 4) {
            this.f96463i.setGravity(17);
            this.f96463i.setText(com.tencent.mm.R.string.cbv);
            return;
        }
        this.f96463i.setGravity(17);
        this.f96463i.setText(com.tencent.mm.R.string.cbu);
        if (this.f96476y) {
            return;
        }
        this.f96476y = true;
    }

    public final void W6() {
        android.view.View view = this.f96466o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f96459e.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.A)) {
            this.f96458d.setVisibility(8);
        } else {
            this.f96458d.setVisibility(0);
        }
        this.f96460f.setVisibility(0);
        this.f96460f.setText(com.tencent.mm.R.string.cb7);
        this.f96463i.setVisibility(8);
    }

    public final void X6() {
        if (this.f96474w) {
            return;
        }
        this.f96474w = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_fav_path", hx1.b.c(this.f96470s));
        intent.putExtra("key_detail_fav_thumb_path", hx1.b.e(this.f96470s));
        intent.putExtra("key_detail_fav_video_duration", this.f96470s.f375448y);
        intent.putExtra("key_detail_statExtStr", this.f96470s.R1);
        intent.putExtra("key_detail_fav_video_scene_from", 1);
        intent.putExtra("key_detail_msg_uuid", this.f96470s.f375431q2);
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a5e;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 5);
        if (i18 == -1 && i17 == 1001) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            T6();
            com.tencent.mm.plugin.component.editor.x xVar = new com.tencent.mm.plugin.component.editor.x(this, Q);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.component.editor.h(this, com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")), stringExtra2, xVar));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f96470s = new r45.gp0();
        try {
            this.f96470s.parseFrom(getIntent().getByteArrayExtra("data_item_key"));
        } catch (java.io.IOException unused) {
        }
        this.f96458d = (android.widget.Button) findViewById(com.tencent.mm.R.id.l3u);
        this.f96459e = (android.widget.Button) findViewById(com.tencent.mm.R.id.kio);
        this.f96460f = (android.widget.Button) findViewById(com.tencent.mm.R.id.f484115d31);
        this.f96461g = (com.tencent.mm.ui.MMImageView) findViewById(com.tencent.mm.R.id.h6y);
        this.f96462h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k3s);
        this.f96463i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487334ob5);
        this.f96467p = findViewById(com.tencent.mm.R.id.f484120d40);
        this.f96466o = findViewById(com.tencent.mm.R.id.d3v);
        this.f96464m = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.d3t);
        this.f96465n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d3x);
        if (4 == T6()) {
            setMMTitle(com.tencent.mm.R.string.cdy);
        } else if (15 == T6()) {
            setMMTitle(com.tencent.mm.R.string.ccx);
            findViewById(com.tencent.mm.R.id.oy7).setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        } else {
            setMMTitle(com.tencent.mm.R.string.cav);
        }
        if (T6() == 4) {
            this.f96461g.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_video);
        } else {
            this.f96461g.setImageResource(o25.y.a(this.f96470s.K));
        }
        this.f96462h.setText(this.f96470s.f375404d);
        setBackBtn(new com.tencent.mm.plugin.component.editor.j(this));
        this.f96459e.setOnClickListener(new com.tencent.mm.plugin.component.editor.k(this));
        java.lang.String str = this.f96470s.A;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f96458d.setOnClickListener(new com.tencent.mm.plugin.component.editor.l(this, str));
        }
        this.f96460f.setOnClickListener(new com.tencent.mm.plugin.component.editor.m(this));
        this.f96467p.setOnClickListener(new com.tencent.mm.plugin.component.editor.n(this));
        com.tencent.mm.plugin.handoff.model.AbsHandOffFile Ai = ((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Ai(this.f96470s, null, null, hx1.b.c(null));
        this.f96471t = Ai;
        Ai.setSource(1);
        this.f96471t.setFileStatus(com.tencent.mm.vfs.w6.j(hx1.b.c(this.f96470s)) ? 1 : 2);
        ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f96471t);
        ((d73.i) i95.n0.c(d73.i.class)).Ma(this.f96471t);
        if (T6() != 15 || com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SightForwardEnable"), 0) == 1) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.component.editor.u(this));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.EditorFileUI", "can not retransmit sight msg");
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.f375438u);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.f375411g2) || com.tencent.mm.sdk.platformtools.t8.K0(this.f96470s.f375407e2);
        if (!z17 && !z18) {
            V6();
        } else if (com.tencent.mm.vfs.w6.j(hx1.b.c(this.f96470s))) {
            enableOptionMenu(true);
            U6();
        } else {
            W6();
            enableOptionMenu(false);
        }
        com.tencent.mm.plugin.component.editor.f.f96553d.b(this.f96475x);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f96468q;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f96468q.stop();
            this.f96468q.onDetach();
        }
        com.tencent.mm.plugin.component.editor.f fVar = com.tencent.mm.plugin.component.editor.f.f96553d;
        fVar.e(this.f96470s.T);
        ((java.util.ArrayList) fVar.f96554a).remove(this.f96475x);
        if (this.f96471t != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f96471t);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f96468q;
        if (f4Var != null) {
            f4Var.stop();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f96468q;
        if (f4Var != null) {
            f4Var.start();
        }
    }
}
