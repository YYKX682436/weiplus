package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class ExdeviceProfileUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements q32.e {
    public static int M;
    public boolean A;
    public java.lang.String B;
    public android.view.GestureDetector K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f99303d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f99304e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f99305f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99306g;

    /* renamed from: h, reason: collision with root package name */
    public r32.a f99307h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f99308i;

    /* renamed from: m, reason: collision with root package name */
    public r45.hh7 f99309m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView f99310n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f99311o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f99312p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader f99313q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.o3 f99314r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f99315s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f99316t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f99317u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f99318v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f99319w;

    /* renamed from: x, reason: collision with root package name */
    public int f99320x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f99321y = false;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99322z = null;
    public final h32.b C = new com.tencent.mm.plugin.exdevice.ui.h4(this);
    public final android.text.TextPaint D = new android.text.TextPaint(1);
    public int E = 0;
    public final db5.t4 F = new com.tencent.mm.plugin.exdevice.ui.y4(this);
    public final h32.b G = new com.tencent.mm.plugin.exdevice.ui.a5(this);
    public final h32.b H = new com.tencent.mm.plugin.exdevice.ui.x3(this);
    public final h32.b I = new com.tencent.mm.plugin.exdevice.ui.l4(this);

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f99302J = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OplogServiceResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.28
        {
            this.__eventId = 1984241019;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent) {
            com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent2 = oplogServiceResultEvent;
            oplogServiceResultEvent2.f54602g.getClass();
            am.vn vnVar = oplogServiceResultEvent2.f54602g;
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "count: %d ret: %s title: %s content: %s", 0, java.lang.Integer.valueOf(vnVar.f8204a), vnVar.f8205b, vnVar.f8206c);
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.this;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = exdeviceProfileUI.f99322z;
            if (u3Var != null && u3Var.isShowing()) {
                exdeviceProfileUI.f99322z.dismiss();
            }
            exdeviceProfileUI.f99302J.dead();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KeyNeedUpdateRank", true);
            exdeviceProfileUI.setResult(-1, intent);
            exdeviceProfileUI.finish();
            return false;
        }
    };
    public final db5.h5 L = new com.tencent.mm.plugin.exdevice.ui.p4(this);

    public static void U6(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        exdeviceProfileUI.removeAllOptionMenu();
        if (c01.z1.r().equals(exdeviceProfileUI.f99304e)) {
            exdeviceProfileUI.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.exdevice.ui.q4(exdeviceProfileUI));
            return;
        }
        boolean h17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(exdeviceProfileUI.f99304e);
        boolean z17 = (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(exdeviceProfileUI.f99304e, true).getType() & 524288) != 0;
        if (exdeviceProfileUI.f99318v && h17) {
            exdeviceProfileUI.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.exdevice.ui.s4(exdeviceProfileUI));
        } else {
            if (z17) {
                return;
            }
            exdeviceProfileUI.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.exdevice.ui.u4(exdeviceProfileUI));
        }
    }

    public static void V6(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        float f17;
        float f18;
        android.view.View childAt = exdeviceProfileUI.f99312p.getChildAt(0);
        int[] iArr = new int[2];
        if (childAt == null || exdeviceProfileUI.f99312p.getFirstVisiblePosition() != 0) {
            return;
        }
        childAt.getLocationOnScreen(iArr);
        if (M == 0) {
            M = iArr[1];
        }
        int i17 = iArr[1];
        int i18 = M;
        if (i17 <= (-i18) / 2) {
            exdeviceProfileUI.f99310n.setAlpha(0.0f);
            exdeviceProfileUI.f99310n.setVisibility(8);
            return;
        }
        if (i17 > 0) {
            f17 = i17 * 2;
            f18 = i18 * 2.0f;
        } else {
            f17 = i17;
            f18 = i18;
        }
        exdeviceProfileUI.f99310n.setAlpha(f17 / f18);
        exdeviceProfileUI.f99310n.setVisibility(0);
    }

    public final void W6() {
        r32.a aVar = this.f99307h;
        if (aVar == null) {
            this.f99311o.setImageResource(com.tencent.mm.R.color.f478866jc);
            this.f99316t = null;
            return;
        }
        java.lang.String str = this.f99316t;
        java.lang.String str2 = aVar.field_championUrl;
        if (str != str2) {
            if (str == null || !str.equals(str2)) {
                android.widget.ImageView imageView = this.f99311o;
                java.lang.String str3 = this.f99307h.field_championUrl;
                iz5.a.g(null, imageView != null);
                if (com.tencent.mm.sdk.platformtools.u3.e()) {
                    p32.g.b(this, imageView, str3, com.tencent.mm.R.color.f478866jc);
                } else {
                    com.tencent.mm.sdk.platformtools.u3.h(new p32.d(this, imageView, str3, com.tencent.mm.R.color.f478866jc));
                }
                this.f99316t = this.f99307h.field_championUrl;
            }
        }
    }

    public final void X6() {
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader exdeviceProfileListHeader;
        android.view.View view;
        java.lang.String r17 = c01.z1.r();
        android.view.View view2 = this.f99315s;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17) || !r17.equals(this.f99304e)) {
            r32.a aVar = this.f99307h;
            if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_championUrl) || (exdeviceProfileListHeader = this.f99313q) == null) {
                return;
            }
            exdeviceProfileListHeader.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.j4(this));
            return;
        }
        r32.a aVar2 = this.f99307h;
        if (aVar2 != null && com.tencent.mm.sdk.platformtools.t8.K0(aVar2.field_championUrl) && (view = this.f99315s) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader exdeviceProfileListHeader2 = this.f99313q;
        if (exdeviceProfileListHeader2 != null) {
            exdeviceProfileListHeader2.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.g4(this));
        }
    }

    @Override // q32.e
    public void b3(java.lang.String str, q32.d dVar) {
        if ("HardDeviceChampionInfo".equals(str) && this.f99304e.equals(dVar.f359931b)) {
            this.f99307h = com.tencent.mm.plugin.exdevice.model.l3.wi().y0(this.f99304e);
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.m4(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a_7;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(z32.s.class);
        hashSet.add(y32.b.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList P1;
        super.onActivityResult(i17, i18, intent);
        if (p32.g.a(this, i17, i18, intent, this.f99306g)) {
            return;
        }
        if (i17 == 1) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                java.lang.String o17 = new com.tencent.mm.vfs.r6(getCacheDir(), "sport_share_bitmap.jpg").o();
                if (stringExtra == null || stringExtra.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sport.ExdeviceProfileUI", "select conversation failed, toUser is null.");
                    return;
                } else {
                    com.tencent.mm.plugin.exdevice.model.f3.c(this, stringExtra, o17, intent.getStringExtra("custom_send_text"), this.f99317u);
                    db5.e1.T(getContext(), getResources().getString(com.tencent.mm.R.string.f490560yi));
                    return;
                }
            }
            return;
        }
        if (i17 == 2) {
            if (i18 == -1) {
                android.widget.Toast.makeText(this, com.tencent.mm.R.string.j3v, 1).show();
            }
        } else if (i17 == 3 && i18 == -1 && (P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","))) != null) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f99322z;
            if (u3Var != null) {
                u3Var.show();
            }
            gm0.j1.n().f273288b.g(new p32.h(P1, this.I));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x025b, code lost:
    
        if (r2 <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x026f, code lost:
    
        if (r11.f99319w == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0271, code lost:
    
        r12 = getString(com.tencent.mm.R.string.c4e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x02ea, code lost:
    
        setMMTitle(r12);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.w4(r11));
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "mUsername:" + r11.f99304e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0313, code lost:
    
        if (c01.z1.r().equals(r11.f99304e) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0315, code lost:
    
        ((ve4.f) com.tencent.mm.sdk.event.q.f192403a.a(ve4.f.class)).O6(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0327, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0279, code lost:
    
        r2 = (le0.x) i95.n0.c(le0.x.class);
        r1 = new java.lang.Object[1];
        r4 = r11.f99304e;
        r5 = r11.E;
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        r6 = c01.a2.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x029c, code lost:
    
        if (r4.equalsIgnoreCase(r6) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a4, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r11.f99305f) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02a6, code lost:
    
        r12 = (le0.x) i95.n0.c(le0.x.class);
        r4 = getContext();
        r6 = r11.f99305f;
        ((ke0.e) r12).getClass();
        r12 = com.tencent.mm.pluginsdk.ui.span.c0.i(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02cf, code lost:
    
        r1[0] = android.text.TextUtils.ellipsize(r12, r11.D, r5, android.text.TextUtils.TruncateAt.END);
        r12 = getString(com.tencent.mm.R.string.c4h, r1);
        ((ke0.e) r2).getClass();
        r12 = com.tencent.mm.pluginsdk.ui.span.c0.i(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02bc, code lost:
    
        r12 = (le0.x) i95.n0.c(le0.x.class);
        r4 = getContext();
        ((ke0.e) r12).getClass();
        r12 = com.tencent.mm.pluginsdk.ui.span.c0.i(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x026b, code lost:
    
        r11.E = 60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0269, code lost:
    
        if (r11.E > 0) goto L27;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f99302J.dead();
        this.f99321y = true;
        super.onDestroy();
        q32.a hj6 = com.tencent.mm.plugin.exdevice.model.l3.hj();
        hj6.getClass();
        android.util.SparseArray sparseArray = hj6.f359925a;
        if (sparseArray == null) {
            return;
        }
        sparseArray.remove(hashCode());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.v4(this));
        if (this.f99319w) {
            return;
        }
        com.tencent.mm.plugin.exdevice.model.l3.Ri().y0(this.f99304e);
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y3(this));
    }
}
