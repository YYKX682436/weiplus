package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class SelectedMemberChattingRecordUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final kk.j f63998n = new jt0.j(32);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f63999d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f64000e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f64001f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.chatroom.ui.ee f64002g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f64003h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f64004i;

    /* renamed from: m, reason: collision with root package name */
    public int f64005m = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.view.View view = this.f64001f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView = (com.tencent.mm.ui.base.MMLoadMoreListView) findViewById(com.tencent.mm.R.id.f485880jf5);
        this.f63999d = mMLoadMoreListView;
        mMLoadMoreListView.g();
        com.tencent.mm.chatroom.ui.ee eeVar = new com.tencent.mm.chatroom.ui.ee(this, this, this.f64003h, this.f64004i, this.f64005m);
        this.f64002g = eeVar;
        this.f63999d.setAdapter((android.widget.ListAdapter) eeVar);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mjj);
        this.f64000e = findViewById;
        if (this.f64005m == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f63999d.setVisibility(8);
        }
        this.f63999d.setOnItemClickListener(new com.tencent.mm.chatroom.ui.be(this));
        this.f63999d.setOnLoadMoreListener(new com.tencent.mm.chatroom.ui.ce(this));
        setBackBtn(new com.tencent.mm.chatroom.ui.de(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "[onCreate]");
        this.f64003h = getIntent().getStringExtra("RoomInfo_Id");
        this.f64004i = getIntent().getStringExtra("room_member");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "roomId:%s", this.f64003h);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        setMMTitle(stringExtra);
        this.f64001f = findViewById(com.tencent.mm.R.id.mjk);
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.chatroom.ui.ae(this));
    }
}
