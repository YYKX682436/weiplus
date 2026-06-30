package df5;

/* loaded from: classes11.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f313655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int[] f313657h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v11.q f313658i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f313659m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313660n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, int i18, df5.j1 j1Var, int i19, int[] iArr, v11.q qVar, int i27, java.util.List list) {
        super(0);
        this.f313653d = i17;
        this.f313654e = i18;
        this.f313655f = j1Var;
        this.f313656g = i19;
        this.f313657h = iArr;
        this.f313658i = qVar;
        this.f313659m = i27;
        this.f313660n = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f313653d;
        int i18 = this.f313654e;
        boolean z17 = i17 + i18 <= 1;
        df5.j1 j1Var = this.f313655f;
        j1Var.f313673x = z17;
        int i19 = this.f313656g;
        java.util.ArrayList arrayList = new java.util.ArrayList(i19);
        for (int i27 = 0; i27 < i19; i27++) {
            arrayList.add(null);
        }
        int[] iArr = this.f313657h;
        java.util.List list = this.f313658i.f513989c;
        int i28 = i17 - 1;
        int i29 = this.f313659m;
        j1Var.c(arrayList, iArr, list, false, i29 == i28);
        return df5.j1.b(j1Var, this.f313660n, i18, i29);
    }
}
