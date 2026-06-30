package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152021d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f152022e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p943x351df9c2.e f152023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f152024g;

    public n(com.p314xaae8f345.mm.p943x351df9c2.r rVar, java.lang.String str) {
        this.f152024g = rVar;
        this.f152021d = null;
        this.f152022e = null;
        this.f152023f = null;
        this.f152021d = str;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var;
        java.lang.String str = this.f152021d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r rVar = this.f152024g;
        rVar.getClass();
        if (str == null ? false : str.startsWith("ammURL_")) {
            java.lang.String str2 = (java.lang.String) ((lt0.f) rVar.f152060m).get(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && ((n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str)) == null || !str.equals(n07.e()))) {
                com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
                Ni.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4,img_flag.updateflag from img_flag where img_flag.reserved2=\"");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
                sb6.append(str2);
                sb6.append("\"");
                android.database.Cursor f17 = Ni.f152072d.f(sb6.toString(), null, 2);
                if (f17 == null) {
                    r0Var = null;
                } else {
                    if (f17.moveToFirst()) {
                        f17.moveToFirst();
                        r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                        r0Var.a(f17);
                    } else {
                        r0Var = null;
                    }
                    f17.close();
                }
                if (r0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.e())) {
                    com.p314xaae8f345.mm.vfs.w6.c(com.p314xaae8f345.mm.p943x351df9c2.g.c(r0Var.e(), false, false), com.p314xaae8f345.mm.p943x351df9c2.g.c(str, false, true));
                }
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var2 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                r0Var2.f152062a = str;
                r0Var2.f152063b = 3;
                r0Var2.f152065d = str2;
                r0Var2.f152066e = str2;
                if (r0Var != null) {
                    r0Var2.f152069h = r0Var.f152069h;
                } else {
                    r0Var2.f152069h = 1;
                }
                r0Var2.f152067f = 1;
                r0Var2.f152070i = 31;
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(r0Var2);
            }
        }
        com.p314xaae8f345.mm.p943x351df9c2.z e17 = rVar.e();
        if (e17 == null) {
            return false;
        }
        java.util.Map map = com.p314xaae8f345.mm.p943x351df9c2.z.f152109c;
        int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) ? ((java.lang.Integer) ((com.p314xaae8f345.mm.p943x351df9c2.y) map).get(str)).intValue() : 0;
        if (intValue != 0) {
            com.p314xaae8f345.mm.p943x351df9c2.d1.Bi().getClass();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context != null) {
                e17.t(str, bp.b.m10969xb866ec1c(context.getResources(), intValue, null));
            }
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 n08 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
        if (n08 != null) {
            if (n08.f152069h != 0) {
                this.f152022e = null;
                return true;
            }
        }
        this.f152022e = com.p314xaae8f345.mm.p943x351df9c2.z.h(e17.j(str, false), str, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024d  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p943x351df9c2.n.b():boolean");
    }

    public n(com.p314xaae8f345.mm.p943x351df9c2.r rVar, java.lang.String str, com.p314xaae8f345.mm.p943x351df9c2.e eVar) {
        this.f152024g = rVar;
        this.f152021d = null;
        this.f152022e = null;
        this.f152023f = null;
        this.f152021d = str;
        this.f152023f = eVar;
    }
}
