package com.tencent.matrix.lifecycle.owners;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0000H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0012\u0012\u0002\b\u0003\u0018\u00010\u001ej\b\u0012\u0002\b\u0003\u0018\u0001`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010#¨\u00062"}, d2 = {"Lcom/tencent/matrix/lifecycle/owners/OverlayWindowLifecycleOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Landroid/view/ViewGroup$LayoutParams;", "", "isOverlayType", "inject", "Ljz5/f0;", "prepareWindowGlobal", "enable", "init$matrix_android_lib_release", "(Z)V", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "hasVisibleWindow", "hasOverlayWindow", "", "Landroid/view/View;", "getAllViews$matrix_android_lib_release", "()Ljava/util/List;", "getAllViews", "", "TAG", "Ljava/lang/String;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "overlayViews", "Ljava/util/HashSet;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "WindowManagerGlobal_mRoots", "Ljava/util/ArrayList;", "injected", "Z", "Loj/a0;", "Field_ViewRootImpl_mView$delegate", "Ljz5/g;", "getField_ViewRootImpl_mView", "()Loj/a0;", "Field_ViewRootImpl_mView", "Lcom/tencent/matrix/lifecycle/owners/a;", "onViewRootChangedListener$delegate", "getOnViewRootChangedListener", "()Lcom/tencent/matrix/lifecycle/owners/a;", "onViewRootChangedListener", "fallbacked", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class OverlayWindowLifecycleOwner extends com.tencent.matrix.lifecycle.StatefulOwner {
    private static final java.lang.String TAG = "Matrix.OverlayWindowLifecycleOwner";
    private static java.util.ArrayList<?> WindowManagerGlobal_mRoots;
    private static volatile boolean fallbacked;
    private static volatile boolean injected;
    public static final com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner INSTANCE = new com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner();
    private static final java.util.HashSet<java.lang.Object> overlayViews = new java.util.HashSet<>();
    private static final android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: Field_ViewRootImpl_mView$delegate, reason: from kotlin metadata */
    private static final jz5.g Field_ViewRootImpl_mView = jz5.h.b(com.tencent.matrix.lifecycle.owners.j.f52752d);

    /* renamed from: onViewRootChangedListener$delegate, reason: from kotlin metadata */
    private static final jz5.g onViewRootChangedListener = jz5.h.b(com.tencent.matrix.lifecycle.owners.m.f52763d);

    private OverlayWindowLifecycleOwner() {
        super(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oj.a0 getField_ViewRootImpl_mView() {
        return (oj.a0) Field_ViewRootImpl_mView.getValue();
    }

    private final com.tencent.matrix.lifecycle.owners.a getOnViewRootChangedListener() {
        return (com.tencent.matrix.lifecycle.owners.a) onViewRootChangedListener.getValue();
    }

    private final com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner inject() {
        java.lang.Object a17;
        try {
            if (injected) {
                oj.j.b(TAG, "already injected", new java.lang.Object[0]);
            } else {
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
                java.lang.Object[] objArr = new java.lang.Object[0];
                oj.b0 b0Var = new oj.b0(cls, "getInstance", new java.lang.Class[0]);
                synchronized (b0Var) {
                    a17 = b0Var.a(null, false, objArr);
                }
                java.lang.Object WindowManagerGlobal_mLock = oj.c0.a(cls, "mLock", a17);
                kotlin.jvm.internal.o.f(WindowManagerGlobal_mLock, "WindowManagerGlobal_mLock");
                synchronized (WindowManagerGlobal_mLock) {
                    com.tencent.matrix.lifecycle.owners.b bVar = new com.tencent.matrix.lifecycle.owners.b((java.util.ArrayList) oj.c0.a(cls, "mRoots", a17), getOnViewRootChangedListener());
                    oj.a0 a0Var = new oj.a0(cls, "mRoots");
                    synchronized (a0Var) {
                        a0Var.d(a17, bVar, false);
                    }
                    WindowManagerGlobal_mRoots = bVar;
                }
                injected = true;
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOverlayType(android.view.ViewGroup.LayoutParams layoutParams) {
        int i17;
        if (layoutParams instanceof android.view.WindowManager.LayoutParams) {
            return android.os.Build.VERSION.SDK_INT < 26 ? ((android.view.WindowManager.LayoutParams) layoutParams).type == 2002 : !((i17 = ((android.view.WindowManager.LayoutParams) layoutParams).type) != 2038 && i17 != 2002);
        }
        return false;
    }

    private final void prepareWindowGlobal() {
        java.lang.Object a17;
        if (WindowManagerGlobal_mRoots == null) {
            if (fallbacked) {
                throw new java.lang.ClassNotFoundException("WindowManagerGlobal_mRoots not found");
            }
            oj.j.c(TAG, "monitor disabled, fallback init", new java.lang.Object[0]);
            fallbacked = true;
            java.util.ArrayList<?> arrayList = null;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
                java.lang.Object[] objArr = new java.lang.Object[0];
                oj.b0 b0Var = new oj.b0(cls, "getInstance", new java.lang.Class[0]);
                synchronized (b0Var) {
                    a17 = b0Var.a(null, false, objArr);
                }
                arrayList = (java.util.ArrayList) oj.c0.a(cls, "mRoots", a17);
            } catch (java.lang.Throwable th6) {
                oj.j.d(TAG, th6, "", new java.lang.Object[0]);
            }
            WindowManagerGlobal_mRoots = arrayList;
        }
        if (WindowManagerGlobal_mRoots == null) {
            throw new java.lang.ClassNotFoundException("WindowManagerGlobal_mRoots not found");
        }
        if (getField_ViewRootImpl_mView() == null) {
            throw new java.lang.ClassNotFoundException("Field_ViewRootImpl_mView not found");
        }
    }

    public final java.util.List<android.view.View> getAllViews$matrix_android_lib_release() {
        kz5.p0 p0Var = kz5.p0.f313996d;
        try {
            INSTANCE.prepareWindowGlobal();
            java.util.ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            if (arrayList == null) {
                return p0Var;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (java.lang.Object obj : arrayList) {
                oj.a0 field_ViewRootImpl_mView = INSTANCE.getField_ViewRootImpl_mView();
                kotlin.jvm.internal.o.d(field_ViewRootImpl_mView);
                arrayList2.add((android.view.View) field_ViewRootImpl_mView.a(obj));
            }
            return kz5.n0.S0(arrayList2);
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
            return p0Var;
        }
    }

    public final boolean hasOverlayWindow() {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (injected) {
            return active();
        }
        try {
            INSTANCE.prepareWindowGlobal();
            java.util.ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            kotlin.jvm.internal.o.d(arrayList);
            if (arrayList.isEmpty()) {
                return false;
            }
            for (java.lang.Object obj : arrayList) {
                com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = INSTANCE;
                oj.a0 field_ViewRootImpl_mView = overlayWindowLifecycleOwner.getField_ViewRootImpl_mView();
                kotlin.jvm.internal.o.d(field_ViewRootImpl_mView);
                android.view.View view = (android.view.View) field_ViewRootImpl_mView.a(obj);
                if (view != null && (layoutParams = view.getLayoutParams()) != null && overlayWindowLifecycleOwner.isOverlayType(layoutParams) && view.getVisibility() == 0 && view.getWindowVisibility() == 0) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean hasVisibleWindow() {
        try {
            INSTANCE.prepareWindowGlobal();
            java.util.ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            kotlin.jvm.internal.o.d(arrayList);
            if (arrayList.isEmpty()) {
                return false;
            }
            for (java.lang.Object obj : arrayList) {
                oj.a0 field_ViewRootImpl_mView = INSTANCE.getField_ViewRootImpl_mView();
                kotlin.jvm.internal.o.d(field_ViewRootImpl_mView);
                android.view.View view = (android.view.View) field_ViewRootImpl_mView.a(obj);
                if (view != null && view.getVisibility() == 0 && view.getWindowVisibility() == 0) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            oj.j.d(TAG, th6, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final void init$matrix_android_lib_release(boolean enable) {
        if (enable) {
            inject();
        } else {
            oj.j.c(TAG, "disabled", new java.lang.Object[0]);
        }
    }
}
