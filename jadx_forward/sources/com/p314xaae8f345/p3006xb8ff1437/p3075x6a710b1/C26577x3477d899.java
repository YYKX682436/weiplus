package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher */
/* loaded from: classes13.dex */
public class C26577x3477d899 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_CREATE */
    public static final int f55343x2b40af83 = 0;

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_DESTROY */
    public static final int f55344x5c5a6233 = 5;

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_PAUSE */
    public static final int f55345x231d266f = 2;

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_RESUME */
    public static final int f55346x4428d6b4 = 3;

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_START */
    public static final int f55347x234fc4db = 1;

    /* renamed from: EVENT_PROCESS_LIFE_CYCLE_STOP */
    public static final int f55348x3af21049 = 4;

    /* renamed from: EVENT_PROCESS_ON_BACKGROUND */
    public static final int f55349x9f1b0599 = 2;

    /* renamed from: EVENT_PROCESS_ON_FOREGROUND */
    public static final int f55350x64cb19ae = 3;

    /* renamed from: STATE_INITED */
    private static final int f55351x28dde13d = 2;

    /* renamed from: STATE_INITING */
    private static final int f55352xf2de56e4 = 1;

    /* renamed from: STATE_UNINITED */
    private static final int f55353x47262996 = 0;

    /* renamed from: STATE_UNINITING */
    private static final int f55354x9d9f19ab = 3;
    private static final java.lang.String TAG = "TPProcessLifeCycleEventPublisher";

    /* renamed from: mObserver */
    private static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899 f55356x39c4fa63 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899();

    /* renamed from: mState */
    private static int f55357xbec81024 = 0;

    /* renamed from: mListeners */
    private static java.util.concurrent.CopyOnWriteArraySet<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener> f55355x32131c52 = new java.util.concurrent.CopyOnWriteArraySet<>();

    /* renamed from: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$ITPOnProcessLifeCycleChangeListener */
    /* loaded from: classes6.dex */
    public interface ITPOnProcessLifeCycleChangeListener {
        /* renamed from: onEvent */
        void mo103838xaf8c47fb(int i17);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher$TPProcessLiftCycleEventId */
    /* loaded from: classes6.dex */
    public @interface TPProcessLiftCycleEventId {
    }

    private C26577x3477d899() {
    }

    /* renamed from: addEventListener */
    public static void m104366xdab2e64d(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (f55355x32131c52.add(iTPOnProcessLifeCycleChangeListener)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "add ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    /* renamed from: clearEventListener */
    public static void m104367xb99d4021() {
        f55355x32131c52.clear();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "clear ProcessLifeCycleChangeListeners");
    }

    /* renamed from: init */
    public static synchronized void m104368x316510() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.class) {
            int i17 = f55357xbec81024;
            if (i17 != 2 && i17 != 1) {
                if (i17 == 3) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "current state is UNINITING, no need to init, just change state to INITED");
                    f55357xbec81024 = 2;
                    return;
                }
                f55357xbec81024 = 1;
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.a(f55356x39c4fa63);
                    f55357xbec81024 = 2;
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "init successfully");
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104415xf2510df(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.class) {
                                if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024 != 1) {
                                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.TAG, "stop init, current state:" + com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024);
                                } else {
                                    p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.a(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55356x39c4fa63);
                                    int unused = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024 = 2;
                                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.TAG, "init successfully");
                                }
                            }
                        }
                    });
                }
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "no need to init, current state:" + f55357xbec81024);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
    /* renamed from: onCreate */
    private void m104369x3e5a77bb() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onCreate");
        m104375x72f91433(0);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    private void m104370xac79a11b() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onDestroy");
        m104375x72f91433(5);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    private void m104371xb01dfb57() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPause");
        m104375x72f91433(2);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    private void m104372x57429eec() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onResume");
        m104375x72f91433(3);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: onStart */
    private void m104373xb05099c3() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStart");
        m104375x72f91433(1);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onStop */
    private void m104374xc39f8281() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStop");
        m104375x72f91433(4);
    }

    /* renamed from: postEventToAllListeners */
    private void m104375x72f91433(int i17) {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener> it = f55355x32131c52.iterator();
        while (it.hasNext()) {
            it.next().mo103838xaf8c47fb(i17);
        }
    }

    /* renamed from: removeEventListener */
    public static void m104376xdfb98f4a(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.ITPOnProcessLifeCycleChangeListener iTPOnProcessLifeCycleChangeListener) {
        if (f55355x32131c52.remove(iTPOnProcessLifeCycleChangeListener)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "remove ProcessLifeCycleChangeListener: " + iTPOnProcessLifeCycleChangeListener);
        }
    }

    /* renamed from: uninit */
    public static synchronized void m104377xcde67f29() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.class) {
            int i17 = f55357xbec81024;
            if (i17 != 0 && i17 != 3) {
                if (i17 == 1) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "current state is initing, no need to uninit, just change state to uninited");
                    f55357xbec81024 = 0;
                    return;
                }
                f55357xbec81024 = 3;
                if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                    p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.c(f55356x39c4fa63);
                    f55357xbec81024 = 0;
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "uninit successfully");
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104415xf2510df(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher.2
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.class) {
                                if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024 != 3) {
                                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.TAG, "stop uninit, current state:" + com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024);
                                } else {
                                    p012xc85e97e9.p093xedfae76a.q0.f93173o.f93179i.c(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55356x39c4fa63);
                                    int unused = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.f55357xbec81024 = 0;
                                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26577x3477d899.TAG, "uninit successfully");
                                }
                            }
                        }
                    });
                }
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "no need to uninit, current state:" + f55357xbec81024);
        }
    }
}
