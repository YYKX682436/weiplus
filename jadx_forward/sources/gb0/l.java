package gb0;

/* loaded from: classes8.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f351497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f351498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, java.lang.String str, long j17, java.lang.Long l17, java.lang.String str2) {
        super(0);
        this.f351495d = context;
        this.f351496e = str;
        this.f351497f = j17;
        this.f351498g = l17;
        this.f351499h = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bh5.c cVar = new bh5.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_open_type", 3L);
        intent.putExtra("key_session_id", this.f351496e);
        intent.putExtra("key_scene_type", this.f351497f);
        intent.putExtra("key_msg_id", this.f351498g);
        intent.putExtra("key_talker", this.f351499h);
        intent.putExtra("key_material_origin", "chat");
        pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.p0.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.d.class);
        cVar.d(intent);
        cVar.f102455a.f102457a = this.f351495d;
        cVar.a(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.ActivityC10638xd29f3d8b.class.getName());
        cVar.b(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.C10637x3843837e.class);
        cVar.g();
        return jz5.f0.f384359a;
    }
}
