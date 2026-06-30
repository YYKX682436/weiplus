package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class q4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259871d;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.h4 h4Var) {
        this.f259871d = activityC19016xf99a44c4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f259871d.f259539g).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.o85) ((java.util.ArrayList) this.f259871d.f259539g).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4 = this.f259871d;
        if (view == null) {
            view = android.view.LayoutInflater.from(activityC19016xf99a44c4.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btm, viewGroup, false);
            view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r4(activityC19016xf99a44c4, view));
        }
        r45.o85 o85Var = (r45.o85) ((java.util.ArrayList) activityC19016xf99a44c4.f259539g).get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r4 r4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.r4) view.getTag();
        r4Var.getClass();
        r4Var.f259887b.setText(o85Var.f463562d);
        int i18 = o85Var.f463564f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c42 = r4Var.f259889d;
        android.widget.TextView textView = r4Var.f259888c;
        if (i18 == 2) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.lang.String str2 = "" + o85Var.f463563e;
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4.D;
            activityC19016xf99a44c42.getClass();
            if (str2.length() == 1) {
                str = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2286xa0294fa3.concat(str2);
            } else if (str2.length() == 2) {
                str = "0.".concat(str2);
            } else {
                str = str2.substring(0, str2.length() - 2) + "." + str2.substring(str2.length() - 2);
            }
            sb6.append(str);
            objArr[0] = sb6.toString();
            textView.setText(activityC19016xf99a44c42.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kqp, objArr));
            textView.setTextColor(activityC19016xf99a44c42.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            textView.setText(o85Var.f463565g);
            textView.setTextColor(activityC19016xf99a44c42.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_i));
        }
        return view;
    }
}
