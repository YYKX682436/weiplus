package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class j2 extends com.p314xaae8f345.p3210x3857dc.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 f198687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198688b;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 k2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f198687a = k2Var;
        this.f198688b = activityC0065xcd7aa112;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.s0
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k2 k2Var = this.f198687a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k2Var.f198709d, "onReceivedTitle title:" + str + ' ' + this.f198688b);
        if ((str == null || str.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k2Var.f198711f, str)) {
            return;
        }
        ((yg0.s3) ((zg0.b3) i95.n0.c(zg0.b3.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.d(str) || r26.i0.y(str, "about:blank", false) || (textView = k2Var.f198715m) == null) {
            return;
        }
        textView.setText(str);
    }
}
