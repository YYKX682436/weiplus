package i2;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i2.e f369386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i2.e eVar) {
        super(4);
        this.f369386d = eVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        f2.r fontWeight = (f2.r) obj2;
        int i17 = ((f2.p) obj3).f340349a;
        int i18 = ((f2.q) obj4).f340350a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontWeight, "fontWeight");
        i2.e eVar = this.f369386d;
        i2.i iVar = new i2.i(((f2.k) eVar.f369388b).b((f2.h) obj, fontWeight, i17, i18));
        ((java.util.ArrayList) eVar.f369392f).add(iVar);
        return (android.graphics.Typeface) iVar.f369400b;
    }
}
