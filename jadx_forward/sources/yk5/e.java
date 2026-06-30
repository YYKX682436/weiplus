package yk5;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f544408o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f544409p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f544410q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f544411r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f544412s;

    /* renamed from: t, reason: collision with root package name */
    public bb5.e f544413t;

    /* renamed from: u, reason: collision with root package name */
    public final bb5.g f544414u;

    public e(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.l4());
        this.f544408o = null;
        this.f544409p = r1;
        this.f544411r = true;
        this.f544413t = null;
        this.f544414u = new bb5.g(15, new yk5.a(this));
        this.f294144h = y9Var;
        android.content.res.ColorStateList[] colorStateListArr = {i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560949yn), i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560950yo)};
        this.f544410q = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj;
        if (cursor.getString(0) != null && cursor.getString(0).equals("1")) {
            if (l4Var == null) {
                l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            }
            l4Var.mo9015xbf5d97fd(cursor);
        } else if (cursor.getString(0).equals("2")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5)));
            if (L == null) {
                L = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                L.mo9015xbf5d97fd(cursor);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).s0(L, false);
            }
            if (l4Var == null) {
                l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            }
            l4Var.W1(2);
            l4Var.n1(-1L);
            l4Var.M1(1);
            l4Var.l1(this.f294141e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffi));
            l4Var.b2(L.d1());
            l4Var.Y1(0);
            l4Var.S1(java.lang.Integer.toString(1));
        } else {
            if (l4Var == null) {
                l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
            }
            l4Var.mo9015xbf5d97fd(cursor);
        }
        return l4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk5.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.util.HashMap hashMap = this.f544410q;
        if (str != null && !str.equals("") && hashMap != null) {
            hashMap.remove(str);
        } else if (hashMap != null) {
            hashMap.clear();
        }
        f();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        android.database.Cursor[] cursorArr = new android.database.Cursor[2];
        cursorArr[0] = c01.d9.b().A().a(c01.e2.f118654e, this.f544408o, this.f544412s);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.f544408o;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f544408o);
        }
        while (cursorArr[0].moveToNext()) {
            try {
                android.database.Cursor cursor = cursorArr[0];
                java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5));
                arrayList.add(string);
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(string)) {
                    arrayList2.add(string);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SearchConversationAdapter", e17, "", new java.lang.Object[0]);
            }
        }
        cursorArr[1] = c01.d9.b().z().c(this.f544412s, "@micromsg.with.all.biz.qq.com", null, arrayList, false, true, true, 2, arrayList2);
        s(new android.database.MergeCursor(cursorArr));
        notifyDataSetChanged();
    }
}
