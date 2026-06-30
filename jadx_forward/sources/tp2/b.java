package tp2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp2.f f502652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f502653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f502654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f502655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f502656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502657i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502658m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f502659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f502660o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f502661p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ jq2.a f502662q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f502663r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.List f502664s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tp2.f fVar, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, int i18, android.os.Bundle bundle, so2.j5 j5Var2, jq2.a aVar, long j17, java.util.List list) {
        super(2);
        this.f502652d = fVar;
        this.f502653e = i17;
        this.f502654f = j5Var;
        this.f502655g = arrayList;
        this.f502656h = view;
        this.f502657i = str;
        this.f502658m = str2;
        this.f502659n = i18;
        this.f502660o = bundle;
        this.f502661p = j5Var2;
        this.f502662q = aVar;
        this.f502663r = j17;
        this.f502664s = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        tp2.f fVar = this.f502652d;
        int i17 = this.f502653e;
        so2.j5 j5Var = this.f502654f;
        java.util.ArrayList arrayList = this.f502655g;
        android.view.View view = this.f502656h;
        java.lang.String str = this.f502657i;
        java.lang.String str2 = this.f502658m;
        int i18 = this.f502659n;
        android.os.Bundle bundle = this.f502660o;
        so2.j5 j5Var2 = this.f502661p;
        jq2.a aVar = this.f502662q;
        long j17 = this.f502663r;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        tp2.f.b(fVar, i17, j5Var, arrayList, view, str, str2, booleanValue, i18, bundle, j5Var2, 0L, aVar, j17, intent, this.f502664s, 1024, null);
        return jz5.f0.f384359a;
    }
}
