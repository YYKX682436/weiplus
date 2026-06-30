package aw2;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(aw2.n nVar) {
        super(4);
        this.f96284d = nVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String link = (java.lang.String) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        int intValue2 = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(link, "link");
        aw2.n.f(this.f96284d, link, title, intValue, intValue2, null, 16, null);
        return jz5.f0.f384359a;
    }
}
