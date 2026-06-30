package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPGlobalEventNofication */
/* loaded from: classes13.dex */
public class C26570x7018c6b1 {

    /* renamed from: EVENT_ID_APP_ENTER_BACKGROUND */
    public static final int f55297xb2c3d72 = 100001;

    /* renamed from: EVENT_ID_APP_ENTER_FOREGROUND */
    public static final int f55298xd0dc5187 = 100002;

    /* renamed from: EVENT_ID_UPC_CHANGED */
    public static final int f55299x87635d9e = 100003;
    private static final java.lang.String TAG = "TPGlobalEventNofication";

    /* renamed from: mListeners */
    private static java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener> f55300x32131c52 = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: com.tencent.thumbplayer.utils.TPGlobalEventNofication$OnGlobalEventChangeListener */
    /* loaded from: classes13.dex */
    public interface OnGlobalEventChangeListener {
        /* renamed from: onEvent */
        void mo103064xaf8c47fb(int i17, int i18, int i19, java.lang.Object obj);
    }

    /* renamed from: addEventListener */
    public static synchronized void m104303xdab2e64d(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.class) {
            java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener> copyOnWriteArrayList = f55300x32131c52;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.contains(onGlobalEventChangeListener)) {
                f55300x32131c52.add(onGlobalEventChangeListener);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "add onNetStatus change listener: " + onGlobalEventChangeListener + ", mListeners: " + f55300x32131c52.size());
            }
        }
    }

    /* renamed from: postGlobalEvent */
    public static synchronized void m104304x1057b7f7(int i17, int i18, int i19, java.lang.Object obj) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.class) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener> it = f55300x32131c52.iterator();
            while (it.hasNext()) {
                it.next().mo103064xaf8c47fb(i17, i18, i19, obj);
            }
        }
    }

    /* renamed from: removeEventListener */
    public static synchronized void m104305xdfb98f4a(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener onGlobalEventChangeListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.class) {
            java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener> copyOnWriteArrayList = f55300x32131c52;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(onGlobalEventChangeListener);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "remove netStatusChangeListener, listener: " + onGlobalEventChangeListener + ", mListeners: " + f55300x32131c52.size());
            }
        }
    }
}
