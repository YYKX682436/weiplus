package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class ModRemarkRoomNameUI extends com.tencent.mm.ui.MMActivity implements al5.e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f63816r = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f63817d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f63818e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f63819f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f63820g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f63821h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f63822i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ScrollView f63823m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f63824n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f63825o;

    /* renamed from: p, reason: collision with root package name */
    public int f63826p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f63827q;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRoomNameUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f63821h.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams.topMargin = 0;
            this.f63821h.setLayoutParams(layoutParams);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f63824n;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f63824n.getPaddingTop(), this.f63824n.getPaddingRight(), 0);
            this.f63823m.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f63821h.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f63821h.setLayoutParams(layoutParams2);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = this.f63824n;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f63824n.getPaddingTop(), this.f63824n.getPaddingRight(), i17);
        int height = this.f63823m.getHeight();
        this.f63824n.requestLayout();
        this.f63824n.post(new com.tencent.mm.chatroom.ui.a5(this, height));
    }

    public final void T6(boolean z17) {
        if (this.f63818e == null) {
            return;
        }
        if (z17 && la5.b.f317600a.g(true)) {
            android.view.View view = this.f63818e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f63818e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "updateClearBtnVisable", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2e;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View view;
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f63823m = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcm);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.hdf);
        this.f63824n = inputPanelLinearLayout;
        inputPanelLinearLayout.e(this);
        this.f63817d = (com.tencent.mm.ui.base.MMClearEditText) findViewById(com.tencent.mm.R.id.jpm);
        this.f63818e = findViewById(com.tencent.mm.R.id.d9a);
        this.f63819f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpo);
        this.f63820g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jpn);
        this.f63821h = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f63822i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhj);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.bgj);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483622bh1);
        this.f63826p = getIntent().getIntExtra("Key_Scenen", 0);
        this.f63825o = getIntent().getStringExtra("Key_Room_Id");
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRoomNameUI", "scene %d, roomId %s", java.lang.Integer.valueOf(this.f63826p), this.f63825o);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f63825o)) {
            finish();
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f63825o, true);
        if (((int) n17.E2) > 0) {
            if (this.f63826p == 3) {
                ng5.a.a(imageView, c01.z1.r());
            } else {
                ng5.a.a(imageView, n17.d1());
            }
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String P0 = n17.P0();
        if (P0 == null) {
            P0 = "";
        }
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, P0);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String w07 = n17.w0();
        if (w07 == null) {
            w07 = "";
        }
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, w07);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkRoomNameUI", "roomName %s, remarkName %s", i17, i18);
        int i19 = this.f63826p;
        if (i19 == 1) {
            this.f63819f.setText(com.tencent.mm.R.string.i3r);
            this.f63820g.setText(com.tencent.mm.R.string.gy_);
            this.f63817d.setText(i17);
            if (com.tencent.mm.sdk.platformtools.t8.J0(i17)) {
                this.f63817d.setHint(getString(com.tencent.mm.R.string.i4x));
            }
            getString(com.tencent.mm.R.string.f492880i40);
            getString(com.tencent.mm.R.string.f492882i42);
        } else if (i19 == 2) {
            this.f63819f.setText(com.tencent.mm.R.string.f492895i61);
            this.f63820g.setText(com.tencent.mm.R.string.gya);
            this.f63817d.setText(i18);
            this.f63817d.setHint(com.tencent.mm.R.string.f492895i61);
            java.lang.CharSequence string = com.tencent.mm.sdk.platformtools.t8.J0(i17) ? getString(com.tencent.mm.R.string.i4x) : i17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483623bh2);
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = getString(com.tencent.mm.R.string.gy9, string);
            ((ke0.e) xVar3).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string2));
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483624bh3);
            if (com.tencent.mm.sdk.platformtools.t8.J0(i17)) {
                textView2.setVisibility(8);
            } else {
                textView2.setOnClickListener(new com.tencent.mm.chatroom.ui.v4(this, i17, textView2));
            }
            getString(com.tencent.mm.R.string.itd);
        } else if (i19 != 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemarkRoomNameUI", "unknown scene %d, finish()", java.lang.Integer.valueOf(i19));
            finish();
        } else {
            this.f63819f.setText(com.tencent.mm.R.string.i5k);
            this.f63820g.setText(com.tencent.mm.R.string.gy8);
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f63817d;
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f63825o);
            java.lang.String str = z07 != null ? z07.field_selfDisplayName : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = c01.z1.l();
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            android.text.SpannableString i27 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, str);
            ((ke0.e) xVar4).getClass();
            mMClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, i27));
            getString(com.tencent.mm.R.string.f492881i41);
            getString(com.tencent.mm.R.string.i3z);
        }
        this.f63827q = this.f63817d.getText().toString();
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f63817d;
        mMClearEditText2.setSelection(mMClearEditText2.getText().length());
        if (la5.b.f317600a.g(true) && (view = this.f63818e) != null) {
            view.setOnClickListener(new com.tencent.mm.chatroom.ui.w4(this));
            T6(this.f63817d.getText().length() > 0);
        }
        this.f63817d.addTextChangedListener(new com.tencent.mm.chatroom.ui.x4(this));
        if (this.f63826p == 2) {
            ck5.f b17 = ck5.f.b(this.f63817d);
            b17.f42561f = 0;
            b17.f42560e = 64;
            b17.f42556a = false;
            b17.d(null);
        } else {
            ck5.f b18 = ck5.f.b(this.f63817d);
            b18.f42561f = 0;
            b18.f42560e = 32;
            b18.f42556a = false;
            b18.d(null);
        }
        this.f63817d.requestFocus();
        setBackBtn(new com.tencent.mm.chatroom.ui.y4(this));
        this.f63821h.setOnClickListener(new com.tencent.mm.chatroom.ui.z4(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f63825o = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.chatroom.ui.e5.class);
    }
}
