package y91;

/* loaded from: classes16.dex */
public class i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f541814h = 0;

    /* renamed from: e, reason: collision with root package name */
    public y91.x f541819e;

    /* renamed from: a, reason: collision with root package name */
    public final a66.c f541815a = new a66.c();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.Lock f541816b = new java.util.concurrent.locks.ReentrantReadWriteLock(true).writeLock();

    /* renamed from: c, reason: collision with root package name */
    public boolean f541817c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f541818d = -1;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f541821g = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.regex.Pattern f541820f = java.util.regex.Pattern.compile("uuid:([a-fA-F\\d]{8}(-[a-fA-F\\d]{4}){3}-[a-fA-F\\d]{12})");

    public i0(y91.a0 a0Var) {
    }

    public boolean a() {
        v91.b.b("i0", "mRouter is shutting down...");
        if (!this.f541817c) {
            return false;
        }
        ((java.util.HashSet) this.f541821g).clear();
        y91.x xVar = this.f541819e;
        synchronized (xVar) {
            xVar.f541859g = false;
            java.net.MulticastSocket multicastSocket = xVar.f541857e;
            if (multicastSocket != null && !multicastSocket.isClosed()) {
                xVar.f541857e.close();
            }
            java.net.MulticastSocket multicastSocket2 = xVar.f541858f;
            if (multicastSocket2 != null && !multicastSocket2.isClosed()) {
                try {
                    v91.b.b("x", "Leaving multicast group");
                    java.util.Iterator it = xVar.f541855c.iterator();
                    while (it.hasNext()) {
                        xVar.f541858f.leaveGroup(xVar.f541856d, (java.net.NetworkInterface) it.next());
                    }
                } catch (java.lang.Exception e17) {
                    v91.b.b("x", "Could not leave multicast group: " + e17);
                }
                xVar.f541858f.close();
            }
        }
        this.f541815a.d();
        this.f541817c = false;
        return true;
    }

    public boolean b() {
        v91.b.b("i0", "mRouter is starting ...");
        if (y91.k0.f541829d == null) {
            synchronized (y91.d.class) {
                if (y91.k0.f541829d == null) {
                    y91.k0.f541829d = new y91.k0(true);
                }
            }
        }
        this.f541818d = y91.k0.f541829d.f541832c;
        try {
            if (this.f541817c) {
                return false;
            }
            y91.x xVar = new y91.x(new y91.y("239.255.255.250", 1900), y91.z.c(), this, this.f541818d);
            this.f541819e = xVar;
            xVar.c();
            this.f541817c = true;
            return true;
        } catch (java.lang.Exception e17) {
            v91.b.c("i0", e17, "");
            return false;
        }
    }

    public final java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.util.regex.Matcher matcher = this.f541820f.matcher(str);
        java.lang.String group = matcher.find() ? matcher.group(1) : null;
        if (group != null) {
            return group;
        }
        v91.b.a("i0", "fallbackGetUuid: " + str);
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return str;
    }

    public final void d(java.util.concurrent.locks.Lock lock) {
        try {
            if (lock.tryLock(6000, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            } else {
                throw new ba1.a("Router wasn't available exclusively after waiting 6000ms, lock failed: ".concat(lock.getClass().getSimpleName()));
            }
        } catch (java.lang.InterruptedException e17) {
            throw new ba1.a("Interruption while waiting for exclusive access: ".concat(lock.getClass().getSimpleName()), e17);
        }
    }

    public void e(aa1.b bVar) {
        java.util.concurrent.locks.Lock lock = this.f541816b;
        try {
            try {
                d(lock);
            } catch (java.lang.Exception e17) {
                v91.b.c("i0", e17, "");
            }
            if (this.f541817c) {
                if (h(bVar)) {
                    this.f541815a.a(new y91.e(bVar).a().g(new y91.f0(this, bVar), new y91.g0(this)));
                } else {
                    v91.b.b("i0", "parser fail");
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void f(boolean z17) {
        w91.i iVar = new w91.i(z17);
        if (!this.f541817c) {
            v91.b.a("i0", "DLNA Router is not enable");
            return;
        }
        y91.g gVar = new y91.g(iVar);
        y91.d dVar = gVar.f541805c;
        dVar.getClass();
        this.f541815a.a(((p56.l) ((ca1.b) gVar.f121304a).mo14559x2e7a5e(p56.l.b(new y91.b(dVar, gVar.f541804b)))).g(new y91.d0(this), new y91.e0(this)));
    }

    public void g(w91.f fVar, z91.a aVar) {
        if (!this.f541817c) {
            v91.b.a("i0", "DLNA Router is not enable");
            return;
        }
        y91.f fVar2 = new y91.f(fVar);
        y91.d dVar = fVar2.f541801c;
        dVar.getClass();
        this.f541815a.a(((p56.l) ((ca1.b) fVar2.f121304a).mo14559x2e7a5e(p56.l.b(new y91.c(dVar, fVar2.f541800b)))).g(new y91.b0(this, fVar, aVar), new y91.c0(this, aVar)));
    }

    public final boolean h(aa1.b bVar) {
        java.lang.String a17 = bVar.a("NT");
        java.lang.String a18 = bVar.a("ST");
        java.lang.String a19 = bVar.a("NTS");
        java.lang.String a27 = bVar.a("USN");
        java.lang.String a28 = bVar.a(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.InterfaceC2422xfd62b179.f7379x9ff58fb5);
        if (!"upnp:rootdevice".equals(a17) && !"upnp:rootdevice".equals(a18)) {
            return false;
        }
        java.util.HashSet hashSet = (java.util.HashSet) this.f541821g;
        if (hashSet.size() > 0 && hashSet.contains(a28)) {
            return false;
        }
        java.lang.String c17 = c(a27);
        if (android.text.TextUtils.isEmpty(c17)) {
            return false;
        }
        x91.b b17 = x91.b.b();
        if (!"ssdp:alive".equals(a19)) {
            if ("ssdp:byebye".equals(a19)) {
                if (((java.util.HashMap) b17.f534164b).containsKey(c17)) {
                    b17.d(c17);
                }
                return false;
            }
            if (!android.text.TextUtils.isEmpty(a28)) {
                return !((java.util.HashMap) b17.f534164b).containsKey(c17);
            }
            v91.b.a("i0", "mDevice location is empty");
            return false;
        }
        x91.h hVar = (x91.h) ((java.util.HashMap) b17.f534164b).get(c17);
        if (hVar == null) {
            if (android.text.TextUtils.isEmpty(a28)) {
                return false;
            }
            hashSet.add(a28);
            return true;
        }
        if (hVar.f534180a.f534166a.equals(a28)) {
            return false;
        }
        b17.d(c17);
        hashSet.add(a28);
        return true;
    }
}
