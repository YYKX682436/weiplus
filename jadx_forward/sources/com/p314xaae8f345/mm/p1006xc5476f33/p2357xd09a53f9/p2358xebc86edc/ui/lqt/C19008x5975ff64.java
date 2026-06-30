package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout */
/* loaded from: classes9.dex */
public class C19008x5975ff64 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f259459d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f259460e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bn5 f259461f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t f259462g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f259463h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f259464i;

    public C19008x5975ff64(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f259459d = new java.util.ArrayList();
        this.f259460e = new java.util.ArrayList();
        this.f259463h = false;
        this.f259464i = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s(this);
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t tVar = this.f259462g;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.k6) tVar;
            k6Var.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.R1;
            k6Var.f259773a.Z6(true);
        }
    }

    public void b(java.util.List list, boolean z17) {
        this.f259463h = true;
        java.util.List list2 = this.f259459d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        java.util.List list3 = this.f259460e;
        ((java.util.ArrayList) list3).clear();
        removeAllViews();
        setVisibility(0);
        if (list2 == null || ((java.util.ArrayList) list2).isEmpty()) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.bn5 bn5Var = (r45.bn5) it.next();
            android.view.View view = (android.widget.LinearLayout) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571161d73, (android.view.ViewGroup) this, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u(null);
            uVar.f259921d = view;
            uVar.f259918a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ixh);
            uVar.f259919b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ixg);
            uVar.f259920c = (android.widget.RadioButton) view.findViewById(com.p314xaae8f345.mm.R.id.ixj);
            uVar.f259918a.setText(bn5Var.f452430e);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bn5Var.f452431f)) {
                uVar.f259919b.setVisibility(8);
            } else {
                uVar.f259919b.setText(bn5Var.f452431f);
            }
            if (this.f259461f != null) {
                int i18 = this.f259461f.f452429d;
            }
            if (z17) {
                r45.bn5 bn5Var2 = this.f259461f;
                if (bn5Var2 != null && bn5Var2.f452429d == bn5Var.f452429d) {
                    uVar.f259920c.setChecked(true);
                }
            } else if (i17 == 0) {
                uVar.f259920c.setChecked(true);
                this.f259461f = bn5Var;
            }
            uVar.f259922e = i17;
            view.setTag(uVar);
            view.setOnClickListener(this.f259464i);
            ((java.util.ArrayList) list3).add(new java.lang.ref.WeakReference(uVar));
            addView(view);
            i17++;
        }
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "input money: %s", str);
        java.util.List list = this.f259459d;
        if (list != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.isEmpty()) {
                return;
            }
            this.f259461f = null;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f259460e;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (weakReference.get() != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) weakReference.get()).f259920c.setEnabled(true);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) weakReference.get()).f259920c.setChecked(false);
                }
            }
            int i07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(str, "100");
            java.util.Iterator it6 = arrayList.iterator();
            int i17 = 0;
            while (it6.hasNext()) {
                r45.bn5 bn5Var = (r45.bn5) it6.next();
                int i18 = bn5Var.f452432g;
                if (i18 < 0 || i07 <= i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) ((java.lang.ref.WeakReference) arrayList2.get(i17)).get();
                    if (uVar != null) {
                        uVar.f259920c.setEnabled(true);
                        uVar.f259918a.setEnabled(true);
                        uVar.f259919b.setEnabled(true);
                        uVar.f259921d.setEnabled(true);
                        if (this.f259461f == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "auto select type: %s", java.lang.Integer.valueOf(bn5Var.f452429d));
                            uVar.f259920c.setChecked(true);
                            this.f259461f = bn5Var;
                            a();
                            if (i17 > 0) {
                                uVar.f259918a.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
                            } else {
                                uVar.f259918a.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a_z));
                            }
                        } else {
                            uVar.f259918a.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a_z));
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "disable item: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bn5Var.f452432g));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u uVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) ((java.lang.ref.WeakReference) arrayList2.get(i17)).get();
                    if (uVar2 != null) {
                        uVar2.f259920c.setChecked(false);
                        uVar2.f259920c.setEnabled(false);
                        uVar2.f259918a.setEnabled(false);
                        uVar2.f259919b.setEnabled(false);
                        uVar2.f259921d.setEnabled(false);
                        this.f259461f = null;
                        a();
                    }
                }
                i17++;
            }
        }
    }

    /* renamed from: getRedeemTypeList */
    public java.util.List<r45.bn5> m73817xba5015aa() {
        return this.f259459d;
    }

    /* renamed from: getSelectRedeemType */
    public r45.bn5 m73818x2858fc88() {
        return this.f259461f;
    }

    /* renamed from: setCallback */
    public void m73819x6c4ebec7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.t tVar) {
        this.f259462g = tVar;
    }

    public C19008x5975ff64(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f259459d = new java.util.ArrayList();
        this.f259460e = new java.util.ArrayList();
        this.f259463h = false;
        this.f259464i = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.s(this);
    }
}
