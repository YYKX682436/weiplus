package ds2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cs2.p f324435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cs2.p pVar) {
        super(1);
        this.f324435d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        cs2.p pVar = this.f324435d;
        return java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.f303625i2, pVar.f303625i2) && it.f323338x == pVar.f323338x && it.V1 == pVar.V1);
    }
}
