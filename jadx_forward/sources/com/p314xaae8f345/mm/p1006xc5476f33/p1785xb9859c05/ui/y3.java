package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class y3 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224617e;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f224616d = null;

    /* renamed from: f, reason: collision with root package name */
    public r45.rr3 f224618f = null;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224617e = null;
        iz5.a.g(null, activityC16143x7673980 != null);
        this.f224617e = activityC16143x7673980;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f224616d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f224616d;
        if (list != null) {
            return list.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x3 x3Var;
        t83.d dVar;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224617e;
        if (view == null) {
            view = ((android.view.LayoutInflater) activityC16143x7673980.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bm7, viewGroup, false);
            x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x3(this, null);
            x3Var.f224603a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okn);
            x3Var.f224604b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okl);
            x3Var.f224605c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okk);
            x3Var.f224606d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.okj);
            x3Var.f224607e = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.azl);
            view.setTag(x3Var);
        } else {
            x3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x3) view.getTag();
        }
        r45.l57 l57Var = (r45.l57) getItem(i17);
        if (l57Var == null) {
            return view;
        }
        x3Var.f224603a.setText(l57Var.f460697h);
        x3Var.f224604b.setText(l57Var.f460698i);
        x3Var.f224605c.setText(l57Var.f460699m);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l57Var.f460699m)) {
            x3Var.f224605c.setVisibility(8);
        } else {
            x3Var.f224605c.setVisibility(0);
        }
        if (this.f224618f != null) {
            android.widget.TextView textView = x3Var.f224606d;
            java.lang.String string = activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4f);
            java.lang.Object[] objArr = new java.lang.Object[2];
            java.lang.String str2 = this.f224618f.f466670g;
            java.util.HashMap hashMap = t83.c.f497945b;
            if (hashMap.size() == 0) {
                t83.c.k();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (dVar = (t83.d) hashMap.get(str2)) != null) {
                str = dVar.f497952c;
            }
            objArr[0] = str;
            objArr[1] = java.lang.String.valueOf(l57Var.f460695f);
            textView.setText(java.lang.String.format(string, objArr));
        }
        x3Var.f224607e.setTag(java.lang.Integer.valueOf(i17));
        x3Var.f224607e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w3(this));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
