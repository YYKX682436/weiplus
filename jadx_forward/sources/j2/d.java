package j2;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f378748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f378749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.text.Spannable spannable, yz5.r rVar) {
        super(3);
        this.f378748d = spannable;
        this.f378749e = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a2.g1 spanStyle = (a2.g1) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanStyle, "spanStyle");
        f2.r rVar = spanStyle.f82258c;
        if (rVar == null) {
            rVar = f2.r.f340355i;
        }
        f2.p pVar = spanStyle.f82259d;
        f2.p pVar2 = new f2.p(pVar != null ? pVar.f340349a : 0);
        f2.q qVar = spanStyle.f82260e;
        this.f378748d.setSpan(new d2.k((android.graphics.Typeface) this.f378749e.C(spanStyle.f82261f, rVar, pVar2, new f2.q(qVar != null ? qVar.f340350a : 1))), intValue, intValue2, 33);
        return jz5.f0.f384359a;
    }
}
