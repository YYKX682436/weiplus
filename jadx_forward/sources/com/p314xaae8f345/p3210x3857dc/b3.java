package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f301746a;

    /* renamed from: b, reason: collision with root package name */
    public static long f301747b;

    /* renamed from: c, reason: collision with root package name */
    public static zx5.c f301748c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f301749d;

    public static synchronized void a(android.content.Context context, com.p314xaae8f345.p3210x3857dc.h2 h2Var) {
        synchronized (com.p314xaae8f345.p3210x3857dc.b3.class) {
            by5.c4.f("XWebSdkInternal", java.lang.String.format("initXWebEnvironment, logInterface:%s, reportInterface:%s, spProvider:%s, libraryLoader:%s, webViewExtensionListener:%s, sevenZipDecompressor:%s", h2Var.f301823a, h2Var.f301824b, h2Var.f301825c, h2Var.f301826d, h2Var.f301827e, h2Var.f301828f));
            by5.w wVar = h2Var.f301823a;
            if (wVar != null) {
                by5.c4.f117956a = wVar;
            }
            com.p314xaae8f345.p3210x3857dc.n1 n1Var = h2Var.f301824b;
            if (n1Var != null) {
                by5.s0.f118128c = n1Var;
            }
            com.p314xaae8f345.p3210x3857dc.v vVar = h2Var.f301825c;
            if (vVar != null) {
                synchronized (by5.d4.class) {
                    if (vVar != null) {
                        by5.d4.f117968a = vVar;
                    }
                }
            }
            com.p314xaae8f345.p3210x3857dc.a0 a0Var = h2Var.f301826d;
            if (a0Var != null) {
                com.p314xaae8f345.p3210x3857dc.b0.f301744a = a0Var;
            }
            by5.t0 t0Var = h2Var.f301827e;
            if (t0Var != null) {
                org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429515o = t0Var;
            }
            com.p314xaae8f345.p3210x3857dc.x xVar = h2Var.f301828f;
            if (xVar != null) {
                dy5.c.f326278a = xVar;
            }
            org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.q(context);
            com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
        }
    }

    public static boolean b(tx5.a aVar, java.util.ArrayList arrayList) {
        int ordinal = aVar.ordinal();
        int i17 = 0;
        if (ordinal == 0) {
            if (arrayList == null || arrayList.isEmpty()) {
                by5.c4.f("XWebUpdateHttpDnsHostList", "addHttpDnsHostList fail, add empty list");
                return false;
            }
            java.lang.String b17 = com.p314xaae8f345.p3210x3857dc.q2.b("http-dns");
            by5.c4.f("XWebUpdateHttpDnsHostList", "addHttpDnsHostList, current: " + b17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (b17 == null || b17.length() == 0) {
                by5.c4.f("XWebUpdateHttpDnsHostList", "addHttpDnsHostList, current is empty, add success");
            } else {
                arrayList2.addAll(java.util.Arrays.asList(b17.split("\\|")));
                while (i17 < arrayList.size()) {
                    if (arrayList2.contains(arrayList.get(i17))) {
                        by5.c4.f("XWebUpdateHttpDnsHostList", "addHttpDnsHostList, add " + ((java.lang.String) arrayList.get(i17)) + " fail, exist");
                    } else {
                        arrayList2.add((java.lang.String) arrayList.get(i17));
                        by5.c4.f("XWebUpdateHttpDnsHostList", "addHttpDnsHostList, add " + ((java.lang.String) arrayList.get(i17)) + " success");
                    }
                    i17++;
                }
                arrayList = arrayList2;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb6.append((java.lang.CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb6.append((java.lang.CharSequence) "|");
                }
            }
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p3210x3857dc.q2.c("http-dns", sb7);
            by5.c4.f("XWebUpdateHttpDnsHostList", "after addHttpDnsHostList, list: " + sb7);
            return true;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                by5.c4.f("XWebSdkInternal", "updateHttpDnsHostListInternal fail, unsupported UpdateHttpDns type");
                return false;
            }
            java.lang.String b18 = com.p314xaae8f345.p3210x3857dc.q2.b("http-dns");
            if (b18 != null && b18.length() != 0) {
                com.p314xaae8f345.p3210x3857dc.q2.c("http-dns", "");
            }
            java.lang.String b19 = com.p314xaae8f345.p3210x3857dc.q2.b("http-dns");
            if (b19 == null || b19.length() == 0) {
                by5.c4.f("XWebUpdateHttpDnsHostList", "deleteAllHttpDnsHostList success");
                return true;
            }
            by5.c4.f("XWebUpdateHttpDnsHostList", "deleteAllHttpDnsHostList fail");
            return false;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            by5.c4.f("XWebUpdateHttpDnsHostList", "deleteHttpDnsHostList fail, delete empty list");
            return false;
        }
        java.lang.String b27 = com.p314xaae8f345.p3210x3857dc.q2.b("http-dns");
        by5.c4.f("XWebUpdateHttpDnsHostList", "deleteHttpDnsHostList, current: " + b27);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (b27 == null || b27.length() == 0) {
            by5.c4.f("XWebUpdateHttpDnsHostList", "deleteHttpDnsHostList, current is empty, delete fail");
            return false;
        }
        arrayList3.addAll(java.util.Arrays.asList(b27.split("\\|")));
        while (i17 < arrayList.size()) {
            if (arrayList3.contains(arrayList.get(i17))) {
                arrayList3.remove(arrayList.get(i17));
                by5.c4.f("XWebUpdateHttpDnsHostList", "deleteHttpDnsHostList, delete " + ((java.lang.String) arrayList.get(i17)) + " success");
            } else {
                by5.c4.f("XWebUpdateHttpDnsHostList", "deleteHttpDnsHostList, delete " + ((java.lang.String) arrayList.get(i17)) + " fail, not exist");
            }
            i17++;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it6 = arrayList3.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb8.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                }
                sb8.append((java.lang.CharSequence) "|");
            }
        }
        java.lang.String sb9 = sb8.toString();
        com.p314xaae8f345.p3210x3857dc.q2.c("http-dns", sb9);
        by5.c4.f("XWebUpdateHttpDnsHostList", "after deleteHttpDnsHostList, list: " + sb9);
        return true;
    }
}
