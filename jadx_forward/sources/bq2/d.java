package bq2;

/* loaded from: classes2.dex */
public final class d extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final r45.pw1 f105098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.pw1 info, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 belongRecyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongRecyclerView, "belongRecyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(belongAdapter, "belongAdapter");
        this.f105098e = info;
    }

    /* renamed from: toString */
    public java.lang.String m11030x9616526c() {
        return "entry_type: " + this.f105098e.m75939xb282bd08(0) + " belongRecyclerView: " + this.f105094b + " belongAdapter: " + this.f105095c;
    }
}
