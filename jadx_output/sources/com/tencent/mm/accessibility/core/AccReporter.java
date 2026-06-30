package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0002J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0014J\u0006\u0010\u0016\u001a\u00020\u0004R\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccReporter;", "", "", "time", "Ljz5/f0;", "saveReportTime", "getLastRepReportTime", "", "", "types", "addHasReportedType", "overwriteHasReportedType", "", "getHasReportedType", "Ljz5/l;", "", "reportInternal", "initListener", "releaseListener", "reportAppTypeIfNeed", "", "getAccServiceTypeArray", "reportTouchExplorationEnable", "TAG", "Ljava/lang/String;", "Lfm5/b;", "autoAuthCallback", "Lfm5/b;", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class AccReporter {
    public static final com.tencent.mm.accessibility.core.AccReporter INSTANCE = new com.tencent.mm.accessibility.core.AccReporter();
    public static final java.lang.String TAG = "MicroMsg.Acc.AccReporter";
    private static fm5.b autoAuthCallback;

    private AccReporter() {
    }

    private final void addHasReportedType(int... iArr) {
        java.util.Set W0 = kz5.n0.W0(getHasReportedType());
        kotlin.jvm.internal.o.g(iArr, "<this>");
        java.lang.Integer[] numArr = new java.lang.Integer[iArr.length];
        int length = iArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            numArr[i17] = java.lang.Integer.valueOf(iArr[i17]);
        }
        kz5.h0.w(W0, numArr);
        com.tencent.mm.sdk.platformtools.o4.L().putString(com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.HasReportDataString, kz5.n0.g0(W0, ";", null, null, 0, null, null, 62, null));
    }

    private final java.util.List<java.lang.Integer> getHasReportedType() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString(com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.HasReportDataString, "");
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

    private final long getLastRepReportTime() {
        return com.tencent.mm.sdk.platformtools.o4.L().getLong(com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.LastReportTimeLong, 0L);
    }

    private final void overwriteHasReportedType(int... iArr) {
        java.util.Collection collection;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        kotlin.jvm.internal.o.g(iArr, "<this>");
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
            collection = kz5.r0.f314002d;
        }
        L.putString(com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.HasReportDataString, kz5.n0.g0(collection, ";", null, null, 0, null, null, 62, null));
    }

    private final void reportInternal(java.util.List<jz5.l> list) {
        for (jz5.l lVar : list) {
            com.tencent.mars.xlog.Log.i(TAG, "reportInternal: " + lVar);
            com.tencent.mm.autogen.mmdata.rpt.RedScreenSoftwareUseStruct redScreenSoftwareUseStruct = new com.tencent.mm.autogen.mmdata.rpt.RedScreenSoftwareUseStruct();
            redScreenSoftwareUseStruct.f59939d = (long) ((java.lang.Number) lVar.f302833d).intValue();
            redScreenSoftwareUseStruct.f59940e = redScreenSoftwareUseStruct.b("PackageName", (java.lang.String) lVar.f302834e, true);
            redScreenSoftwareUseStruct.k();
        }
    }

    private final void saveReportTime(long j17) {
        com.tencent.mm.sdk.platformtools.o4.L().putLong(com.tencent.mm.accessibility.core.AccConstants.ReportMMKVKey.LastReportTimeLong, j17);
    }

    public final java.util.List<jz5.l> getAccServiceTypeArray() {
        android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
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
                kotlin.jvm.internal.o.f(next, "next(...)");
                com.tencent.mars.xlog.Log.i(TAG, "getAccServiceTypeArray: ".concat(next));
                if (r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServiceName.TalkBack, false) && r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServicePackage.TalkBack, false)) {
                    arrayList2.add(new jz5.l(1, com.tencent.mm.accessibility.core.AccConstants.ServiceName.TalkBack));
                } else if (r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServiceName.ScreenReader, false) && r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServicePackage.ScreenReader, false)) {
                    arrayList2.add(new jz5.l(2, com.tencent.mm.accessibility.core.AccConstants.ServiceName.ScreenReader));
                } else if (r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServiceName.JieShuo, false) && r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServicePackage.JieShuo, false)) {
                    arrayList2.add(new jz5.l(4, com.tencent.mm.accessibility.core.AccConstants.ServiceName.JieShuo));
                } else if (r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServiceName.DianMing, false) && r26.n0.B(next, com.tencent.mm.accessibility.core.AccConstants.ServicePackage.DianMing, false)) {
                    arrayList2.add(new jz5.l(3, com.tencent.mm.accessibility.core.AccConstants.ServiceName.DianMing));
                } else {
                    arrayList2.add(new jz5.l(0, next));
                }
            }
        }
        return arrayList2;
    }

    public final void initListener() {
        en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
        autoAuthCallback = ((dn1.i) kVar).f241874d.v(new en1.j() { // from class: com.tencent.mm.accessibility.core.AccReporter$initListener$1
            @Override // en1.j
            public void onAuthResponse(o45.ug req, o45.vg resp, boolean z17) {
                kotlin.jvm.internal.o.g(req, "req");
                kotlin.jvm.internal.o.g(resp, "resp");
                com.tencent.mm.accessibility.core.AccReporter.INSTANCE.reportAppTypeIfNeed();
            }

            @Override // en1.j
            public void onRegResponse(o45.ci resp, java.lang.String alias, int i17, java.lang.String nick, java.lang.String mobile, int i18) {
                kotlin.jvm.internal.o.g(resp, "resp");
                kotlin.jvm.internal.o.g(alias, "alias");
                kotlin.jvm.internal.o.g(nick, "nick");
                kotlin.jvm.internal.o.g(mobile, "mobile");
            }
        });
    }

    public final void releaseListener() {
        fm5.b bVar = autoAuthCallback;
        if (bVar != null) {
            bVar.dead();
        }
    }

    public final void reportAppTypeIfNeed() {
        if (gm0.j1.a() && com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            boolean z17 = !android.text.format.DateUtils.isToday(getLastRepReportTime());
            java.util.List<jz5.l> accServiceTypeArray = getAccServiceTypeArray();
            if (!accServiceTypeArray.isEmpty()) {
                if (z17) {
                    reportInternal(accServiceTypeArray);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(accServiceTypeArray, 10));
                    java.util.Iterator<T> it = accServiceTypeArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) it.next()).f302833d).intValue()));
                    }
                    int[] R0 = kz5.n0.R0(arrayList);
                    overwriteHasReportedType(java.util.Arrays.copyOf(R0, R0.length));
                } else {
                    java.util.List<java.lang.Integer> hasReportedType = getHasReportedType();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : accServiceTypeArray) {
                        if (!hasReportedType.contains(((jz5.l) obj).f302833d)) {
                            arrayList2.add(obj);
                        }
                    }
                    reportInternal(arrayList2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(accServiceTypeArray, 10));
                    java.util.Iterator<T> it6 = accServiceTypeArray.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) it6.next()).f302833d).intValue()));
                    }
                    int[] R02 = kz5.n0.R0(arrayList3);
                    addHasReportedType(java.util.Arrays.copyOf(R02, R02.length));
                }
                saveReportTime(java.lang.System.currentTimeMillis());
            }
        }
    }

    public final void reportTouchExplorationEnable() {
        jx3.f.INSTANCE.idkeyStat(com.tencent.mm.accessibility.core.AccConstants.ReportKey.ID, 0L, 1L, false);
    }
}
