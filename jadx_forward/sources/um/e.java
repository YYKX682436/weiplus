package um;

/* loaded from: classes10.dex */
public class e implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f510208d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f510209e;

    /* renamed from: f, reason: collision with root package name */
    public int f510210f;

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f510208d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f510209e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        if (z17) {
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            java.util.Iterator it = this.f510208d.iterator();
            while (it.hasNext()) {
                ((xk0.d) it.next()).a(canvas);
            }
            return;
        }
        java.util.Stack stack = this.f510208d;
        xk0.d dVar = (stack == null || stack.size() <= 0) ? null : (xk0.d) this.f510208d.peek();
        if (dVar != null) {
            dVar.a(canvas);
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        java.util.Iterator it = this.f510208d.iterator();
        while (it.hasNext()) {
            ((xk0.d) it.next()).a(canvas);
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f510208d.size()));
        java.util.Stack stack = this.f510209e;
        if (stack != null) {
            stack.clear();
        }
        this.f510209e = (java.util.Stack) this.f510208d.clone();
        if (z17) {
            this.f510208d.clear();
        }
    }

    public void a(xk0.d dVar) {
        java.util.Iterator it = this.f510208d.iterator();
        while (it.hasNext()) {
            if (((xk0.d) it.next()).f536478n == dVar.f536478n) {
                it.remove();
            }
        }
    }

    @Override // um.m
    public void add(java.lang.Object obj) {
        xk0.d dVar = (xk0.d) obj;
        java.util.Stack stack = this.f510208d;
        if (stack != null) {
            stack.push(dVar);
        }
    }

    @Override // um.m
    /* renamed from: clear */
    public void mo168218x5a5b64d() {
        java.util.Stack stack = this.f510208d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f510208d.size()));
        this.f510208d.clear();
        java.util.Stack stack = this.f510209e;
        if (stack != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f510208d.addAll(this.f510209e);
            if (z17) {
                this.f510209e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
        this.f510210f++;
    }

    @Override // um.m
    /* renamed from: onCreate */
    public void mo168219x3e5a77bb() {
        this.f510208d = new java.util.Stack();
    }

    @Override // um.m
    /* renamed from: onDestroy */
    public void mo168220xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleCache", "[onDestroy]");
        java.util.Stack stack = this.f510208d;
        if (stack != null) {
            stack.clear();
        }
        java.util.Stack stack2 = this.f510209e;
        if (stack2 != null) {
            stack2.clear();
        }
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f510208d.size() <= 0) {
            return null;
        }
        return (xk0.d) this.f510208d.pop();
    }
}
