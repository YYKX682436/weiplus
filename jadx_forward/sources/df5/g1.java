package df5;

/* loaded from: classes11.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.j1 f313643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f313645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v11.q f313646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313647h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(df5.j1 j1Var, int i17, int[] iArr, v11.q qVar, java.util.List list) {
        super(0);
        this.f313643d = j1Var;
        this.f313644e = i17;
        this.f313645f = iArr;
        this.f313646g = qVar;
        this.f313647h = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df5.j1 j1Var = this.f313643d;
        int i17 = this.f313644e;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(null);
        }
        int[] iArr = this.f313645f;
        v11.q qVar = this.f313646g;
        j1Var.c(arrayList, iArr, qVar.f513989c, true, qVar.f513988b.isEmpty());
        return df5.j1.b(this.f313643d, this.f313647h, 0, 0);
    }
}
