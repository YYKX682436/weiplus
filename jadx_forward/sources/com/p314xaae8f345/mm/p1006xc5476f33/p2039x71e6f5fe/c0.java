package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes4.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l a(android.content.Context r18, android.view.View r19, java.util.ArrayList r20, int r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.a(android.content.Context, android.view.View, java.util.ArrayList, int):jz5.l");
    }

    public static final void b(android.content.Context context, android.view.View view, java.util.ArrayList dataList, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.b0 b0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        if (view == null || dataList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(dataList);
        jz5.l a17 = a(context, view, arrayList, i17);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a17.f384366d;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a17.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeViewHelper", "handleCode  dataList:" + dataList.size() + "  dstPointListOnCurrentDisplay:" + arrayList3.size() + ' ');
        try {
            java.lang.Object systemService = context.getSystemService("vibrator");
            android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeViewHelper", e17, "", new java.lang.Object[0]);
        }
        if (arrayList2.size() != 0) {
            if (b0Var != null) {
                b0Var.a(arrayList3, arrayList2, arrayList);
            }
        } else if (dataList.size() > 0) {
            java.lang.Object obj = dataList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) obj;
            if (b0Var != null) {
                b0Var.b(c17261xe88a6357, arrayList);
            }
        }
    }
}
