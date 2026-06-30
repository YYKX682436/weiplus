package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.owners.j f52752d = new com.tencent.matrix.lifecycle.owners.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        try {
            return new oj.a0(java.lang.Class.forName("android.view.ViewRootImpl"), "mView");
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.OverlayWindowLifecycleOwner", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
