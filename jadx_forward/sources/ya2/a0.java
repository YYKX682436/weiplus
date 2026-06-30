package ya2;

/* loaded from: classes8.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f541953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f541955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f541956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, java.lang.String str, int i17, android.content.Intent intent, android.content.Context context) {
        super(0);
        this.f541953d = j17;
        this.f541954e = str;
        this.f541955f = i17;
        this.f541956g = intent;
        this.f541957h = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.xk a17;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 Yk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Yk(this.f541953d, this.f541954e, this.f541955f, "");
        android.content.Context context = this.f541957h;
        if (Yk == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRouterApi", "enterFinderProfileUI requestFinderObject null");
            pm0.v.X(new ya2.y(context));
        } else {
            java.lang.String str = "";
            android.content.Intent intent = this.f541956g;
            if (intent != null) {
                java.lang.String m76836x6c03c64c = Yk.m76836x6c03c64c();
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                intent.putExtra("finder_username", m76836x6c03c64c);
            }
            if (intent != null) {
                java.lang.String m76836x6c03c64c2 = Yk.m76836x6c03c64c();
                if (m76836x6c03c64c2 == null) {
                    m76836x6c03c64c2 = "";
                }
                intent.putExtra("key_finder_teen_mode_user_id", m76836x6c03c64c2);
            }
            if (intent != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = Yk.m76760x76845fea();
                if (m76760x76845fea != null && (a17 = ya2.d.a(m76760x76845fea, false)) != null && (m75945x2fec8307 = a17.m75945x2fec8307(0)) != null) {
                    str = m75945x2fec8307;
                }
                intent.putExtra("key_biz_username", str);
            }
            pm0.v.X(new ya2.z(context, intent));
        }
        return jz5.f0.f384359a;
    }
}
