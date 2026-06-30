package ui5;

/* loaded from: classes.dex */
public final class b implements si5.c {

    /* renamed from: g, reason: collision with root package name */
    public static final ui5.a f509674g = new ui5.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f509675a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.l f509676b;

    /* renamed from: c, reason: collision with root package name */
    public final p13.r f509677c;

    /* renamed from: d, reason: collision with root package name */
    public final int f509678d;

    /* renamed from: e, reason: collision with root package name */
    public int f509679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f509680f;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
    }

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.a3 chatroomMember, p13.l lVar, p13.r rVar, int i17, int i18, java.lang.String compareContent, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lVar = (i19 & 2) != 0 ? null : lVar;
        rVar = (i19 & 4) != 0 ? null : rVar;
        i17 = (i19 & 8) != 0 ? 0 : i17;
        i18 = (i19 & 16) != 0 ? 0 : i18;
        compareContent = (i19 & 32) != 0 ? "" : compareContent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomMember, "chatroomMember");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compareContent, "compareContent");
        this.f509675a = chatroomMember;
        this.f509676b = lVar;
        this.f509677c = rVar;
        this.f509678d = i17;
        this.f509679e = i18;
        this.f509680f = compareContent;
    }

    @Override // si5.c
    public int a() {
        return this.f509679e;
    }

    @Override // si5.c
    public int b(ri5.j thisItem, ri5.j otherItem, si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thisItem, "thisItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherItem, "otherItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof ui5.b)) {
            return 0;
        }
        int i17 = thisItem.f477643e;
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i17, otherItem.f477643e);
        if (i18 != 0) {
            return i18;
        }
        ri5.h hVar = ri5.j.I;
        if (i17 == ri5.j.W) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f509678d, ((ui5.b) other).f509678d);
        }
        ui5.b bVar = (ui5.b) other;
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f509679e, bVar.f509679e);
        return i19 != 0 ? i19 : this.f509680f.compareTo(bVar.f509680f);
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
        if (!(other instanceof ui5.b)) {
            return false;
        }
        ui5.b bVar = (ui5.b) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509675a, bVar.f509675a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509676b, bVar.f509676b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509677c, bVar.f509677c) && this.f509678d == bVar.f509678d && this.f509679e == bVar.f509679e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509680f, bVar.f509680f);
    }
}
