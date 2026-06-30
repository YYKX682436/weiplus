package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ko {

    /* renamed from: a, reason: collision with root package name */
    private static final android.os.Handler f131659a;

    /* renamed from: b, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ko.c f131660b;

    /* renamed from: c, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f131661c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f131662d;

    /* loaded from: classes13.dex */
    public static abstract class a<T> implements com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<T>, java.lang.Runnable {
        @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
        /* renamed from: callback */
        public abstract void mo35806xf5bc2045(T t17);

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends android.os.HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        public static final java.lang.String f131664a = "tms-dsp";

        /* renamed from: h, reason: collision with root package name */
        private static final int f131665h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f131666i = 300;

        /* renamed from: b, reason: collision with root package name */
        private boolean f131667b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f131668c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f131669d;

        /* renamed from: e, reason: collision with root package name */
        private android.os.Handler f131670e;

        /* renamed from: f, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mapsdk.internal.ko.b.a> f131671f;

        /* renamed from: g, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentLinkedQueue<com.tencent.mapsdk.internal.ko.b.a> f131672g;

        /* loaded from: classes13.dex */
        public class a<T> {

            /* renamed from: a, reason: collision with root package name */
            static final int f131674a = 0;

            /* renamed from: b, reason: collision with root package name */
            static final int f131675b = 1;

            /* renamed from: c, reason: collision with root package name */
            static final int f131676c = 2;

            /* renamed from: d, reason: collision with root package name */
            static final int f131677d = 3;

            /* renamed from: e, reason: collision with root package name */
            static final int f131678e = 4;

            /* renamed from: f, reason: collision with root package name */
            boolean f131679f;

            /* renamed from: g, reason: collision with root package name */
            com.tencent.mapsdk.internal.ko.d<T> f131680g;

            /* renamed from: h, reason: collision with root package name */
            final com.tencent.mapsdk.internal.ko.g<T> f131681h;

            /* renamed from: i, reason: collision with root package name */
            com.tencent.mapsdk.internal.ko.a<T> f131682i;

            /* renamed from: j, reason: collision with root package name */
            java.util.concurrent.Future<T> f131683j;

            /* renamed from: k, reason: collision with root package name */
            T f131684k;

            /* renamed from: l, reason: collision with root package name */
            int f131685l;

            /* renamed from: m, reason: collision with root package name */
            int f131686m;

            public /* synthetic */ a(com.tencent.mapsdk.internal.ko.b bVar, com.tencent.mapsdk.internal.ko.g gVar, byte b17) {
                this(gVar);
            }

            private void b(com.tencent.mapsdk.internal.ko.d<T> dVar) {
                this.f131680g = dVar;
                com.tencent.mapsdk.internal.ko.g<T> gVar = this.f131681h;
                if (gVar != null) {
                    ((com.tencent.mapsdk.internal.ko.g) gVar).f131696a = new com.tencent.mapsdk.internal.ko.a<T>() { // from class: com.tencent.mapsdk.internal.ko.b.a.1
                        @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                        /* renamed from: callback */
                        public final void mo35806xf5bc2045(T t17) {
                            com.tencent.mapsdk.internal.ko.b.a.this.f131684k = t17;
                        }
                    };
                }
            }

            private void c() {
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(null)).a();
            }

            private boolean d() {
                this.f131685l++;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("try time:" + this.f131685l);
                if (this.f131685l >= 2) {
                    return false;
                }
                this.f131679f = false;
                a();
                return true;
            }

            private void e() {
                com.tencent.mapsdk.internal.ko.g<T> gVar;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                com.tencent.mapsdk.internal.ko.d<T> dVar = this.f131680g;
                if (dVar != null && (gVar = this.f131681h) != null) {
                    this.f131683j = dVar.a(gVar);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                this.f131686m = 2;
            }

            private void f() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("result:" + this.f131684k, "userCallback:" + this.f131682i);
                com.tencent.mapsdk.internal.ko.a<T> aVar = this.f131682i;
                if (aVar != null) {
                    aVar.mo35806xf5bc2045(this.f131684k);
                }
            }

            private void g() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                java.util.concurrent.Future<T> future = this.f131683j;
                if (future == null || this.f131679f) {
                    return;
                }
                if (future.isDone()) {
                    this.f131686m = 3;
                } else if (this.f131683j.isCancelled()) {
                    this.f131684k = this.f131683j.get();
                    b();
                }
            }

            private a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
                this.f131686m = 0;
                this.f131681h = gVar;
                if (gVar == null || com.tencent.mapsdk.internal.ko.b.this.f131669d) {
                    this.f131679f = true;
                }
            }

            public final com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.d<T> dVar) {
                com.tencent.mapsdk.internal.ko.b.this.f131671f.add(this);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("dispatchHandler:" + com.tencent.mapsdk.internal.ko.b.this.f131670e);
                b(dVar);
                return this;
            }

            public final void b(com.tencent.mapsdk.internal.ko.a<T> aVar) {
                this.f131682i = aVar;
                a();
            }

            public final void b() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                this.f131679f = true;
                java.util.concurrent.Future<T> future = this.f131683j;
                if (future != null) {
                    future.cancel(false);
                }
                this.f131686m = 4;
            }

            public final void a(T t17) {
                if (com.tencent.mapsdk.internal.ko.b.this.f131669d) {
                    return;
                }
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.f(t17)).a();
            }

            public final void a(com.tencent.mapsdk.internal.ko.a<T> aVar) {
                if (com.tencent.mapsdk.internal.ko.b.this.f131669d) {
                    return;
                }
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.f(null)).b(aVar);
            }

            public final void a(T t17, com.tencent.mapsdk.internal.ko.a<T> aVar) {
                a((com.tencent.mapsdk.internal.ko.d) new com.tencent.mapsdk.internal.ko.e(t17)).b(aVar);
            }

            public final void a() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                if (!this.f131679f && !com.tencent.mapsdk.internal.ko.b.this.f131669d) {
                    this.f131686m = 1;
                    if (com.tencent.mapsdk.internal.ko.b.this.f131670e != null) {
                        com.tencent.mapsdk.internal.ko.b.this.f131670e.sendEmptyMessage(1);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("cancelled...");
            }
        }

        public b() {
            super(f131664a);
            this.f131671f = new java.util.concurrent.ConcurrentLinkedQueue<>();
            this.f131672g = new java.util.concurrent.ConcurrentLinkedQueue<>();
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            this.f131667b = true;
            this.f131670e = new android.os.Handler(getLooper()) { // from class: com.tencent.mapsdk.internal.ko.b.1
                @Override // android.os.Handler
                public final void dispatchMessage(android.os.Message message) {
                    super.dispatchMessage(message);
                    if (message.what == 1) {
                        try {
                            if (com.tencent.mapsdk.internal.ko.b.this.a()) {
                                com.tencent.mapsdk.internal.ko.b.this.f131670e.sendEmptyMessageDelayed(1, 300L);
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b("MSG_SYNC_CHECK ERR:", th6);
                        }
                    }
                }
            };
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("looper is prepared...");
            this.f131670e.sendEmptyMessage(1);
        }

        @Override // android.os.HandlerThread
        public final boolean quit() {
            boolean quit = super.quit();
            if (quit) {
                b();
                this.f131669d = true;
            }
            return quit;
        }

        @Override // android.os.HandlerThread
        public final boolean quitSafely() {
            boolean quitSafely = super.quitSafely();
            if (quitSafely) {
                b();
                this.f131669d = true;
            }
            return quitSafely;
        }

        private void a(com.tencent.mapsdk.internal.ko.c cVar) {
            cVar.a(f131664a, this);
        }

        private void b() {
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it = this.f131671f.iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next = it.next();
                if (next != null) {
                    next.b();
                }
            }
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it6 = this.f131672g.iterator();
            while (it6.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next2 = it6.next();
                if (next2 != null) {
                    next2.b();
                }
            }
            this.f131671f.clear();
            this.f131672g.clear();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("cancelAll...");
            android.os.Handler handler = this.f131670e;
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
            if (!this.f131671f.isEmpty() && (poll = this.f131671f.poll()) != null && poll.f131686m == 1) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                com.tencent.mapsdk.internal.ko.d<T> dVar = poll.f131680g;
                if (dVar != 0 && (callable = poll.f131681h) != null) {
                    poll.f131683j = dVar.a(callable);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                poll.f131686m = 2;
                this.f131672g.add(poll);
            }
            java.util.Iterator<com.tencent.mapsdk.internal.ko.b.a> it = this.f131672g.iterator();
            while (it.hasNext()) {
                com.tencent.mapsdk.internal.ko.b.a next = it.next();
                if (next != null) {
                    int i17 = next.f131686m;
                    if (i17 == 2) {
                        try {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(new java.lang.Object[0]);
                            java.util.concurrent.Future<T> future = next.f131683j;
                            if (future != 0 && !next.f131679f) {
                                if (future.isDone()) {
                                    next.f131686m = 3;
                                } else if (next.f131683j.isCancelled()) {
                                    next.f131684k = next.f131683j.get();
                                    next.b();
                                }
                            }
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
                        }
                    } else if (i17 == 3) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("result:" + next.f131684k, "userCallback:" + next.f131682i);
                        com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 interfaceC4308xf9968465 = next.f131682i;
                        if (interfaceC4308xf9968465 != null) {
                            interfaceC4308xf9968465.mo35806xf5bc2045(next.f131684k);
                        }
                        it.remove();
                    } else if (i17 == 4) {
                        next.f131685l++;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("try time:" + next.f131685l);
                        if (next.f131685l < 2) {
                            next.f131679f = false;
                            next.a();
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            this.f131671f.offer(next);
                        }
                        it.remove();
                    }
                }
            }
            return !this.f131672g.isEmpty();
        }

        public final synchronized <T> com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            byte b17;
            b17 = 0;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a("prepared:" + this.f131667b);
            if (!this.f131667b && !this.f131668c && !this.f131669d) {
                start();
                this.f131668c = true;
            }
            return new com.tencent.mapsdk.internal.ko.b.a<>(this, gVar, b17);
        }
    }

    /* loaded from: classes13.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final java.util.Map<java.lang.String, android.os.HandlerThread> f131689a = new java.util.HashMap();

        /* renamed from: b, reason: collision with root package name */
        final com.tencent.mapsdk.internal.ko.b f131690b = new com.tencent.mapsdk.internal.ko.b();

        /* renamed from: com.tencent.mapsdk.internal.ko$c$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.a<java.util.Map.Entry<java.lang.String, android.os.HandlerThread>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ java.util.List f131691a;

            public AnonymousClass1(java.util.List list) {
                this.f131691a = list;
            }

            private void a(java.util.Map.Entry<java.lang.String, android.os.HandlerThread> entry) {
                android.os.HandlerThread value;
                if (entry == null || (value = entry.getValue()) == null) {
                    return;
                }
                value.quitSafely();
                this.f131691a.add(entry.getKey());
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                android.os.HandlerThread handlerThread;
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (entry == null || (handlerThread = (android.os.HandlerThread) entry.getValue()) == null) {
                    return;
                }
                handlerThread.quitSafely();
                this.f131691a.add(entry.getKey());
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ko$c$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        public class AnonymousClass2 extends com.tencent.mapsdk.internal.ko.a<java.lang.String> {
            public AnonymousClass2() {
            }

            private void a(java.lang.String str) {
                if (str != null) {
                    com.tencent.mapsdk.internal.ko.c.this.f131689a.remove(str);
                }
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                java.lang.String str = (java.lang.String) obj;
                if (str != null) {
                    com.tencent.mapsdk.internal.ko.c.this.f131689a.remove(str);
                }
            }
        }

        private com.tencent.mapsdk.internal.ko.b b() {
            return this.f131690b;
        }

        private void c() {
            if (this.f131689a.isEmpty()) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35824xd79b624a(this.f131689a.entrySet(), new com.tencent.mapsdk.internal.ko.c.AnonymousClass1(arrayList));
            com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35824xd79b624a(arrayList, new com.tencent.mapsdk.internal.ko.c.AnonymousClass2());
        }

        private void a() {
            a(com.tencent.mapsdk.internal.ko.b.f131664a, this.f131690b);
        }

        public final void a(java.lang.String str, android.os.HandlerThread handlerThread) {
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f131689a.put(str, handlerThread);
        }

        private android.os.Looper a(java.lang.String str) {
            java.lang.String concat = "tms-".concat(java.lang.String.valueOf(str));
            android.os.HandlerThread handlerThread = this.f131689a.get(concat);
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
        T f131694a;

        public e(T t17) {
            this.f131694a = t17;
        }

        @Override // com.tencent.mapsdk.internal.ko.d
        public final java.util.concurrent.Future<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.a().submit(gVar, this.f131694a);
        }
    }

    /* loaded from: classes13.dex */
    public static class f<T> implements com.tencent.mapsdk.internal.ko.d<T> {

        /* renamed from: a, reason: collision with root package name */
        T f131695a;

        public f(T t17) {
            this.f131695a = t17;
        }

        @Override // com.tencent.mapsdk.internal.ko.d
        public final java.util.concurrent.Future<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.b().submit(gVar, this.f131695a);
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class g<T> implements java.lang.Runnable, java.util.concurrent.Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.mapsdk.internal.ko.a<T> f131696a;

        @Override // java.lang.Runnable
        public final void run() {
            try {
                T call = call();
                com.tencent.mapsdk.internal.ko.a<T> aVar = this.f131696a;
                if (aVar != null) {
                    aVar.mo35806xf5bc2045(call);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    static {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t);
        f131659a = new android.os.Handler(android.os.Looper.getMainLooper());
        f131661c = new java.util.concurrent.atomic.AtomicInteger();
    }

    public static void a(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            f131659a.post(runnable);
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
        f131659a.removeCallbacks(runnable);
    }

    public static void d() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f131661c;
        if (atomicInteger.get() <= 0) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t, "sDispatcher clean quit finally curCnt: " + atomicInteger);
            com.tencent.mapsdk.internal.ko.c cVar = f131660b;
            if (cVar != null) {
                if (!cVar.f131689a.isEmpty()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35824xd79b624a(cVar.f131689a.entrySet(), new com.tencent.mapsdk.internal.ko.c.AnonymousClass1(arrayList));
                    com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35824xd79b624a(arrayList, new com.tencent.mapsdk.internal.ko.c.AnonymousClass2());
                }
                f131662d = true;
            }
            atomicInteger.set(0);
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t, "sDispatcher clean quiting curCnt: " + atomicInteger);
        }
        f131659a.removeCallbacksAndMessages(null);
    }

    private static android.os.Looper e() {
        com.tencent.mapsdk.internal.ko.c cVar = f131660b;
        if (cVar == null) {
            return null;
        }
        return cVar.f131690b.getLooper();
    }

    public static void c() {
        f131661c.decrementAndGet();
    }

    public static void b() {
        f131661c.incrementAndGet();
    }

    public static void a(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        f131659a.postDelayed(runnable, j17);
    }

    public static android.os.Looper a(java.lang.String str) {
        com.tencent.mapsdk.internal.ko.c cVar = f131660b;
        if (cVar == null) {
            return null;
        }
        java.lang.String concat = "tms-".concat(java.lang.String.valueOf(str));
        android.os.HandlerThread handlerThread = cVar.f131689a.get(concat);
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
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f131661c;
        sb6.append(atomicInteger.get());
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t, sb6.toString());
        if (cVar == null || atomicInteger.get() > 1) {
            return;
        }
        com.tencent.mapsdk.internal.ko.c cVar2 = f131660b;
        if (cVar2 == null || (cVar2 != null && f131662d)) {
            f131660b = cVar;
            cVar.a(com.tencent.mapsdk.internal.ko.b.f131664a, cVar.f131690b);
            f131662d = false;
        }
        android.os.Looper looper = f131660b.f131690b.getLooper();
        if (looper != null) {
            looper.setMessageLogging(new android.util.Printer() { // from class: com.tencent.mapsdk.internal.ko.2
                @Override // android.util.Printer
                public final void println(java.lang.String str) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t, str);
                }
            });
        }
    }

    public static <T> com.tencent.mapsdk.internal.ko.b.a<T> a(com.tencent.mapsdk.internal.ko.g<T> gVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131752t).a(gVar);
        return f131660b.f131690b.a(gVar);
    }
}
