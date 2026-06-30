package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class u implements com.tencent.mapsdk.internal.tc, com.tencent.mapsdk.internal.td, com.tencent.mapsdk.internal.te {

    /* renamed from: c, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.u f52295c = new com.tencent.mapsdk.internal.u();

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.s f52297b;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.td f52296a = new com.tencent.mapsdk.internal.td() { // from class: com.tencent.mapsdk.internal.u.1
        @Override // com.tencent.mapsdk.internal.tf.a
        public final void a(android.content.Context context, java.lang.String str) {
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.Object b(java.lang.String str) {
            return com.tencent.map.tools.Util.newInstance(a(str), new java.lang.Object[0]);
        }

        @Override // com.tencent.mapsdk.internal.td
        public final int c() {
            return 0;
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.io.File d() {
            return null;
        }

        @Override // com.tencent.mapsdk.internal.tf.a
        public final void i() {
        }

        @Override // com.tencent.mapsdk.internal.td
        public final <T> T a(java.lang.Class<T> cls, java.lang.Object... objArr) {
            return (T) com.tencent.map.tools.Util.newInstance(cls, objArr);
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.ClassLoader b() {
            return com.tencent.mapsdk.internal.u.AnonymousClass1.class.getClassLoader();
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
            return com.tencent.map.tools.Util.invokeMethod(obj, str, objArr);
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
            return com.tencent.map.tools.Util.invokeMethod(obj, str, clsArr, objArr);
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.Object a(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
            return com.tencent.map.tools.Util.invokeStaticMethod(cls, str, clsArr, objArr);
        }

        @Override // com.tencent.mapsdk.internal.td
        public final java.lang.Class a(java.lang.String str) {
            return com.tencent.map.tools.Util.findClass(str, com.tencent.mapsdk.internal.u.AnonymousClass1.class.getClassLoader());
        }

        @Override // com.tencent.mapsdk.internal.td
        public final <T> java.lang.Class<? extends T> a(java.lang.String str, java.lang.Class<T> cls) {
            return com.tencent.map.tools.Util.findClass(str, cls, com.tencent.mapsdk.internal.u.AnonymousClass1.class.getClassLoader());
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tc f52298d = new com.tencent.mapsdk.internal.tc() { // from class: com.tencent.mapsdk.internal.u.2
        @Override // com.tencent.mapsdk.internal.tf.a
        public final void a(android.content.Context context, java.lang.String str) {
        }

        @Override // com.tencent.mapsdk.internal.tc
        public final void h() {
        }

        @Override // com.tencent.mapsdk.internal.tf.a
        public final void i() {
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mapsdk.internal.te f52299e = new com.tencent.mapsdk.internal.te() { // from class: com.tencent.mapsdk.internal.u.3
        @Override // com.tencent.mapsdk.internal.tf.a
        public final void a(android.content.Context context, java.lang.String str) {
        }

        @Override // com.tencent.mapsdk.internal.te
        public final void e() {
        }

        @Override // com.tencent.mapsdk.internal.te
        public final void f() {
        }

        @Override // com.tencent.mapsdk.internal.te
        public final void g() {
        }

        @Override // com.tencent.mapsdk.internal.tf.a
        public final void i() {
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.u$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f52303a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f52304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.os.Handler f52305c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.tools.Callback f52306d;

        public AnonymousClass4(android.content.Context context, java.lang.String str, android.os.Handler handler, com.tencent.map.tools.Callback callback) {
            this.f52303a = context;
            this.f52304b = str;
            this.f52305c = handler;
            this.f52306d = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.u.this.a(this.f52303a, this.f52304b);
            this.f52305c.post(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.u.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.map.tools.Callback callback = com.tencent.mapsdk.internal.u.AnonymousClass4.this.f52306d;
                    if (callback != null) {
                        callback.callback(null);
                    }
                }
            });
        }
    }

    private u() {
    }

    public static com.tencent.mapsdk.internal.u a() {
        return f52295c;
    }

    private com.tencent.mapsdk.internal.s j() {
        return this.f52297b;
    }

    private java.io.File k() {
        return this.f52296a.d();
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.Object b(java.lang.String str) {
        return this.f52296a.b(str);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final int c() {
        return this.f52296a.c();
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.io.File d() {
        return this.f52296a.d();
    }

    @Override // com.tencent.mapsdk.internal.te
    public final void e() {
    }

    @Override // com.tencent.mapsdk.internal.te
    public final void f() {
    }

    @Override // com.tencent.mapsdk.internal.te
    public final void g() {
    }

    @Override // com.tencent.mapsdk.internal.tc
    public final void h() {
    }

    @Override // com.tencent.mapsdk.internal.tf.a
    public final void i() {
    }

    private void a(android.content.Context context, java.lang.String str, com.tencent.map.tools.Callback<java.lang.Void> callback) {
        new java.lang.Thread(new com.tencent.mapsdk.internal.u.AnonymousClass4(context, str, new android.os.Handler(android.os.Looper.getMainLooper()), callback), "tms-plugin").start();
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.ClassLoader b() {
        return this.f52296a.b();
    }

    @Override // com.tencent.mapsdk.internal.tf.a
    public final void a(android.content.Context context, java.lang.String str) {
        com.tencent.mapsdk.internal.tf.a(context);
        if (!com.tencent.mapsdk.internal.tf.f51594p.isEmpty()) {
            java.util.Iterator<com.tencent.mapsdk.internal.tf.b> it = com.tencent.mapsdk.internal.tf.f51594p.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = "com.tencent.mapsdk." + it.next().f51599d;
                java.lang.Object b17 = com.tencent.map.tools.Util.findClass(str2, com.tencent.mapsdk.internal.u.class.getClassLoader()) != null ? this.f52296a.b(str2) : null;
                if (b17 instanceof com.tencent.mapsdk.internal.tf.a) {
                    ((com.tencent.mapsdk.internal.tf.a) b17).a(context, str);
                }
                if (b17 instanceof com.tencent.mapsdk.internal.td) {
                    this.f52296a = (com.tencent.mapsdk.internal.td) b17;
                } else if (b17 instanceof com.tencent.mapsdk.internal.te) {
                    this.f52299e = (com.tencent.mapsdk.internal.te) b17;
                } else if (b17 instanceof com.tencent.mapsdk.internal.tc) {
                    this.f52298d = (com.tencent.mapsdk.internal.tc) b17;
                }
            }
        }
        this.f52297b = (com.tencent.mapsdk.internal.s) this.f52296a.b("com.tencent.mapsdk.core.MapDelegateFactoryImpl");
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.Class a(java.lang.String str) {
        return this.f52296a.a(str);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final <T> java.lang.Class<? extends T> a(java.lang.String str, java.lang.Class<T> cls) {
        return this.f52296a.a(str, cls);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final <T> T a(java.lang.Class<T> cls, java.lang.Object... objArr) {
        return (T) this.f52296a.a(cls, objArr);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Object... objArr) {
        return this.f52296a.a(obj, str, objArr);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.Object a(java.lang.Object obj, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        return this.f52296a.a(obj, str, clsArr, objArr);
    }

    @Override // com.tencent.mapsdk.internal.td
    public final java.lang.Object a(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        return this.f52296a.a(cls, str, clsArr, objArr);
    }
}
