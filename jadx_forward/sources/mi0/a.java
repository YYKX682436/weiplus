package mi0;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 f408029a;

    /* renamed from: b, reason: collision with root package name */
    public static final mi0.a f408030b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f408031c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f408032d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f408033e;

    static {
        com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 c26980x5cc54665 = new com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665();
        f408029a = c26980x5cc54665;
        mi0.a aVar = new mi0.a();
        f408030b = aVar;
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("businessType", aVar, 1, false, true);
        f408031c = c26981x40bb0da;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 enumC27000xf95317d0 = com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da, enumC27000xf95317d0);
        c26999xf78690af.m108104xf4a715dd(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3().m108099xb40240fd());
        c26980x5cc54665.m107892x77dc3d2e(c26999xf78690af);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da(dm.i4.f66874x4c6b1f55, aVar, 2, false, false);
        f408032d = c26981x40bb0da2;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da2, enumC27000xf95317d0));
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da3 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("recordItems", aVar, 3, false, false);
        f408033e = c26981x40bb0da3;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da3, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.BLOB));
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: allBindingFields */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] mo107912xefdf857d() {
        return new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{f408031c, f408032d, f408033e};
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: baseBinding */
    public com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 mo107913x82ba2274() {
        return f408029a;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindField */
    public void mo107914xc72baabd(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da, int i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992) {
        mi0.b bVar = (mi0.b) obj;
        int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
        if (m107906xa778f7f == 1) {
            c26923xdf786992.m107034x52f72641(bVar.f408034a, i17);
            return;
        }
        if (m107906xa778f7f == 2) {
            c26923xdf786992.m107034x52f72641(bVar.f408035b, i17);
            return;
        }
        if (m107906xa778f7f != 3) {
            return;
        }
        byte[] bArr = bVar.f408036c;
        if (bArr != null) {
            c26923xdf786992.m107026x37f6e55a(bArr, i17);
        } else {
            c26923xdf786992.m107041x37fcf764(i17);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindingType */
    public java.lang.Class mo107915xeeffe75f() {
        return mi0.b.class;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: extractObject */
    public java.lang.Object mo107916xd4074720(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992, java.lang.Class cls) {
        mi0.b bVar = (mi0.b) cls.newInstance();
        int i17 = 0;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da : c26981x40bb0daArr) {
            int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
            if (m107906xa778f7f == 1) {
                bVar.f408034a = c26923xdf786992.m107063xb58848b9(i17);
            } else if (m107906xa778f7f == 2) {
                bVar.f408035b = c26923xdf786992.m107063xb58848b9(i17);
            } else if (m107906xa778f7f == 3 && c26923xdf786992.m107060x70c1f3a6(i17) != com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null) {
                bVar.f408036c = c26923xdf786992.m107054xfb7d1bf3(i17);
            }
            i17++;
        }
        return bVar;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: isAutoIncrement */
    public /* bridge */ /* synthetic */ boolean mo107917xf0271976(java.lang.Object obj) {
        return false;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: setLastInsertRowId */
    public /* bridge */ /* synthetic */ void mo107918x96b7f424(java.lang.Object obj, long j17) {
    }
}
