package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ko {

    /* renamed from: a, reason: collision with root package name */
    private static final android.os.Handler f50126a;

    /* renamed from: b, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ko.c f50127b;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f50128c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f50129d;

    /* loaded from: classes13.dex */
    public static abstract class a<T> implements com.tencent.map.tools.Callback<T>, java.lang.Runnable {
        @Override // com.tencent.map.tools.Callback
        public abstract void callback(T t17);

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends android.os.HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f50131a = "tms-dsp";

        /* renamed from: h, reason: collision with root package name */
        private static final int f50132h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f50133i = 300;

        /* renamed from: b, reason: collision with root package name */
        private boolean f50134b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f50135c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f50136d;

        /* renamed from: e, reason: collision with root package name */
        private android.os.Handler f50137e;

        /* renamed from: f, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mapsdk.internal.ko.b.a> f50138f;

        /* renamed from: g, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mapsdk.internal.ko.b.a> f50139g;

        /* loaded from: classes13.dex */
        public class a<T> {

            /* renamed from: a, reason: collision with root package name */
            static final int f50141a = 0;

            /* renamed from: b, reason: collision with root package name */
            static final int f50142b = 1;

            /* renamed from: c, reason: collision with root package name */
            static final int f50143c = 2;

            /* renamed from: d, reason: collision with root package name */
            static final int f50144d = 3;

            /* renamed from: e, reason: collision with root package name */
            static final int f50145e = 4;

            /* renamed from: f, reason: collision with root package name */
            boolean f50146f;

            /* renamed from: g, reason: collision with root package name */
            com.tencent.mapsdk.internal.ko.d<T> f50147g;

            /* renamed from: h, reason: collision with root package name */
            final com.tencent.mapsdk.internal.ko.g<T> f50148h;

            /* renamed from: i, reason: collision with root package name */
            com.tencent.mapsdk.internal.ko.a<T> f50149i;

            /* renamed from: j, reason: collision with root package name */
            java.util.concurrent.Future<T> f50150j;

            /* renamed from: k, reason: collision with root package name */
            T f50151k;

            /* renamed from: l, reason: collision with root package name */
            int f50152l;

            /* renamed from: m, reason: collision with root package name */
            int f50153m;

            public /* synthetic */ a(com.tencent.mapsdk.internal.ko.b bVar, com.tencent.mapsdk.internal.ko.g gVar, byte b17) {
                this(gVar);
            }

            private void b(com.tencent.mapsdk.internal.ko.d<T> dVar) {
                this.f50147g = dVar;
                com.tencent.mapsdk.internal.ko.g<T> gVar = this.f50148h;
                if (gVar != null) {
                    ((com.tencent.mapsdk.internal.ko.g) gVar).f50163a = new com.tencent.mapsdk.internal.ko.a<T>() { // from class: com.tencent.mapsdk.internal.ko.b.a.1
                        @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
                        public final void callback(T t17) {
                            com.tencent.mapsdk.internal.ko.b.a.this.f50151k = t17;
                        }
                    };
                }
            }

            private void c() {
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(null)).a();
            }

            private boolean d() {
                this.f50152l++;
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("try time:" + this.f50152l);
                if (this.f50152l >= 2) {
                    return false;
                }
                this.f50146f = false;
                a();
                return true;
            }

            private void e() {
                com.tencent.mapsdk.internal.ko.g<T> gVar;
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                com.tencent.mapsdk.internal.ko.d<T> dVar = this.f50147g;
                if (dVar != null && (gVar = this.f50148h) != null) {
                    this.f50150j = dVar.a(gVar);
                }
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                this.f50153m = 2;
            }

            private void f() {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("result:" + this.f50151k, "userCallback:" + this.f50149i);
                com.tencent.mapsdk.internal.ko.a<T> aVar = this.f50149i;
                if (aVar != null) {
                    aVar.callback(this.f50151k);
                }
            }

            private void g() {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                java.util.concurrent.Future<T> future = this.f50150j;
                if (future == null || this.f50146f) {
                    return;
                }
                if (future.isDone()) {
                    this.f50153m = 3;
                } else if (this.f50150j.isCancelled()) {
                    this.f50151k = this.f50150j.get();
                    b();
                }
            }

            private a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
                this.f50153m = 0;
                this.f50148h = gVar;
                if (gVar == null || com.tencent.mapsdk.internal.ko.b.this.f50136d) {
                    this.f50146f = true;
                }
            }

            public final com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.d<T> dVar) {
                com.tencent.mapsdk.internal.ko.b.this.f50138f.add(this);
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("dispatchHandler:" + com.tencent.mapsdk.internal.ko.b.this.f50137e);
                b(dVar);
                return this;
            }

            public final void b(com.tencent.mapsdk.internal.ko.a<T> aVar) {
                this.f50149i = aVar;
                a();
            }

            public final void b() {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                this.f50146f = true;
                java.util.concurrent.Future<T> future = this.f50150j;
                if (future != null) {
                    future.cancel(false);
                }
                this.f50153m = 4;
            }

            public final void a(T t17) {
                if (com.tencent.mapsdk.internal.ko.b.this.f50136d) {
                    return;
                }
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.f(t17)).a();
            }

            public final void a(com.tencent.mapsdk.internal.ko.a<T> aVar) {
                if (com.tencent.mapsdk.internal.ko.b.this.f50136d) {
                    return;
                }
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.f(null)).b(aVar);
            }

            public final void a(T t17, com.tencent.mapsdk.internal.ko.a<T> aVar) {
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(t17)).b(aVar);
            }

            public final void a() {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                if (!this.f50146f && !com.tencent.mapsdk.internal.ko.b.this.f50136d) {
                    this.f50153m = 1;
                    if (com.tencent.mapsdk.internal.ko.b.this.f50137e != null) {
                        com.tencent.mapsdk.internal.ko.b.this.f50137e.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("cancelled...");
            }
        }

        public b() {
            super(f50131a);
            this.f50138f = new java.util.concurrent.ConcurrentLinkedQueue<>();
            this.f50139g = new java.util.concurrent.ConcurrentLinkedQueue<>();
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f50134b = true;
            this.f50137e = new android.os.Handler(getLooper()) { // from class: com.tencent.mapsdk.internal.ko.b.1
                @Override // android.os.Handler
                public final void dispatchMessage(android.os.Message message) {
                    super.dispatchMessage(message);
                    if (message.what == 1) {
                        try {
                            if (com.tencent.mapsdk.internal.ko.b.this.a()) {
                                com.tencent.mapsdk.internal.ko.b.this.f50137e.sendEmptyMessageDelayed(1, 300L);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.b("MSG_SYNC_CHECK ERR:", th6);
                        }
                    }
                }
            };
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("looper is prepared...");
            this.f50137e.sendEmptyMessage(1);
        }

        @Override // android.os.HandlerThread
        public final boolean quit() {
            boolean quit = super.quit();
            if (quit) {
                b();
                this.f50136d = true;
            }
            return quit;
        }

        @Override // android.os.HandlerThread
        public final boolean quitSafely() {
            boolean quitSafely = super.quitSafely();
            if (quitSafely) {
                b();
                this.f50136d = true;
            }
            return quitSafely;
        }

        private void a(com.tencent.mapsdk.internal.ko.c cVar) {
            cVar.a(f50131a, this);
        }

        private void b() {
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it = this.f50138f.iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next = it.next();
                if (next != null) {
                    next.b();
                }
            }
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it6 = this.f50139g.iterator();
            while (it6.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next2 = it6.next();
                if (next2 != null) {
                    next2.b();
                }
            }
            this.f50138f.clear();
            this.f50139g.clear();
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("cancelAll...");
            android.os.Handler handler = this.f50137e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r6v17, types: [T, java.lang.Object] */
        public boolean a() {
            boolean z17;
            com.tencent.mapsdk.internal.ko.b.a poll;
            java.util.concurrent.Callable callable;
            if (!this.f50138f.isEmpty() && (poll = this.f50138f.poll()) != null && poll.f50153m == 1) {
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                com.tencent.mapsdk.internal.ko.d<T> dVar = poll.f50147g;
                if (dVar != 0 && (callable = poll.f50148h) != null) {
                    poll.f50150j = dVar.a(callable);
                }
                com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                poll.f50153m = 2;
                this.f50139g.add(poll);
            }
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it = this.f50139g.iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next = it.next();
                if (next != null) {
                    int i17 = next.f50153m;
                    if (i17 == 2) {
                        try {
                            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(new java.lang.Object[0]);
                            java.util.concurrent.Future<T> future = next.f50150j;
                            if (future != 0 && !next.f50146f) {
                                if (future.isDone()) {
                                    next.f50153m = 3;
                                } else if (next.f50150j.isCancelled()) {
                                    next.f50151k = next.f50150j.get();
                                    next.b();
                                }
                            }
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                        }
                    } else if (i17 == 3) {
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("result:" + next.f50151k, "userCallback:" + next.f50149i);
                        com.tencent.map.tools.Callback callback = next.f50149i;
                        if (callback != null) {
                            callback.callback(next.f50151k);
                        }
                        it.remove();
                    } else if (i17 == 4) {
                        next.f50152l++;
                        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("try time:" + next.f50152l);
                        if (next.f50152l < 2) {
                            next.f50146f = false;
                            next.a();
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            this.f50138f.offer(next);
                        }
                        it.remove();
                    }
                }
            }
            return !this.f50139g.isEmpty();
        }

        public final synchronized <T> com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            byte b17;
            b17 = 0;
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a("prepared:" + this.f50134b);
            if (!this.f50134b && !this.f50135c && !this.f50136d) {
                start();
                this.f50135c = true;
            }
            return new com.tencent.mapsdk.internal.ko.b.a<>(this, gVar, b17);
        }
    }

    /* loaded from: classes13.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final java.util.Map<java.lang.String, android.os.HandlerThread> f50156a = new java.util.HashMap();

        /* renamed from: b, reason: collision with root package name */
        final com.tencent.mapsdk.internal.ko.b f50157b = new com.tencent.mapsdk.internal.ko.b();

        /* renamed from: com.tencent.mapsdk.internal.ko$c$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.a<java.util.Map.Entry<java.lang.String, android.os.HandlerThread>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.util.List f50158a;

            public AnonymousClass1(java.util.List list) {
                this.f50158a = list;
            }

            private void a(java.util.Map.Entry<java.lang.String, android.os.HandlerThread> entry) {
                android.os.HandlerThread value;
                if (entry == null || (value = entry.getValue()) == null) {
                    return;
                }
                value.quitSafely();
                this.f50158a.add(entry.getKey());
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(java.lang.Object obj) {
                android.os.HandlerThread handlerThread;
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry == null || (handlerThread = (android.os.HandlerThread) entry.getValue()) == null) {
                    return;
                }
                handlerThread.quitSafely();
                this.f50158a.add(entry.getKey());
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ko$c$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass2 extends com.tencent.mapsdk.internal.ko.a<java.lang.String> {
            public AnonymousClass2() {
            }

            private void a(java.lang.String str) {
                if (str != null) {
                    com.tencent.mapsdk.internal.ko.c.this.f50156a.remove(str);
                }
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(java.lang.Object obj) {
                java.lang.String str = (java.lang.String) obj;
                if (str != null) {
                    com.tencent.mapsdk.internal.ko.c.this.f50156a.remove(str);
                }
            }
        }

        private com.tencent.mapsdk.internal.ko.b b() {
            return this.f50157b;
        }

        private void c() {
            if (this.f50156a.isEmpty()) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.map.tools.Util.foreach(this.f50156a.entrySet(), new com.tencent.mapsdk.internal.ko.c.AnonymousClass1(arrayList));
            com.tencent.map.tools.Util.foreach(arrayList, new com.tencent.mapsdk.internal.ko.c.AnonymousClass2());
        }

        private void a() {
            a(com.tencent.mapsdk.internal.ko.b.f50131a, this.f50157b);
        }

        public final void a(java.lang.String str, android.os.HandlerThread handlerThread) {
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f50156a.put(str, handlerThread);
        }

        private android.os.Looper a(java.lang.String str) {
            java.lang.String concat = "tms-".concat(java.lang.String.valueOf(str));
            android.os.HandlerThread handlerThread = this.f50156a.get(concat);
            if (handlerThread == null || handlerThread.getThreadId() == -1) {
                handlerThread = new android.os.HandlerThread(concat);
                handlerThread.start();
                a(concat, handlerThread);
            }
            return handlerThread.getLooper();
        }
    }

    /* loaded from: classes13.dex */
    public interface d<T> {
        java.util.concurrent.Future<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar);
    }

    /* loaded from: classes13.dex */
    public static class e<T> implements com.tencent.mapsdk.internal.ko.d<T> {

        /* renamed from: a, reason: collision with root package name */
        T f50161a;

        public e(T t17) {
            this.f50161a = t17;
        }

        @Override // com.tencent.mapsdk.internal.ko.d
        public final java.util.concurrent.Future<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            return com.tencent.mapsdk.internal.ht.a().submit(gVar, this.f50161a);
        }
    }

    /* loaded from: classes13.dex */
    public static class f<T> implements com.tencent.mapsdk.internal.ko.d<T> {

        /* renamed from: a, reason: collision with root package name */
        T f50162a;

        public f(T t17) {
            this.f50162a = t17;
        }

        @Override // com.tencent.mapsdk.internal.ko.d
        public final java.util.concurrent.Future<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            return com.tencent.mapsdk.internal.ht.b().submit(gVar, this.f50162a);
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class g<T> implements java.lang.Runnable, java.util.concurrent.Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ko.a<T> f50163a;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                T call = call();
                com.tencent.mapsdk.internal.ko.a<T> aVar = this.f50163a;
                if (aVar != null) {
                    aVar.callback(call);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    static {
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50219t);
        f50126a = new android.os.Handler(android.os.Looper.getMainLooper());
        f50128c = new java.util.concurrent.atomic.AtomicInteger();
    }

    public static void a(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            f50126a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void b(final java.lang.Runnable runnable) {
        a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Void>() { // from class: com.tencent.mapsdk.internal.ko.1
            private java.lang.Void a() {
                runnable.run();
                return null;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                runnable.run();
                return null;
            }
        }).a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(null)).a();
    }

    private static void c(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f50126a.removeCallbacks(runnable);
    }

    public static void d() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f50128c;
        if (atomicInteger.get() <= 0) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50219t, "sDispatcher clean quit finally curCnt: " + atomicInteger);
            com.tencent.mapsdk.internal.ko.c cVar = f50127b;
            if (cVar != null) {
                if (!cVar.f50156a.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.map.tools.Util.foreach(cVar.f50156a.entrySet(), new com.tencent.mapsdk.internal.ko.c.AnonymousClass1(arrayList));
                    com.tencent.map.tools.Util.foreach(arrayList, new com.tencent.mapsdk.internal.ko.c.AnonymousClass2());
                }
                f50129d = true;
            }
            atomicInteger.set(0);
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50219t, "sDispatcher clean quiting curCnt: " + atomicInteger);
        }
        f50126a.removeCallbacksAndMessages(null);
    }

    private static android.os.Looper e() {
        com.tencent.mapsdk.internal.ko.c cVar = f50127b;
        if (cVar == null) {
            return null;
        }
        return cVar.f50157b.getLooper();
    }

    public static void c() {
        f50128c.decrementAndGet();
    }

    public static void b() {
        f50128c.incrementAndGet();
    }

    public static void a(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        f50126a.postDelayed(runnable, j17);
    }

    public static android.os.Looper a(java.lang.String str) {
        com.tencent.mapsdk.internal.ko.c cVar = f50127b;
        if (cVar == null) {
            return null;
        }
        java.lang.String concat = "tms-".concat(java.lang.String.valueOf(str));
        android.os.HandlerThread handlerThread = cVar.f50156a.get(concat);
        if (handlerThread == null || handlerThread.getThreadId() == -1) {
            handlerThread = new android.os.HandlerThread(concat);
            handlerThread.start();
            cVar.a(concat, handlerThread);
        }
        return handlerThread.getLooper();
    }

    public static com.tencent.mapsdk.internal.ko.c a() {
        return new com.tencent.mapsdk.internal.ko.c();
    }

    public static void a(com.tencent.mapsdk.internal.ko.c cVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sDispatcher registerDispatcher refCnt: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f50128c;
        sb6.append(atomicInteger.get());
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50219t, sb6.toString());
        if (cVar == null || atomicInteger.get() > 1) {
            return;
        }
        com.tencent.mapsdk.internal.ko.c cVar2 = f50127b;
        if (cVar2 == null || (cVar2 != null && f50129d)) {
            f50127b = cVar;
            cVar.a(com.tencent.mapsdk.internal.ko.b.f50131a, cVar.f50157b);
            f50129d = false;
        }
        android.os.Looper looper = f50127b.f50157b.getLooper();
        if (looper != null) {
            looper.setMessageLogging(new android.util.Printer() { // from class: com.tencent.mapsdk.internal.ko.2
                @Override // android.util.Printer
                public final void println(java.lang.String str) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50219t, str);
                }
            });
        }
    }

    public static <T> com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50219t).a(gVar);
        return f50127b.f50157b.a(gVar);
    }
}
