package zo1;

/* loaded from: classes5.dex */
public final class o implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f556242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 f556243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f556244c;

    public o(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6, yz5.l lVar) {
        this.f556242a = z17;
        this.f556243b = activityC12866x739418c6;
        this.f556244c = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
    /* renamed from: onResult */
    public final void mo26477x57429edc(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            boolean z18 = this.f556242a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6 = this.f556243b;
            if (i17 != 1 || z18) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(i17, i18 - 1, i19);
                this.f556244c.mo146xb9724478(calendar);
                if (z18) {
                    activityC12866x739418c6.f174330s = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12866x739418c6.f174320f;
                    if (c12853x6acde7c9 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                        throw null;
                    }
                    c12853x6acde7c9.f174266g = calendar.getTimeInMillis();
                    android.widget.TextView textView = activityC12866x739418c6.f174328q;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startTimeTv");
                        throw null;
                    }
                    textView.setText(activityC12866x739418c6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = activityC12866x739418c6.f174320f;
                    if (c12853x6acde7c92 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                        throw null;
                    }
                    c12853x6acde7c92.f174267h = calendar.getTimeInMillis();
                    android.widget.TextView textView2 = activityC12866x739418c6.f174329r;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endTimeTv");
                        throw null;
                    }
                    textView2.setText(activityC12866x739418c6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = activityC12866x739418c6.f174320f;
                if (c12853x6acde7c93 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                    throw null;
                }
                c12853x6acde7c93.f174267h = 0L;
                android.widget.TextView textView3 = activityC12866x739418c6.f174329r;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endTimeTv");
                    throw null;
                }
                textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mz_);
            }
            java.util.Calendar calendar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.f174317t;
            activityC12866x739418c6.V6();
        }
    }
}
