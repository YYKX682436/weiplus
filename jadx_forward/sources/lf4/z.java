package lf4;

/* loaded from: classes4.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f400039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f400040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f400041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f400042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f400043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ if4.f f400044i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(boolean z17, lf4.b0 b0Var, int i17, int i18, java.util.ArrayList arrayList, if4.f fVar) {
        super(0);
        this.f400039d = z17;
        this.f400040e = b0Var;
        this.f400041f = i17;
        this.f400042g = i18;
        this.f400043h = arrayList;
        this.f400044i = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f400039d) {
            lf4.b0 b0Var = this.f400040e;
            java.lang.String str = b0Var.f399891h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentChanged, will update row:");
            int i17 = this.f400041f;
            sb6.append(i17);
            sb6.append(" col:");
            int i18 = this.f400042g;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList = this.f400043h;
            arrayList.set(i18, this.f400044i);
            lf4.h hVar = b0Var.f399888e;
            ((sf4.a1) hVar).h(i17, arrayList);
            ((sf4.a1) hVar).e(i17, i18, 1);
            ((sf4.a1) hVar).d();
        }
        return jz5.f0.f384359a;
    }
}
