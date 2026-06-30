package o4;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final o4.g f424341a;

    /* renamed from: b, reason: collision with root package name */
    public final o4.b f424342b = new o4.b();

    /* renamed from: c, reason: collision with root package name */
    public boolean f424343c;

    static {
        new o4.e(null);
    }

    public f(o4.g gVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f424341a = gVar;
    }

    public final void a(android.os.Bundle bundle) {
        boolean z17 = this.f424343c;
        final o4.b bVar = this.f424342b;
        o4.g gVar = this.f424341a;
        if (!z17) {
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = gVar.mo273xed6858b4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "owner.lifecycle");
            if (!(mo273xed6858b4.b() == p012xc85e97e9.p093xedfae76a.n.INITIALIZED)) {
                throw new java.lang.IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
            }
            mo273xed6858b4.a(new p012xc85e97e9.p106x5cbb526a.C1167xb710c279(gVar));
            bVar.getClass();
            if (!(!bVar.f424335b)) {
                throw new java.lang.IllegalStateException("SavedStateRegistry was already attached.".toString());
            }
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: o4.b$$a
                @Override // p012xc85e97e9.p093xedfae76a.v
                /* renamed from: onStateChanged */
                public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m event) {
                    o4.b this$0 = o4.b.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<anonymous parameter 0>");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
                        this$0.f424339f = true;
                    } else if (event == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
                        this$0.f424339f = false;
                    }
                }
            });
            bVar.f424335b = true;
            this.f424343c = true;
        }
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42 = gVar.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b42, "owner.lifecycle");
        if (!(!mo273xed6858b42.b().a(p012xc85e97e9.p093xedfae76a.n.STARTED))) {
            throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + mo273xed6858b42.b()).toString());
        }
        if (!bVar.f424335b) {
            throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!bVar.f424337d)) {
            throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        bVar.f424336c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        bVar.f424337d = true;
    }

    public final void b(android.os.Bundle outBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outBundle, "outBundle");
        o4.b bVar = this.f424342b;
        bVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        android.os.Bundle bundle2 = bVar.f424336c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        q.h hVar = bVar.f424334a;
        hVar.getClass();
        q.e eVar = new q.e(hVar);
        hVar.f440746f.put(eVar, java.lang.Boolean.FALSE);
        while (eVar.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) eVar.next();
            bundle.putBundle((java.lang.String) entry.getKey(), ((o4.d) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }
}
