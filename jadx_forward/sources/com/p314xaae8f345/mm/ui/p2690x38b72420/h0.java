package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class h0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {
    public int A;
    public final boolean B;
    public final boolean C;
    public final java.util.List D;
    public final java.util.List E;
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.k1 F;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.i0 f288270n;

    /* renamed from: o, reason: collision with root package name */
    public int f288271o;

    /* renamed from: p, reason: collision with root package name */
    public int f288272p;

    /* renamed from: q, reason: collision with root package name */
    public int f288273q;

    /* renamed from: r, reason: collision with root package name */
    public int f288274r;

    /* renamed from: s, reason: collision with root package name */
    public int f288275s;

    /* renamed from: t, reason: collision with root package name */
    public int f288276t;

    /* renamed from: u, reason: collision with root package name */
    public int f288277u;

    /* renamed from: v, reason: collision with root package name */
    public int f288278v;

    /* renamed from: w, reason: collision with root package name */
    public int f288279w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.HashMap f288280x;

    /* renamed from: y, reason: collision with root package name */
    public android.util.SparseArray f288281y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f288282z;

    public h0(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, boolean z17, boolean z18, com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var, boolean z19, boolean z27, boolean z28) {
        super(abstractActivityC22312xbd689c47, list4, z17, z18, z19);
        this.f288271o = Integer.MAX_VALUE;
        this.f288272p = Integer.MAX_VALUE;
        this.f288273q = Integer.MAX_VALUE;
        this.f288274r = Integer.MAX_VALUE;
        this.f288275s = Integer.MAX_VALUE;
        this.f288276t = Integer.MAX_VALUE;
        this.f288277u = Integer.MAX_VALUE;
        this.f288278v = Integer.MAX_VALUE;
        this.f288279w = Integer.MAX_VALUE;
        this.f288280x = null;
        this.f288281y = null;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.F = new com.p314xaae8f345.mm.ui.p2690x38b72420.k1();
        this.B = z27;
        this.C = z28;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "create!");
        if (i0Var != null) {
            this.f288270n = i0Var;
        } else {
            this.f288270n = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        }
        this.E = list;
        this.D = list2;
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i17);
        if (a1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + a1Var.toString());
        }
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj.toString());
        }
        if (obj != null) {
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
            if (L == null || !L.r2()) {
                return;
            }
            s();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count = this.f288282z.getCount();
        android.util.SparseArray sparseArray = this.f288281y;
        return count + (sparseArray == null ? 0 : sparseArray.size());
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        int i18 = this.f288279w;
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        if (i17 == i18) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574492ig1));
        }
        int i19 = this.f288271o;
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var = this.f288270n;
        if (i17 == i19) {
            return t(i17, i0Var.f288306m);
        }
        if (i17 == this.f288272p) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifm));
        }
        if (i17 == this.f288273q) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifw));
        }
        if (i17 == this.f288274r) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifx));
        }
        if (i17 == this.f288275s) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iff));
        }
        if (i17 == this.f288276t) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571398dw));
        }
        if (i17 == this.f288277u) {
            return t(i17, l4Var.mo8774x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ift));
        }
        if (i17 == this.f288278v) {
            return new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d1(i17);
        }
        if (this.f288281y.indexOfKey(i17) >= 0) {
            return t(i17, (java.lang.String) this.f288281y.get(i17));
        }
        int i27 = i17;
        int i28 = 0;
        while (i28 <= this.f288281y.size()) {
            if (this.f288281y.indexOfKey(i27) >= 0) {
                i28++;
            }
            i27--;
            if (i27 < 0) {
                break;
            }
        }
        int i29 = i17 - i28;
        if (!this.f288282z.moveToPosition(i29)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i29));
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(this.f288282z);
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u uVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.u(i17);
        uVar.f(z3Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i0Var.f288307n)) {
            uVar.f288382r = i0Var.f288307n;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(z3Var.d1())) {
            uVar.f288369e = false;
            uVar.f288372h = false;
            uVar.f288371g = false;
            uVar.F = true;
        } else {
            uVar.f288369e = this.f288611f;
            uVar.f288372h = this.f288612g;
            uVar.F = false;
        }
        uVar.f288367c = this.B;
        uVar.G = this.C;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlphabetContactAdapter", "finish!");
        android.database.Cursor cursor = this.f288282z;
        if (cursor != null) {
            cursor.close();
            this.f288282z = null;
        }
        gm0.j1.i();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public int m() {
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public boolean o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        int i17 = dVar.f288366b + 1;
        int[] iArr = {this.f288279w, this.f288271o, this.f288272p, this.f288273q, this.f288274r, this.f288275s, this.f288276t, this.f288277u};
        for (int i18 = 0; i18 < 8; i18++) {
            if (i17 == iArr[i18]) {
                return true;
            }
        }
        return this.f288281y.indexOfKey(i17) >= 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public int r(java.lang.String str) {
        if (str.equals("↑")) {
            return 0;
        }
        java.util.HashMap hashMap = this.f288280x;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) this.f288280x.get(str)).intValue() + this.f288609d.O3().getHeaderViewsCount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x022b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043d  */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.h0.s():void");
    }

    public final com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d t(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
        n0Var.f288436y = str;
        n0Var.f288367c = this.B;
        return n0Var;
    }

    public final void u(int i17, java.lang.String str) {
        this.f288280x.put(str, java.lang.Integer.valueOf(i17));
        this.f288281y.put(i17, str);
    }

    public h0(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var) {
        this(abstractActivityC22312xbd689c47, null, null, null, list, z17, z18, i0Var, false, false, false);
    }
}
