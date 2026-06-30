package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public class q1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.r1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.reflect.Field f274473a;

    public q1() {
        this.f274473a = null;
        try {
            java.lang.reflect.Field declaredField = android.app.ActivityManager.RunningAppProcessInfo.class.getDeclaredField("processState");
            declaredField.setAccessible(true);
            this.f274473a = declaredField;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GreenManUtil", th6, "", new java.lang.Object[0]);
        }
    }
}
