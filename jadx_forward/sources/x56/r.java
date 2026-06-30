package x56;

/* loaded from: classes16.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    public static final x56.r f533673e = new x56.r();

    /* renamed from: f, reason: collision with root package name */
    public static final x56.b f533674f = new x56.p();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f533675a = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f533676b = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f533677c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f533678d;

    public r() {
        new java.util.concurrent.atomic.AtomicReference();
        this.f533677c = new java.util.concurrent.atomic.AtomicReference();
        this.f533678d = new java.util.concurrent.atomic.AtomicReference();
    }

    public static java.lang.Object d(java.lang.Class cls, java.util.Properties properties) {
        java.util.Properties properties2 = (java.util.Properties) properties.clone();
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            java.util.Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                java.lang.String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    java.lang.String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    java.lang.String property2 = properties2.getProperty(str);
                    if (property2 == null) {
                        throw new java.lang.IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                    property = property2;
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return java.lang.Class.forName(property).asSubclass(cls).newInstance();
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e17);
        } catch (java.lang.ClassNotFoundException e18) {
            throw new java.lang.IllegalStateException(simpleName + " implementation class not found: " + property, e18);
        } catch (java.lang.IllegalAccessException e19) {
            throw new java.lang.IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e19);
        } catch (java.lang.InstantiationException e27) {
            throw new java.lang.IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e27);
        }
    }

    public x56.a a() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f533677c;
        if (atomicReference.get() == null) {
            java.lang.Object d17 = d(x56.a.class, java.lang.System.getProperties());
            if (d17 == null) {
                x56.q qVar = new x56.q(this);
                while (!atomicReference.compareAndSet(null, qVar) && atomicReference.get() == null) {
                }
            } else {
                x56.a aVar = (x56.a) d17;
                while (!atomicReference.compareAndSet(null, aVar) && atomicReference.get() == null) {
                }
            }
        }
        return (x56.a) atomicReference.get();
    }

    public x56.b b() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f533675a;
        if (atomicReference.get() == null) {
            java.lang.Object d17 = d(x56.b.class, java.lang.System.getProperties());
            if (d17 == null) {
                x56.b bVar = f533674f;
                while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                }
            } else {
                x56.b bVar2 = (x56.b) d17;
                while (!atomicReference.compareAndSet(null, bVar2) && atomicReference.get() == null) {
                }
            }
        }
        return (x56.b) atomicReference.get();
    }

    public x56.n c() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f533676b;
        if (atomicReference.get() == null) {
            java.lang.Object d17 = d(x56.n.class, java.lang.System.getProperties());
            if (d17 == null) {
                x56.o oVar = x56.o.f533672a;
                while (!atomicReference.compareAndSet(null, oVar) && atomicReference.get() == null) {
                }
            } else {
                x56.n nVar = (x56.n) d17;
                while (!atomicReference.compareAndSet(null, nVar) && atomicReference.get() == null) {
                }
            }
        }
        return (x56.n) atomicReference.get();
    }

    public x56.s e() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f533678d;
        if (atomicReference.get() == null) {
            java.lang.Object d17 = d(x56.s.class, java.lang.System.getProperties());
            if (d17 == null) {
                x56.s sVar = x56.s.f533679a;
                while (!atomicReference.compareAndSet(null, sVar) && atomicReference.get() == null) {
                }
            } else {
                x56.s sVar2 = (x56.s) d17;
                while (!atomicReference.compareAndSet(null, sVar2) && atomicReference.get() == null) {
                }
            }
        }
        return (x56.s) atomicReference.get();
    }
}
