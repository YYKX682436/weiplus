package c24;

/* loaded from: classes.dex */
public final class f extends xm3.a implements c24.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f38076d;

    /* renamed from: e, reason: collision with root package name */
    public final a24.i f38077e;

    public f(int i17, a24.i item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f38076d = i17;
        this.f38077e = item;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        c24.f other = (c24.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        a24.i iVar = this.f38077e;
        if (kotlin.jvm.internal.o.b(iVar.a7(), other.f38077e.a7())) {
            a24.h v76 = iVar.v7();
            a24.h hVar = iVar.f885d;
            iVar.f885d = iVar.v7();
            if (!(!kotlin.jvm.internal.o.b(hVar, v76))) {
                return true;
            }
        }
        return false;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        c24.f other = (c24.f) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f38076d, other.f38076d);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f38077e.Z6();
    }

    @Override // c24.a
    public a24.i j() {
        return this.f38077e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f38077e.a7();
    }
}
