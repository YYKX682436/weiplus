package com.tencent.mm.chatroom.ui;

/* loaded from: classes14.dex */
public class SelectDateUI extends com.tencent.mm.ui.MMActivity implements gn.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f63958o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.DayPickerView f63959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63960e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f63961f;

    /* renamed from: g, reason: collision with root package name */
    public long f63962g = -1;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f63963h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f63964i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f63965m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f63966n;

    public final int[] T6() {
        com.tencent.mm.chatroom.ui.le leVar = (com.tencent.mm.chatroom.ui.le) this.f63959d.getChildAt(0);
        if (leVar != null) {
            return new int[]{leVar.I, leVar.D + 1};
        }
        return null;
    }

    public void U6(kn.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectDateUI", "null == calendarDay");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", java.lang.Long.valueOf(aVar.f309374e), java.lang.Integer.valueOf(aVar.f309371b), java.lang.Integer.valueOf(aVar.f309372c), java.lang.Integer.valueOf(aVar.f309373d));
        long j17 = aVar.f309375f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", java.lang.Long.valueOf(j17));
        j45.l.u(this, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", this.f63960e).putExtra("finish_direct", true).putExtra("from_date_search", true).putExtra("msg_local_id", j17), null);
        if (com.tencent.mm.storage.z3.S4(this.f63960e)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27229, 1, 4, "", 0, 0, java.lang.Long.valueOf(aVar.f309374e / 1000));
        }
    }

    public void V6(int i17, int i18) {
        this.f63965m.setText(getString(com.tencent.mm.R.string.ndc, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        setMMTitle(com.tencent.mm.R.string.ic9);
        this.f63966n = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.vgl);
        this.f63959d = (com.tencent.mm.chatroom.ui.DayPickerView) findViewById(com.tencent.mm.R.id.kvr);
        this.f63965m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.uh8);
        this.f63964i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mf6);
        this.f63961f = new java.util.HashMap();
        this.f63963h = new com.tencent.mm.sdk.platformtools.n3(getMainLooper());
        this.f63960e = getIntent().getStringExtra("detail_username");
        this.f63959d.setScrolledCallback(new com.tencent.mm.chatroom.ui.jc(this));
        s75.d.b(new com.tencent.mm.chatroom.ui.lc(this), "prepare_data");
        setBackBtn(new com.tencent.mm.chatroom.ui.mc(this));
        this.f63966n.setOnClickListener(new com.tencent.mm.chatroom.ui.nc(this));
    }
}
