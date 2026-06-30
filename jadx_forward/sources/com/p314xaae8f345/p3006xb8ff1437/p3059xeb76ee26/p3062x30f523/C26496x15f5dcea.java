package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523;

/* renamed from: com.tencent.thumbplayer.tmediacodec.hook.HookManager */
/* loaded from: classes14.dex */
public final class C26496x15f5dcea {
    private static final java.lang.String TAG = "HookManager";

    /* renamed from: sHoldCallbackMap */
    private static final java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.InterfaceC26499xff462bf2> f54143xfcec63a5 = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: sIsSurfaceMethodHooked */
    private static boolean f54144x1427a653;

    /* renamed from: hookSurfaceCallback */
    public static void m103434x95dec6f(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.InterfaceC26499xff462bf2 interfaceC26499xff462bf2) {
        java.util.Map<java.lang.String, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.InterfaceC26499xff462bf2> map = f54143xfcec63a5;
        map.put(str, interfaceC26499xff462bf2);
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "after hookSurfaceCallback size:" + map.size() + " mHoldCallbackMap:" + map);
        }
        if (f54144x1427a653) {
            return;
        }
        f54144x1427a653 = true;
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.m103444x2499340a(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.SurfaceTextureHookCallback() { // from class: com.tencent.thumbplayer.tmediacodec.hook.HookManager.1
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26500x9e673249.SurfaceTextureHookCallback
            /* renamed from: onSurfaceTextureDestroyedCalled */
            public boolean mo103437x8cb207c9(android.graphics.SurfaceTexture surfaceTexture) {
                if (surfaceTexture == null) {
                    return true;
                }
                java.lang.String obj = surfaceTexture.toString();
                java.util.Iterator it = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26496x15f5dcea.f54143xfcec63a5.keySet().iterator();
                while (it.hasNext()) {
                    if (android.text.TextUtils.equals((java.lang.String) it.next(), obj)) {
                        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.InterfaceC26499xff462bf2 interfaceC26499xff462bf22 = (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.InterfaceC26499xff462bf2) com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26496x15f5dcea.f54143xfcec63a5.get(obj);
                        if (interfaceC26499xff462bf22 == null) {
                            return false;
                        }
                        interfaceC26499xff462bf22.m103441xac79a11b(surfaceTexture);
                        return false;
                    }
                }
                return true;
            }
        });
    }

    /* renamed from: realReleaseSurfaceTexture */
    public static void m103435x2aeef497(android.graphics.SurfaceTexture surfaceTexture) {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture);
            m103436x9d840516(surfaceTexture.toString());
            surfaceTexture.release();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "realReleaseSurfaceTexture surfaceTexture:" + surfaceTexture + " ignoreThrowable", th6);
        }
    }

    /* renamed from: unHookSurfaceCallback */
    public static void m103436x9d840516(java.lang.String str) {
        f54143xfcec63a5.remove(str);
    }
}
