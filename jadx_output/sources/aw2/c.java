package aw2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(aw2.n nVar) {
        super(2);
        this.f14723d = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String link = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(link, "link");
        this.f14723d.a(link, booleanValue);
        return jz5.f0.f302826a;
    }
}
