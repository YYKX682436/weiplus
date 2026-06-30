package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public final class c2 {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.exdevice.model.c2 f98859b;

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f98860a = new android.util.SparseArray();

    public static com.tencent.mm.plugin.exdevice.model.c2 a() {
        if (f98859b == null) {
            f98859b = new com.tencent.mm.plugin.exdevice.model.c2();
        }
        return f98859b;
    }

    public void b(int i17, java.lang.Object... objArr) {
        java.util.List list = (java.util.List) this.f98860a.get(i17);
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i18 = 0; i18 < list.size(); i18++) {
            ((com.tencent.mm.plugin.exdevice.model.b2) list.get(i18)).a(i17, objArr);
        }
    }

    public boolean c(int i17, com.tencent.mm.plugin.exdevice.model.b2 b2Var) {
        if (b2Var == null) {
            return false;
        }
        android.util.SparseArray sparseArray = this.f98860a;
        java.util.List list = (java.util.List) sparseArray.get(i17);
        if (list == null) {
            list = new java.util.LinkedList();
            sparseArray.put(i17, list);
        } else if (list.contains(b2Var)) {
            return false;
        }
        return list.add(b2Var);
    }

    public boolean d(int i17, com.tencent.mm.plugin.exdevice.model.b2 b2Var) {
        android.util.SparseArray sparseArray = this.f98860a;
        java.util.List list = (java.util.List) sparseArray.get(i17);
        if (list == null) {
            return false;
        }
        list.remove(b2Var);
        if (list.size() != 0) {
            return false;
        }
        sparseArray.remove(i17);
        return false;
    }
}
