package i55;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final i55.f f370380a = new i55.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f370381b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f370382c;

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        for (int i17 = 0; i17 < 4; i17++) {
            arrayList.add(new java.util.LinkedHashMap());
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f370381b).entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            g55.e eVar = (g55.e) entry.getValue();
            if (intValue >= 0 && intValue < 4) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.put("tab_index", java.lang.Integer.valueOf(intValue));
                linkedHashMap.put("bottom_red_dot_info", eVar.a());
                arrayList.set(intValue, linkedHashMap);
            }
        }
        return arrayList;
    }

    public final void b(int i17, long j17, boolean z17) {
        if (f370382c) {
            f370382c = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomRedDotLogic", "bottom redDot unExposure");
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f370381b).entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                ((g55.e) entry.getValue()).f(j17, null);
            }
        }
    }

    public final void c(boolean z17, int i17, int i18, java.lang.String redDotText, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotText, "redDotText");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        i55.e eVar = new i55.e(currentTimeMillis);
        eVar.f370377e = redDotText;
        eVar.f370378f = i19;
        eVar.f370379g = z17;
        java.util.Map map = f370381b;
        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        java.lang.Object obj2 = obj;
        if (!z17) {
            if (obj != null) {
                g55.e eVar2 = (g55.e) obj;
                eVar2.f(currentTimeMillis, null);
                eVar2.f350502h = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomRedDotLogic", "report " + obj);
            }
            map.remove(java.lang.Integer.valueOf(i17));
            return;
        }
        if (obj == null) {
            e55.e eVar3 = e55.e.f331200a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Set set = e55.e.f331201b;
            sb6.append(i17 < set.size() ? (java.lang.String) kz5.n0.T(set, i17) : null);
            sb6.append('_');
            sb6.append(i18);
            g55.e eVar4 = new g55.e(sb6.toString());
            f55.e eVar5 = f55.e.f341304e;
            if (i17 == 3) {
                java.util.Map f17 = eVar3.f("", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTab"), ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("MyTab"));
                if (f17 != null) {
                    eVar4.d().putAll(f17);
                }
            }
            map.put(java.lang.Integer.valueOf(i17), eVar4);
            obj2 = eVar4;
            if (f370382c) {
                eVar4.e(currentTimeMillis, null);
                obj2 = eVar4;
            }
        }
        g55.e eVar6 = (g55.e) obj2;
        g55.i iVar = (g55.i) kz5.n0.k0(eVar6.b());
        if (iVar != null ? true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar, iVar) : true) {
            if (iVar != null) {
                iVar.f350532b = currentTimeMillis;
                iVar.f350533c += currentTimeMillis - iVar.f350534d;
                iVar.f350534d = 0L;
            }
            eVar6.b().add(eVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BottomRedDotLogic", "new redDot info index = " + i17 + ' ' + eVar);
        }
    }
}
