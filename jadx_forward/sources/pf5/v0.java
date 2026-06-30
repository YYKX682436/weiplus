package pf5;

/* loaded from: classes5.dex */
public final class v0 extends p012xc85e97e9.p093xedfae76a.l1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f435473b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f435474c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f435475d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f435476e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f435477f;

    public v0(boolean z17) {
        this.f435473b = z17;
        this.f435474c = new java.lang.Object();
        this.f435477f = jz5.h.b(pf5.u0.f435470d);
        java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        pf5.t0 t0Var = new pf5.t0(this);
        this.f435476e = t0Var;
        declaredField.set(this, t0Var);
    }

    public final void b(yz5.l isExecuteOnCleared) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isExecuteOnCleared, "isExecuteOnCleared");
        java.util.HashMap hashMap = this.f435476e;
        if (hashMap != null) {
            synchronized (this.f435474c) {
                this.f435473b = true;
                java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
                java.util.HashMap hashMap3 = new java.util.HashMap();
                java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                for (java.util.Map.Entry entry : entrySet) {
                    java.lang.Object value = entry.getValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "<get-value>(...)");
                    if (((java.lang.Boolean) isExecuteOnCleared.mo146xb9724478(value)).booleanValue()) {
                        java.lang.Object key = entry.getKey();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                        java.lang.Object value2 = entry.getValue();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value2, "<get-value>(...)");
                        hashMap3.put(key, value2);
                    }
                }
                hashMap.clear();
                hashMap.putAll(hashMap3);
                a();
                hashMap.putAll(hashMap2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (r1 == null) goto L8;
     */
    /* renamed from: toString */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m158371x9616526c() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f435474c
            monitor-enter(r0)
            java.util.HashMap r1 = r2.f435476e     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto Lf
        Ld:
            java.lang.String r1 = "null"
        Lf:
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf5.v0.m158371x9616526c():java.lang.String");
    }

    public /* synthetic */ v0(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17);
    }
}
