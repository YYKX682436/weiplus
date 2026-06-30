package uf5;

/* loaded from: classes10.dex */
public class q1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f508818n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f508819o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f508820p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f508821q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f508822r;

    /* renamed from: s, reason: collision with root package name */
    public final int f508823s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 f508824t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var, int i17) {
        super(l4Var, k35.c.a(), true, false);
        this.f508824t = activityC22349xe6f834c8;
        this.f508819o = new java.util.HashMap();
        this.f508820p = new android.util.SparseArray();
        this.f508821q = "";
        this.f508822r = new java.util.LinkedList();
        this.f508823s = i17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f508818n;
        if (cursor == null) {
            return 0;
        }
        int count = cursor.getCount();
        android.util.SparseArray sparseArray = this.f508820p;
        return count + (sparseArray != null ? sparseArray.size() : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar;
        android.util.SparseArray sparseArray = this.f508820p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = str;
            return n0Var;
        }
        int i18 = i17;
        int i19 = 0;
        while (i19 <= sparseArray.size()) {
            if (sparseArray.indexOfKey(i18) >= 0) {
                i19++;
            }
            i18--;
            if (i18 < 0) {
                break;
            }
        }
        if (this.f508818n.moveToPosition(i17 - i19)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(this.f508818n);
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
            uVar2.f(z3Var);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                uVar2.f288369e = false;
                uVar2.f288372h = false;
                uVar2.f288371g = false;
                uVar2.F = true;
            } else {
                uVar2.f288369e = p();
                uVar2.f288372h = this.f288612g;
                uVar2.F = false;
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508824t;
            if (activityC22349xe6f834c8.p5(uVar2)) {
                ((java.util.LinkedList) activityC22349xe6f834c8.C.f508822r).remove(z3Var.d1());
            }
            uVar = uVar2;
        } else {
            uVar = null;
        }
        uVar.f288369e = true;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "finish!");
        android.database.Cursor cursor = this.f508818n;
        if (cursor != null) {
            cursor.close();
            this.f508818n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean p() {
        return !this.f508824t.M;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f508819o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        java.lang.String[] strArr;
        android.database.Cursor cursor = this.f508818n;
        if (cursor != null) {
            cursor.close();
            this.f508818n = null;
        }
        java.util.HashMap hashMap = this.f508819o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f508820p;
        sparseArray.clear();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508824t;
        if (("@all.contact.android".equals(activityC22349xe6f834c8.F) || "@all.contact.without.chatroom.without.openim".equals(activityC22349xe6f834c8.F)) && ((strArr = activityC22349xe6f834c8.H) == null || strArr.length == 0)) {
            return;
        }
        gm0.j1.i();
        this.f508818n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(activityC22349xe6f834c8.H, this.f508821q, activityC22349xe6f834c8.F, "", this.f288121m);
        java.lang.String[] strArr2 = activityC22349xe6f834c8.H;
        java.lang.String str = activityC22349xe6f834c8.F;
        java.lang.String str2 = this.f508821q;
        java.util.List list = this.f288121m;
        java.lang.String[] y17 = c01.e2.y(strArr2, str, "", str2, list);
        int[] w17 = c01.e2.w(activityC22349xe6f834c8.H, activityC22349xe6f834c8.F, "", list, this.f508821q);
        if (y17 != null && w17 != null) {
            int i17 = 0;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        h();
        notifyDataSetChanged();
    }

    public void t(java.lang.String str) {
        java.util.List list = this.f508822r;
        if (((java.util.LinkedList) list).contains(str)) {
            ((java.util.LinkedList) list).remove(str);
        } else {
            int size = ((java.util.LinkedList) list).size();
            int i17 = this.f508823s;
            if (size >= i17) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2693xed412388.ActivityC22349xe6f834c8 activityC22349xe6f834c8 = this.f508824t;
                db5.e1.t(activityC22349xe6f834c8.mo55332x76847179(), activityC22349xe6f834c8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571412ea, java.lang.Integer.valueOf(i17)), "", new uf5.p1(this));
                return;
            }
            ((java.util.LinkedList) list).add(str);
        }
        notifyDataSetChanged();
    }
}
