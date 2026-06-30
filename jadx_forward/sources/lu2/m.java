package lu2;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f402913b;

    /* renamed from: c, reason: collision with root package name */
    public static android.view.WindowManager f402914c;

    /* renamed from: d, reason: collision with root package name */
    public static android.view.View f402915d;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f402917f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f402918g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f402919h;

    /* renamed from: a, reason: collision with root package name */
    public static final lu2.m f402912a = new lu2.m();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f402916e = kz5.c1.k(new jz5.l("朋友", "TLRecommendTab"), new jz5.l("发现tab", "Discovery"));

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("视频号", "直播", "听一听", "看一看", "长视频", "图文(下线)", "搜一搜", "游戏"));
        f402917f = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add("DSL红点");
            arrayList3.add("s级红点");
            arrayList3.add("clear_type=0");
            arrayList3.add("文字红点");
            arrayList3.add("文字头像红点");
            arrayList3.add("普通红点");
            arrayList2.add(arrayList3);
        }
        f402918g = arrayList2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int size2 = f402917f.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int size3 = ((java.util.List) f402918g.get(i18)).size();
            for (int i19 = 0; i19 < size3; i19++) {
                java.lang.String str = (java.lang.String) f402917f.get(i18);
                int hashCode = str.hashCode();
                if (hashCode != 969785) {
                    if (hashCode == 35126732 && str.equals("视频号")) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add("无");
                        arrayList5.add("朋友");
                        arrayList5.add("发现tab");
                        arrayList4.add(arrayList5);
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add("");
                    arrayList4.add(arrayList6);
                } else {
                    if (str.equals("直播")) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add("无");
                        arrayList7.add("发现tab");
                        arrayList4.add(arrayList7);
                    }
                    java.util.ArrayList arrayList62 = new java.util.ArrayList();
                    arrayList62.add("");
                    arrayList4.add(arrayList62);
                }
            }
        }
        f402919h = arrayList4;
    }

    public static final void a(lu2.m mVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj, java.lang.Object obj2) {
        int i19;
        java.util.LinkedList linkedList;
        java.lang.String str3;
        mVar.getClass();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "s级红点");
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "clear_type=0");
        java.util.ArrayList d17 = kz5.c0.d(str);
        if (obj2 != null && (str3 = (java.lang.String) f402916e.get(obj2)) != null) {
            d17.add(str3);
        }
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470029q = g92.b.f351302e.T0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tipsId_");
        sb6.append(str);
        char c17 = '_';
        sb6.append('_');
        sb6.append(i18);
        sb6.append('_');
        sb6.append(java.lang.System.nanoTime());
        vs2Var.f470023h = sb6.toString();
        vs2Var.f470036x = "tipsUuid_" + str + '_' + i18 + '_' + java.lang.System.nanoTime();
        vs2Var.f470024i = 1800;
        vs2Var.f470020e = i17;
        vs2Var.f470038z = i18;
        int size = d17.size();
        int i27 = 0;
        int i28 = 0;
        while (i28 < size) {
            java.util.LinkedList linkedList2 = vs2Var.f470022g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f455425i = (java.lang.String) d17.get(i28);
            f03Var.f455427n = 1;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
            c19795xce8b809e.set(i27, -4688240171222493109L);
            f03Var.f455428o = hc2.b.a(c19795xce8b809e);
            f03Var.f455424h = !b18 ? 1 : 0;
            f03Var.f455432s = b17 ? 1 : 0;
            f03Var.f455422f = str2 + c17 + obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "文字红点")) {
                i19 = 3;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "文字头像红点")) {
                f03Var.f455423g = null;
                i19 = 16;
            } else {
                i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "普通红点") ? 1 : 999;
            }
            f03Var.f455420d = i19;
            if (i19 == 999) {
                r45.ya0 ya0Var = new r45.ya0();
                f03Var.B = ya0Var;
                r45.fz2 fz2Var = new r45.fz2();
                ya0Var.f472451d = fz2Var;
                java.util.LinkedList linkedList3 = fz2Var.f456274d;
                if (linkedList3 == null) {
                    linkedList3 = new java.util.LinkedList();
                }
                fz2Var.f456274d = linkedList3;
                r45.cp5 cp5Var = new r45.cp5();
                cp5Var.f453301d = 1;
                r45.ap5 ap5Var = new r45.ap5();
                cp5Var.f453302e = ap5Var;
                ap5Var.f451709d = new r45.x80();
                r45.ap5 ap5Var2 = cp5Var.f453302e;
                r45.x80 x80Var = ap5Var2 != null ? ap5Var2.f451709d : null;
                if (x80Var != null) {
                    x80Var.f471386d = str2 + "_test_ori_" + obj;
                }
                r45.ap5 ap5Var3 = cp5Var.f453302e;
                r45.x80 x80Var2 = ap5Var3 != null ? ap5Var3.f451709d : null;
                if (x80Var2 != null) {
                    r45.wm5 wm5Var = new r45.wm5();
                    wm5Var.f470823d = 1;
                    x80Var2.f471388f = wm5Var;
                }
                r45.ap5 ap5Var4 = cp5Var.f453302e;
                if (ap5Var4 != null) {
                    ap5Var4.f451710e = new r45.x80();
                }
                r45.ap5 ap5Var5 = cp5Var.f453302e;
                r45.x80 x80Var3 = ap5Var5 != null ? ap5Var5.f451710e : null;
                if (x80Var3 != null) {
                    x80Var3.f471386d = str2 + "_test_thu_" + obj;
                }
                r45.ap5 ap5Var6 = cp5Var.f453302e;
                r45.x80 x80Var4 = ap5Var6 != null ? ap5Var6.f451710e : null;
                if (x80Var4 != null) {
                    r45.wm5 wm5Var2 = new r45.wm5();
                    wm5Var2.f470823d = 1;
                    x80Var4.f471388f = wm5Var2;
                }
                r45.yo5 yo5Var = new r45.yo5();
                cp5Var.f453303f = yo5Var;
                yo5Var.f472794d = new r45.t60();
                r45.yo5 yo5Var2 = cp5Var.f453303f;
                r45.t60 t60Var = yo5Var2 != null ? yo5Var2.f472794d : null;
                i27 = 0;
                if (t60Var != null) {
                    t60Var.f467701f = 0;
                }
                r45.fz2 fz2Var2 = ya0Var.f472451d;
                if (fz2Var2 != null && (linkedList = fz2Var2.f456274d) != null) {
                    linkedList.add(cp5Var);
                }
            }
            linkedList2.add(f03Var);
            i28++;
            c17 = '_';
        }
        zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "RedDotMock", null, false, null, 28, null);
    }
}
