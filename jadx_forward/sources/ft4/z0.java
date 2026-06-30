package ft4;

/* loaded from: classes14.dex */
public final class z0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c f348276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c) {
        super(false);
        this.f348276d = activityC19139x26e1e89c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.util.Collection collection;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "clickDateBtnListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348276d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 4, 7, java.lang.Integer.valueOf(activityC19139x26e1e89c.f261983f), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261984g));
        if (activityC19139x26e1e89c.f261990p == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19139x26e1e89c.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            gt4.s0 s0Var = new gt4.s0(mo55332x76847179);
            activityC19139x26e1e89c.f261990p = s0Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = s0Var.f357074n;
            if (c22705x7e16f613 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
                throw null;
            }
            c22705x7e16f613.f293733o = false;
            c22705x7e16f613.f293734p = true;
            c22705x7e16f613.f293735q = true;
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            java.util.List g17 = new r26.t("-").g(format, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            gt4.s0 s0Var2 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var2);
            s0Var2.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[2], 0));
            gt4.s0 s0Var3 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var3);
            s0Var3.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[2], 0));
            gt4.s0 s0Var4 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var4);
            int i17 = activityC19139x26e1e89c.f261985h;
            s0Var4.i(i17 / 10000, (i17 % 10000) / 100, 1);
            if (activityC19139x26e1e89c.f261983f > 0) {
                gt4.s0 s0Var5 = activityC19139x26e1e89c.f261990p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var5);
                int i18 = activityC19139x26e1e89c.f261983f;
                s0Var5.g(i18 / 10000, (i18 % 10000) / 100, i18 % 100);
            }
            gt4.s0 s0Var6 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var6);
            s0Var6.L = new ft4.e1(activityC19139x26e1e89c);
        }
        dt4.p pVar = activityC19139x26e1e89c.f261991q;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("ledgerDataCenter");
            throw null;
        }
        int i19 = pVar.i(activityC19139x26e1e89c.f261982e, activityC19139x26e1e89c.f261987m);
        activityC19139x26e1e89c.f261985h = i19;
        if (i19 > 0) {
            gt4.s0 s0Var7 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var7);
            int i27 = activityC19139x26e1e89c.f261985h;
            s0Var7.i(i27 / 10000, (i27 % 10000) / 100, 1);
        }
        if (activityC19139x26e1e89c.f261983f > 0) {
            gt4.s0 s0Var8 = activityC19139x26e1e89c.f261990p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var8);
            int i28 = activityC19139x26e1e89c.f261983f;
            s0Var8.g(i28 / 10000, (i28 % 10000) / 100, i28 % 100);
        }
        gt4.s0 s0Var9 = activityC19139x26e1e89c.f261990p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var9);
        s0Var9.l();
    }
}
