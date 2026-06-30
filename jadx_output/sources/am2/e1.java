package am2;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final am2.e1 f8657a = new am2.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final am2.h3[] f8658b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f8659c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f8660d;

    static {
        am2.h3 h3Var = am2.h3.f8682e;
        am2.h3 h3Var2 = am2.h3.f8686i;
        am2.h3 h3Var3 = am2.h3.f8687m;
        am2.h3 h3Var4 = am2.h3.f8688n;
        am2.h3 h3Var5 = am2.h3.f8689o;
        am2.h3 h3Var6 = am2.h3.f8685h;
        am2.h3 h3Var7 = am2.h3.f8690p;
        am2.h3 h3Var8 = am2.h3.f8691q;
        f8658b = new am2.h3[]{h3Var, h3Var2, h3Var3, h3Var4, h3Var5, h3Var6, h3Var7, h3Var8};
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(am2.h3.f8681d, new am2.z0("MMFinderLiveGift100001", "test123456789testestest_爱心"));
        hashMap.put(h3Var, new am2.z0("findercoin_5_14508936543944575067", "test123456789testestest_掌声响起"));
        hashMap.put(am2.h3.f8683f, new am2.z0("MMFinderLiveGift100002", "test123456789testestest_干杯"));
        hashMap.put(am2.h3.f8684g, new am2.z0("MMFinderLiveGift100003", "test_撸串"));
        hashMap.put(h3Var6, new am2.z0("MMFinderLiveGift100004", "test123456789testestest_奶茶"));
        hashMap.put(h3Var2, new am2.z0("findercoin_5_14292800838796838928", "test_万柿兴龙"));
        hashMap.put(h3Var3, new am2.z0("findercoin_5_14171197588311115892", "test_火箭"));
        hashMap.put(h3Var4, new am2.z0("MMFinderLiveGift100014_special", "test123456789testestest_摘星星"));
        hashMap.put(h3Var5, new am2.z0("findercoin_5_13747901361130440763", "test123456789testestest_桃花岛"));
        hashMap.put(h3Var7, new am2.z0("MMFinderLiveGift100015", "test_抱抱"));
        hashMap.put(h3Var8, new am2.z0("MMFinderLiveGift100016", "test123456789testestest_告白气球"));
        hashMap.put(am2.h3.f8692r, new am2.z0("findercoin_5_14239178507806247143", "test_玫瑰"));
        f8659c = hashMap;
        f8660d = new java.util.HashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            f8660d.put(entry.getKey(), new am2.y0(entry));
        }
    }

    public final void a(java.util.List commandList, boolean z17) {
        kotlin.jvm.internal.o.g(commandList, "commandList");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftMockUtil", "executeBatchMockCommand: " + commandList);
        int i17 = 0;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(commandList, 10));
            java.util.Iterator it = commandList.iterator();
            while (it.hasNext()) {
                arrayList.add(((am2.b1) it.next()).a());
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            am2.b1 b1Var = (am2.b1) commandList.get(0);
            b1Var.getClass();
            pm0.v.Q("FinderLiveGiftMockUtil" + (c06.e.f37716d.c() % 4), false, new am2.c1(V0), b1Var.f8635d, 2, null);
            return;
        }
        for (java.lang.Object obj : commandList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            am2.b1 b1Var2 = (am2.b1) obj;
            b1Var2.getClass();
            pm0.v.Q("FinderLiveGiftMockUtil" + (i17 % 4), false, new am2.d1(b1Var2), b1Var2.f8635d, 2, null);
            i17 = i18;
        }
    }
}
