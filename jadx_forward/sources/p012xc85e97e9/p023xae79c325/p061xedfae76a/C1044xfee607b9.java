package p012xc85e97e9.p023xae79c325.p061xedfae76a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository */
/* loaded from: classes14.dex */
public final class C1044xfee607b9 {

    /* renamed from: mCameraCoordinator */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab f2622x9969adde;

    /* renamed from: mLock */
    private final java.lang.Object f2625x6243b38 = new java.lang.Object();

    /* renamed from: mCameraMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key, p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f> f2623x6654a60a = new java.util.HashMap();

    /* renamed from: mLifecycleObserverMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver, java.util.Set<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key>> f2624xc15e78e9 = new java.util.HashMap();

    /* renamed from: mActiveLifecycleOwners */
    private final java.util.ArrayDeque<p012xc85e97e9.p093xedfae76a.y> f2621xea7d1d7 = new java.util.ArrayDeque<>();

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$Key */
    /* loaded from: classes14.dex */
    public static abstract class Key {
        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key m6925xaf65a0fc(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId cameraId) {
            return new p012xc85e97e9.p023xae79c325.p061xedfae76a.C1040xe7306a1c(yVar, cameraId);
        }

        /* renamed from: getCameraId */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId mo6886x72efd496();

        /* renamed from: getLifecycleOwner */
        public abstract p012xc85e97e9.p093xedfae76a.y mo6887x95c7fa5f();
    }

    /* renamed from: androidx.camera.lifecycle.LifecycleCameraRepository$LifecycleCameraRepositoryObserver */
    /* loaded from: classes14.dex */
    public static class LifecycleCameraRepositoryObserver implements p012xc85e97e9.p093xedfae76a.x {

        /* renamed from: mLifecycleCameraRepository */
        private final p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9 f2626xc86e6bec;

        /* renamed from: mLifecycleOwner */
        private final p012xc85e97e9.p093xedfae76a.y f2627xade33736;

        public LifecycleCameraRepositoryObserver(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9 c1044xfee607b9) {
            this.f2627xade33736 = yVar;
            this.f2626xc86e6bec = c1044xfee607b9;
        }

        /* renamed from: getLifecycleOwner */
        public p012xc85e97e9.p093xedfae76a.y m6926x95c7fa5f() {
            return this.f2627xade33736;
        }

        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
        /* renamed from: onDestroy */
        public void m6927xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
            this.f2626xc86e6bec.m6924xb8b5768e(yVar);
        }

        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
        /* renamed from: onStart */
        public void m6928xb05099c3(p012xc85e97e9.p093xedfae76a.y yVar) {
            this.f2626xc86e6bec.m6920x37bd608(yVar);
        }

        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
        /* renamed from: onStop */
        public void m6929xc39f8281(p012xc85e97e9.p093xedfae76a.y yVar) {
            this.f2626xc86e6bec.m6921x780afaed(yVar);
        }
    }

    /* renamed from: getLifecycleCameraRepositoryObserver */
    private p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            for (p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.f2624xc15e78e9.keySet()) {
                if (yVar.equals(lifecycleCameraRepositoryObserver.m6926x95c7fa5f())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* renamed from: hasUseCaseBound */
    private boolean m6911xaa91be21(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919 = m6910xe15d2919(yVar);
            if (m6910xe15d2919 == null) {
                return false;
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2624xc15e78e9.get(m6910xe15d2919).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = this.f2623x6654a60a.get(it.next());
                c1042xedb7970f.getClass();
                if (!c1042xedb7970f.m6894x6967cf72().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: registerCamera */
    private void m6912xc6f817a8(p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f) {
        synchronized (this.f2625x6243b38) {
            p012xc85e97e9.p093xedfae76a.y m6892x95c7fa5f = c1042xedb7970f.m6892x95c7fa5f();
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key m6925xaf65a0fc = p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key.m6925xaf65a0fc(m6892x95c7fa5f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.m6059x5f39cbb5((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e) c1042xedb7970f.mo4253x764d3969(), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e) c1042xedb7970f.m6893x4bda6ad1()));
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919 = m6910xe15d2919(m6892x95c7fa5f);
            java.util.Set<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> hashSet = m6910xe15d2919 != null ? this.f2624xc15e78e9.get(m6910xe15d2919) : new java.util.HashSet<>();
            hashSet.add(m6925xaf65a0fc);
            this.f2623x6654a60a.put(m6925xaf65a0fc, c1042xedb7970f);
            if (m6910xe15d2919 == null) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver(m6892x95c7fa5f, this);
                this.f2624xc15e78e9.put(lifecycleCameraRepositoryObserver, hashSet);
                m6892x95c7fa5f.mo273xed6858b4().a(lifecycleCameraRepositoryObserver);
            }
        }
    }

    /* renamed from: suspendUseCases */
    private void m6913xac6e9a58(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919 = m6910xe15d2919(yVar);
            if (m6910xe15d2919 == null) {
                return;
            }
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2624xc15e78e9.get(m6910xe15d2919).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = this.f2623x6654a60a.get(it.next());
                c1042xedb7970f.getClass();
                c1042xedb7970f.m6903x919ca03c();
            }
        }
    }

    /* renamed from: unsuspendUseCases */
    private void m6914x76be669f(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2624xc15e78e9.get(m6910xe15d2919(yVar)).iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = this.f2623x6654a60a.get(it.next());
                c1042xedb7970f.getClass();
                if (!c1042xedb7970f.m6894x6967cf72().isEmpty()) {
                    c1042xedb7970f.m6906xf7a4a383();
                }
            }
        }
    }

    /* renamed from: bindToLifecycleCamera */
    public void m6915x2fd4e077(p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 c0582x4b1fd0e6, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> list, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab) {
        synchronized (this.f2625x6243b38) {
            m3.h.a(!collection.isEmpty());
            this.f2622x9969adde = interfaceC0584xe74c66ab;
            p012xc85e97e9.p093xedfae76a.y m6892x95c7fa5f = c1042xedb7970f.m6892x95c7fa5f();
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919 = m6910xe15d2919(m6892x95c7fa5f);
            if (m6910xe15d2919 == null) {
                return;
            }
            java.util.Set<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> set = this.f2624xc15e78e9.get(m6910xe15d2919);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab2 = this.f2622x9969adde;
            if (interfaceC0584xe74c66ab2 == null || interfaceC0584xe74c66ab2.mo4121x7ef94829() != 2) {
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = set.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f2 = this.f2623x6654a60a.get(it.next());
                    c1042xedb7970f2.getClass();
                    if (!c1042xedb7970f2.equals(c1042xedb7970f) && !c1042xedb7970f2.m6894x6967cf72().isEmpty()) {
                        throw new java.lang.IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                c1042xedb7970f.m6891x9ca928f3().m6095xbdd80b48(c0582x4b1fd0e6);
                c1042xedb7970f.m6891x9ca928f3().m6094x43ef0240(list);
                c1042xedb7970f.m6890x2e243d(collection);
                if (m6892x95c7fa5f.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
                    m6920x37bd608(m6892x95c7fa5f);
                }
            } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraException e17) {
                throw new java.lang.IllegalArgumentException(e17);
            }
        }
    }

    /* renamed from: clear */
    public void m6916x5a5b64d() {
        synchronized (this.f2625x6243b38) {
            java.util.Iterator it = new java.util.HashSet(this.f2624xc15e78e9.keySet()).iterator();
            while (it.hasNext()) {
                m6924xb8b5768e(((p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver) it.next()).m6926x95c7fa5f());
            }
        }
    }

    /* renamed from: createLifecycleCamera */
    public p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f m6917x1df45e93(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d c0831xfaa2a09d) {
        synchronized (this.f2625x6243b38) {
            m3.h.b(this.f2623x6654a60a.get(p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key.m6925xaf65a0fc(yVar, c0831xfaa2a09d.m6087x72efd496())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = new p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f(yVar, c0831xfaa2a09d);
            if (c0831xfaa2a09d.m6090x6967cf72().isEmpty()) {
                c1042xedb7970f.m6903x919ca03c();
            }
            if (yVar.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
                return c1042xedb7970f;
            }
            m6912xc6f817a8(c1042xedb7970f);
            return c1042xedb7970f;
        }
    }

    /* renamed from: getLifecycleCamera */
    public p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f m6918xd86b0f9(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId cameraId) {
        p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f;
        synchronized (this.f2625x6243b38) {
            c1042xedb7970f = this.f2623x6654a60a.get(p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key.m6925xaf65a0fc(yVar, cameraId));
        }
        return c1042xedb7970f;
    }

    /* renamed from: getLifecycleCameras */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f> m6919xa34f6e9a() {
        java.util.Collection<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f> unmodifiableCollection;
        synchronized (this.f2625x6243b38) {
            unmodifiableCollection = java.util.Collections.unmodifiableCollection(this.f2623x6654a60a.values());
        }
        return unmodifiableCollection;
    }

    /* renamed from: setActive */
    public void m6920x37bd608(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            if (m6911xaa91be21(yVar)) {
                if (this.f2621xea7d1d7.isEmpty()) {
                    this.f2621xea7d1d7.push(yVar);
                } else {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab = this.f2622x9969adde;
                    if (interfaceC0584xe74c66ab == null || interfaceC0584xe74c66ab.mo4121x7ef94829() != 2) {
                        p012xc85e97e9.p093xedfae76a.y peek = this.f2621xea7d1d7.peek();
                        if (!yVar.equals(peek)) {
                            m6913xac6e9a58(peek);
                            this.f2621xea7d1d7.remove(yVar);
                            this.f2621xea7d1d7.push(yVar);
                        }
                    }
                }
                m6914x76be669f(yVar);
            }
        }
    }

    /* renamed from: setInactive */
    public void m6921x780afaed(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            this.f2621xea7d1d7.remove(yVar);
            m6913xac6e9a58(yVar);
            if (!this.f2621xea7d1d7.isEmpty()) {
                m6914x76be669f(this.f2621xea7d1d7.peek());
            }
        }
    }

    /* renamed from: unbind */
    public void m6922xcde33e56(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2625x6243b38) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2623x6654a60a.keySet().iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = this.f2623x6654a60a.get(it.next());
                boolean z17 = !c1042xedb7970f.m6894x6967cf72().isEmpty();
                c1042xedb7970f.m6904xcde33e56(collection);
                if (z17 && c1042xedb7970f.m6894x6967cf72().isEmpty()) {
                    m6921x780afaed(c1042xedb7970f.m6892x95c7fa5f());
                }
            }
        }
    }

    /* renamed from: unbindAll */
    public void m6923x5f941b6b() {
        synchronized (this.f2625x6243b38) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2623x6654a60a.keySet().iterator();
            while (it.hasNext()) {
                p012xc85e97e9.p023xae79c325.p061xedfae76a.C1042xedb7970f c1042xedb7970f = this.f2623x6654a60a.get(it.next());
                c1042xedb7970f.m6905x5f941b6b();
                m6921x780afaed(c1042xedb7970f.m6892x95c7fa5f());
            }
        }
    }

    /* renamed from: unregisterLifecycle */
    public void m6924xb8b5768e(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2625x6243b38) {
            p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.LifecycleCameraRepositoryObserver m6910xe15d2919 = m6910xe15d2919(yVar);
            if (m6910xe15d2919 == null) {
                return;
            }
            m6921x780afaed(yVar);
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p061xedfae76a.C1044xfee607b9.Key> it = this.f2624xc15e78e9.get(m6910xe15d2919).iterator();
            while (it.hasNext()) {
                this.f2623x6654a60a.remove(it.next());
            }
            this.f2624xc15e78e9.remove(m6910xe15d2919);
            m6910xe15d2919.m6926x95c7fa5f().mo273xed6858b4().c(m6910xe15d2919);
        }
    }
}
