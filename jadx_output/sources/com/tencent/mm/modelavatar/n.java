package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class n implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f70488d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f70489e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelavatar.e f70490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70491g;

    public n(com.tencent.mm.modelavatar.r rVar, java.lang.String str) {
        this.f70491g = rVar;
        this.f70488d = null;
        this.f70489e = null;
        this.f70490f = null;
        this.f70488d = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        com.tencent.mm.modelavatar.r0 n07;
        com.tencent.mm.modelavatar.r0 r0Var;
        java.lang.String str = this.f70488d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.modelavatar.r rVar = this.f70491g;
        rVar.getClass();
        if (str == null ? false : str.startsWith("ammURL_")) {
            java.lang.String str2 = (java.lang.String) ((lt0.f) rVar.f70527m).get(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str)) == null || !str.equals(n07.e()))) {
                com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
                Ni.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4,img_flag.updateflag from img_flag where img_flag.reserved2=\"");
                com.tencent.mm.sdk.platformtools.t8.n(str2);
                sb6.append(str2);
                sb6.append("\"");
                android.database.Cursor f17 = Ni.f70539d.f(sb6.toString(), null, 2);
                if (f17 == null) {
                    r0Var = null;
                } else {
                    if (f17.moveToFirst()) {
                        f17.moveToFirst();
                        r0Var = new com.tencent.mm.modelavatar.r0();
                        r0Var.a(f17);
                    } else {
                        r0Var = null;
                    }
                    f17.close();
                }
                if (r0Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(r0Var.e())) {
                    com.tencent.mm.vfs.w6.c(com.tencent.mm.modelavatar.g.c(r0Var.e(), false, false), com.tencent.mm.modelavatar.g.c(str, false, true));
                }
                com.tencent.mm.modelavatar.r0 r0Var2 = new com.tencent.mm.modelavatar.r0();
                r0Var2.f70529a = str;
                r0Var2.f70530b = 3;
                r0Var2.f70532d = str2;
                r0Var2.f70533e = str2;
                if (r0Var != null) {
                    r0Var2.f70536h = r0Var.f70536h;
                } else {
                    r0Var2.f70536h = 1;
                }
                r0Var2.f70534f = 1;
                r0Var2.f70537i = 31;
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var2);
            }
        }
        com.tencent.mm.modelavatar.z e17 = rVar.e();
        if (e17 == null) {
            return false;
        }
        java.util.Map map = com.tencent.mm.modelavatar.z.f70576c;
        int intValue = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) ? ((java.lang.Integer) ((com.tencent.mm.modelavatar.y) map).get(str)).intValue() : 0;
        if (intValue != 0) {
            com.tencent.mm.modelavatar.d1.Bi().getClass();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                e17.t(str, bp.b.decodeResource(context.getResources(), intValue, null));
            }
        }
        com.tencent.mm.modelavatar.r0 n08 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
        if (n08 != null) {
            if (n08.f70536h != 0) {
                this.f70489e = null;
                return true;
            }
        }
        this.f70489e = com.tencent.mm.modelavatar.z.h(e17.j(str, false), str, true);
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
    @Override // com.tencent.mm.sdk.platformtools.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelavatar.n.b():boolean");
    }

    public n(com.tencent.mm.modelavatar.r rVar, java.lang.String str, com.tencent.mm.modelavatar.e eVar) {
        this.f70491g = rVar;
        this.f70488d = null;
        this.f70489e = null;
        this.f70490f = null;
        this.f70488d = str;
        this.f70490f = eVar;
    }
}
