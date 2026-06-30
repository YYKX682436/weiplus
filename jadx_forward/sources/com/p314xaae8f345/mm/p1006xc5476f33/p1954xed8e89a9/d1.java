package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f234946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f234947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f234948f;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, android.content.Context context, long j17) {
        this.f234948f = e0Var;
        this.f234946d = context;
        this.f234947e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f234946d;
        if (context instanceof android.app.Activity) {
            intent = ((android.app.Activity) context).getIntent();
        }
        if (!intent.hasExtra("Contact_Conversation_IsFromNewFriendToProfile")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "doReportClick , is no from new friend add.");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6788xdc40e792 c6788xdc40e792 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6788xdc40e792();
        long j17 = this.f234947e;
        c6788xdc40e792.f141211h = j17;
        c6788xdc40e792.f141207d = intent.getBooleanExtra("Contact_Conversation_IsSelfSendAdd", false) ? 1L : 2L;
        c6788xdc40e792.f141209f = intent.getBooleanExtra("Contact_Conversation_Isexpired", false) ? 2L : 1L;
        c6788xdc40e792.f141210g = intent.getIntExtra("Contact_Scene", 0);
        c6788xdc40e792.f141208e = intent.getBooleanExtra("Contact_Conversation_IsContact", false) ? 1L : 2L;
        c6788xdc40e792.f141212i = c6788xdc40e792.b(dm.i4.f66875xa013b0d5, this.f234948f.f234954e.d1(), true);
        c6788xdc40e792.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "24723 type_ = " + c6788xdc40e792.f141207d + ",status_ = " + c6788xdc40e792.f141208e + ",is_expired_ = " + c6788xdc40e792.f141209f + ",source_ = " + c6788xdc40e792.f141210g + ",action = " + j17);
    }
}
