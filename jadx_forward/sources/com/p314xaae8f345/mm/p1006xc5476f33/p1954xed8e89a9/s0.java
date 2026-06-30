package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class s0 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f235139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f235141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f235143f;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
        this.f235143f = e0Var;
        this.f235138a = z3Var;
        this.f235139b = i17;
        this.f235140c = str;
        this.f235141d = linkedList;
        this.f235142e = str2;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = this.f235143f;
            final r35.a aVar = new r35.a(e0Var.f234953d, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t0(this));
            java.lang.String str = this.f235140c;
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            final com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235138a;
            if (isEmpty) {
                str = z3Var.F1;
            }
            boolean isEmpty2 = android.text.TextUtils.isEmpty(str);
            final java.util.LinkedList linkedList = this.f235141d;
            if (!isEmpty2) {
                aVar.m(str);
                aVar.b(z3Var.d1(), linkedList, false, "");
                return;
            }
            ((c01.k7) c01.n8.a()).e(z3Var.d1());
            ((java.util.LinkedList) e0Var.f234968v).add(z3Var.d1());
            c01.p8 a17 = c01.n8.a();
            java.lang.String d17 = z3Var.d1();
            int a18 = r35.s.a(java.lang.Integer.valueOf(e0Var.f234956g));
            final java.lang.String str2 = this.f235142e;
            ((c01.k7) a17).g(d17, str2, a18, new c01.o8() { // from class: com.tencent.mm.plugin.profile.s0$$a
                @Override // c01.o8
                public final void a(java.lang.String str3, boolean z17) {
                    java.lang.String str4;
                    com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.this;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).n(z3Var2.d1(), true);
                    if (n17 == null || (str4 = n17.F1) == null) {
                        str4 = "";
                    }
                    if (android.text.TextUtils.isEmpty(str4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewContactWidgetNormal", "[-] yuanbao: getContact during addContact still get empty antispam ticket.");
                    }
                    r35.a aVar2 = aVar;
                    aVar2.m(str4);
                    aVar2.a(z3Var2.d1(), str2, linkedList);
                }
            });
        }
    }
}
