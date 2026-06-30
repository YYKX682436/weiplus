package lu2;

/* loaded from: classes.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402903f;

    public e(java.lang.String str, java.lang.String str2, android.content.Context context) {
        this.f402901d = str;
        this.f402902e = str2;
        this.f402903f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DebugDialog", "onClick1");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.f402901d + '\n' + this.f402902e);
        dp.a.m125854x26a183b(this.f402903f, "copy done", 0).show();
    }
}
