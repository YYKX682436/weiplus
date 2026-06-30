package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class b5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 f259639d;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a03192, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s4 s4Var) {
        this.f259639d = activityC19017x85a03192;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f259639d.f259566q.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.n85) this.f259639d.f259566q.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a03192 = this.f259639d;
        if (view == null) {
            view = android.view.LayoutInflater.from(activityC19017x85a03192.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.btp, viewGroup, false);
            view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d5(activityC19017x85a03192, view));
        }
        r45.n85 n85Var = (r45.n85) activityC19017x85a03192.f259566q.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d5 d5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d5) view.getTag();
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = d5Var.f259672b;
        c22904x897710ab.b();
        java.math.BigDecimal i18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + n85Var.f462697e, "100", 2, java.math.RoundingMode.HALF_UP);
        double intValue = (double) i18.intValue();
        double doubleValue = i18.doubleValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a031922 = d5Var.f259681k;
        if (intValue == doubleValue) {
            java.lang.String str = "" + i18.intValue();
            activityC19017x85a031922.getClass();
            if (!str.contains(".")) {
                str = str.concat(".00");
            }
            c22904x897710ab.setText(str);
        } else {
            java.lang.String bigDecimal = i18.toString();
            activityC19017x85a031922.getClass();
            if (!bigDecimal.contains(".")) {
                bigDecimal = bigDecimal.concat(".00");
            }
            c22904x897710ab.setText(bigDecimal);
        }
        java.lang.String format = java.lang.String.format("%s %s(%s)", n85Var.f462707r, n85Var.f462709t, n85Var.f462699g);
        android.widget.TextView textView = d5Var.f259675e;
        textView.setText(format);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(n85Var.f462708s);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = d5Var.f259680j;
        if (d17 != null) {
            c19659x677e0913.setImageBitmap(d17);
        }
        r45.ro6 ro6Var = n85Var.f462702m;
        android.widget.TextView textView2 = d5Var.f259676f;
        if (ro6Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ro6Var.f466598d)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(n85Var.f462702m.f466598d);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n85Var.f462702m.f466599e)) {
                textView2.setTextColor(activityC19017x85a031922.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5));
            } else {
                textView2.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.b(n85Var.f462702m.f466599e, true));
            }
            textView2.setVisibility(0);
        }
        d5Var.f259679i.setVisibility(8);
        d5Var.f259677g.setVisibility(8);
        if (n85Var.f462703n != null) {
            d5Var.f259674d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c5(d5Var, n85Var));
        }
        int i19 = n85Var.f462706q;
        android.widget.ImageView imageView = d5Var.f259673c;
        android.widget.TextView textView3 = d5Var.f259678h;
        if (i19 != 1) {
            textView3.setVisibility(0);
            textView.setAlpha(0.2f);
            c22904x897710ab.setAlpha(0.2f);
            c19659x677e0913.setAlpha(0.3f);
            imageView.setAlpha(1.0f);
        } else {
            textView3.setVisibility(8);
            textView.setAlpha(1.0f);
            c22904x897710ab.setAlpha(1.0f);
            c19659x677e0913.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
        }
        return view;
    }
}
