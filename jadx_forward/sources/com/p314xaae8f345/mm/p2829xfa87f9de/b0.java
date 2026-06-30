package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes8.dex */
public class b0 extends by5.t0 {
    @Override // by5.t0
    public java.lang.Object a(java.lang.String str, java.lang.Object... objArr) {
        boolean z17 = true;
        if ("AddFilterResources".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, AddFilterResources");
            android.content.res.Resources resources = (android.content.res.Resources) objArr[0];
            java.util.Map map = (java.util.Map) objArr[1];
            m95.h hVar = m95.k.f406637a;
            n95.d.b("MicroMsg.SVGResourceLoader", "addFilterResources:" + resources, new java.lang.Object[0]);
            java.util.HashMap hashMap = (java.util.HashMap) m95.k.f406649m;
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (((java.lang.ref.WeakReference) it.next()).get() == resources) {
                    break;
                }
            }
            if (!z17) {
                hashMap.put(new java.lang.ref.WeakReference(resources), map);
            }
            return java.lang.Boolean.TRUE;
        }
        if ("autoCheckUpdate".equals(str)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (com.p314xaae8f345.p3210x3857dc.a3.o(true)) {
                com.p314xaae8f345.mm.p2829xfa87f9de.u0.a(context, 7);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "autoCheckUpdateIfNeed, no need check update");
            }
            return java.lang.Boolean.TRUE;
        }
        if ("getHostByName".equals(str)) {
            java.lang.String str2 = (java.lang.String) objArr[0];
            java.util.List list = (java.util.List) objArr[1];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, getHostByNameFromNew, hostName:" + str2);
            android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str2), com.p314xaae8f345.mm.p2829xfa87f9de.g0.class);
            if (list == null || bundle == null) {
                return 0;
            }
            list.clear();
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("ipList");
            int i17 = bundle.getInt("result");
            list.addAll(stringArrayList);
            return java.lang.Integer.valueOf(i17);
        }
        if ("getHostByNameFromHttp".equals(str)) {
            java.lang.String str3 = (java.lang.String) objArr[0];
            java.util.List list2 = (java.util.List) objArr[1];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, getHostByNameFromHttp, hostName:" + str3);
            android.os.Bundle bundle2 = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str3), com.p314xaae8f345.mm.p2829xfa87f9de.f0.class);
            if (list2 == null || bundle2 == null) {
                return 0;
            }
            list2.clear();
            java.util.ArrayList<java.lang.String> stringArrayList2 = bundle2.getStringArrayList("ipList");
            int i18 = bundle2.getInt("result");
            list2.addAll(stringArrayList2);
            return java.lang.Integer.valueOf(i18);
        }
        if (!"getHostByNameFromSimple".equals(str)) {
            return null;
        }
        java.lang.String str4 = (java.lang.String) objArr[0];
        java.util.List list3 = (java.util.List) objArr[1];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewExtensionListener", "onMiscCallBack, getHostByNameFromSImple, hostName:" + str4);
        android.os.Bundle bundle3 = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ":push", new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str4), com.p314xaae8f345.mm.p2829xfa87f9de.h0.class);
        if (list3 != null && bundle3 != null) {
            list3.clear();
            list3.addAll(bundle3.getStringArrayList("ipList"));
        }
        return 0;
    }
}
