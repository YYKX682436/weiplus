package p012xc85e97e9.p023xae79c325.p061xedfae76a;

/* renamed from: androidx.camera.lifecycle.LifecycleCamera */
/* loaded from: classes14.dex */
public final class C1042xedb7970f implements p012xc85e97e9.p093xedfae76a.x, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 {

    /* renamed from: mCameraUseCaseAdapter */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d f2615x57c3288a;

    /* renamed from: mLifecycleOwner */
    private final p012xc85e97e9.p093xedfae76a.y f2617xade33736;

    /* renamed from: mLock */
    private final java.lang.Object f2618x6243b38 = new java.lang.Object();

    /* renamed from: mIsActive */
    private volatile boolean f2616xf85a185d = false;

    /* renamed from: mSuspended */
    private boolean f2620x17acd7ee = false;

    /* renamed from: mReleased */
    private boolean f2619x42180ca = false;

    public C1042xedb7970f(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d c0831xfaa2a09d) {
        this.f2617xade33736 = yVar;
        this.f2615x57c3288a = c0831xfaa2a09d;
        if (yVar.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
            c0831xfaa2a09d.m6085x352acf61();
        } else {
            c0831xfaa2a09d.m6086xe116caaf();
        }
        yVar.mo273xed6858b4().a(this);
    }

    /* renamed from: bind */
    public void m6890x2e243d(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2618x6243b38) {
            this.f2615x57c3288a.m6084xb37b3dbd(collection);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraControl */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 mo4252xa97012c2() {
        return this.f2615x57c3288a.mo4252xa97012c2();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 mo4253x764d3969() {
        return this.f2615x57c3288a.mo4253x764d3969();
    }

    /* renamed from: getCameraUseCaseAdapter */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d m6891x9ca928f3() {
        return this.f2615x57c3288a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getExtendedConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo3093x13f11ad1() {
        return this.f2615x57c3288a.mo3093x13f11ad1();
    }

    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y m6892x95c7fa5f() {
        p012xc85e97e9.p093xedfae76a.y yVar;
        synchronized (this.f2618x6243b38) {
            yVar = this.f2617xade33736;
        }
        return yVar;
    }

    /* renamed from: getSecondaryCameraInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 m6893x4bda6ad1() {
        return this.f2615x57c3288a.m6089x4bda6ad1();
    }

    /* renamed from: getUseCases */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6894x6967cf72() {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> unmodifiableList;
        synchronized (this.f2618x6243b38) {
            unmodifiableList = java.util.Collections.unmodifiableList(this.f2615x57c3288a.m6090x6967cf72());
        }
        return unmodifiableList;
    }

    /* renamed from: isActive */
    public boolean m6895xd35c70d0() {
        boolean z17;
        synchronized (this.f2618x6243b38) {
            z17 = this.f2616xf85a185d;
        }
        return z17;
    }

    /* renamed from: isBound */
    public boolean m6896x7a81e674(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        boolean contains;
        synchronized (this.f2618x6243b38) {
            contains = this.f2615x57c3288a.m6090x6967cf72().contains(abstractC0580x5a5e3137);
        }
        return contains;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: isUseCasesCombinationSupported */
    public boolean mo4254xb7fe8105(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137... abstractC0580x5a5e3137Arr) {
        return this.f2615x57c3288a.mo4254xb7fe8105(z17, abstractC0580x5a5e3137Arr);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onDestroy */
    public void m6897xac79a11b(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2618x6243b38) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d c0831xfaa2a09d = this.f2615x57c3288a;
            c0831xfaa2a09d.m6092x8e842aa0(c0831xfaa2a09d.m6090x6967cf72());
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onPause */
    public void m6898xb01dfb57(p012xc85e97e9.p093xedfae76a.y yVar) {
        this.f2615x57c3288a.m6093x2bcb495(false);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: onResume */
    public void m6899x57429eec(p012xc85e97e9.p093xedfae76a.y yVar) {
        this.f2615x57c3288a.m6093x2bcb495(true);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
    /* renamed from: onStart */
    public void m6900xb05099c3(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2618x6243b38) {
            if (!this.f2620x17acd7ee && !this.f2619x42180ca) {
                this.f2615x57c3288a.m6085x352acf61();
                this.f2616xf85a185d = true;
            }
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onStop */
    public void m6901xc39f8281(p012xc85e97e9.p093xedfae76a.y yVar) {
        synchronized (this.f2618x6243b38) {
            if (!this.f2620x17acd7ee && !this.f2619x42180ca) {
                this.f2615x57c3288a.m6086xe116caaf();
                this.f2616xf85a185d = false;
            }
        }
    }

    /* renamed from: release */
    public void m6902x41012807() {
        synchronized (this.f2618x6243b38) {
            this.f2619x42180ca = true;
            this.f2616xf85a185d = false;
            this.f2617xade33736.mo273xed6858b4().c(this);
        }
    }

    /* renamed from: suspend */
    public void m6903x919ca03c() {
        synchronized (this.f2618x6243b38) {
            if (this.f2620x17acd7ee) {
                return;
            }
            m6901xc39f8281(this.f2617xade33736);
            this.f2620x17acd7ee = true;
        }
    }

    /* renamed from: unbind */
    public void m6904xcde33e56(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2618x6243b38) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.retainAll(this.f2615x57c3288a.m6090x6967cf72());
            this.f2615x57c3288a.m6092x8e842aa0(arrayList);
        }
    }

    /* renamed from: unbindAll */
    public void m6905x5f941b6b() {
        synchronized (this.f2618x6243b38) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d c0831xfaa2a09d = this.f2615x57c3288a;
            c0831xfaa2a09d.m6092x8e842aa0(c0831xfaa2a09d.m6090x6967cf72());
        }
    }

    /* renamed from: unsuspend */
    public void m6906xf7a4a383() {
        synchronized (this.f2618x6243b38) {
            if (this.f2620x17acd7ee) {
                this.f2620x17acd7ee = false;
                if (this.f2617xade33736.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
                    m6900xb05099c3(this.f2617xade33736);
                }
            }
        }
    }
}
