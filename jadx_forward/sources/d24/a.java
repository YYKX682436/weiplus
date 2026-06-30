package d24;

/* loaded from: classes.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17510x3aecf297 f307432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307434c;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17510x3aecf297 c17510x3aecf297, android.content.Context context, java.lang.String str) {
        this.f307432a = c17510x3aecf297;
        this.f307433b = context;
        this.f307434c = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.SettingAdditionBottom", "OpenLiteApp fail");
        this.f307432a.y7(this.f307433b, this.f307434c);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.SettingAdditionBottom", "OpenLiteApp success");
    }
}
