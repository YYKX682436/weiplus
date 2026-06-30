package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class a0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f273032d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0 f273033e = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.UNINSTALL;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273034f;

    public a0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273034f = activityC19725xad6fc40e;
        activityC19725xad6fc40e.f272865d = activityC19725xad6fc40e.getPackageManager();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x getItem(int i17) {
        java.util.List list = this.f273032d;
        if (list == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x) list.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f273032d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return getItem(i17).f272565h ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b0 b0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar;
        android.content.pm.ResolveInfo resolveInfo;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x item = getItem(i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e = this.f273034f;
        if (view == null || view.getTag() == null) {
            view = android.view.LayoutInflater.from(activityC19725xad6fc40e.mo55332x76847179()).inflate(item.f272565h ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f569658hu : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569657ht, (android.view.ViewGroup) null);
            b0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b0(activityC19725xad6fc40e, view);
            view.setTag(b0Var);
        } else {
            b0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b0) view.getTag();
        }
        if (item.f272563f == null) {
            new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c0(activityC19725xad6fc40e).execute(item);
        }
        b0Var.f273052a.setImageDrawable(item.f272563f);
        java.lang.CharSequence charSequence = item.f272562e;
        if (activityC19725xad6fc40e.E && (resolveInfo = item.f272561d) != null && resolveInfo.activityInfo.packageName.equals(activityC19725xad6fc40e.F)) {
            charSequence = android.text.TextUtils.concat(charSequence, activityC19725xad6fc40e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571898sy));
            if (activityC19725xad6fc40e.A == null) {
                activityC19725xad6fc40e.A = item;
            }
        }
        b0Var.f273053b.setText(charSequence);
        boolean z17 = item.f272565h;
        android.widget.RadioButton radioButton = b0Var.f273056e;
        android.widget.TextView textView = b0Var.f273055d;
        if ((!z17 || item.f272566i || (z17 && item.f272568n && activityC19725xad6fc40e.H >= activityC19725xad6fc40e.I)) && !item.f272567m) {
            textView.setVisibility(8);
            radioButton.setVisibility(0);
            radioButton.setChecked(item.a(activityC19725xad6fc40e.A));
        } else {
            textView.setVisibility(0);
            radioButton.setVisibility(8);
            textView.setOnClickListener(activityC19725xad6fc40e.V);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0 e0Var = this.f273033e;
            if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.UNINSTALL) {
                if (item.f272567m) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572032wt);
                } else {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571908t8);
                }
                textView.setEnabled(true);
            } else if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.DOWNLOADING) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td);
                textView.setEnabled(false);
            } else if (e0Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e0.DOWNLOADED) {
                if (item.f272567m) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572110yz);
                } else {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572109yy);
                }
                textView.setEnabled(true);
            }
        }
        boolean z18 = item.f272565h;
        android.widget.TextView textView2 = b0Var.f273054c;
        if (z18) {
            if (activityC19725xad6fc40e.f272884y == 4) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hok);
            } else {
                java.lang.String str = activityC19725xad6fc40e.f272880u;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                textView2.setText(str);
            }
            textView2.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19725xad6fc40e.f272880u) ? 8 : 0);
        } else {
            textView2.setVisibility(8);
        }
        if (activityC19725xad6fc40e.f272884y != 6 && (xVar = activityC19725xad6fc40e.A) != null && xVar.equals(item)) {
            radioButton.setChecked(true);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
