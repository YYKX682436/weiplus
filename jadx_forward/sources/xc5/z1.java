package xc5;

/* loaded from: classes12.dex */
public final class z1 extends lf3.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // lf3.c0, qf3.a
    public void T3(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPreviewComponent", "onAnchor position:" + i17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 != null) {
            c22956x1a4bbf4.c(i17, false);
        }
    }

    @Override // lf3.c0, qf3.a
    public void h1(mf3.i newData, java.util.List insertData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insertData, "insertData");
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        int m83649xfda78ef6 = c22956x1a4bbf4 != null ? c22956x1a4bbf4.m83649xfda78ef6() : 0;
        super.h1(newData, insertData);
        if ((!insertData.isEmpty()) && c22956x1a4bbf4 != null && c22956x1a4bbf4.m83654x54496c8e() == 0) {
            c22956x1a4bbf4.c(m83649xfda78ef6 + insertData.size(), false);
        }
    }

    @Override // lf3.c0, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null) {
            return;
        }
        android.view.View childAt = c22956x1a4bbf4.getChildAt(0);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = childAt instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 ? (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) childAt : null;
        if (c22949xf1deaba4 == null) {
            return;
        }
        int childCount = c22949xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            java.lang.Object J2 = c22949xf1deaba4.J(c22949xf1deaba4.getChildAt(i17));
            mf3.l lVar = J2 instanceof mf3.l ? (mf3.l) J2 : null;
            if (lVar != null) {
                lVar.mo129548x408b7293();
            }
        }
    }

    @Override // lf3.c0, kg3.f
    /* renamed from: onPageSelected */
    public void mo143395x510f45c9(int i17) {
        java.lang.String mo2110x5db1b11;
        java.lang.Long j17;
        pf5.c U6 = U6(qf3.b.class);
        qf3.c cVar = U6 instanceof qf3.c ? (qf3.c) U6 : null;
        if (cVar != null) {
            xc5.l lVar = (xc5.l) cVar;
            if (lVar.f535063o) {
                mf3.f fVar = lVar.f535055d;
                if (!fVar.isEmpty()) {
                    if (!(lVar.f535058g.length == 0)) {
                        mf3.k kVar = (mf3.k) fVar.get(i17);
                        if (kVar != null && (mo2110x5db1b11 = kVar.mo2110x5db1b11()) != null && (j17 = r26.h0.j(mo2110x5db1b11)) != null) {
                            lVar.f535064p.add(java.lang.Long.valueOf(j17.longValue()));
                        }
                        if (i17 <= 1 && !lVar.f535061m && lVar.f535059h > 0) {
                            lVar.f535061m = true;
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = lVar.O6();
                            if (O6 != null) {
                                v65.i.b(O6, null, new xc5.k(lVar, null), 1, null);
                            }
                        }
                        if (i17 >= (fVar.size() - 1) - 1 && !lVar.f535062n && lVar.f535060i < lVar.f535058g.length) {
                            lVar.f535062n = true;
                            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O62 = lVar.O6();
                            if (O62 != null) {
                                v65.i.b(O62, null, new xc5.i(lVar, null), 1, null);
                            }
                        }
                    }
                }
            }
        }
        super.mo143395x510f45c9(i17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 != null) {
            c22956x1a4bbf4.post(new xc5.y1(this, i17));
        }
    }
}
