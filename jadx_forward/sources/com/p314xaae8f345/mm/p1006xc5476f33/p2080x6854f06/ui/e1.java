package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class e1 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.LayoutInflater f243789o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e f243790p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17680x54e9523e activityC17680x54e9523e, android.content.Context context) {
        super(context, new h34.h0());
        this.f243790p = activityC17680x54e9523e;
        this.f243789o = android.view.LayoutInflater.from(context);
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        h34.h0 h0Var = (h34.h0) obj;
        if (h0Var == null) {
            h0Var = new h34.h0();
        }
        h0Var.mo9015xbf5d97fd(cursor);
        return h0Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.d1 d1Var;
        android.view.View view2;
        java.lang.String d17;
        if (view == null) {
            view2 = this.f243789o.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cmu, viewGroup, false);
            d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.d1(this);
            d1Var.f243784a = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view2.findViewById(com.p314xaae8f345.mm.R.id.ms6);
            d1Var.f243785b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ms8);
            d1Var.f243786c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ms7);
            view2.setTag(d1Var);
        } else {
            d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.d1) view.getTag();
            view2 = view;
        }
        h34.h0 h0Var = (h34.h0) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.f1.b(d1Var.f243784a, h0Var.f4176xd640b811, 0, true);
        d1Var.f243785b.setText(h0Var.f4177x29dd02d3);
        android.widget.TextView textView = d1Var.f243786c;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f243790p.mo55332x76847179();
        long j17 = h0Var.f4174xad24a2e * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            d17 = "";
        } else {
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                d17 = (timeInMillis2 <= 0 || timeInMillis2 > 86400000) ? k35.m1.d(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17 / 1000) : mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
            } else {
                d17 = k35.m1.d(mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17 / 1000);
            }
        }
        textView.setText(d17);
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        s(c34.h0.Ui().f360076d.B("SELECT * FROM shaketvhistory ORDER BY createtime DESC", null));
        notifyDataSetChanged();
    }
}
