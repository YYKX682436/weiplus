package lf4;

/* loaded from: classes4.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f399940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f399941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ if4.f f399944i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(boolean z17, lf4.j1 j1Var, int i17, int i18, java.util.ArrayList arrayList, if4.f fVar) {
        super(0);
        this.f399939d = z17;
        this.f399940e = j1Var;
        this.f399941f = i17;
        this.f399942g = i18;
        this.f399943h = arrayList;
        this.f399944i = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f399939d) {
            lf4.j1 j1Var = this.f399940e;
            java.lang.String str = j1Var.f399954h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentChanged, will update row:");
            int i17 = this.f399941f;
            sb6.append(i17);
            sb6.append(" col:");
            int i18 = this.f399942g;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList = this.f399943h;
            arrayList.set(i18, this.f399944i);
            lf4.h hVar = j1Var.f399952f;
            ((sf4.a1) hVar).h(i17, arrayList);
            ((sf4.a1) hVar).e(i17, i18, 1);
            ((sf4.a1) hVar).d();
        }
        return jz5.f0.f384359a;
    }
}
