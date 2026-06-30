package qh;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final qh.a0 f444924a = new qh.a0(null);

    public qh.z a(java.lang.String str) {
        qh.a0 a0Var = this.f444924a;
        if (a0Var.f444838x == java.util.Collections.EMPTY_LIST) {
            a0Var.f444838x = new java.util.ArrayList();
        }
        a0Var.f444838x.add(str);
        return this;
    }

    public qh.z b(long j17) {
        if (j17 > 0) {
            this.f444924a.f444821g = j17;
        }
        return this;
    }

    public qh.a0 c() {
        qh.a0 a0Var = this.f444924a;
        java.util.Collections.sort(a0Var.f444839y, new qh.y(this));
        if (a0Var.f444840z == null) {
            a0Var.f444840z = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.i();
        }
        if (a0Var.A == null) {
            a0Var.A = new wh.s();
        }
        return a0Var;
    }

    public qh.z d(java.lang.Class cls) {
        try {
            ((java.util.ArrayList) this.f444924a.f444839y).add((rh.e3) cls.newInstance());
        } catch (java.lang.Exception unused) {
        }
        return this;
    }

    public qh.z e(boolean z17) {
        this.f444924a.f444833s = z17;
        return this;
    }

    public qh.z f(boolean z17) {
        this.f444924a.f444831q = z17;
        return this;
    }

    public qh.z g(boolean z17) {
        this.f444924a.f444829o = z17;
        return this;
    }

    public qh.z h(boolean z17) {
        this.f444924a.f444830p = z17;
        return this;
    }

    public qh.z i(boolean z17) {
        this.f444924a.D = z17;
        return this;
    }

    public qh.z j(int i17) {
        this.f444924a.f444823i = i17;
        return this;
    }

    public qh.z k(int i17) {
        if (i17 >= 0) {
            this.f444924a.f444832r = i17;
        }
        return this;
    }

    public qh.z l(int i17) {
        if (i17 > 1000) {
            this.f444924a.f444825k = i17;
        }
        return this;
    }

    public qh.z m(wh.s sVar) {
        this.f444924a.A = sVar;
        return this;
    }

    public qh.z n(int i17) {
        if (i17 > 1000) {
            this.f444924a.f444824j = i17;
        }
        return this;
    }

    public qh.z o(int i17) {
        if (i17 >= 10) {
            this.f444924a.f444822h = i17;
        }
        return this;
    }

    public qh.z p(java.util.concurrent.Callable callable) {
        this.f444924a.f444817c = callable;
        return this;
    }

    public qh.z q(boolean z17) {
        this.f444924a.f444834t = z17;
        return this;
    }
}
