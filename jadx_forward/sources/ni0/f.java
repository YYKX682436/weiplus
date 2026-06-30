package ni0;

/* loaded from: classes12.dex */
public class f implements com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 f418751a;

    /* renamed from: b, reason: collision with root package name */
    public static final ni0.f f418752b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f418753c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f418754d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f418755e;

    static {
        com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 c26980x5cc54665 = new com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665();
        f418751a = c26980x5cc54665;
        ni0.f fVar = new ni0.f();
        f418752b = fVar;
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da(dm.i4.f66865x76d1ec5a, fVar, 1, true, true);
        f418753c = c26981x40bb0da;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 enumC27000xf95317d0 = com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da, enumC27000xf95317d0);
        c26999xf78690af.m108104xf4a715dd(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3().m108099xb40240fd().m108083x6ee7c280());
        c26980x5cc54665.m107892x77dc3d2e(c26999xf78690af);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("actionType", fVar, 2, false, false);
        f418754d = c26981x40bb0da2;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da2, enumC27000xf95317d0));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da3 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, fVar, 3, false, false);
        f418755e = c26981x40bb0da3;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da3, enumC27000xf95317d0));
        c26980x5cc54665.m107893xb51dfcb1("_actionType_timestamp_index", false, new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27030xedf69c67().m108568xa5c9a021().m108569xcfe5d928(c26981x40bb0da2, c26981x40bb0da3));
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: allBindingFields */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] mo107912xefdf857d() {
        return new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{f418753c, f418754d, f418755e};
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: baseBinding */
    public com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 mo107913x82ba2274() {
        return f418751a;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindField */
    public void mo107914xc72baabd(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da, int i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992) {
        ni0.l lVar = (ni0.l) obj;
        int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
        if (m107906xa778f7f == 1) {
            c26923xdf786992.m107034x52f72641(lVar.f418777a, i17);
        } else if (m107906xa778f7f == 2) {
            c26923xdf786992.m107034x52f72641(lVar.f418778b, i17);
        } else {
            if (m107906xa778f7f != 3) {
                return;
            }
            c26923xdf786992.m107034x52f72641(lVar.f418779c, i17);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindingType */
    public java.lang.Class mo107915xeeffe75f() {
        return ni0.l.class;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: extractObject */
    public java.lang.Object mo107916xd4074720(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992, java.lang.Class cls) {
        ni0.l lVar = (ni0.l) cls.newInstance();
        int i17 = 0;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da : c26981x40bb0daArr) {
            int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
            if (m107906xa778f7f == 1) {
                lVar.f418777a = c26923xdf786992.m107063xb58848b9(i17);
            } else if (m107906xa778f7f == 2) {
                lVar.f418778b = c26923xdf786992.m107063xb58848b9(i17);
            } else if (m107906xa778f7f == 3) {
                lVar.f418779c = c26923xdf786992.m107063xb58848b9(i17);
            }
            i17++;
        }
        return lVar;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: isAutoIncrement */
    public boolean mo107917xf0271976(java.lang.Object obj) {
        return ((ni0.l) obj).f418777a == 0;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: setLastInsertRowId */
    public void mo107918x96b7f424(java.lang.Object obj, long j17) {
        ((ni0.l) obj).f418777a = (int) j17;
    }
}
