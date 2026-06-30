package com.p314xaae8f345.mm.p2617xca9a2a67;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "verify mH callback hack, result failed!.", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.f275193s.a(675L, 32L, 1L);
        try {
            java.lang.Object f17 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f(com.p314xaae8f345.mm.p2617xca9a2a67.j.f275177c);
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(f17 == com.p314xaae8f345.mm.p2617xca9a2a67.q.f275206a);
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "spy, activityThread %s", objArr);
            java.lang.reflect.Field declaredField = f17.getClass().getDeclaredField("mH");
            declaredField.setAccessible(true);
            android.os.Handler handler = (android.os.Handler) declaredField.get(f17);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(handler == com.p314xaae8f345.mm.p2617xca9a2a67.q.f275207b);
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "spy, ActivityThread_mH %s", objArr2);
            java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            android.os.Handler.Callback callback = (android.os.Handler.Callback) declaredField2.get(handler);
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            objArr3[0] = java.lang.Boolean.valueOf(callback == com.p314xaae8f345.mm.p2617xca9a2a67.q.f275210e);
            objArr3[1] = callback;
            com.p314xaae8f345.mm.p2617xca9a2a67.j.d("WxSplash.Splash", "spy, callback %s %s", objArr3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p2617xca9a2a67.j.e(e17, "spy failed.");
        }
    }
}
