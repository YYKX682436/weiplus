package ti5;

/* loaded from: classes.dex */
public final class d implements si5.c {

    /* renamed from: i, reason: collision with root package name */
    public static final ti5.c f501196i = new ti5.c(null);

    /* renamed from: a, reason: collision with root package name */
    public final p13.y f501197a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.r f501198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f501199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f501200d;

    /* renamed from: e, reason: collision with root package name */
    public final int f501201e;

    /* renamed from: f, reason: collision with root package name */
    public int f501202f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f501203g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f501204h;

    public d(p13.y yVar, p13.r rVar, int i17, int i18, int i19, int i27, java.lang.String compareContent, boolean z17, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        yVar = (i28 & 1) != 0 ? null : yVar;
        rVar = (i28 & 2) != 0 ? null : rVar;
        i17 = (i28 & 4) != 0 ? 0 : i17;
        i18 = (i28 & 8) != 0 ? 0 : i18;
        i19 = (i28 & 16) != 0 ? 0 : i19;
        i27 = (i28 & 32) != 0 ? 0 : i27;
        compareContent = (i28 & 64) != 0 ? "" : compareContent;
        z17 = (i28 & 128) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compareContent, "compareContent");
        this.f501197a = yVar;
        this.f501198b = rVar;
        this.f501199c = i17;
        this.f501200d = i18;
        this.f501201e = i19;
        this.f501202f = i27;
        this.f501203g = compareContent;
        this.f501204h = z17;
    }

    @Override // si5.c
    public int a() {
        return this.f501202f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2 != false) goto L22;
     */
    @Override // si5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(ri5.j r5, ri5.j r6, si5.c r7) {
        /*
            r4 = this;
            java.lang.String r0 = "thisItem"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "otherItem"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "other"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r7 instanceof ti5.d
            r1 = 0
            if (r0 == 0) goto L8b
            int r0 = ri5.j.X
            int r5 = r5.f477643e
            r2 = 1
            if (r5 != r0) goto L1c
            goto L20
        L1c:
            int r3 = ri5.j.W
            if (r5 != r3) goto L22
        L20:
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            int r6 = r6.f477643e
            if (r3 == 0) goto L33
            if (r6 != r0) goto L2a
            goto L30
        L2a:
            int r3 = ri5.j.W
            if (r6 != r3) goto L2f
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L33
            goto L37
        L33:
            int r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r5, r6)
        L37:
            if (r1 == 0) goto L3a
            return r1
        L3a:
            ri5.h r6 = ri5.j.I
            if (r5 == r0) goto L75
            int r6 = ri5.j.W
            if (r5 != r6) goto L43
            goto L75
        L43:
            int r6 = ri5.j.P
            if (r5 == r6) goto L6a
            int r6 = ri5.j.Q
            if (r5 == r6) goto L6a
            int r6 = ri5.j.L
            if (r5 == r6) goto L6a
            int r6 = ri5.j.N
            if (r5 != r6) goto L54
            goto L6a
        L54:
            int r5 = r4.f501202f
            ti5.d r7 = (ti5.d) r7
            int r6 = r7.f501202f
            int r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r5, r6)
            if (r5 == 0) goto L61
            return r5
        L61:
            java.lang.String r5 = r4.f501203g
            java.lang.String r6 = r7.f501203g
            int r5 = r5.compareTo(r6)
            return r5
        L6a:
            ti5.d r7 = (ti5.d) r7
            int r5 = r7.f501201e
            int r6 = r4.f501201e
            int r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r6, r5)
            return r5
        L75:
            ti5.d r7 = (ti5.d) r7
            int r5 = r7.f501199c
            int r6 = r4.f501199c
            int r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r6, r5)
            if (r5 == 0) goto L82
            return r5
        L82:
            int r5 = r4.f501200d
            int r6 = r7.f501200d
            int r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(r5, r6)
            return r5
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ti5.d.b(ri5.j, ri5.j, si5.c):int");
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ri5.h hVar = ri5.j.I;
        if (item.f477643e == ri5.j.W) {
            si5.c cVar = item.f477646h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.SelectContactAddressBookListItemExtension");
            if (!((ti5.d) cVar).f501204h) {
                return true;
            }
        }
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (!(other instanceof ti5.d)) {
            return false;
        }
        ti5.d dVar = (ti5.d) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501197a, dVar.f501197a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501198b, dVar.f501198b) && this.f501199c == dVar.f501199c && this.f501200d == dVar.f501200d && this.f501201e == dVar.f501201e && this.f501202f == dVar.f501202f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f501203g, dVar.f501203g) && this.f501204h == dVar.f501204h;
    }
}
