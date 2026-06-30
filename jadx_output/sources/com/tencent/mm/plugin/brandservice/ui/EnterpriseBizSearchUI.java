package com.tencent.mm.plugin.brandservice.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class EnterpriseBizSearchUI extends com.tencent.mm.ui.MMActivity implements y90.j, or1.t0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f94035d;

    /* renamed from: e, reason: collision with root package name */
    public y90.k f94036e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView f94037f;

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", str);
        this.f94037f.a(str);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a96;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94035d)) {
            java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.f94035d = stringExtra;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                finish();
            }
        }
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView) findViewById(com.tencent.mm.R.id.ndr);
        this.f94037f = enterpriseBizContactListView;
        enterpriseBizContactListView.setFatherBizName(this.f94035d);
        this.f94037f.setExcludeBizChat(true);
        this.f94037f.i();
        this.f94037f.setMode(1);
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView2 = this.f94037f;
        enterpriseBizContactListView2.getClass();
        enterpriseBizContactListView2.setOnItemClickListener(new or1.j0(enterpriseBizContactListView2));
        if (enterpriseBizContactListView2.getMode() == 0) {
            enterpriseBizContactListView2.setOnItemLongClickListener(new or1.k0(enterpriseBizContactListView2));
        }
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView3 = this.f94037f;
        enterpriseBizContactListView3.f197872p = false;
        fb5.m mVar = enterpriseBizContactListView3.f197866g;
        mVar.c(mVar.f260894d);
        this.f94037f.d(false);
        this.f94037f.setOnTouchListener(this);
        ((android.widget.TextView) this.f94037f.getNoResultView()).setText(com.tencent.mm.R.string.c1k);
        ((x90.q) ((y90.l) i95.n0.c(y90.l.class))).getClass();
        a31.v vVar = new a31.v();
        this.f94036e = vVar;
        vVar.c(true);
        a31.v vVar2 = (a31.v) this.f94036e;
        vVar2.f999u = this;
        vVar2.f210324i = this;
        vVar2.f996r = false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        hideVKB();
        return true;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        ((com.tencent.mm.ui.tools.c9) this.f94036e).j(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f94037f != null) {
            ((java.util.ArrayList) r01.q3.pj().f368275a).clear();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((a31.v) this.f94036e).s();
        ((com.tencent.mm.ui.tools.c9) this.f94036e).a();
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        ((a31.v) this.f94036e).m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
