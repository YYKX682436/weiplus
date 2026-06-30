package eb3;

/* loaded from: classes.dex */
public final class a implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f332404a;

    /* renamed from: b, reason: collision with root package name */
    public final long f332405b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.y f332406c;

    /* renamed from: d, reason: collision with root package name */
    public final p13.r f332407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f332408e;

    /* renamed from: f, reason: collision with root package name */
    public final int f332409f;

    public a(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        j18 = (i19 & 2) != 0 ? 0L : j18;
        yVar = (i19 & 4) != 0 ? null : yVar;
        rVar = (i19 & 8) != 0 ? null : rVar;
        i17 = (i19 & 16) != 0 ? 0 : i17;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        this.f332404a = j17;
        this.f332405b = j18;
        this.f332406c = yVar;
        this.f332407d = rVar;
        this.f332408e = i17;
        this.f332409f = i18;
    }

    @Override // si5.c
    public int a() {
        return 0;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisItem, "thisItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherItem, "otherItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof eb3.a)) {
            return 0;
        }
        ri5.h hVar = ri5.j.I;
        int i17 = ri5.j.X;
        int i18 = thisItem.f477643e;
        int i19 = otherItem.f477643e;
        if (i18 == i17 || i18 == ri5.j.W) {
            eb3.a aVar = (eb3.a) other;
            int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f332408e, aVar.f332408e);
            if (i27 != 0) {
                return i27;
            }
            int i28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i19);
            return i28 != 0 ? i28 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f332409f, aVar.f332409f);
        }
        int i29 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i19);
        if (i29 != 0) {
            return i29;
        }
        eb3.a aVar2 = (eb3.a) other;
        int j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(aVar2.f332405b, this.f332405b);
        return j17 == 0 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.j(aVar2.f332404a, this.f332404a) : j17;
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBinding, "uiBinding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (xg3.b.a(this.f332405b, 4, 0L) != 0) {
            uiBinding.k().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562844q7);
        } else {
            uiBinding.k().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562845q8);
        }
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ri5.h hVar = ri5.j.I;
        return item.f477643e == ri5.j.W;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof eb3.a)) {
            return false;
        }
        eb3.a aVar = (eb3.a) other;
        return this.f332404a == aVar.f332404a && this.f332405b == aVar.f332405b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332406c, aVar.f332406c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f332407d, aVar.f332407d) && this.f332408e == aVar.f332408e && this.f332409f == aVar.f332409f;
    }
}
