package vi5;

/* loaded from: classes.dex */
public class f implements si5.c {

    /* renamed from: h, reason: collision with root package name */
    public static final vi5.e f519153h = new vi5.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f519154a;

    /* renamed from: b, reason: collision with root package name */
    public final long f519155b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.y f519156c;

    /* renamed from: d, reason: collision with root package name */
    public final p13.r f519157d;

    /* renamed from: e, reason: collision with root package name */
    public final int f519158e;

    /* renamed from: f, reason: collision with root package name */
    public final int f519159f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f519160g;

    public f(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, boolean z17) {
        this.f519154a = j17;
        this.f519155b = j18;
        this.f519156c = yVar;
        this.f519157d = rVar;
        this.f519158e = i17;
        this.f519159f = i18;
        this.f519160g = z17;
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
        if (!(other instanceof vi5.f)) {
            return 0;
        }
        ri5.h hVar = ri5.j.I;
        int i17 = ri5.j.X;
        int i18 = thisItem.f477647i;
        int i19 = otherItem.f477647i;
        int i27 = thisItem.f477643e;
        if (i27 != i17 && i27 != ri5.j.W && i27 != ri5.j.V) {
            int i28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i19);
            return i28 != 0 ? i28 : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(((vi5.f) other).f519155b, this.f519155b);
        }
        vi5.f fVar = (vi5.f) other;
        int i29 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f519158e, fVar.f519158e);
        if (i29 != 0) {
            return i29;
        }
        int i37 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i18, i19);
        return i37 != 0 ? i37 : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f519159f, fVar.f519159f);
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBinding, "uiBinding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (xg3.b.a(this.f519155b, 4, 0L) != 0) {
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
        if (!(other instanceof vi5.f)) {
            return false;
        }
        vi5.f fVar = (vi5.f) other;
        return this.f519154a == fVar.f519154a && this.f519155b == fVar.f519155b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519156c, fVar.f519156c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519157d, fVar.f519157d) && this.f519158e == fVar.f519158e && this.f519159f == fVar.f519159f;
    }

    public /* synthetic */ f(long j17, long j18, p13.y yVar, p13.r rVar, int i17, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? 0L : j17, (i19 & 2) == 0 ? j18 : 0L, (i19 & 4) != 0 ? null : yVar, (i19 & 8) == 0 ? rVar : null, (i19 & 16) != 0 ? 0 : i17, (i19 & 32) != 0 ? 0 : i18, (i19 & 64) == 0 ? z17 : false);
    }
}
