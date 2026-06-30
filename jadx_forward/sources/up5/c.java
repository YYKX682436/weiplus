package up5;

/* loaded from: classes12.dex */
public class c implements com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 f511442a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.c f511443b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f511444c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f511445d;

    static {
        com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 c26980x5cc54665 = new com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665();
        f511442a = c26980x5cc54665;
        up5.c cVar = new up5.c();
        f511443b = cVar;
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("configId", cVar, 1, false, true);
        f511444c = c26981x40bb0da;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Integer);
        c26999xf78690af.m108104xf4a715dd(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3().m108099xb40240fd());
        c26980x5cc54665.m107892x77dc3d2e(c26999xf78690af);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("value", cVar, 2, false, false);
        f511445d = c26981x40bb0da2;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da2, com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text));
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: allBindingFields */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] mo107912xefdf857d() {
        return new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{f511444c, f511445d};
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: baseBinding */
    public com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 mo107913x82ba2274() {
        return f511442a;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindField */
    public void mo107914xc72baabd(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da, int i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992) {
        up5.q qVar = (up5.q) obj;
        int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
        if (m107906xa778f7f == 1) {
            c26923xdf786992.m107034x52f72641(qVar.f511576a, i17);
            return;
        }
        if (m107906xa778f7f != 2) {
            return;
        }
        java.lang.String str = qVar.f511577b;
        if (str != null) {
            c26923xdf786992.m107047x37ff770a(str, i17);
        } else {
            c26923xdf786992.m107041x37fcf764(i17);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindingType */
    public java.lang.Class mo107915xeeffe75f() {
        return up5.q.class;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: extractObject */
    public java.lang.Object mo107916xd4074720(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992, java.lang.Class cls) {
        up5.q qVar = (up5.q) cls.newInstance();
        int i17 = 0;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da : c26981x40bb0daArr) {
            int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
            if (m107906xa778f7f == 1) {
                qVar.f511576a = c26923xdf786992.m107063xb58848b9(i17);
            } else if (m107906xa778f7f == 2 && c26923xdf786992.m107060x70c1f3a6(i17) != com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null) {
                qVar.f511577b = c26923xdf786992.m107078xfb85ada3(i17);
            }
            i17++;
        }
        return qVar;
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
