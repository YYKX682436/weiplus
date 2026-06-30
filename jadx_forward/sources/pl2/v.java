package pl2;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f438199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f438200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl2.w f438201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f438202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438203h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, int i18, pl2.w wVar, java.util.ArrayList arrayList, yz5.a aVar) {
        super(0);
        this.f438199d = i17;
        this.f438200e = i18;
        this.f438201f = wVar;
        this.f438202g = arrayList;
        this.f438203h = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18 = this.f438199d;
        if (i18 >= 0 && (i17 = this.f438200e) >= 0 && i18 <= i17) {
            while (true) {
                pl2.a aVar = (pl2.a) kz5.n0.a0(this.f438202g, i18);
                pl2.w wVar = this.f438201f;
                wVar.d(i18, aVar, wVar.f438210g != 1 ? 2 : 1);
                wVar.f438212i.add(java.lang.Integer.valueOf(i18));
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        pm0.v.X(new pl2.u(this.f438203h));
        return jz5.f0.f384359a;
    }
}
