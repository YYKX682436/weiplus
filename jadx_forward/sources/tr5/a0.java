package tr5;

/* loaded from: classes13.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final tr5.f0 f502973a;

    /* renamed from: b, reason: collision with root package name */
    public int f502974b = -1;

    /* renamed from: c, reason: collision with root package name */
    public tr5.u f502975c;

    /* renamed from: d, reason: collision with root package name */
    public tr5.y f502976d;

    /* renamed from: e, reason: collision with root package name */
    public tr5.f f502977e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f502978f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.channels.Selector f502979g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f502980h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f502981i;

    public a0(tr5.f0 f0Var) {
        if (f0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        this.f502973a = f0Var;
    }

    public int a() {
        if (sr5.f.a(this.f502974b)) {
            throw new java.lang.IllegalStateException("mCurNetStack".concat(" is not initialized yet"));
        }
        return this.f502974b;
    }

    public tr5.a0 b(int i17) {
        if (sr5.f.a(i17)) {
            throw new java.lang.IllegalArgumentException("curNetStack".concat(" is invalid"));
        }
        this.f502974b = i17;
        return this;
    }

    public java.util.Set c() {
        java.util.Set set = this.f502980h;
        if (set != null) {
            return set;
        }
        throw new java.lang.IllegalStateException("mDnses".concat(" is not initialized yet"));
    }

    public tr5.a0 d(tr5.f0 f0Var) {
        tr5.a0 a0Var = new tr5.a0(f0Var);
        a0Var.b(this.f502974b);
        a0Var.g(this.f502975c);
        a0Var.i(this.f502976d);
        tr5.f fVar = this.f502977e;
        if (fVar == null) {
            throw new java.lang.IllegalArgumentException("transaction".concat(" can not be null"));
        }
        a0Var.f502977e = fVar;
        java.util.concurrent.CountDownLatch countDownLatch = this.f502978f;
        if (countDownLatch == null) {
            throw new java.lang.IllegalArgumentException("countDownLatch".concat(" can not be null"));
        }
        a0Var.f502978f = countDownLatch;
        a0Var.f502979g = this.f502979g;
        java.util.Set set = this.f502980h;
        if (set == null) {
            throw new java.lang.IllegalArgumentException("dnses".concat(" can not be null"));
        }
        a0Var.f502980h = set;
        java.util.List list = this.f502981i;
        if (list == null) {
            throw new java.lang.IllegalArgumentException("sessions".concat(" can not be null"));
        }
        a0Var.f502981i = list;
        return a0Var;
    }

    public java.util.List e() {
        java.util.List list = this.f502981i;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("mSessions".concat(" is not initialized yet"));
    }

    public tr5.u f() {
        tr5.u uVar = this.f502975c;
        if (uVar != null) {
            return uVar;
        }
        throw new java.lang.IllegalStateException("mSorter".concat(" is not initialized yet"));
    }

    public tr5.a0 g(tr5.u uVar) {
        if (uVar == null) {
            throw new java.lang.IllegalArgumentException("sorter".concat(" can not be null"));
        }
        this.f502975c = uVar;
        return this;
    }

    public tr5.y h() {
        tr5.y yVar = this.f502976d;
        if (yVar != null) {
            return yVar;
        }
        throw new java.lang.IllegalStateException("mStatMerge".concat(" is not initialized yet"));
    }

    public tr5.a0 i(tr5.y yVar) {
        if (yVar == null) {
            throw new java.lang.IllegalArgumentException("statMerge".concat(" can not be null"));
        }
        this.f502976d = yVar;
        return this;
    }

    public tr5.f j() {
        tr5.f fVar = this.f502977e;
        if (fVar != null) {
            return fVar;
        }
        throw new java.lang.IllegalStateException("mTransaction".concat(" is not initialized yet"));
    }

    /* renamed from: toString */
    public java.lang.String m166980x9616526c() {
        return "LookupContext{mLookupParams=" + this.f502973a + ", mCurNetStack=" + this.f502974b + ", mSorter=" + this.f502975c + ", mStatMerge=" + this.f502976d + ", mTransaction=" + this.f502977e + ", mCountDownLatch=" + this.f502978f + ", mSelector=" + this.f502979g + ", mDnses=" + this.f502980h + ", mSessions=" + this.f502981i + '}';
    }
}
