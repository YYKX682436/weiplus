package com.p314xaae8f345.mm.p648x55baa833.ui;

/* renamed from: com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI */
/* loaded from: classes8.dex */
public class ActivityC10375x35d0ae60 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: n, reason: collision with root package name */
    public static final kk.j f145531n = new jt0.j(32);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e f145532d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f145533e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f145534f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p648x55baa833.ui.ee f145535g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145536h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145537i;

    /* renamed from: m, reason: collision with root package name */
    public int f145538m = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cjv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        android.view.View view = this.f145534f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e c21506x8bfe589e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21506x8bfe589e) findViewById(com.p314xaae8f345.mm.R.id.f567413jf5);
        this.f145532d = c21506x8bfe589e;
        c21506x8bfe589e.g();
        com.p314xaae8f345.mm.p648x55baa833.ui.ee eeVar = new com.p314xaae8f345.mm.p648x55baa833.ui.ee(this, this, this.f145536h, this.f145537i, this.f145538m);
        this.f145535g = eeVar;
        this.f145532d.setAdapter((android.widget.ListAdapter) eeVar);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mjj);
        this.f145533e = findViewById;
        if (this.f145538m == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/chatroom/ui/SelectedMemberChattingRecordUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f145532d.setVisibility(8);
        }
        this.f145532d.setOnItemClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.be(this));
        this.f145532d.m79055xb7d2c730(new com.p314xaae8f345.mm.p648x55baa833.ui.ce(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.de(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "[onCreate]");
        this.f145536h = getIntent().getStringExtra("RoomInfo_Id");
        this.f145537i = getIntent().getStringExtra("room_member");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedMemberChattingRecordUI", "roomId:%s", this.f145536h);
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        mo54450xbf7c1df6(stringExtra);
        this.f145534f = findViewById(com.p314xaae8f345.mm.R.id.mjk);
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p648x55baa833.ui.ae(this));
    }
}
