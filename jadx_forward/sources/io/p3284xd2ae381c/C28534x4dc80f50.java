package io.p3284xd2ae381c;

/* renamed from: io.flutter.FlutterInjector */
/* loaded from: classes13.dex */
public final class C28534x4dc80f50 {

    /* renamed from: accessed */
    private static boolean f70412x800ff903;

    /* renamed from: instance */
    private static io.p3284xd2ae381c.C28534x4dc80f50 f70413x21169495;

    /* renamed from: deferredComponentManager */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f f70414xa57111ef;

    /* renamed from: executorService */
    private java.util.concurrent.ExecutorService f70415x8a276262;

    /* renamed from: flutterJniFactory */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory f70416x316d5ae1;

    /* renamed from: flutterLoader */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f f70417x464ccf4f;

    /* renamed from: io.flutter.FlutterInjector$Builder */
    /* loaded from: classes13.dex */
    public static final class Builder {

        /* renamed from: deferredComponentManager */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f f70418xa57111ef;

        /* renamed from: executorService */
        private java.util.concurrent.ExecutorService f70419x8a276262;

        /* renamed from: flutterJniFactory */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory f70420x316d5ae1;

        /* renamed from: flutterLoader */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f f70421x464ccf4f;

        /* renamed from: io.flutter.FlutterInjector$Builder$NamedThreadFactory */
        /* loaded from: classes13.dex */
        public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {

            /* renamed from: threadId */
            private int f70423x57d5bcc5;

            private NamedThreadFactory() {
                this.f70423x57d5bcc5 = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("flutter-worker-");
                int i17 = this.f70423x57d5bcc5;
                this.f70423x57d5bcc5 = i17 + 1;
                sb6.append(i17);
                thread.setName(sb6.toString());
                return thread;
            }
        }

        /* renamed from: fillDefaults */
        private void m136953xe8b118f5() {
            if (this.f70420x316d5ae1 == null) {
                this.f70420x316d5ae1 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory();
            }
            if (this.f70419x8a276262 == null) {
                this.f70419x8a276262 = java.util.concurrent.Executors.newCachedThreadPool(new io.p3284xd2ae381c.C28534x4dc80f50.Builder.NamedThreadFactory());
            }
            if (this.f70421x464ccf4f == null) {
                this.f70421x464ccf4f = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f(this.f70420x316d5ae1.m137772xf9e7376a(), this.f70419x8a276262);
            }
        }

        /* renamed from: build */
        public io.p3284xd2ae381c.C28534x4dc80f50 m136954x59bc66e() {
            m136953xe8b118f5();
            return new io.p3284xd2ae381c.C28534x4dc80f50(this.f70421x464ccf4f, this.f70418xa57111ef, this.f70420x316d5ae1, this.f70419x8a276262);
        }

        /* renamed from: setDeferredComponentManager */
        public io.p3284xd2ae381c.C28534x4dc80f50.Builder m136955x854a6c71(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f) {
            this.f70418xa57111ef = interfaceC28611x253f360f;
            return this;
        }

        /* renamed from: setExecutorService */
        public io.p3284xd2ae381c.C28534x4dc80f50.Builder m136956xa55fcda0(java.util.concurrent.ExecutorService executorService) {
            this.f70419x8a276262 = executorService;
            return this;
        }

        /* renamed from: setFlutterJNIFactory */
        public io.p3284xd2ae381c.C28534x4dc80f50.Builder m136957xdb84729f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory factory) {
            this.f70420x316d5ae1 = factory;
            return this;
        }

        /* renamed from: setFlutterLoader */
        public io.p3284xd2ae381c.C28534x4dc80f50.Builder m136958x9682f20d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f) {
            this.f70421x464ccf4f = c28615x75ebff2f;
            return this;
        }
    }

    /* renamed from: instance */
    public static io.p3284xd2ae381c.C28534x4dc80f50 m136946x21169495() {
        f70412x800ff903 = true;
        if (f70413x21169495 == null) {
            f70413x21169495 = new io.p3284xd2ae381c.C28534x4dc80f50.Builder().m136954x59bc66e();
        }
        return f70413x21169495;
    }

    /* renamed from: reset */
    public static void m136947x6761d4f() {
        f70412x800ff903 = false;
        f70413x21169495 = null;
    }

    /* renamed from: setInstance */
    public static void m136948x97a93317(io.p3284xd2ae381c.C28534x4dc80f50 c28534x4dc80f50) {
        if (f70412x800ff903) {
            throw new java.lang.IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
        }
        f70413x21169495 = c28534x4dc80f50;
    }

    /* renamed from: deferredComponentManager */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f m136949xa57111ef() {
        return this.f70414xa57111ef;
    }

    /* renamed from: executorService */
    public java.util.concurrent.ExecutorService m136950x8a276262() {
        return this.f70415x8a276262;
    }

    /* renamed from: flutterLoader */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f() {
        return this.f70417x464ccf4f;
    }

    /* renamed from: getFlutterJNIFactory */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory m136952xffee662b() {
        return this.f70416x316d5ae1;
    }

    private C28534x4dc80f50(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f c28615x75ebff2f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.Factory factory, java.util.concurrent.ExecutorService executorService) {
        this.f70417x464ccf4f = c28615x75ebff2f;
        this.f70414xa57111ef = interfaceC28611x253f360f;
        this.f70416x316d5ae1 = factory;
        this.f70415x8a276262 = executorService;
    }
}
