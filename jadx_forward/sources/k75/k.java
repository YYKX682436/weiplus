package k75;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386379d;

    /* renamed from: e, reason: collision with root package name */
    public volatile k75.j f386380e;

    /* renamed from: f, reason: collision with root package name */
    public volatile android.os.HandlerThread f386381f;

    public k(java.lang.String str, android.os.Looper looper) {
        this.f386379d = str;
        this.f386380e = new k75.j(looper, this, null);
    }

    public final void c(k75.c cVar) {
        k75.j jVar = this.f386380e;
        java.lang.Object obj = k75.j.f386362q;
        jVar.a(cVar, null);
    }

    public final android.os.Message d() {
        k75.j jVar = this.f386380e;
        if (jVar == null) {
            return null;
        }
        return jVar.f386365c;
    }

    public final k75.a e() {
        k75.j jVar = this.f386380e;
        if (jVar == null) {
            return null;
        }
        return jVar.f386368f[jVar.f386369g].f386359a;
    }

    public void f(java.lang.String str) {
    }

    public void g(java.lang.String str) {
    }

    public void h() {
        j();
    }

    public void i() {
    }

    public final void j() {
        k75.j jVar = this.f386380e;
        if (jVar == null) {
            return;
        }
        if (jVar.f386364b) {
            jVar.f386374l.f("quit:");
        }
        jVar.sendMessage(jVar.obtainMessage(-1, k75.j.f386362q));
    }

    public boolean k(android.os.Message message) {
        return true;
    }

    public final void l(int i17) {
        k75.j jVar = this.f386380e;
        if (jVar == null) {
            return;
        }
        jVar.sendMessage(android.os.Message.obtain(this.f386380e, i17));
    }

    public final void m(k75.c cVar) {
        k75.j jVar = this.f386380e;
        if (jVar.f386364b) {
            jVar.f386374l.f("setInitialState: initialState=" + cVar.mo51017xfb82e301());
        }
        jVar.f386376n = cVar;
    }

    public void n() {
        k75.j jVar = this.f386380e;
        if (jVar == null) {
            return;
        }
        if (jVar.f386364b) {
            jVar.f386374l.f("completeConstruction: E");
        }
        java.util.HashMap hashMap = jVar.f386375m;
        int i17 = 0;
        int i18 = 0;
        for (k75.i iVar : hashMap.values()) {
            int i19 = 0;
            while (iVar != null) {
                iVar = iVar.f386360b;
                i19++;
            }
            if (i18 < i19) {
                i18 = i19;
            }
        }
        if (jVar.f386364b) {
            jVar.f386374l.f("completeConstruction: maxDepth=" + i18);
        }
        jVar.f386368f = new k75.i[i18];
        jVar.f386370h = new k75.i[i18];
        if (jVar.f386364b) {
            jVar.f386374l.f("setupInitialStateStack: E mInitialState=" + jVar.f386376n.mo51017xfb82e301());
        }
        k75.i iVar2 = (k75.i) hashMap.get(jVar.f386376n);
        while (true) {
            jVar.f386371i = i17;
            if (iVar2 == null) {
                break;
            }
            jVar.f386370h[i17] = iVar2;
            iVar2 = iVar2.f386360b;
            i17++;
        }
        jVar.f386369g = -1;
        jVar.c();
        jVar.sendMessageAtFrontOfQueue(jVar.obtainMessage(-2, k75.j.f386362q));
        if (jVar.f386364b) {
            jVar.f386374l.f("completeConstruction: X");
        }
    }

    public final void o(k75.a aVar) {
        k75.j jVar = this.f386380e;
        java.lang.Object obj = k75.j.f386362q;
        jVar.d(aVar);
    }

    public void p(android.os.Message message) {
        if (this.f386380e.f386364b) {
            g(" - unhandledMessage: msg.what=" + message.what);
        }
    }
}
