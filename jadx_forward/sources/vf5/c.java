package vf5;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf5.d f517943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f517945f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vf5.d dVar, java.lang.String str, int i17) {
        super(0);
        this.f517943d = dVar;
        this.f517944e = str;
        this.f517945f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "blacklist_user_clicks");
        hashMap.put("black_list_sid", (java.lang.String) ((jz5.n) this.f517943d.f517947e).mo141623x754a37bb());
        hashMap.put("wx_username", this.f517944e);
        hashMap.put("account_index", java.lang.String.valueOf(this.f517945f));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 33328);
        return jz5.f0.f384359a;
    }
}
