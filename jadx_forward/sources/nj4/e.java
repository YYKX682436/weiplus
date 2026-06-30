package nj4;

/* loaded from: classes11.dex */
public class e extends nj4.i {

    /* renamed from: d, reason: collision with root package name */
    public final ai4.e f419469d;

    public e(ai4.e info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f419469d = info;
    }

    @Override // nj4.i, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(nj4.i other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean X(nj4.i other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof nj4.e)) {
            return false;
        }
        ai4.e eVar = this.f419469d;
        java.lang.String str = eVar.f86667a;
        ai4.e eVar2 = ((nj4.e) other).f419469d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, eVar2.f86667a) || eVar.f86668b.size() != eVar2.f86668b.size()) {
            return false;
        }
        int size = eVar.f86668b.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) ((mj4.h) eVar.f86668b.get(i17))).l(), ((mj4.k) ((mj4.h) eVar2.f86668b.get(i17))).l()) || !nj4.f.a((mj4.h) eVar.f86668b.get(i17), (mj4.h) eVar2.f86668b.get(i17))) {
                return false;
            }
        }
        return true;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f419469d.f86667a;
    }
}
