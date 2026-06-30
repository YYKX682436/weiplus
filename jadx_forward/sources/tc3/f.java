package tc3;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc3.u f498718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f498721g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tc3.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f498718d = uVar;
        this.f498719e = str;
        this.f498720f = str2;
        this.f498721g = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String ih6 = this.f498718d.f498784e.ih(this.f498719e, this.f498720f, this.f498721g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ih6, "invokeSync(...)");
        return ih6;
    }
}
