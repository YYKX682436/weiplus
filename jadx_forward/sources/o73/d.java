package o73;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.String str) {
        super(1);
        this.f425075d = i17;
        this.f425076e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o73.b it = (o73.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = this.f425075d;
        return java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i17 != 1 ? i17 != 3 ? it.f76392xdcacde15 : it.f76393xda587801 : it.f76394x8d8a3769, this.f425076e));
    }
}
