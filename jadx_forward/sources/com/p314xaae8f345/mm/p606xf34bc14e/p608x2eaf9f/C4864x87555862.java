package com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0002J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0014J\u0006\u0010\u0016\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccReporter;", "", "", "time", "Ljz5/f0;", "saveReportTime", "getLastRepReportTime", "", "", "types", "addHasReportedType", "overwriteHasReportedType", "", "getHasReportedType", "Ljz5/l;", "", "reportInternal", "initListener", "releaseListener", "reportAppTypeIfNeed", "", "getAccServiceTypeArray", "reportTouchExplorationEnable", "TAG", "Ljava/lang/String;", "Lfm5/b;", "autoAuthCallback", "Lfm5/b;", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.core.AccReporter */
/* loaded from: classes12.dex */
public final class C4864x87555862 {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862 f21035x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862();
    public static final java.lang.String TAG = "MicroMsg.Acc.AccReporter";
    private static fm5.b autoAuthCallback;

    private C4864x87555862() {
    }

    /* renamed from: addHasReportedType */
    private final void m42436x65c1df86(int... iArr) {
        java.util.Set W0 = kz5.n0.W0(m42437x6af4e831());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iArr, "<this>");
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(iArr[i17]);
        }
        kz5.h0.w(W0, numArr);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putString(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportMMKVKey.HasReportDataString, kz5.n0.g0(W0, ";", null, null, 0, null, null, 62, null));
    }

    /* renamed from: getHasReportedType */
    private final java.util.List<java.lang.Integer> m42437x6af4e831() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportMMKVKey.HasReportDataString, "");
        java.util.List f07 = r26.n0.f0(string == null ? "" : string, new java.lang.String[]{";"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            java.lang.Integer h17 = r26.h0.h((java.lang.String) it.next());
            if (h17 != null) {
                arrayList.add(h17);
            }
        }
        return arrayList;
    }

    /* renamed from: getLastRepReportTime */
    private final long m42438x6401ef2() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportMMKVKey.LastReportTimeLong, 0L);
    }

    /* renamed from: overwriteHasReportedType */
    private final void m42439xdf04675c(int... iArr) {
        java.util.Collection collection;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                collection = new java.util.LinkedHashSet(kz5.b1.d(iArr.length));
                for (int i17 : iArr) {
                    collection.add(java.lang.Integer.valueOf(i17));
                }
            } else {
                collection = kz5.o1.c(java.lang.Integer.valueOf(iArr[0]));
            }
        } else {
            collection = kz5.r0.f395535d;
        }
        L.putString(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportMMKVKey.HasReportDataString, kz5.n0.g0(collection, ";", null, null, 0, null, null, 62, null));
    }

    /* renamed from: reportInternal */
    private final void m42440xb8e80c11(java.util.List<jz5.l> list) {
        for (jz5.l lVar : list) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "reportInternal: " + lVar);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6826xc827f398 c6826xc827f398 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6826xc827f398();
            c6826xc827f398.f141472d = (long) ((java.lang.Number) lVar.f384366d).intValue();
            c6826xc827f398.f141473e = c6826xc827f398.b("PackageName", (java.lang.String) lVar.f384367e, true);
            c6826xc827f398.k();
        }
    }

    /* renamed from: saveReportTime */
    private final void m42441xa54077e(long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportMMKVKey.LastReportTimeLong, j17);
    }

    /* renamed from: getAccServiceTypeArray */
    public final java.util.List<jz5.l> m42442x48e5f375() {
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("enabled_accessibility_services");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/accessibility/core/AccReporter", "getAccServiceTypeArray", "()Ljava/util/List;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (str != null) {
            android.text.TextUtils.SimpleStringSplitter simpleStringSplitter = new android.text.TextUtils.SimpleStringSplitter(':');
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext()) {
                java.lang.String next = simpleStringSplitter.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getAccServiceTypeArray: ".concat(next));
                if (r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.TalkBack, false) && r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServicePackage.TalkBack, false)) {
                    arrayList2.add(new jz5.l(1, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.TalkBack));
                } else if (r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.ScreenReader, false) && r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServicePackage.ScreenReader, false)) {
                    arrayList2.add(new jz5.l(2, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.ScreenReader));
                } else if (r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.JieShuo, false) && r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServicePackage.JieShuo, false)) {
                    arrayList2.add(new jz5.l(4, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.JieShuo));
                } else if (r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.DianMing, false) && r26.n0.B(next, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServicePackage.DianMing, false)) {
                    arrayList2.add(new jz5.l(3, com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ServiceName.DianMing));
                } else {
                    arrayList2.add(new jz5.l(0, next));
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: initListener */
    public final void m42443xd75a7de4() {
        en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
        autoAuthCallback = ((dn1.i) kVar).f323407d.v(new en1.j() { // from class: com.tencent.mm.accessibility.core.AccReporter$initListener$1
            @Override // en1.j
            /* renamed from: onAuthResponse */
            public void mo8828x48bdb988(o45.ug req, o45.vg resp, boolean z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
                com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4864x87555862.f21035x4fbc8495.m42445xb95cab5a();
            }

            @Override // en1.j
            /* renamed from: onRegResponse */
            public void mo8829x6279e596(o45.ci resp, java.lang.String alias, int i17, java.lang.String nick, java.lang.String mobile, int i18) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alias, "alias");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nick, "nick");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            }
        });
    }

    /* renamed from: releaseListener */
    public final void m42444xc34f59db() {
        fm5.b bVar = autoAuthCallback;
        if (bVar != null) {
            bVar.mo10668x2efc64();
        }
    }

    /* renamed from: reportAppTypeIfNeed */
    public final void m42445xb95cab5a() {
        if (gm0.j1.a() && com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            boolean z17 = !android.text.format.DateUtils.isToday(m42438x6401ef2());
            java.util.List<jz5.l> m42442x48e5f375 = m42442x48e5f375();
            if (!m42442x48e5f375.isEmpty()) {
                if (z17) {
                    m42440xb8e80c11(m42442x48e5f375);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m42442x48e5f375, 10));
                    java.util.Iterator<T> it = m42442x48e5f375.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) it.next()).f384366d).intValue()));
                    }
                    int[] R0 = kz5.n0.R0(arrayList);
                    m42439xdf04675c(java.util.Arrays.copyOf(R0, R0.length));
                } else {
                    java.util.List<java.lang.Integer> m42437x6af4e831 = m42437x6af4e831();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : m42442x48e5f375) {
                        if (!m42437x6af4e831.contains(((jz5.l) obj).f384366d)) {
                            arrayList2.add(obj);
                        }
                    }
                    m42440xb8e80c11(arrayList2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(m42442x48e5f375, 10));
                    java.util.Iterator<T> it6 = m42442x48e5f375.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f384366d).intValue()));
                    }
                    int[] R02 = kz5.n0.R0(arrayList3);
                    m42436x65c1df86(java.util.Arrays.copyOf(R02, R02.length));
                }
                m42441xa54077e(java.lang.System.currentTimeMillis());
            }
        }
    }

    /* renamed from: reportTouchExplorationEnable */
    public final void m42446xc5c2625b() {
        jx3.f.INSTANCE.mo68477x336bdfd8(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.C4854x5f398dee.ReportKey.ID, 0L, 1L, false);
    }
}
