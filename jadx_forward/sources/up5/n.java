package up5;

/* loaded from: classes12.dex */
public class n implements com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 f511551a;

    /* renamed from: b, reason: collision with root package name */
    public static final up5.n f511552b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f511553c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da f511554d;

    static {
        com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 c26980x5cc54665 = new com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665();
        f511551a = c26980x5cc54665;
        up5.n nVar = new up5.n();
        f511552b = nVar;
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("payMsgId", nVar, 1, false, true);
        f511553c = c26981x40bb0da;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 enumC27000xf95317d0 = com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Text;
        com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af c26999xf78690af = new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da, enumC27000xf95317d0);
        c26999xf78690af.m108104xf4a715dd(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26998xf72455f3().m108099xb40240fd());
        c26980x5cc54665.m107892x77dc3d2e(c26999xf78690af);
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da2 = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da("newCoverInfoDetail", nVar, 2, false, false);
        f511554d = c26981x40bb0da2;
        c26980x5cc54665.m107892x77dc3d2e(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C26999xf78690af(c26981x40bb0da2, enumC27000xf95317d0));
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: allBindingFields */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] mo107912xefdf857d() {
        return new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[]{f511553c, f511554d};
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: baseBinding */
    public com.p314xaae8f345.p3121x37984a.orm.C26980x5cc54665 mo107913x82ba2274() {
        return f511551a;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindField */
    public void mo107914xc72baabd(java.lang.Object obj, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da, int i17, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992) {
        up5.b0 b0Var = (up5.b0) obj;
        int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
        if (m107906xa778f7f == 1) {
            java.lang.String str = b0Var.f511440a;
            if (str != null) {
                c26923xdf786992.m107047x37ff770a(str, i17);
                return;
            } else {
                c26923xdf786992.m107041x37fcf764(i17);
                return;
            }
        }
        if (m107906xa778f7f != 2) {
            return;
        }
        java.lang.String str2 = b0Var.f511441b;
        if (str2 != null) {
            c26923xdf786992.m107047x37ff770a(str2, i17);
        } else {
            c26923xdf786992.m107041x37fcf764(i17);
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: bindingType */
    public java.lang.Class mo107915xeeffe75f() {
        return up5.b0.class;
    }

    @Override // com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7
    /* renamed from: extractObject */
    public java.lang.Object mo107916xd4074720(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992, java.lang.Class cls) {
        up5.b0 b0Var = (up5.b0) cls.newInstance();
        int i17 = 0;
        for (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da : c26981x40bb0daArr) {
            int m107906xa778f7f = c26981x40bb0da.m107906xa778f7f();
            if (m107906xa778f7f != 1) {
                if (m107906xa778f7f == 2 && c26923xdf786992.m107060x70c1f3a6(i17) != com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null) {
                    b0Var.f511441b = c26923xdf786992.m107078xfb85ada3(i17);
                }
            } else if (c26923xdf786992.m107060x70c1f3a6(i17) != com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0.Null) {
                b0Var.f511440a = c26923xdf786992.m107078xfb85ada3(i17);
            }
            i17++;
        }
        return b0Var;
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
