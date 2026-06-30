package y80;

/* loaded from: classes8.dex */
public final class w0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.y0 f541480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ za3.d f541482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f541483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z80.p0 f541484h;

    public w0(y80.y0 y0Var, android.content.Context context, za3.d dVar, java.util.Map map, z80.p0 p0Var) {
        this.f541480d = y0Var;
        this.f541481e = context;
        this.f541482f = dVar;
        this.f541483g = map;
        this.f541484h = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        android.content.Context context = this.f541481e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        y80.y0 y0Var = this.f541480d;
        y0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        z80.p0 p0Var = this.f541484h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = p0Var.f552188a;
        za3.d dVar = this.f541482f;
        java.util.Map d17 = dVar.d(c16279x64cea23);
        java.util.Map map = this.f541483g;
        map.putAll(d17);
        java.lang.Object[] objArr = !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() || y0Var.Ni(map);
        int i17 = y0Var.f541492d;
        if (objArr != false) {
            sb6.append("com.tencent.map|");
            g4Var.b(i17, com.p314xaae8f345.mm.R.C30867xcad56011.juc, 0);
        }
        int i18 = i17 + 1;
        int Ai = y0Var.Ai();
        if ((Ai == 1 || Ai == 2) == true) {
            int i19 = i18;
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "com.tencent.map")) {
                    sb6.append(str);
                    sb6.append("|");
                    g4Var.g(i19, str2, 0);
                }
                i19++;
            }
            y0Var.Ui(context, g4Var, p0Var, i19, sb6);
        } else {
            java.util.Iterator it = ((java.util.ArrayList) dVar.e(p0Var.f552188a, true, true)).iterator();
            int i27 = i18;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) it.next();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f0Var.f226346e, "com.tencent.map")) {
                    sb6.append(f0Var.f226346e);
                    sb6.append("|");
                    g4Var.g(i27, f0Var.f226344c, 0);
                }
                i27++;
            }
            y0Var.Ui(context, g4Var, p0Var, i27, sb6);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != false) {
            int Di = y0Var.Di("com.tencent.map");
            boolean Ni = y0Var.Ni(map);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(Di);
            sb7.append(':');
            sb7.append(Ni ? 1 : 0);
            arrayList.add(sb7.toString());
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "com.tencent.map")) {
                arrayList.add(y0Var.Di(str3) + ":1");
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("navigate_the_software_status", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "view_exp", y0Var.Bi(linkedHashMap), 34048);
    }
}
