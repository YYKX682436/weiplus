package df5;

/* loaded from: classes11.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f313616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f313619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v11.q f313620h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f313621i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f313622m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f313624o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(df5.j1 j1Var, int i17, int i18, int[] iArr, v11.q qVar, int i19, int i27, java.util.List list, int i28) {
        super(0);
        this.f313616d = j1Var;
        this.f313617e = i17;
        this.f313618f = i18;
        this.f313619g = iArr;
        this.f313620h = qVar;
        this.f313621i = i19;
        this.f313622m = i27;
        this.f313623n = list;
        this.f313624o = i28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f313617e <= 1;
        df5.j1 j1Var = this.f313616d;
        j1Var.f313673x = z17;
        int i17 = this.f313618f;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        int[] iArr = this.f313619g;
        java.util.List list = this.f313620h.f513989c;
        int i19 = this.f313622m - 1;
        int i27 = this.f313621i;
        j1Var.c(arrayList, iArr, list, false, i27 == i19);
        return df5.j1.b(j1Var, this.f313623n, this.f313624o, i27);
    }
}
