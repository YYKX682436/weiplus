package qg5;

/* loaded from: classes9.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(android.content.Context context, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444645e = context;
        this.f444646f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qg5.o3 o3Var = new qg5.o3(this.f444645e, this.f444646f, interfaceC29045xdcb5ca57);
        o3Var.f444644d = obj;
        return o3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.o3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.content.Context context = this.f444645e;
        java.lang.Object systemService = context.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (clipboardManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoCopyChatRecordsFSC", "getClipboardManager failed");
            return f0Var;
        }
        android.content.ClipDescription clipDescription = new android.content.ClipDescription("", new java.lang.String[]{"text/plain"});
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_CHAT_RECORDS_PROVIDER_SESSION_ID", this.f444646f);
        java.lang.String packageName = context.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_PACKAGE_NAME", packageName);
        clipboardManager.setPrimaryClip(new android.content.ClipData(clipDescription, new android.content.ClipData.Item("", intent, android.net.Uri.EMPTY)));
        return f0Var;
    }
}
