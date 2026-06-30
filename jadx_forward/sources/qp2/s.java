package qp2;

/* loaded from: classes2.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f447331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f447333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f447334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qp2.y yVar, java.lang.String str, boolean z17, java.util.LinkedList linkedList) {
        super(0);
        this.f447331d = yVar;
        this.f447332e = str;
        this.f447333f = z17;
        this.f447334g = linkedList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qp2.y yVar = this.f447331d;
        yVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPageTitle title:");
        java.lang.String str = this.f447332e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", sb6.toString());
        if (!android.text.TextUtils.isEmpty(str)) {
            ((android.widget.TextView) yVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.fnn)).setText(str);
        }
        yVar.f447340d = this.f447333f;
        java.util.List list = yVar.f447341e;
        ((java.util.LinkedList) list).addAll(this.f447334g);
        yVar.O6(list);
        if (c92.g.f121271a.b()) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = yVar.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
            int m75939xb282bd08 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5);
            if (m75939xb282bd08 == 9500001 || m75939xb282bd08 == 9500002 || m75939xb282bd08 == 9500004 || m75939xb282bd08 == 9500003) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for in operation game page.");
            } else {
                pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.K, yVar.m158354x19263085(), new qp2.u(yVar));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NearbyLiveSquareTabLayoutUIC", "registerRedDot return for no hit finder live.");
        }
        return jz5.f0.f384359a;
    }
}
