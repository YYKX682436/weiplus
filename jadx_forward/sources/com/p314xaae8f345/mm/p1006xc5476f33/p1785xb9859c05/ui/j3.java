package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class j3 extends com.p314xaae8f345.mm.ui.z9 implements kv.e0 {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 f224411o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f224412p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f224413q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f224414r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f224415s;

    public j3(android.content.Context context) {
        super(context, null);
        this.f224412p = new java.util.HashMap();
        this.f224414r = new java.util.HashSet();
        this.f224415s = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g3(this);
        r(true);
        this.f224411o = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0(context);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (this.f224414r.contains(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h3(this));
        }
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
        if (this.f224413q == null) {
            t();
        }
        java.util.ArrayList arrayList = this.f224413q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return super.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        s83.c cVar;
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f294141e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.blx, viewGroup, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i3 i3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i3(this, null);
            i3Var.f224402k = view.findViewById(com.p314xaae8f345.mm.R.id.hhq);
            i3Var.f224403l = view.findViewById(com.p314xaae8f345.mm.R.id.d1f);
            i3Var.f224392a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            i3Var.f224393b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            i3Var.f224394c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kuz);
            i3Var.f224395d = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.llw);
            i3Var.f224396e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lm6);
            i3Var.f224397f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lm8);
            i3Var.f224398g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564285n1);
            i3Var.f224399h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564277mr);
            i3Var.f224400i = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564278ms);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hhw);
            i3Var.f224401j = findViewById;
            findViewById.setClickable(true);
            i3Var.f224404m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            view.setTag(i3Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i3 i3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i3) view.getTag();
        i3Var2.f224401j.setClickable(true);
        i3Var2.f224401j.setTag(java.lang.Integer.valueOf(i17));
        i3Var2.f224404m.setVisibility(8);
        if (p(i17)) {
            i3Var2.f224393b.setVisibility(8);
            i3Var2.f224394c.setVisibility(8);
            i3Var2.f224395d.setVisibility(8);
            i3Var2.f224392a.setVisibility(8);
            i3Var2.f224392a.setTag(null);
            i3Var2.f224399h.setVisibility(8);
            i3Var2.f224398g.setVisibility(8);
            i3Var2.f224400i.setVisibility(8);
        } else {
            s83.l lVar = (s83.l) this.f224413q.get(i17);
            if (lVar != null) {
                if (i17 == 0) {
                    i3Var2.f224399h.setVisibility(0);
                    i3Var2.f224398g.setVisibility(8);
                    i3Var2.f224399h.setText(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4a));
                } else {
                    i3Var2.f224399h.setVisibility(8);
                    i3Var2.f224398g.setVisibility(8);
                }
                i3Var2.f224404m.setVisibility(0);
                i3Var2.f224393b.setVisibility(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) i3Var2.f224402k.getLayoutParams();
                layoutParams.height = (int) i3Var2.f224394c.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561537le);
                i3Var2.f224402k.setLayoutParams(layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) i3Var2.f224392a.getLayoutParams();
                layoutParams2.height = (int) i3Var2.f224392a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561535af3);
                layoutParams2.width = (int) i3Var2.f224392a.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561535af3);
                i3Var2.f224392a.setLayoutParams(layoutParams2);
                long j17 = lVar.f68172xcebea32a;
                if (j17 > 0) {
                    java.util.HashMap hashMap = this.f224412p;
                    cVar = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (s83.c) hashMap.get(java.lang.Long.valueOf(lVar.f68172xcebea32a)) : com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().J0(lVar.f68172xcebea32a);
                    if (cVar != null) {
                        hashMap.put(java.lang.Long.valueOf(lVar.f68172xcebea32a), cVar);
                        i3Var2.f224393b.setText(cVar.f67829x5c31173f);
                    }
                } else {
                    i3Var2.f224393b.setText(t83.c.c(lVar.f68176x5b3f2672));
                    cVar = null;
                }
                i3Var2.f224394c.setVisibility(8);
                i3Var2.f224395d.setVisibility(0);
                i3Var2.f224397f.setText(t83.f.b(lVar.f68173x138777d0));
                long j18 = lVar.f68174xa7075739;
                if (j18 > 0) {
                    i3Var2.f224396e.setText(t83.f.a(j18));
                } else {
                    i3Var2.f224396e.setText(t83.f.h(lVar.f68177x10a0fed7));
                }
                android.widget.ImageView imageView = i3Var2.f224392a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag(null);
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7l);
                    if (cVar != null) {
                        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67827x821cd056);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c0 c0Var = this.f224411o;
                        if (!K0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67830xf13c6c01)) {
                            c0Var.d(cVar.f67827x821cd056, cVar.f67830xf13c6c01, imageView);
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67827x821cd056)) {
                            c0Var.c(cVar.f67827x821cd056, imageView);
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67830xf13c6c01)) {
                            c0Var.f(cVar.f67830xf13c6c01, imageView);
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f67830xf13c6c01)) {
                            this.f224414r.add(cVar.f67830xf13c6c01);
                        }
                    }
                }
            }
            android.view.View view2 = i3Var2.f224401j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i3Var2.f224400i.setVisibility(0);
            i3Var2.f224401j.setOnClickListener(this.f224415s);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        t();
        this.f224412p.clear();
        super.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        t();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        t();
    }

    public final void t() {
        java.lang.System.currentTimeMillis();
        s83.m Vi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(6, -30);
        long timeInMillis = calendar.getTimeInMillis();
        l75.k0 k0Var = Vi.f486421d;
        java.lang.String[] strArr = s83.m.f486420f;
        android.database.Cursor E = k0Var.E("IPCallRecord", strArr, "calltime>=?", new java.lang.String[]{timeInMillis + ""}, "addressId, phonenumber", null, "calltime desc");
        if (E.getCount() < 30) {
            E.close();
            E = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d.E("IPCallRecord", strArr, null, null, "addressId, phonenumber", null, "calltime desc");
        }
        java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                if (E.moveToFirst()) {
                    while (!E.isAfterLast() && arrayList.size() <= 30) {
                        s83.l lVar = new s83.l();
                        lVar.mo9015xbf5d97fd(E);
                        if (lVar.f68172xcebea32a != -1) {
                            if (!hashMap.containsKey(lVar.f68172xcebea32a + "")) {
                                hashMap.put(lVar.f68172xcebea32a + "", lVar);
                                arrayList.add(lVar);
                            }
                        } else {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            java.lang.String e17 = t83.c.e(context, lVar.f68176x5b3f2672);
                            s83.c L0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().L0(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) ? o25.b.c(e17, context) : null);
                            if (L0 != null) {
                                l75.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d;
                                long b17 = k0Var2 != null ? k0Var2.b() : -1L;
                                android.database.Cursor E2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d.E("IPCallRecord", s83.m.f486420f, "phonenumber=?", new java.lang.String[]{lVar.f68176x5b3f2672}, null, null, "calltime desc");
                                if (E2.moveToFirst()) {
                                    while (!E2.isAfterLast()) {
                                        s83.l lVar2 = new s83.l();
                                        lVar2.mo9015xbf5d97fd(E2);
                                        lVar2.f68172xcebea32a = L0.f72763xa3c65b86;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().z0(lVar2);
                                        E2.moveToNext();
                                    }
                                }
                                l75.k0 k0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().f486421d;
                                if (k0Var3 != null && b17 != -1) {
                                    k0Var3.w(java.lang.Long.valueOf(b17));
                                }
                                if (!hashMap.containsKey(lVar.f68172xcebea32a + "")) {
                                    hashMap.put(lVar.f68172xcebea32a + "", lVar);
                                    arrayList.add(lVar);
                                }
                            } else if (!hashMap.containsKey(lVar.f68176x5b3f2672)) {
                                hashMap.put(lVar.f68176x5b3f2672, lVar);
                                arrayList.add(lVar);
                            }
                        }
                        E.moveToNext();
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", e18.getMessage());
            }
            E.close();
            java.lang.System.currentTimeMillis();
            this.f224413q = arrayList;
        } catch (java.lang.Throwable th6) {
            E.close();
            throw th6;
        }
    }
}
