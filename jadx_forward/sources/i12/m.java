package i12;

/* loaded from: classes15.dex */
public class m extends j12.b {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f368756i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f368757m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f368758n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f368759o;

    public m(android.content.Context context, java.lang.String str) {
        super(context);
        this.f368756i = true;
        this.f368757m = true;
        this.f368758n = new java.util.LinkedList();
        this.f368759o = "";
        this.f368759o = str;
    }

    @Override // j12.b
    public void a() {
        super.a();
    }

    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return 0;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return true;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17;
        r45.zj0 zj0Var;
        i12.l lVar = (i12.l) view.getTag();
        j12.i item = getItem(i17);
        if (lVar != null && item != null) {
            item.f378707i = this.f368757m;
            r45.kj0 kj0Var = item.f378702d;
            if (kj0Var == null) {
                lVar.k(0);
                z17 = false;
            } else {
                lVar.f368709h.setText(kj0Var.f460260e);
                lVar.j(kj0Var.f460266n);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460265m)) {
                    n11.a b17 = n11.a.b();
                    java.lang.String str = kj0Var.f460265m;
                    b17.h(str, lVar.f368707f, y12.f.b("", str));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460268p)) {
                    lVar.f368708g.setVisibility(8);
                } else {
                    n11.a b18 = n11.a.b();
                    java.lang.String str2 = kj0Var.f460268p;
                    b18.h(str2, lVar.f368708g, y12.f.b("", str2));
                    lVar.f368708g.setVisibility(0);
                }
                lVar.k(8);
                z17 = true;
            }
            if (!z17 && (zj0Var = item.f378700b) != null) {
                lVar.f368709h.setText(zj0Var.f473663f);
                if (n22.l.c(zj0Var)) {
                    n11.a.b().g("", lVar.f368707f);
                    lVar.f368707f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
                } else {
                    n11.a b19 = n11.a.b();
                    java.lang.String str3 = zj0Var.f473662e;
                    b19.h(str3, lVar.f368707f, y12.f.b(zj0Var.f473661d, str3));
                }
                boolean b27 = j12.g.b(zj0Var.f473667m, 2);
                if (!android.text.TextUtils.isEmpty(zj0Var.f473679y)) {
                    lVar.f368708g.setImageDrawable(null);
                    lVar.f368708g.setVisibility(0);
                    n11.a b28 = n11.a.b();
                    java.lang.String str4 = zj0Var.f473679y;
                    b28.h(str4, lVar.f368708g, y12.f.b("", str4));
                } else if (b27) {
                    lVar.f368708g.setVisibility(0);
                    lVar.f368708g.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhy);
                } else {
                    lVar.f368708g.setVisibility(8);
                }
                android.view.View view2 = lVar.f368710i;
                int i18 = ((java.util.LinkedList) this.f368758n).contains(zj0Var.f473661d) ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreMainAdapter", "getItemView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                lVar.j(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473680z) ? zj0Var.f473680z : zj0Var.f473678x);
                java.lang.String str5 = this.f368759o;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                    android.view.View view3 = lVar.A;
                    aVar.pk(view3, "emoticon_album_cell");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view3, 40, 10, false);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(lVar.f368716o, "emoticon_album_cell_add");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(lVar.f368716o, 8, 10, false);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("pid", zj0Var.f473661d);
                    hashMap.put("emoticon_type", 2);
                    hashMap.put("emoticon_enter_scene", 0);
                    hashMap.put("pos_id", java.lang.Integer.valueOf(i17));
                    hashMap.put("requestid", str5);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view3, hashMap);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(lVar.f368716o, hashMap);
                }
            }
        }
        return view;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        i12.l lVar = new i12.l(this, context, view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h0 h0Var = this.f378686f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = lVar.f368716o;
        if (c22661xa3a2b3c0 != null) {
            c22661xa3a2b3c0.setOnClickListener(new i12.a(lVar, h0Var));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = lVar.f368718q;
        if (c22661xa3a2b3c02 != null) {
            c22661xa3a2b3c02.setOnClickListener(new i12.b(lVar, h0Var));
        }
        return lVar;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
    }

    @Override // j12.b
    public void q(int i17) {
    }

    public m(android.content.Context context) {
        super(context);
        this.f368756i = true;
        this.f368757m = true;
        this.f368758n = new java.util.LinkedList();
        this.f368759o = "";
    }
}
