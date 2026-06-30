package aw2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(aw2.n nVar) {
        super(4);
        this.f14751d = nVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String link = (java.lang.String) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        int intValue2 = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(link, "link");
        aw2.n.f(this.f14751d, link, title, intValue, intValue2, null, 16, null);
        return jz5.f0.f302826a;
    }
}
