package bq2;

/* loaded from: classes2.dex */
public final class c extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final r45.le1 f105097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.le1 cardInfo, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 belongRecyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardInfo, "cardInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongRecyclerView, "belongRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongAdapter, "belongAdapter");
        this.f105097e = cardInfo;
    }

    /* renamed from: toString */
    public java.lang.String m11029x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("card id: ");
        r45.le1 le1Var = this.f105097e;
        sb6.append(le1Var.f460880d);
        sb6.append(" card type: ");
        sb6.append(le1Var.f460881e);
        sb6.append(" belongRecyclerView: ");
        sb6.append(this.f105094b);
        sb6.append(" belongAdapter: ");
        sb6.append(this.f105095c);
        return sb6.toString();
    }
}
