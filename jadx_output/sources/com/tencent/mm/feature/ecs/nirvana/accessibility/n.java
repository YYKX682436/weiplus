package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes14.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f65715a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f65716b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f65717c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f65718d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Field f65719e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f65720f;

    public n(com.tencent.mm.feature.ecs.nirvana.accessibility.m mVar) {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.reflect.Field field;
        java.lang.reflect.Method method5;
        java.lang.reflect.Method method6 = null;
        try {
            method = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException unused) {
            io.flutter.Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = android.view.accessibility.AccessibilityRecord.class.getMethod("getSourceNodeId", new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException unused2) {
            io.flutter.Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (android.os.Build.VERSION.SDK_INT <= 26) {
            try {
                method3 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getParentNodeId", new java.lang.Class[0]);
            } catch (java.lang.NoSuchMethodException unused3) {
                io.flutter.Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method3 = null;
            }
            try {
                method4 = android.view.accessibility.AccessibilityNodeInfo.class.getMethod("getChildId", java.lang.Integer.TYPE);
            } catch (java.lang.NoSuchMethodException unused4) {
                io.flutter.Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                method4 = null;
            }
            field = null;
            method5 = null;
            method6 = method3;
        } else {
            try {
                java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method5 = java.lang.Class.forName("android.util.LongArray").getMethod("get", java.lang.Integer.TYPE);
                field = declaredField;
                method4 = null;
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchFieldException | java.lang.NoSuchMethodException | java.lang.NullPointerException unused5) {
                io.flutter.Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method4 = null;
                field = null;
                method5 = null;
            }
        }
        this.f65715a = method;
        this.f65716b = method6;
        this.f65717c = method2;
        this.f65718d = method4;
        this.f65719e = field;
        this.f65720f = method5;
    }

    public static java.lang.Long a(com.tencent.mm.feature.ecs.nirvana.accessibility.n nVar, android.view.accessibility.AccessibilityRecord accessibilityRecord) {
        java.lang.reflect.Method method = nVar.f65717c;
        if (method == null) {
            return null;
        }
        try {
            return (java.lang.Long) method.invoke(accessibilityRecord, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException e17) {
            io.flutter.Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e17);
            return null;
        } catch (java.lang.reflect.InvocationTargetException e18) {
            io.flutter.Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e18);
            return null;
        }
    }

    public static boolean b(long j17, int i17) {
        return (j17 & (1 << i17)) != 0;
    }
}
