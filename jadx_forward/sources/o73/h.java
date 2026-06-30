package o73;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f425081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o73.j jVar, java.lang.String str) {
        super(0);
        this.f425081d = jVar;
        this.f425082e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o73.j jVar = this.f425081d;
        java.lang.String str = this.f425082e;
        if (o73.j.Y6(jVar, str) == null) {
            o73.b bVar = new o73.b();
            bVar.f76395x11b86abb = str;
            bVar.f76394x8d8a3769 = jVar.X6(str, jVar.a7());
            bVar.f76392xdcacde15 = jVar.X6(str, jVar.Z6());
            bVar.f76393xda587801 = jVar.X6(str, jVar.b7());
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.V6(this.f425081d, bVar, false, false, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
