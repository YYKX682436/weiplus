package qw3;

/* loaded from: classes9.dex */
public class t1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 f448742d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377, qw3.m1 m1Var) {
        this.f448742d = activityC17109x265f5377;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448742d;
        int size = ((java.util.ArrayList) activityC17109x265f5377.f238075h).size();
        if (activityC17109x265f5377.f238078n > -1) {
            size++;
        }
        return activityC17109x265f5377.f238079o > -1 ? size + 1 : size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448742d;
        int i19 = activityC17109x265f5377.f238078n;
        if (i17 == i19 || i17 == (i18 = activityC17109x265f5377.f238079o)) {
            return null;
        }
        if (i17 < i18) {
            return ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(i17 - 1);
        }
        if ((i18 > -1) && i17 > i18) {
            return i19 > -1 ? ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(i17 - 2) : ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(i17 - 1);
        }
        if (i19 > -1) {
            return ((java.util.ArrayList) activityC17109x265f5377.f238075h).get(i17 - 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitSelectPayeeUI", "maybe wrong pos: [%s,%s,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC17109x265f5377.f238078n), java.lang.Integer.valueOf(activityC17109x265f5377.f238079o));
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448742d;
        return (i17 == activityC17109x265f5377.f238078n || i17 == activityC17109x265f5377.f238079o) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448742d;
        if (view == null) {
            if (itemViewType == 0) {
                view = android.view.LayoutInflater.from(activityC17109x265f5377.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569721jy, viewGroup, false);
            } else {
                view = android.view.LayoutInflater.from(activityC17109x265f5377.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569722jz, viewGroup, false);
                qw3.s1 s1Var = new qw3.s1(activityC17109x265f5377, null);
                s1Var.f448736a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.az9);
                s1Var.f448737b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.azb);
                s1Var.f448738c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.az_);
                view.setTag(s1Var);
            }
        }
        if (itemViewType == 0) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.az8);
            if (activityC17109x265f5377.f238078n == i17) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aey);
            } else {
                if (activityC17109x265f5377.f238079o == i17) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aew);
                } else {
                    textView.setText("");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitSelectPayeeUI", "wrong header pos: %s", java.lang.Integer.valueOf(i17));
                }
            }
        } else if (itemViewType != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitSelectPayeeUI", "unknown type: %d", java.lang.Integer.valueOf(itemViewType));
        } else {
            qw3.s1 s1Var2 = (qw3.s1) view.getTag();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65 c17100xa183cf65 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17100xa183cf65) getItem(i17);
            if (c17100xa183cf65 != null) {
                s1Var2.f448736a.b(c17100xa183cf65.f238005f, 0, 0, com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17100xa183cf65.f238009m);
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f53772 = s1Var2.f448739d;
                java.lang.String str = c17100xa183cf65.f238008i;
                if (K0) {
                    s1Var2.f448737b.setText(str);
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17109x265f53772.mo55332x76847179();
                    java.lang.String string = activityC17109x265f53772.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aev, str, c17100xa183cf65.f238009m);
                    ((ke0.e) xVar).getClass();
                    s1Var2.f448737b.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, string));
                }
                s1Var2.f448738c.setText(activityC17109x265f53772.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aev, c17100xa183cf65.f238006g, c17100xa183cf65.f238004e));
            } else {
                s1Var2.f448736a.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                s1Var2.f448737b.setText("");
                s1Var2.f448738c.setText("");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankRemitSelectPayeeUI", "empty record");
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448742d;
        return (i17 == activityC17109x265f5377.f238078n || i17 == activityC17109x265f5377.f238079o) ? false : true;
    }
}
