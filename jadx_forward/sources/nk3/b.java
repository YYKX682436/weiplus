package nk3;

/* loaded from: classes8.dex */
public final class b implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f419561a;

    public b(java.util.Map map) {
        this.f419561a = map;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        java.lang.String str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("total", java.lang.Integer.valueOf(list.size()));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) it.next();
            nk3.d dVar = nk3.d.f419563a;
            int i17 = c16601x7ed0e40c.f66793x2262335f;
            dVar.getClass();
            if (i17 == 1) {
                str = "weapp";
            } else if (i17 == 2) {
                str = "webview";
            } else if (i17 == 3) {
                str = "wenote";
            } else if (i17 != 4) {
                switch (i17) {
                    case 6:
                        str = "music";
                        break;
                    case 7:
                        str = ya.b.f77489x9ff58fb5;
                        break;
                    case 8:
                        break;
                    case 9:
                        str = "voip";
                        break;
                    default:
                        switch (i17) {
                            case 20:
                                str = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
                                break;
                            case 21:
                                str = "live";
                                break;
                            case 22:
                                str = "finderStarVideo";
                                break;
                            case 23:
                                str = "tingStarMusic";
                                break;
                            case 24:
                                str = "ting";
                                break;
                            case 25:
                                str = "wcfinderLongVideo";
                                break;
                            case 26:
                                str = "article";
                                break;
                            case 27:
                                break;
                            case 28:
                                str = "liteapp";
                                break;
                            case 29:
                                str = "ask";
                                break;
                            case 30:
                                str = ya.a.f77450x918d59a8;
                                break;
                            default:
                                str = "Unknown$" + i17;
                                break;
                        }
                }
                str = "k1kVideo";
            } else {
                str = "file";
            }
            if (str.length() > 0) {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap2.get(str);
                linkedHashMap2.put(str, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        java.util.Map map = this.f419561a;
        map.put("multi_task_type_list", linkedHashMap);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        nk3.d dVar2 = nk3.d.f419563a;
        dVar2.getClass();
        java.lang.String str2 = nk3.d.f419567e;
        dVar2.getClass();
        ((cy1.a) rVar).Ej(str2, map, nk3.d.f419566d);
    }
}
