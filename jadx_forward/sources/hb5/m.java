package hb5;

/* loaded from: classes11.dex */
public class m extends com.p314xaae8f345.mm.ui.z9 implements s01.f {
    public boolean A;
    public boolean B;
    public long C;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f361754o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f361755p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.c6 f361756q;

    /* renamed from: r, reason: collision with root package name */
    public final float f361757r;

    /* renamed from: s, reason: collision with root package name */
    public final int f361758s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f361759t;

    /* renamed from: u, reason: collision with root package name */
    public final float f361760u;

    /* renamed from: v, reason: collision with root package name */
    public final float f361761v;

    /* renamed from: w, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f361762w;

    /* renamed from: x, reason: collision with root package name */
    public o11.g f361763x;

    /* renamed from: y, reason: collision with root package name */
    public o11.g f361764y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashMap f361765z;

    public m(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var, java.lang.String str) {
        super(context, new s01.b());
        this.f361756q = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f361757r = -1.0f;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f361759t = linkedHashMap;
        this.f361760u = -1.0f;
        this.f361761v = -1.0f;
        android.content.res.ColorStateList[] colorStateListArr = new android.content.res.ColorStateList[5];
        this.f361762w = colorStateListArr;
        this.f361763x = null;
        this.f361764y = null;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.f294144h = y9Var;
        this.f361754o = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
        this.f361755p = str;
        this.f361765z = new java.util.HashMap();
        colorStateListArr[0] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
        colorStateListArr[1] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560950yo);
        colorStateListArr[3] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        colorStateListArr[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[2] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560948ym);
        colorStateListArr[4] = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560838vl);
        linkedHashMap.put(s01.a.ALL, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bqq));
        linkedHashMap.put(s01.a.DEPARTMENT, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bqr));
        linkedHashMap.put(s01.a.EXTERNAL, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bqs));
        this.f361758s = i65.a.b(context, 8);
        this.f361757r = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        this.f361760u = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        this.f361761v = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        o11.f fVar = new o11.f();
        java.lang.String str2 = s01.r.f483457a;
        fVar.f423616g = qk.b.a(str);
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        fVar.f423629t = true;
        fVar.f423630u = i65.a.f(r8, com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3) * 0.1f;
        this.f361763x = fVar.a();
        fVar.f423630u = i65.a.f(r8, com.p314xaae8f345.mm.R.C30860x5b28f31.f561099i) * 0.1f;
        this.f361764y = fVar.a();
    }

    @Override // s01.f
    public void a(s01.e eVar) {
        if (this.A) {
            f();
        } else {
            this.B = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.b bVar = (s01.b) obj;
        if (bVar == null) {
            bVar = new s01.b();
            this.C = bVar.f69064xa6206081;
        }
        bVar.f69064xa6206081 = this.C;
        bVar.mo9015xbf5d97fd(cursor);
        return bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        super.g(i17, a1Var, obj);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04e9  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public android.database.Cursor j() {
        return super.j();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (this.A) {
            f();
        } else {
            this.B = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        c();
        s(r01.q3.aj().L0(this.f361755p));
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    public final java.lang.String t(java.lang.String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public void u(long j17) {
        java.util.HashMap hashMap = this.f361765z;
        if (hashMap != null) {
            hashMap.remove(j17 + "");
        }
    }
}
