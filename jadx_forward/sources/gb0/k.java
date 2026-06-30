package gb0;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f351489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f351491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351493i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(0);
        this.f351488d = context;
        this.f351489e = j17;
        this.f351490f = str;
        this.f351491g = j18;
        this.f351492h = str2;
        this.f351493i = str3;
        this.f351494m = str4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bh5.c cVar = new bh5.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_open_type", this.f351489e);
        intent.putExtra("key_session_id", this.f351490f);
        intent.putExtra("key_scene_type", this.f351491g);
        intent.putExtra("key_is_multi_select", false);
        intent.putExtra("key_material_model", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(this.f351492h, this.f351493i, this.f351494m));
        intent.putExtra("key_material_origin", "");
        pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.h.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.o0.class);
        cVar.d(intent);
        cVar.f102455a.f102457a = this.f351488d;
        cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.ActivityC10638xd29f3d8b.class.getName());
        cVar.b(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.C10637x3843837e.class);
        cVar.g();
        return jz5.f0.f384359a;
    }
}
