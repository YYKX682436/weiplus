package c24;

/* loaded from: classes.dex */
public final class f extends xm3.a implements c24.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f119609d;

    /* renamed from: e, reason: collision with root package name */
    public final a24.i f119610e;

    public f(int i17, a24.i item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f119609d = i17;
        this.f119610e = item;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        c24.f other = (c24.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        a24.i iVar = this.f119610e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.a7(), other.f119610e.a7())) {
            a24.h v76 = iVar.v7();
            a24.h hVar = iVar.f82418d;
            iVar.f82418d = iVar.v7();
            if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar, v76))) {
                return true;
            }
        }
        return false;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        c24.f other = (c24.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f119609d, other.f119609d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f119610e.Z6();
    }

    @Override // c24.a
    public a24.i j() {
        return this.f119610e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f119610e.a7();
    }
}
