package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes3.dex */
public final class w2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f254703d;

    /* renamed from: e, reason: collision with root package name */
    public int f254704e;

    /* renamed from: f, reason: collision with root package name */
    public long f254705f;

    /* renamed from: g, reason: collision with root package name */
    public int f254706g;

    /* renamed from: h, reason: collision with root package name */
    public r45.kz2 f254707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f254706g = -1;
        this.f254707h = new r45.kz2();
    }

    public final void O6() {
        r45.lz2 lz2Var;
        r45.lz2 lz2Var2;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.nzn);
        android.widget.TextView textView2 = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.o0l);
        if (this.f254703d > 0 && this.f254704e >= 0) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(5, 1);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            calendar2.set(5, 1);
            calendar2.set(1, this.f254703d);
            calendar2.set(2, this.f254704e);
            int i17 = calendar.get(1) - calendar2.get(1);
            int i18 = calendar.get(2) - calendar2.get(2);
            if (i17 >= 0 && i17 < 100) {
                this.f254706g = i17;
                if (i18 < 0) {
                    this.f254706g = java.lang.Math.max(i17 - 1, 0);
                }
            } else if (i17 == 100 && i18 < 0) {
                this.f254706g = java.lang.Math.max(i17 - 1, 0);
            }
        }
        int i19 = this.f254706g;
        java.lang.String str = "";
        if (i19 > 0) {
            textView.setText(i19 >= 18 ? m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js9) : m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.js8, java.lang.Integer.valueOf(this.f254706g)));
        } else if (i19 == 0) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.js_);
        } else {
            textView.setText("");
        }
        int i27 = this.f254706g;
        if (i27 < 0) {
            i27 = 10;
        }
        if (i27 < 0 || this.f254707h.m75941xfb821914(2).size() <= 0) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.js6);
            return;
        }
        java.util.Iterator it = this.f254707h.m75941xfb821914(2).iterator();
        while (true) {
            if (!it.hasNext()) {
                lz2Var = null;
                break;
            }
            lz2Var = (r45.lz2) it.next();
            if (i27 >= lz2Var.m75939xb282bd08(0) && i27 <= lz2Var.m75939xb282bd08(1)) {
                break;
            }
        }
        if (lz2Var == null) {
            java.util.LinkedList m75941xfb821914 = this.f254707h.m75941xfb821914(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getVisible_info(...)");
            lz2Var2 = (r45.lz2) kz5.n0.Z(m75941xfb821914);
        } else {
            lz2Var2 = lz2Var;
        }
        if (lz2Var2 != null) {
            if (this.f254705f == 0) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.js6);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = lz2Var2.m75941xfb821914(2).iterator();
                while (it6.hasNext()) {
                    r45.mz2 mz2Var = (r45.mz2) it6.next();
                    if ((this.f254705f & mz2Var.m75942xfb822ef2(0)) > 0) {
                        arrayList.add(mz2Var);
                    }
                }
                if (arrayList.size() == 0) {
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.js6);
                } else if (arrayList.size() == 1) {
                    r45.mz2 mz2Var2 = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var2 != null && (m75945x2fec83072 = mz2Var2.m75945x2fec8307(1)) != null) {
                        str = m75945x2fec83072;
                    }
                    textView2.setText(str);
                } else {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    r45.mz2 mz2Var3 = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var3 != null && (m75945x2fec8307 = mz2Var3.m75945x2fec8307(1)) != null) {
                        str = m75945x2fec8307;
                    }
                    objArr[0] = str;
                    objArr[1] = java.lang.Integer.valueOf(arrayList.size());
                    textView2.setText(m158354x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.js7, objArr));
                }
            }
        }
        if (lz2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTeenModeContentManageUIC", "updateSelectedContentText: can not find visible info of this age=%d, info size=%d", java.lang.Integer.valueOf(this.f254706g), java.lang.Integer.valueOf(this.f254707h.m75941xfb821914(2).size()));
        }
    }
}
