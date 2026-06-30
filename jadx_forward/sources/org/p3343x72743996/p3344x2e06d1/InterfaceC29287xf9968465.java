package org.p3343x72743996.p3344x2e06d1;

@java.lang.FunctionalInterface
/* renamed from: org.chromium.base.Callback */
/* loaded from: classes13.dex */
public interface InterfaceC29287xf9968465<T> {

    /* renamed from: org.chromium.base.Callback$Helper */
    /* loaded from: classes13.dex */
    public static abstract class Helper {
        /* renamed from: onBooleanResultFromNative */
        public static void m152272x56b74fc7(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465, boolean z17) {
            interfaceC29287xf9968465.m152269xd7b79106(java.lang.Boolean.valueOf(z17));
        }

        /* renamed from: onIntResultFromNative */
        public static void m152273x7859c60e(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465, int i17) {
            interfaceC29287xf9968465.m152269xd7b79106(java.lang.Integer.valueOf(i17));
        }

        /* renamed from: onLongResultFromNative */
        public static void m152274x6ae87f79(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465, long j17) {
            interfaceC29287xf9968465.m152269xd7b79106(java.lang.Long.valueOf(j17));
        }

        /* renamed from: onObjectResultFromNative */
        public static void m152275xebad527c(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465, java.lang.Object obj) {
            interfaceC29287xf9968465.m152269xd7b79106(obj);
        }

        /* renamed from: onTimeResultFromNative */
        public static void m152276x701349ca(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465 interfaceC29287xf9968465, long j17) {
            interfaceC29287xf9968465.m152269xd7b79106(java.lang.Long.valueOf(j17));
        }

        /* renamed from: runRunnable */
        public static void m152277xde1a36c8(java.lang.Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: bind */
    default java.lang.Runnable m152270x2e243d(final T t17) {
        return new java.lang.Runnable() { // from class: org.chromium.base.Callback$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465.this.m152269xd7b79106(t17);
            }
        };
    }

    /* renamed from: onResult, reason: merged with bridge method [inline-methods] */
    void m152269xd7b79106(T t17);
}
