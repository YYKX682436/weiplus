package xa;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f534278h = java.util.Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f534279i = java.util.Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f534280j = java.util.Arrays.asList("com.google.android.gms.measurement.AppMeasurement");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f534281k = java.util.Arrays.asList(new java.lang.String[0]);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Set f534282l = java.util.Collections.emptySet();

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f534283m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f534284n = new x.b();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f534285a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f534286b;

    /* renamed from: c, reason: collision with root package name */
    public final xa.c f534287c;

    /* renamed from: d, reason: collision with root package name */
    public final bb.d f534288d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f534289e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f534290f = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f534291g;

    public b(android.content.Context context, java.lang.String str, xa.c cVar) {
        java.util.List<java.lang.String> list;
        android.content.pm.ServiceInfo serviceInfo;
        new java.util.concurrent.CopyOnWriteArrayList();
        this.f534291g = new java.util.concurrent.CopyOnWriteArrayList();
        new java.util.concurrent.CopyOnWriteArrayList();
        android.content.Context context2 = (android.content.Context) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        this.f534285a = context2;
        this.f534286b = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18208xec737762(str);
        this.f534287c = (xa.c) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(cVar);
        android.os.Bundle bundle = null;
        try {
            android.content.pm.PackageManager packageManager = context2.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context2, (java.lang.Class<?>) com.p176xb6135e39.p271xde6bf207.p275xe5548316.ServiceC2736x3f8739e2.class), 128)) != null) {
                bundle = serviceInfo.metaData;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            list = java.util.Collections.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
            list = arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str3 : list) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str3);
                if (com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2738x6324e090.class.isAssignableFrom(cls)) {
                    arrayList2.add((com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2738x6324e090) cls.newInstance());
                } else {
                    java.lang.String.format("Class %s is not an instance of %s", str3, "com.google.firebase.components.ComponentRegistrar");
                }
            } catch (java.lang.ClassNotFoundException unused2) {
                java.lang.String.format("Class %s is not an found.", str3);
            } catch (java.lang.IllegalAccessException unused3) {
                java.lang.String.format("Could not instantiate %s.", str3);
            } catch (java.lang.InstantiationException unused4) {
                java.lang.String.format("Could not instantiate %s.", str3);
            }
        }
        this.f534288d = new bb.d(arrayList2, com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.of(android.content.Context.class, this.f534285a), com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.of(xa.b.class, this), com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.of(xa.c.class, this.f534287c));
    }

    public static xa.b a() {
        xa.b bVar;
        synchronized (f534283m) {
            bVar = (xa.b) ((x.n) f534284n).m174751x4aabfc28("[DEFAULT]", null);
            if (bVar == null) {
                java.lang.String m18616x5d999098 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2008x800f03a2.m18616x5d999098();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(m18616x5d999098).length() + 116);
                sb6.append("Default FirebaseApp is not initialized in this process ");
                sb6.append(m18616x5d999098);
                sb6.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new java.lang.IllegalStateException(sb6.toString());
            }
        }
        return bVar;
    }

    public static xa.b b(android.content.Context context) {
        synchronized (f534283m) {
            if (((x.n) f534284n).m174748xc6607c0("[DEFAULT]")) {
                return a();
            }
            xa.c a17 = xa.c.a(context);
            if (a17 == null) {
                return null;
            }
            return c(context, a17);
        }
    }

    public static xa.b c(android.content.Context context, xa.c cVar) {
        xa.b bVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = db.a.f309352a;
        db.a aVar = new db.a(context);
        while (!atomicReference.compareAndSet(null, aVar) && atomicReference.get() == null) {
        }
        if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2006x32c52cc5.m18595x123cc09e() && (context.getApplicationContext() instanceof android.app.Application)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.m17868x33ebcb90((android.app.Application) context.getApplicationContext());
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.ComponentCallbacks2C1769xa5d87f34.m17867x9cf0d20b().m17869x162a7075(new xa.d());
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f534283m) {
            java.lang.Object obj = f534284n;
            boolean z17 = !((x.n) obj).m174748xc6607c0("[DEFAULT]");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[DEFAULT]".length() + 33);
            sb6.append("FirebaseApp name ");
            sb6.append("[DEFAULT]");
            sb6.append(" already exists!");
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(z17, sb6.toString());
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "Application context cannot be null.");
            bVar = new xa.b(context, "[DEFAULT]", cVar);
            ((x.n) obj).put("[DEFAULT]", bVar);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference2 = db.a.f309352a;
        bVar.f();
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(java.lang.Class cls, java.lang.Object obj, java.lang.Iterable iterable, boolean z17) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (z17) {
                try {
                } catch (java.lang.ClassNotFoundException unused) {
                    if (f534282l.contains(str)) {
                        throw new java.lang.IllegalStateException(java.lang.String.valueOf(str).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    java.lang.String.valueOf(str).concat(" is not linked. Skipping initialization.");
                } catch (java.lang.IllegalAccessException e17) {
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    android.util.Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new java.lang.String("Failed to initialize "), e17);
                } catch (java.lang.NoSuchMethodException unused2) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(str).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (java.lang.reflect.InvocationTargetException e18) {
                    android.util.Log.wtf("FirebaseApp", "Firebase API initialization failure.", e18);
                }
                if (f534281k.contains(str)) {
                }
            }
            java.lang.reflect.Method method = java.lang.Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (java.lang.reflect.Modifier.isPublic(modifiers) && java.lang.reflect.Modifier.isStatic(modifiers)) {
                method.invoke(null, obj);
            }
        }
    }

    /* renamed from: onBackgroundStateChanged */
    public static void m175207x7ebbedf0(boolean z17) {
        synchronized (f534283m) {
            java.util.ArrayList arrayList = new java.util.ArrayList(((x.b) f534284n).values());
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                java.lang.Object obj = arrayList.get(i17);
                i17++;
                xa.b bVar = (xa.b) obj;
                if (bVar.f534289e.get()) {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) bVar.f534291g).iterator();
                    if (it.hasNext()) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                        throw null;
                    }
                }
            }
        }
    }

    public final void d() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!this.f534290f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: equals */
    public boolean m175208xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof xa.b)) {
            return false;
        }
        xa.b bVar = (xa.b) obj;
        bVar.d();
        return this.f534286b.equals(bVar.f534286b);
    }

    public final void f() {
        android.content.Context context = this.f534285a;
        boolean m9716x3434a32d = b3.l.m9716x3434a32d(context);
        boolean z17 = true;
        if (m9716x3434a32d) {
            java.util.concurrent.atomic.AtomicReference atomicReference = xa.a.f534276b;
            if (atomicReference.get() == null) {
                xa.a aVar = new xa.a(context);
                while (true) {
                    if (!atomicReference.compareAndSet(null, aVar)) {
                        if (atomicReference.get() != null) {
                            z17 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z17) {
                    context.registerReceiver(aVar, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            boolean m175210xa9ddf4ea = m175210xa9ddf4ea();
            bb.d dVar = this.f534288d;
            for (com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd c2734x24013cdd : dVar.f100239a) {
                int i17 = c2734x24013cdd.f126172c;
                if (!(i17 == 1)) {
                    if ((i17 == 2) && m175210xa9ddf4ea) {
                    }
                }
                bb.a.get(dVar, (java.lang.Class) c2734x24013cdd.f126170a.iterator().next());
            }
        }
        e(xa.b.class, this, f534278h, m9716x3434a32d);
        if (m175210xa9ddf4ea()) {
            e(xa.b.class, this, f534279i, m9716x3434a32d);
            e(android.content.Context.class, context, f534280j, m9716x3434a32d);
        }
    }

    public <T> T get(java.lang.Class<T> cls) {
        d();
        bb.d dVar = this.f534288d;
        dVar.getClass();
        return (T) bb.a.get(dVar, cls);
    }

    /* renamed from: hashCode */
    public int m175209x8cdac1b() {
        return this.f534286b.hashCode();
    }

    /* renamed from: isDefaultApp */
    public boolean m175210xa9ddf4ea() {
        d();
        return "[DEFAULT]".equals(this.f534286b);
    }

    /* renamed from: toString */
    public java.lang.String m175211x9616526c() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this).add(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f534286b).add("options", this.f534287c).m18192x9616526c();
    }
}
