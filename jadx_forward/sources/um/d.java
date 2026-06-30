package um;

/* loaded from: classes10.dex */
public class d implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Stack f510205d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Stack f510206e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f510207f = new android.graphics.Matrix();

    @Override // um.m
    public int A3(boolean z17) {
        if (z17) {
            java.util.Stack stack = this.f510205d;
            if (stack != null) {
                return stack.size();
            }
            return 0;
        }
        java.util.Stack stack2 = this.f510206e;
        if (stack2 != null) {
            return stack2.size();
        }
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
    }

    @Override // um.m
    public void R2(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCache", "[onSave] size:%s", java.lang.Integer.valueOf(this.f510205d.size()));
        java.util.Stack stack = this.f510206e;
        if (stack != null) {
            stack.clear();
        }
        this.f510206e = (java.util.Stack) this.f510205d.clone();
        if (z17) {
            this.f510205d.clear();
        }
    }

    @Override // um.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(xk0.c cVar) {
        java.util.Stack stack = this.f510205d;
        if (stack != null) {
            stack.push(cVar);
        }
    }

    @Override // um.m
    /* renamed from: clear */
    public void mo168218x5a5b64d() {
        java.util.Stack stack = this.f510205d;
        if (stack != null) {
            stack.clear();
        }
    }

    @Override // um.m
    public void f3(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCache", "[onRestore] size:%s", java.lang.Integer.valueOf(this.f510205d.size()));
        this.f510205d.clear();
        java.util.Stack stack = this.f510206e;
        if (stack != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCache", "[onRestore] %s", java.lang.Integer.valueOf(stack.size()));
            this.f510205d.addAll(this.f510206e);
            if (z17) {
                this.f510206e.clear();
            }
        }
    }

    @Override // um.m
    public void o5() {
    }

    @Override // um.m
    /* renamed from: onCreate */
    public void mo168219x3e5a77bb() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropCache", "[onCreate]");
        this.f510205d = new java.util.Stack();
    }

    @Override // um.m
    /* renamed from: onDestroy */
    public void mo168220xac79a11b() {
        java.util.Stack stack = this.f510205d;
        if (stack != null) {
            stack.clear();
        }
        java.util.Stack stack2 = this.f510206e;
        if (stack2 != null) {
            stack2.clear();
        }
        this.f510207f.reset();
    }

    @Override // um.m
    public java.lang.Object pop() {
        if (this.f510205d.size() > 0) {
            return (xk0.c) this.f510205d.pop();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropCache", "[pop]");
        return null;
    }
}
