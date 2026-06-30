package h31;

/* loaded from: classes9.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f359946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h31.r f359947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, h31.r rVar, int i17) {
        super(0);
        this.f359946d = c11158xe7d16ed5;
        this.f359947e = rVar;
        this.f359948f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f359946d;
        int i17 = c11158xe7d16ed5.f153330w;
        h31.r rVar = this.f359947e;
        if (i17 == 0) {
            h31.a aVar = rVar.f359967h;
            if (aVar != null) {
                ((m31.y1) aVar).c(c11158xe7d16ed5);
            }
        } else {
            h31.a aVar2 = rVar.f359967h;
            if (aVar2 != null) {
                ((m31.y1) aVar2).a(this.f359948f, i17, c11158xe7d16ed5.f153331x);
            }
        }
        return jz5.f0.f384359a;
    }
}
