package nj4;

/* loaded from: classes11.dex */
public final class c extends nj4.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f419463e;

    /* renamed from: f, reason: collision with root package name */
    public final nj4.d f419464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419465g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f419466h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ai4.e info, int i17, nj4.d headerData) {
        super(info);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerData, "headerData");
        this.f419463e = i17;
        this.f419464f = headerData;
        this.f419465g = "";
        java.util.Iterator it = info.f86668b.iterator();
        while (it.hasNext()) {
            this.f419465g += ((mj4.k) ((mj4.h) it.next())).o() + ',';
        }
        this.f419466h = info.f86667a + '_' + this.f419463e + '_' + this.f419465g;
    }

    @Override // nj4.e, nj4.i, xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // nj4.e, xm3.a, in5.c
    public int h() {
        return 6;
    }

    @Override // nj4.e, xm3.d
    /* renamed from: o */
    public boolean X(nj4.i other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        boolean z17 = other instanceof nj4.c;
        if (z17) {
            ai4.e eVar = this.f419469d;
            int size = eVar.f86668b.size();
            ai4.e eVar2 = ((nj4.c) other).f419469d;
            if (size != eVar2.f86668b.size()) {
                return false;
            }
            int size2 = eVar.f86668b.size();
            for (int i17 = 0; i17 < size2; i17++) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) ((mj4.h) eVar.f86668b.get(i17))).l(), ((mj4.k) ((mj4.h) eVar2.f86668b.get(i17))).l()) || !nj4.f.a((mj4.h) eVar.f86668b.get(i17), (mj4.h) eVar2.f86668b.get(i17))) {
                    return false;
                }
            }
        }
        return z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(other.v(), this.f419466h);
    }

    @Override // nj4.e, xm3.d
    public java.lang.String v() {
        return this.f419466h;
    }
}
