package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class w extends com.p314xaae8f345.mm.ui.z9 implements kv.e0 {

    /* renamed from: x, reason: collision with root package name */
    public static java.util.HashMap f224578x;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 f224579o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.Context f224580p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f224581q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f224582r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f224583s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f224584t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f224585u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f224586v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f224587w;

    public w(android.content.Context context) {
        super(context, null);
        this.f224581q = new java.util.HashMap();
        this.f224582r = new java.util.HashMap();
        this.f224583s = new java.util.HashSet();
        this.f224585u = false;
        this.f224586v = false;
        this.f224587w = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.s(this);
        r(true);
        this.f224580p = context;
        this.f224579o = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0(context);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (this.f224583s.contains(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.t(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void c() {
        super.c();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.c cVar = (s83.c) obj;
        if (cVar == null) {
            cVar = new s83.c();
        }
        cVar.mo9015xbf5d97fd(cursor);
        return cVar;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        return super.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return super.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f294141e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.blx, viewGroup, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v(this, null);
            vVar.f224568i = inflate.findViewById(com.p314xaae8f345.mm.R.id.hhq);
            vVar.f224569j = inflate.findViewById(com.p314xaae8f345.mm.R.id.d1f);
            vVar.f224560a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            vVar.f224561b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            vVar.f224562c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kuz);
            vVar.f224563d = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.llw);
            vVar.f224564e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564285n1);
            vVar.f224565f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564277mr);
            vVar.f224566g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564278ms);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hhw);
            vVar.f224567h = findViewById;
            findViewById.setClickable(true);
            vVar.f224570k = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            inflate.setTag(vVar);
            view2 = inflate;
        } else {
            view2 = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v vVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v) view2.getTag();
        vVar2.f224567h.setClickable(true);
        vVar2.f224567h.setTag(java.lang.Integer.valueOf(i17));
        vVar2.f224570k.setVisibility(8);
        if (p(i17)) {
            vVar2.f224561b.setVisibility(8);
            vVar2.f224562c.setVisibility(8);
            vVar2.f224563d.setVisibility(8);
            vVar2.f224560a.setVisibility(8);
            vVar2.f224560a.setTag(null);
            vVar2.f224565f.setVisibility(8);
            vVar2.f224564e.setVisibility(8);
            vVar2.f224566g.setVisibility(8);
        } else {
            s83.c item = getItem(i17);
            if (item != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67829x5c31173f)) {
                    vVar2.f224561b.setVisibility(8);
                    vVar2.f224562c.setVisibility(8);
                } else {
                    vVar2.f224561b.setVisibility(0);
                    if (this.f224585u) {
                        vVar2.f224562c.setVisibility(0);
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) vVar2.f224568i.getLayoutParams();
                        layoutParams.height = (int) vVar2.f224562c.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561538af5);
                        vVar2.f224568i.setLayoutParams(layoutParams);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) vVar2.f224560a.getLayoutParams();
                        layoutParams2.height = (int) vVar2.f224560a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561534ld);
                        layoutParams2.width = (int) vVar2.f224560a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561534ld);
                        vVar2.f224560a.setLayoutParams(layoutParams2);
                    } else {
                        vVar2.f224562c.setVisibility(8);
                        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) vVar2.f224568i.getLayoutParams();
                        layoutParams3.height = (int) vVar2.f224562c.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561537le);
                        vVar2.f224568i.setLayoutParams(layoutParams3);
                        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) vVar2.f224560a.getLayoutParams();
                        layoutParams4.height = (int) vVar2.f224560a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561535af3);
                        layoutParams4.width = (int) vVar2.f224560a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561535af3);
                        vVar2.f224560a.setLayoutParams(layoutParams4);
                    }
                    if (this.f224585u && item.f486402t == null && (hashMap2 = f224578x) != null && hashMap2.containsKey(item.f67827x821cd056)) {
                        item.f486402t = ((s83.c) f224578x.get(item.f67827x821cd056)).f486402t;
                    } else if (this.f224585u && item.f486402t == null && ((hashMap = f224578x) == null || hashMap.containsKey(item.f67827x821cd056))) {
                        java.lang.String str = item.f67827x821cd056;
                        java.lang.String str2 = s83.b.f486399a;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        ((sb0.f) jVar).getClass();
                        if (j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                            android.database.Cursor query = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{str}, null);
                            if (query != null) {
                                try {
                                    try {
                                        if (query.moveToFirst()) {
                                            while (!query.isAfterLast()) {
                                                arrayList.add(query.getString(query.getColumnIndex("data1")));
                                                query.moveToNext();
                                            }
                                        }
                                    } catch (java.lang.Exception e17) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "extractAddressItemFromCursor, error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
                                    }
                                } finally {
                                    query.close();
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
                        }
                        item.f486402t = arrayList;
                    }
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224584t);
                    android.content.Context context2 = this.f224580p;
                    if (!K0 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O0(this.f224584t.charAt(0)) || this.f224584t.startsWith("+"))) {
                        vVar2.f224562c.setText(o13.q.c(context2, w(item, this.f224584t), com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.e(this.f224584t)));
                        vVar2.f224561b.setText(o13.q.c(context2, item.f67829x5c31173f, this.f224584t));
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224584t) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O0(this.f224584t.charAt(0))) {
                        java.lang.String str3 = item.f67829x5c31173f;
                        java.lang.String str4 = this.f224584t;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            str4 = "";
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(str4) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x0(str4)) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int i18 = 0;
                            while (i18 < str3.length()) {
                                int i19 = i18 + 1;
                                java.lang.String substring = str3.substring(i18, i19);
                                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u(this, x51.k.a(substring), substring));
                                i18 = i19;
                            }
                            for (int i27 = 2; i27 <= str3.length(); i27++) {
                                for (int i28 = 0; i28 <= str3.length() - i27; i28++) {
                                    java.lang.String substring2 = str3.substring(i28, i28 + i27);
                                    arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u(this, x51.k.a(substring2), substring2));
                                }
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= arrayList2.size()) {
                                    break;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u) arrayList2.get(i29);
                                if (uVar.f224548a.contains(str4)) {
                                    str4 = uVar.f224549b;
                                    break;
                                }
                                i29++;
                            }
                        }
                        vVar2.f224561b.setText(o13.q.c(context2, str3, str4));
                        vVar2.f224562c.setText(w(item, this.f224584t));
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224584t)) {
                        vVar2.f224561b.setText(item.f67829x5c31173f);
                    }
                }
                android.widget.ImageView imageView = vVar2.f224560a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag(null);
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7l);
                    boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67827x821cd056);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var = this.f224579o;
                    if (!K02 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67830xf13c6c01)) {
                        c0Var.d(item.f67827x821cd056, item.f67830xf13c6c01, imageView);
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67827x821cd056)) {
                        c0Var.c(item.f67827x821cd056, imageView);
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67830xf13c6c01)) {
                        c0Var.f(item.f67830xf13c6c01, imageView);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.f67830xf13c6c01)) {
                        this.f224583s.add(item.f67830xf13c6c01);
                    }
                }
                vVar2.f224563d.setVisibility(8);
                java.lang.String v17 = v(item.f67828xfbe5919c);
                if (i17 == 0) {
                    vVar2.f224564e.setVisibility(0);
                    vVar2.f224564e.setText(v17);
                    vVar2.f224565f.setVisibility(8);
                } else if (v(getItem(i17 - 1).f67828xfbe5919c).equals(v17)) {
                    vVar2.f224564e.setVisibility(8);
                    vVar2.f224564e.setText("");
                    vVar2.f224565f.setVisibility(8);
                } else {
                    vVar2.f224564e.setVisibility(0);
                    vVar2.f224564e.setText(v17);
                    vVar2.f224565f.setVisibility(8);
                }
            }
            android.view.View view3 = vVar2.f224567h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            vVar2.f224566g.setVisibility(8);
            vVar2.f224566g.setOnClickListener(this.f224587w);
        }
        int i37 = i17 + 1;
        boolean z17 = getItem(i37) == null || getItem(i17) == null || v(getItem(i37).f67828xfbe5919c).equals(v(getItem(i17).f67828xfbe5919c));
        if (i37 == super.getCount() || !z17) {
            android.view.View view4 = vVar2.f224569j;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = vVar2.f224569j;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f224581q.clear();
        super.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        super.c();
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fc, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c3, code lost:
    
        if (r5 == null) goto L31;
     */
    @Override // com.p314xaae8f345.mm.ui.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w.q():void");
    }

    public int t() {
        return super.getCount();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public s83.c getItem(int i17) {
        return (s83.c) super.getItem(i17);
    }

    public final java.lang.String v(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : str.startsWith(s83.b.f486399a) ? "#" : str.toUpperCase().substring(0, 1);
    }

    public final java.lang.String w(s83.c cVar, java.lang.String str) {
        java.util.ArrayList arrayList;
        if (cVar == null || (arrayList = cVar.f486402t) == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }
}
