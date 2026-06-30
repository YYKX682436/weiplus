package k75;

/* loaded from: classes7.dex */
public class j extends android.os.Handler {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f386362q = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f386363a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f386364b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Message f386365c;

    /* renamed from: d, reason: collision with root package name */
    public final k75.f f386366d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f386367e;

    /* renamed from: f, reason: collision with root package name */
    public k75.i[] f386368f;

    /* renamed from: g, reason: collision with root package name */
    public int f386369g;

    /* renamed from: h, reason: collision with root package name */
    public k75.i[] f386370h;

    /* renamed from: i, reason: collision with root package name */
    public int f386371i;

    /* renamed from: j, reason: collision with root package name */
    public final k75.g f386372j;

    /* renamed from: k, reason: collision with root package name */
    public final k75.h f386373k;

    /* renamed from: l, reason: collision with root package name */
    public k75.k f386374l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f386375m;

    /* renamed from: n, reason: collision with root package name */
    public k75.c f386376n;

    /* renamed from: o, reason: collision with root package name */
    public k75.c f386377o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f386378p;

    public j(android.os.Looper looper, k75.k kVar, k75.d dVar) {
        super(looper);
        this.f386363a = false;
        this.f386364b = false;
        this.f386366d = new k75.f(null);
        this.f386369g = -1;
        k75.g gVar = new k75.g(this, null);
        this.f386372j = gVar;
        k75.h hVar = new k75.h(this, null);
        this.f386373k = hVar;
        this.f386375m = new java.util.HashMap();
        this.f386378p = new java.util.ArrayList();
        this.f386374l = kVar;
        a(gVar, null);
        a(hVar, null);
    }

    public final k75.i a(k75.c cVar, k75.c cVar2) {
        k75.i iVar;
        if (this.f386364b) {
            k75.k kVar = this.f386374l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addStateInternal: E state=");
            sb6.append(cVar.mo51017xfb82e301());
            sb6.append(",parent=");
            sb6.append(cVar2 == null ? "" : cVar2.mo51017xfb82e301());
            kVar.f(sb6.toString());
        }
        java.util.HashMap hashMap = this.f386375m;
        if (cVar2 != null) {
            iVar = (k75.i) hashMap.get(cVar2);
            if (iVar == null) {
                iVar = a(cVar2, null);
            }
        } else {
            iVar = null;
        }
        k75.i iVar2 = (k75.i) hashMap.get(cVar);
        if (iVar2 == null) {
            iVar2 = new k75.i(this, null);
            hashMap.put(cVar, iVar2);
        }
        k75.i iVar3 = iVar2.f386360b;
        if (iVar3 != null && iVar3 != iVar) {
            throw new java.lang.RuntimeException("state already added");
        }
        iVar2.f386359a = cVar;
        iVar2.f386360b = iVar;
        iVar2.f386361c = false;
        if (this.f386364b) {
            this.f386374l.f("addStateInternal: X stateInfo: " + iVar2);
        }
        return iVar2;
    }

    public final void b(int i17) {
        while (i17 <= this.f386369g) {
            if (this.f386364b) {
                this.f386374l.f("invokeEnterMethods: " + this.f386368f[i17].f386359a.mo51017xfb82e301());
            }
            this.f386368f[i17].f386359a.a();
            this.f386368f[i17].f386361c = true;
            i17++;
        }
    }

    public final int c() {
        int i17 = this.f386369g + 1;
        int i18 = i17;
        for (int i19 = this.f386371i - 1; i19 >= 0; i19--) {
            if (this.f386364b) {
                this.f386374l.f("moveTempStackToStateStack: i=" + i19 + ",j=" + i18);
            }
            this.f386368f[i18] = this.f386370h[i19];
            i18++;
        }
        this.f386369g = i18 - 1;
        if (this.f386364b) {
            this.f386374l.f("moveTempStackToStateStack: X mStateStackTop=" + this.f386369g + ",startingIndex=" + i17 + ",Top=" + this.f386368f[this.f386369g].f386359a.mo51017xfb82e301());
        }
        return i17;
    }

    public final void d(k75.a aVar) {
        this.f386377o = (k75.c) aVar;
        if (this.f386364b) {
            this.f386374l.f("transitionTo: destState=" + this.f386377o.mo51017xfb82e301());
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        k75.c cVar;
        k75.k kVar;
        k75.i iVar;
        if (this.f386363a) {
            return;
        }
        if (this.f386364b) {
            this.f386374l.f("handleMessage: E msg.what=" + message.what);
        }
        this.f386365c = message;
        boolean z17 = this.f386367e;
        if (z17) {
            k75.i iVar2 = this.f386368f[this.f386369g];
            if (this.f386364b) {
                this.f386374l.f("processMsg: " + iVar2.f386359a.mo51017xfb82e301());
            }
            if (message.what == -1 && message.obj == f386362q) {
                d(this.f386373k);
            } else {
                while (true) {
                    if (iVar2.f386359a.c(message)) {
                        break;
                    }
                    iVar2 = iVar2.f386360b;
                    if (iVar2 == null) {
                        this.f386374l.p(message);
                        break;
                    } else if (this.f386364b) {
                        this.f386374l.f("processMsg: " + iVar2.f386359a.mo51017xfb82e301());
                    }
                }
            }
            cVar = iVar2 != null ? iVar2.f386359a : null;
        } else {
            if (z17 || message.what != -2 || message.obj != f386362q) {
                throw new java.lang.RuntimeException("StateMachine.handleMessage: The start method not called, received msg: " + message);
            }
            this.f386367e = true;
            b(0);
            cVar = null;
        }
        k75.c cVar2 = this.f386368f[this.f386369g].f386359a;
        boolean z18 = this.f386374l.k(this.f386365c) && message.obj != f386362q;
        synchronized (this.f386366d) {
        }
        if (z18) {
            k75.f fVar = this.f386366d;
            k75.k kVar2 = this.f386374l;
            android.os.Message message2 = this.f386365c;
            kVar2.getClass();
            k75.c cVar3 = this.f386377o;
            synchronized (fVar) {
                if (fVar.f386355a.size() < fVar.f386356b) {
                    fVar.f386355a.add(new k75.e(kVar2, message2, "", cVar, cVar2, cVar3));
                } else {
                    k75.e eVar = (k75.e) fVar.f386355a.get(fVar.f386357c);
                    int i17 = fVar.f386357c + 1;
                    fVar.f386357c = i17;
                    if (i17 >= fVar.f386356b) {
                        fVar.f386357c = 0;
                    }
                    eVar.f386348a = kVar2;
                    eVar.f386349b = java.lang.System.currentTimeMillis();
                    eVar.f386350c = message2 != null ? message2.what : 0;
                    eVar.f386351d = "";
                    eVar.f386352e = cVar;
                    eVar.f386353f = cVar2;
                    eVar.f386354g = cVar3;
                }
            }
        }
        k75.c cVar4 = this.f386377o;
        if (cVar4 != null) {
            while (true) {
                if (this.f386364b) {
                    this.f386374l.f("handleMessage: new destination call exit/enter");
                }
                this.f386371i = 0;
                k75.i iVar3 = (k75.i) this.f386375m.get(cVar4);
                do {
                    k75.i[] iVarArr = this.f386370h;
                    int i18 = this.f386371i;
                    this.f386371i = i18 + 1;
                    iVarArr[i18] = iVar3;
                    iVar3 = iVar3.f386360b;
                    if (iVar3 == null) {
                        break;
                    }
                } while (!iVar3.f386361c);
                if (this.f386364b) {
                    this.f386374l.f("setupTempStateStackWithStatesToEnter: X mTempStateStackCount=" + this.f386371i + ",curStateInfo: " + iVar3);
                }
                while (true) {
                    int i19 = this.f386369g;
                    if (i19 < 0 || (iVar = this.f386368f[i19]) == iVar3) {
                        break;
                    }
                    k75.c cVar5 = iVar.f386359a;
                    if (this.f386364b) {
                        this.f386374l.f("invokeExitMethods: " + cVar5.mo51017xfb82e301());
                    }
                    cVar5.b();
                    k75.i[] iVarArr2 = this.f386368f;
                    int i27 = this.f386369g;
                    iVarArr2[i27].f386361c = false;
                    this.f386369g = i27 - 1;
                }
                b(c());
                java.util.ArrayList arrayList = this.f386378p;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    android.os.Message message3 = (android.os.Message) arrayList.get(size);
                    if (this.f386364b) {
                        this.f386374l.f("moveDeferredMessageAtFrontOfQueue; what=" + message3.what);
                    }
                    sendMessageAtFrontOfQueue(message3);
                }
                arrayList.clear();
                k75.c cVar6 = this.f386377o;
                if (cVar4 == cVar6) {
                    break;
                } else {
                    cVar4 = cVar6;
                }
            }
            this.f386377o = null;
        }
        if (cVar4 != null) {
            if (cVar4 == this.f386373k) {
                this.f386374l.i();
                if (this.f386374l.f386381f != null) {
                    getLooper().quit();
                    this.f386374l.f386381f = null;
                }
                removeCallbacksAndMessages(null);
                this.f386374l.f386380e = null;
                this.f386374l = null;
                this.f386365c = null;
                k75.f fVar2 = this.f386366d;
                synchronized (fVar2) {
                    fVar2.f386355a.clear();
                }
                this.f386368f = null;
                this.f386370h = null;
                this.f386375m.clear();
                this.f386376n = null;
                this.f386377o = null;
                this.f386378p.clear();
                this.f386363a = true;
            } else if (cVar4 == this.f386372j) {
                this.f386374l.getClass();
            }
        }
        if (!this.f386364b || (kVar = this.f386374l) == null) {
            return;
        }
        kVar.f("handleMessage: X");
    }
}
