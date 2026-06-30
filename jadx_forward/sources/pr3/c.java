package pr3;

/* loaded from: classes8.dex */
public final class c extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f439486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f439487e;

    /* renamed from: f, reason: collision with root package name */
    public int f439488f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f439489g;

    /* renamed from: h, reason: collision with root package name */
    public int f439490h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f439491i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f439492m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f439493n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f439494o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f439495p;

    /* renamed from: q, reason: collision with root package name */
    public pr3.f f439496q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f439497r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f439498s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f439499t;

    public /* synthetic */ c(int i17, int i18, int i19, java.lang.CharSequence charSequence, int i27, boolean z17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, pr3.f fVar, java.util.List list, yz5.p pVar, yz5.a aVar, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, (i28 & 4) != 0 ? i18 : i19, (i28 & 8) != 0 ? null : charSequence, (i28 & 16) != 0 ? Integer.MAX_VALUE : i27, (i28 & 32) != 0 ? false : z17, (i28 & 64) != 0 ? null : num, (i28 & 128) != 0 ? null : num2, (i28 & 256) != 0 ? null : num3, (i28 & 512) != 0 ? null : str, (i28 & 1024) != 0 ? pr3.f.f439505e : fVar, (i28 & 2048) != 0 ? kz5.p0.f395529d : list, (i28 & 4096) != 0 ? null : pVar, (i28 & 8192) != 0 ? pr3.b.f439485d : aVar);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (other instanceof pr3.c) {
            if (this.f439486d == other.i()) {
                pr3.c cVar = (pr3.c) other;
                if (this.f439487e == cVar.f439487e && this.f439488f == cVar.f439488f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439489g, cVar.f439489g) && this.f439490h == cVar.f439490h && this.f439491i == cVar.f439491i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439492m, cVar.f439492m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439493n, cVar.f439493n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439494o, cVar.f439494o) && this.f439496q == cVar.f439496q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439497r, cVar.f439497r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439498s, cVar.f439498s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439499t, cVar.f439499t) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439495p, cVar.f439495p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(this.f439486d, other.i());
    }

    /* renamed from: equals */
    public boolean m158884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.c)) {
            return false;
        }
        pr3.c cVar = (pr3.c) obj;
        return this.f439486d == cVar.f439486d && this.f439487e == cVar.f439487e && this.f439488f == cVar.f439488f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439489g, cVar.f439489g) && this.f439490h == cVar.f439490h && this.f439491i == cVar.f439491i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439492m, cVar.f439492m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439493n, cVar.f439493n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439494o, cVar.f439494o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439495p, cVar.f439495p) && this.f439496q == cVar.f439496q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439497r, cVar.f439497r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439498s, cVar.f439498s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f439499t, cVar.f439499t);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f439487e;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m158885x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f439486d) * 31) + java.lang.Integer.hashCode(this.f439487e)) * 31) + java.lang.Integer.hashCode(this.f439488f)) * 31;
        java.lang.CharSequence charSequence = this.f439489g;
        int hashCode2 = (((((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + java.lang.Integer.hashCode(this.f439490h)) * 31) + java.lang.Boolean.hashCode(this.f439491i)) * 31;
        java.lang.Integer num = this.f439492m;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f439493n;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f439494o;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str = this.f439495p;
        int hashCode6 = (((((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f439496q.hashCode()) * 31) + this.f439497r.hashCode()) * 31;
        yz5.p pVar = this.f439498s;
        return ((hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f439499t.hashCode();
    }

    @Override // pr3.e
    public int i() {
        return this.f439486d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((!r4.f439497r.isEmpty()) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            pr3.f r0 = r4.f439496q
            pr3.f r1 = pr3.f.f439505e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L21
            java.lang.CharSequence r0 = r4.f439489g
            if (r0 == 0) goto L15
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r3
        L16:
            if (r0 == 0) goto L27
            java.util.List r0 = r4.f439497r
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 != 0) goto L27
        L21:
            pr3.f r0 = r4.f439496q
            pr3.f r1 = pr3.f.f439504d
            if (r0 != r1) goto L28
        L27:
            r2 = r3
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pr3.c.j():boolean");
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return (other instanceof pr3.c) && this.f439488f == ((pr3.c) other).f439488f;
    }

    /* renamed from: toString */
    public java.lang.String m158886x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(this.f439488f));
        sb6.append('\t');
        sb6.append((java.lang.Object) this.f439489g);
        sb6.append(" (max: ");
        sb6.append(this.f439490h);
        sb6.append(") ");
        sb6.append(this.f439491i ? ">" : "");
        sb6.append(", margin_bottom: ");
        sb6.append(this.f439492m);
        sb6.append(", displayPolicy: ");
        sb6.append(this.f439496q);
        sb6.append(" images: ");
        sb6.append(this.f439497r);
        return sb6.toString();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f439487e);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        int i17 = this.f439486d;
        int i18 = this.f439487e;
        int i19 = this.f439488f;
        java.lang.CharSequence charSequence = this.f439489g;
        int i27 = this.f439490h;
        boolean z17 = this.f439491i;
        java.lang.Integer num = this.f439492m;
        java.lang.Integer num2 = this.f439493n;
        java.lang.Integer num3 = this.f439494o;
        java.lang.String str = this.f439495p;
        pr3.f displayPolicy = this.f439496q;
        java.util.List images = this.f439497r;
        yz5.p pVar = this.f439498s;
        yz5.a onClick = this.f439499t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayPolicy, "displayPolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(images, "images");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        return new pr3.c(i17, i18, i19, charSequence, i27, z17, num, num2, num3, str, displayPolicy, images, pVar, onClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, int i18, int i19, java.lang.CharSequence charSequence, int i27, boolean z17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, pr3.f displayPolicy, java.util.List images, yz5.p pVar, yz5.a onClick) {
        super(i17, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayPolicy, "displayPolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(images, "images");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f439486d = i17;
        this.f439487e = i18;
        this.f439488f = i19;
        this.f439489g = charSequence;
        this.f439490h = i27;
        this.f439491i = z17;
        this.f439492m = num;
        this.f439493n = num2;
        this.f439494o = num3;
        this.f439495p = str;
        this.f439496q = displayPolicy;
        this.f439497r = images;
        this.f439498s = pVar;
        this.f439499t = onClick;
    }
}
