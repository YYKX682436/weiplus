package ne2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne2.k f418065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ne2.k kVar) {
        super(4);
        this.f418065d = kVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String source = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        long longValue = ((java.lang.Number) obj3).longValue();
        r45.td2 td2Var = (r45.td2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        ne2.l lVar = ne2.l.f418078a;
        r45.q84 b17 = intValue != 1 ? intValue != 2 ? null : ne2.l.b(lVar, longValue, td2Var, 0, 4, null) : lVar.a(longValue, td2Var);
        this.f418065d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeTimeManager", source + " timer generator liveId:" + longValue + ", mode:" + intValue + ", " + cm2.a.f124861a.r(b17));
        return b17;
    }
}
