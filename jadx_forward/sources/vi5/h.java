package vi5;

/* loaded from: classes.dex */
public class h implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f519164a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.y f519165b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.r f519166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f519167d;

    public h(long j17, p13.y yVar, p13.r rVar, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 1) != 0 ? 0L : j17;
        yVar = (i18 & 2) != 0 ? null : yVar;
        rVar = (i18 & 4) != 0 ? null : rVar;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        this.f519164a = j17;
        this.f519165b = yVar;
        this.f519166c = rVar;
        this.f519167d = i17;
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
        if (!(other instanceof vi5.h)) {
            return 0;
        }
        int i17 = thisItem.f477643e;
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i17, otherItem.f477643e);
        if (i18 != 0) {
            return i18;
        }
        ri5.h hVar = ri5.j.I;
        if (i17 == ri5.j.W) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f519167d, ((vi5.h) other).f519167d);
        }
        int compare = java.lang.Boolean.compare(otherItem.f477659w, thisItem.f477659w);
        return compare != 0 ? compare : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(((vi5.h) other).f519164a, this.f519164a);
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBinding, "uiBinding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.c(uiBinding, holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 e17 = uiBinding.e();
        if (e17.getVisibility() == 0) {
            e17.setOnClickListener(new vi5.g(this, holder, item));
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
        if (!(other instanceof vi5.h)) {
            return false;
        }
        vi5.h hVar = (vi5.h) other;
        return this.f519164a == hVar.f519164a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519165b, hVar.f519165b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f519166c, hVar.f519166c) && this.f519167d == hVar.f519167d;
    }
}
