package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f273277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273281h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        super(0);
        this.f273277d = f4Var;
        this.f273278e = str;
        this.f273279f = str2;
        this.f273280g = str3;
        this.f273281h = activityC19730xa7b9756f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f273277d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, this.f273278e);
        intent.putExtra("fileExt", this.f273279f);
        intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, this.f273280g);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f273281h;
        activityC19730xa7b9756f.setResult(-1, intent);
        activityC19730xa7b9756f.finish();
        return jz5.f0.f384359a;
    }
}
