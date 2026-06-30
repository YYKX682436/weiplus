package com.tencent.mm.console;

/* loaded from: classes10.dex */
public class l4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        int i17;
        java.util.List<android.view.View> allViews$matrix_android_lib_release = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.getAllViews$matrix_android_lib_release();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allViews$matrix_android_lib_release, 10));
        java.util.Iterator<T> it = allViews$matrix_android_lib_release.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(oj.j0.f345707a.a((android.view.View) it.next(), 0));
        }
        java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
        if (array == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        for (java.lang.String str : (java.lang.String[]) array) {
        }
    }
}
