package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class d3 implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 f282397a;

    public d3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var) {
        this.f282397a = k3Var;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "preRemoveCallback %s", (java.lang.String) obj);
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282397a;
        if (k3Var.f282668s.indexOfKey(bitmap.hashCode()) >= 0) {
            return;
        }
        java.util.LinkedList linkedList = k3Var.f282667r;
        if (linkedList.contains(java.lang.Integer.valueOf(bitmap.hashCode()))) {
            linkedList.remove(java.lang.Integer.valueOf(bitmap.hashCode()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
            bitmap.recycle();
        }
    }
}
