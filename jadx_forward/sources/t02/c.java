package t02;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t02.e f495946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f495950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f495951i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t02.e eVar, java.lang.String str, int i17, java.lang.String str2, byte[] bArr, yz5.l lVar) {
        super(0);
        this.f495946d = eVar;
        this.f495947e = str;
        this.f495948f = i17;
        this.f495949g = str2;
        this.f495950h = bArr;
        this.f495951i = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zz.b bj6 = this.f495946d.bj(this.f495947e, this.f495948f, this.f495949g, this.f495950h);
        yz5.l lVar = this.f495951i;
        if (lVar == null) {
            return null;
        }
        lVar.mo146xb9724478(bj6);
        return jz5.f0.f384359a;
    }
}
