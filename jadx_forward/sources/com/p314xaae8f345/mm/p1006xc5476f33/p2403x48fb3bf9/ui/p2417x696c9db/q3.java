package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class q3 {
    public q3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String url, android.content.Intent intent) {
        java.util.List arrayList;
        boolean z17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ip.e a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            java.util.List list = a17.f375087c;
            if (list.isEmpty()) {
                list.addAll(a17.a());
            }
            arrayList = java.util.Collections.unmodifiableList(list);
        } else {
            arrayList = new java.util.ArrayList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewActionBarHelper", "fullScreenMpLinkInfos size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r26.i0.A(r26.n0.u0(url).toString(), ((jp.a) obj).f382503a, false, 2, null)) {
                break;
            }
        }
        jp.a aVar = (jp.a) obj;
        int intExtra = intent.getIntExtra(com.p314xaae8f345.mm.ui.w2.f292730j, -1);
        if (aVar != null) {
            java.util.List list2 = aVar.f382504b;
            z17 = list2.isEmpty() ? true : list2.contains(java.lang.Integer.valueOf(intExtra));
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Boolean bool = valueOf.booleanValue() ? valueOf : null;
            if (bool != null) {
                bool.booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewActionBarHelper", "check should fullscreen Match url: " + url + ", urlPrefix: " + aVar.f382503a + " itemShowType: " + intExtra);
            }
        }
        return z17;
    }
}
