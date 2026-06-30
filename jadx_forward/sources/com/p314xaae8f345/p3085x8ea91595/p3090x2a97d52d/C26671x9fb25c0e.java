package com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d;

/* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool */
/* loaded from: classes13.dex */
public class C26671x9fb25c0e {
    public static final java.lang.String TAG = "DownloadThreadPool";

    /* renamed from: mDownloadThreadPool */
    protected static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e f56143x313dfb3b;

    /* renamed from: mDownloadThreadList */
    final java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TaskThread> f56144x313c13bd;

    /* renamed from: mExecList */
    final java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> f56145x9eb0d45c;

    /* renamed from: mPriorityQueueComparator */
    protected final java.util.Comparator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> f56146xa79ecf56;

    /* renamed from: mTaskLock */
    final java.lang.Object f56147xc87cbdd;

    /* renamed from: mThreadlock */
    final java.lang.Object f56148x959bb682;

    /* renamed from: mWaitingList */
    final java.util.PriorityQueue<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> f56149xc63cddde;

    /* renamed from: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool$TaskThread */
    /* loaded from: classes13.dex */
    public class TaskThread extends java.lang.Thread {

        /* renamed from: _hellAccFlag_ */
        private byte f56153x7f11beae;

        /* renamed from: mIndex */
        private int f56154xbe387465;

        public TaskThread(int i17) {
            this.f56154xbe387465 = i17;
            setName("download_thread_" + this.f56154xbe387465);
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d c26670x4be6424d;
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "Thread " + this.f56154xbe387465 + " starts running...");
            while (true) {
                synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56148x959bb682) {
                    try {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "Thread " + this.f56154xbe387465 + " is waitting...");
                        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56148x959bb682.wait();
                    } catch (java.lang.InterruptedException e17) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "Thread " + this.f56154xbe387465 + " is interrupted...");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, e17, "", new java.lang.Object[0]);
                        return;
                    }
                }
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "Thread " + this.f56154xbe387465 + " is interrupted...");
                    return;
                }
                while (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.m104945x1629a278()) {
                    synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56147xc87cbdd) {
                        if (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56149xc63cddde.size() > 0) {
                            c26670x4be6424d = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56149xc63cddde.remove();
                            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56145x9eb0d45c.add(c26670x4be6424d);
                        } else {
                            c26670x4be6424d = null;
                        }
                    }
                    if (java.lang.Thread.currentThread().isInterrupted()) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "Thread " + this.f56154xbe387465 + " is interrupted...");
                        return;
                    }
                    if (c26670x4be6424d != null) {
                        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TAG, "TaskThread::Run ThreadName: " + getName() + " url: " + c26670x4be6424d.m104938x91a59a8e());
                        android.os.PowerManager.WakeLock m104887x8d0c9665 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.m104887x8d0c9665();
                        c26670x4be6424d.m104937x2fb891(getName());
                        if (m104887x8d0c9665 != null) {
                            yj0.a.c(m104887x8d0c9665, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                            m104887x8d0c9665.release();
                            yj0.a.f(m104887x8d0c9665, "com/tencent/tmassistantsdk/downloadservice/DownloadThreadPool$TaskThread", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                        }
                    }
                    synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56147xc87cbdd) {
                        if (c26670x4be6424d != null) {
                            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56145x9eb0d45c.remove(c26670x4be6424d);
                        }
                    }
                }
            }
        }
    }

    private C26671x9fb25c0e() {
        java.util.Comparator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> comparator = new java.util.Comparator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d>() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.1
            @Override // java.util.Comparator
            public int compare(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d c26670x4be6424d, com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d c26670x4be6424d2) {
                if (c26670x4be6424d.m104939x3662b71a() > c26670x4be6424d2.m104939x3662b71a()) {
                    return 1;
                }
                return c26670x4be6424d.m104939x3662b71a() == c26670x4be6424d2.m104939x3662b71a() ? 0 : -1;
            }
        };
        this.f56146xa79ecf56 = comparator;
        this.f56149xc63cddde = new java.util.PriorityQueue<>(16, comparator);
        this.f56145x9eb0d45c = new java.util.ArrayList<>();
        this.f56144x313c13bd = new java.util.ArrayList<>();
        this.f56148x959bb682 = new java.lang.Object();
        this.f56147xc87cbdd = new java.lang.Object();
        int m104920xd898e5b3 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.m104915x9cf0d20b().m104920xd898e5b3();
        for (int i17 = 0; i17 < m104920xd898e5b3; i17++) {
            this.f56144x313c13bd.add(new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.TaskThread(i17));
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e m104941x9cf0d20b() {
        if (f56143x313dfb3b == null) {
            f56143x313dfb3b = new com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e();
        }
        return f56143x313dfb3b;
    }

    /* renamed from: addDownloadTask */
    public int m104942xbddad16e(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d c26670x4be6424d) {
        int m104940x30961476;
        synchronized (this.f56147xc87cbdd) {
            this.f56149xc63cddde.add(c26670x4be6424d);
            synchronized (this.f56148x959bb682) {
                this.f56148x959bb682.notifyAll();
            }
            m104940x30961476 = c26670x4be6424d.m104940x30961476();
        }
        return m104940x30961476;
    }

    /* renamed from: cancelDownloadTask */
    public void m104943x48fc89c7(final int i17) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.tmassistantsdk.downloadservice.DownloadThreadPool.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56147xc87cbdd) {
                    java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> it = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56145x9eb0d45c.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d next = it.next();
                        if (next.m104940x30961476() == i17) {
                            next.m104936xae7a2e7a();
                            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56145x9eb0d45c.remove(next);
                            return;
                        }
                    }
                    java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> it6 = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56149xc63cddde.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d next2 = it6.next();
                        if (next2.m104940x30961476() == i17) {
                            next2.m104936xae7a2e7a();
                            com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26671x9fb25c0e.this.f56149xc63cddde.remove(next2);
                            return;
                        }
                    }
                }
            }
        }).start();
    }

    /* renamed from: getDownloadTask */
    public com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d m104944xa30d80a3(java.lang.String str) {
        synchronized (this.f56147xc87cbdd) {
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> it = this.f56145x9eb0d45c.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d next = it.next();
                if (next.m104938x91a59a8e().equals(str)) {
                    return next;
                }
            }
            java.util.Iterator<com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d> it6 = this.f56149xc63cddde.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d next2 = it6.next();
                if (next2.m104938x91a59a8e().equals(str)) {
                    return next2;
                }
            }
            return null;
        }
    }

    /* renamed from: hasWaitingTask */
    public boolean m104945x1629a278() {
        boolean z17;
        synchronized (this.f56147xc87cbdd) {
            z17 = this.f56149xc63cddde.size() > 0;
        }
        return z17;
    }
}
