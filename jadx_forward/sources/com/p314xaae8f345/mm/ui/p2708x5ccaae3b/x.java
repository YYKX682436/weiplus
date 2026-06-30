package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes12.dex */
public class x extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t f290296d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f290297e;

    public x(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t tVar) {
        this.f290296d = tVar;
        tVar.registerDataSetObserver(new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.v(this, null));
        this.f290297e = a(tVar);
    }

    public java.util.List a(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t tVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            cw1.j3 j3Var = (cw1.j3) tVar;
            if (i17 >= j3Var.getCount()) {
                return arrayList;
            }
            long c17 = ((bw1.l) j3Var.f304559f.get(i17)).c();
            com.p314xaae8f345.mm.ui.p2708x5ccaae3b.w wVar = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.w) hashMap.get(java.lang.Long.valueOf(c17));
            if (wVar == null) {
                wVar = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.w(this, i17);
                arrayList.add(wVar);
            }
            wVar.f290294a++;
            hashMap.put(java.lang.Long.valueOf(c17), wVar);
            i17++;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public int b(int i17) {
        try {
            return ((com.p314xaae8f345.mm.ui.p2708x5ccaae3b.w) this.f290297e.get(i17)).f290294a;
        } catch (java.lang.IndexOutOfBoundsException e17) {
            e17.toString();
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public int e() {
        return this.f290297e.size();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((cw1.j3) this.f290296d).getCount();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((cw1.j3) this.f290296d).getItem(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        ((cw1.j3) this.f290296d).getClass();
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return ((cw1.j3) this.f290296d).getView(i17, view, viewGroup);
    }

    @Override // com.p314xaae8f345.mm.ui.p2708x5ccaae3b.b
    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cw1.n3 n3Var;
        int i18 = ((com.p314xaae8f345.mm.ui.p2708x5ccaae3b.w) this.f290297e.get(i17)).f290295b;
        cw1.j3 j3Var = (cw1.j3) this.f290296d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = j3Var.f304558e;
        boolean z17 = false;
        if (view == null) {
            view = activityC13115xef650a1b.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570153yr, viewGroup, false);
            n3Var = new cw1.n3();
            n3Var.f304712b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gzf);
            n3Var.f304713c = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.f566766gz5);
            view.setTag(n3Var);
        } else {
            n3Var = (cw1.n3) view.getTag();
        }
        bw1.l item = j3Var.getItem(i18);
        n3Var.f304711a = i18;
        n3Var.f304712b.setText(k35.m1.d(activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573682fe4), item.f106348g / 1000));
        android.widget.CheckBox checkBox = n3Var.f304713c;
        long c17 = item.c();
        java.util.HashSet hashSet = new java.util.HashSet();
        int i19 = 0;
        while (true) {
            if (i19 >= j3Var.f304559f.size()) {
                break;
            }
            if (((bw1.l) r5.get(i19)).c() == c17) {
                hashSet.add(java.lang.Integer.valueOf(i19));
            }
            i19++;
        }
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = true;
                break;
            }
            if (!j3Var.f304557d.contains(java.lang.Integer.valueOf(((java.lang.Integer) it.next()).intValue()))) {
                break;
            }
        }
        checkBox.setChecked(z17);
        return view;
    }
}
