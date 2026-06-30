package y14;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f540442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f540444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, java.lang.String str, android.app.Activity activity) {
        super(0);
        this.f540442d = f4Var;
        this.f540443e = str;
        this.f540444f = activity;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f540442d.dismiss();
        java.lang.String str = this.f540443e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", "download image success: %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImageMode", 1);
        intent.putExtra("CropImage_Filter", true);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        intent.putExtra("CropImage_OutputPath", com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(c01.z1.r() + ".crop", true));
        intent.putExtra("CropImage_from_scene", 3);
        intent.putExtra("CropImage_source", 2);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setData(a17.h());
        ((com.p314xaae8f345.mm.app.y7) f14.g.b()).q(this.f540444f, intent2, intent, g83.a.a(), 4, null);
        return jz5.f0.f384359a;
    }
}
