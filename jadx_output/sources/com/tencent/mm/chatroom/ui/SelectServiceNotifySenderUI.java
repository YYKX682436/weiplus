package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class SelectServiceNotifySenderUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f63988d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f63989e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f63990f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.SelectMemberScrollBar f63991g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.wd f63992h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f63993i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f63994m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f63995n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f63996o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f63997p = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str = this.f63993i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        setMMTitle(str);
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f485880jf5);
        this.f63988d = listView;
        listView.setBackgroundResource(com.tencent.mm.R.color.BW_93);
        this.f63990f = findViewById(com.tencent.mm.R.id.mjl);
        this.f63996o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484228dg2);
        this.f63992h = new com.tencent.mm.chatroom.ui.wd(this, this);
        new java.util.HashSet().add(c01.z1.r());
        this.f63988d.setAdapter((android.widget.ListAdapter) this.f63992h);
        com.tencent.mm.chatroom.ui.SelectMemberScrollBar selectMemberScrollBar = (com.tencent.mm.chatroom.ui.SelectMemberScrollBar) findViewById(com.tencent.mm.R.id.jft);
        this.f63991g = selectMemberScrollBar;
        selectMemberScrollBar.setOnScrollBarTouchListener(new com.tencent.mm.chatroom.ui.nd(this));
        this.f63991g.setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.mjh);
        this.f63989e = mMEditText;
        mMEditText.addTextChangedListener(new com.tencent.mm.chatroom.ui.pd(this));
        com.tencent.mm.chatroom.ui.wd wdVar = this.f63992h;
        android.view.View view = wdVar.f64633n.f63990f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectServiceNotifySenderUI$ServiceNotifyAdapter", "loadData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gm0.j1.e().j(new com.tencent.mm.chatroom.ui.sd(wdVar));
        setBackBtn(new com.tencent.mm.chatroom.ui.qd(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectServiceNotifySenderUI", "[onCreate]");
        getIntent().getIntExtra("from_scene", 0);
        this.f63993i = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f63994m = getIntent().getBooleanExtra("is_show_owner", true);
        this.f63995n = getIntent().getStringExtra("service_notify_session_id");
        initView();
    }
}
