package fp0;

/* loaded from: classes10.dex */
public final class o implements fp0.c {

    /* renamed from: a, reason: collision with root package name */
    public final gp0.e f346802a;

    /* renamed from: b, reason: collision with root package name */
    public fp0.a f346803b;

    /* renamed from: c, reason: collision with root package name */
    public fp0.a f346804c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f346805d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f346806e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f346807f;

    public o(gp0.e configuration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
        this.f346802a = configuration;
        this.f346805d = new java.util.LinkedList();
        this.f346806e = new java.util.LinkedList();
        this.f346807f = new java.util.LinkedList();
    }

    public final void a(fp0.d t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        b(t17, null);
    }

    public final void b(fp0.d t17, fp0.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        pm0.v.X(new fp0.e(this, t17, false, pVar));
    }

    public final boolean c() {
        java.util.LinkedList linkedList = this.f346806e;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.DefaultTaskLoader", f() + "DefaultTaskLoader mPendingQueue is empty");
            return false;
        }
        java.util.LinkedList linkedList2 = this.f346807f;
        int size = linkedList2.size();
        gp0.e eVar = this.f346802a;
        if (size >= ((gp0.g) eVar).f355708d) {
            return false;
        }
        java.lang.Object remove = linkedList.remove(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
        fp0.q qVar = (fp0.q) remove;
        linkedList2.add(qVar);
        boolean a17 = ((gp0.g) eVar).f355705a.a((fp0.d) qVar.f346808a);
        java.lang.Object obj = qVar.f346808a;
        if (a17) {
            d(new fp0.w((fp0.d) obj, this, new fp0.h(this)));
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f());
        sb6.append(" block retryStrategy ");
        sb6.append(obj);
        sb6.append(" callback size=");
        java.util.Queue<fp0.p> queue = qVar.f346809b;
        sb6.append(queue.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.DefaultTaskLoader", sb6.toString());
        for (fp0.p pVar : queue) {
            if (pVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.callPrepareInUI$lambda$1");
                pVar.a((fp0.d) obj, fp0.u.f346822e);
            }
        }
        return true;
    }

    public void d(java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        if (this.f346803b == null) {
            gp0.g gVar = (gp0.g) this.f346802a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pool light poolSize ");
            gp0.h hVar = gVar.f355706b;
            sb6.append(hVar.f355711a);
            sb6.append(" priority ");
            int i17 = hVar.f355711a;
            sb6.append(i17);
            sb6.append(" name: ");
            java.lang.String str = gVar.f355709e;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f355710f, sb6.toString());
            this.f346803b = new gp0.c(str, i17, i17, new kp0.a());
        }
        fp0.a aVar = this.f346803b;
        if (aVar != null) {
            ((gp0.c) aVar).execute(runnable);
        }
    }

    public final boolean e(fp0.d t17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.util.Iterator it = this.f346807f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fp0.d) ((fp0.q) obj).f346808a).d(), t17.d())) {
                break;
            }
        }
        return ((fp0.q) obj) != null;
    }

    public final java.lang.String f() {
        return "name:" + ((gp0.g) this.f346802a).f355709e + "_this:" + hashCode() + '_';
    }

    public final void g(fp0.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        pm0.v.X(new fp0.k(this, callback));
    }
}
