package f93;

/* loaded from: classes11.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f342043n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f342044o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f342045p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f342046q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f342047r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f342048s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea, com.p314xaae8f345.mm.ui.p2690x38b72420.l4 activity) {
        super(activity, null, true, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f342048s = activityC16165x57283aea;
        this.f342044o = new java.util.HashMap();
        this.f342045p = new android.util.SparseArray();
        this.f342046q = "";
        this.f342047r = new java.util.LinkedList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count;
        android.database.Cursor cursor = this.f342043n;
        if (cursor == null) {
            count = 0;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cursor);
            count = cursor.getCount();
        }
        android.util.SparseArray sparseArray = this.f342045p;
        return count + (sparseArray != null ? sparseArray.size() : 0) + 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f342048s;
        if (i17 == 0) {
            java.lang.String string = activityC16165x57283aea.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574254hl4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = string;
            uVar = n0Var;
        } else {
            if (i17 == 1) {
                java.lang.String str = activityC16165x57283aea.f224728h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                f93.b5 b5Var = new f93.b5(i17, str);
                b5Var.G = new f93.x(activityC16165x57283aea);
                uVar2 = b5Var;
            } else if (i17 == 2) {
                java.lang.String str2 = "标签成员 (" + activityC16165x57283aea.f224734q.size() + ')';
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var2 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
                n0Var2.f288436y = str2;
                uVar = n0Var2;
            } else if (i17 == 3) {
                f93.s4 s4Var = new f93.s4(i17);
                s4Var.C = new f93.w(activityC16165x57283aea);
                uVar = s4Var;
            } else {
                android.util.SparseArray sparseArray = this.f342045p;
                if (sparseArray.indexOfKey(i17) >= 0) {
                    java.lang.Object obj = sparseArray.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var3 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
                    n0Var3.f288436y = (java.lang.String) obj;
                    uVar = n0Var3;
                } else {
                    int i18 = 4;
                    int i19 = i17;
                    do {
                        if (sparseArray.indexOfKey(i19) >= 0) {
                            i18++;
                        }
                        i19--;
                    } while (i19 >= 0);
                    int i27 = i17 - i18;
                    android.database.Cursor cursor = this.f342043n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cursor);
                    if (cursor.moveToPosition(i27)) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                        z3Var.mo9015xbf5d97fd(this.f342043n);
                        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar3 = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
                        uVar3.f(z3Var);
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
                            uVar3.f288369e = false;
                            uVar3.f288372h = false;
                            uVar3.f288371g = false;
                            uVar3.F = true;
                            uVar2 = uVar3;
                        } else {
                            uVar3.f288369e = this.f288611f;
                            uVar3.f288372h = this.f288612g;
                            uVar3.F = false;
                            uVar2 = uVar3;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
                        uVar = null;
                    }
                }
            }
            uVar = uVar2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        android.database.Cursor cursor = this.f342043n;
        if (cursor != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cursor);
            cursor.close();
            this.f342043n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f342044o;
        if (!hashMap.containsKey(str)) {
            return -1;
        }
        java.lang.Object obj = hashMap.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return ((java.lang.Number) obj).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f342048s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "resetData");
        android.database.Cursor cursor = this.f342043n;
        if (cursor != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cursor);
            cursor.close();
            this.f342043n = null;
        }
        java.util.HashMap hashMap = this.f342044o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f342045p;
        sparseArray.clear();
        java.lang.String[] strArr = new java.lang.String[0];
        int[] iArr = new int[0];
        this.f342043n = null;
        java.util.ArrayList arrayList = activityC16165x57283aea.f224734q;
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "mCurrentList is null | mCurrenList size == 0");
        } else {
            this.f342043n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U((java.lang.String[]) activityC16165x57283aea.f224734q.toArray(new java.lang.String[0]), this.f342046q, "@all.contact.android", "", null);
            strArr = c01.e2.y((java.lang.String[]) activityC16165x57283aea.f224734q.toArray(new java.lang.String[0]), "@all.contact.android", "", this.f342046q, null);
            iArr = c01.e2.w((java.lang.String[]) activityC16165x57283aea.f224734q.toArray(new java.lang.String[0]), "@all.contact.android", "", null, this.f342046q);
        }
        if (strArr != null && iArr != null) {
            int length = strArr.length;
            int i17 = 4;
            for (int i18 = 0; i18 < length; i18++) {
                if (i18 < iArr.length) {
                    hashMap.put(strArr[i18], java.lang.Integer.valueOf(iArr[i18] + i17));
                    sparseArray.put(iArr[i18] + i17, strArr[i18]);
                    i17++;
                }
            }
        }
        h();
        notifyDataSetChanged();
    }
}
