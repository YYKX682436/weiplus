package or;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f428951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f428952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428953c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f428954d;

    public a(int i17, int i18, int i19) {
        this(i17, i18, i19, null, 8, null);
    }

    /* renamed from: equals */
    public boolean m152129xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or.a)) {
            return false;
        }
        or.a aVar = (or.a) obj;
        return this.f428951a == aVar.f428951a && this.f428952b == aVar.f428952b && this.f428953c == aVar.f428953c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f428954d, aVar.f428954d);
    }

    /* renamed from: hashCode */
    public int m152130x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f428951a) * 31) + java.lang.Integer.hashCode(this.f428952b)) * 31) + java.lang.Integer.hashCode(this.f428953c)) * 31;
        java.lang.Integer num = this.f428954d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m152131x9616526c() {
        return "EditStickerInfoItem(picIndex=" + this.f428951a + ", editStickerSource=" + this.f428952b + ", editStickerType=" + this.f428953c + ", uploadSucc=" + this.f428954d + ')';
    }

    public a(int i17, int i18, int i19, java.lang.Integer num) {
        this.f428951a = i17;
        this.f428952b = i18;
        this.f428953c = i19;
        this.f428954d = num;
    }

    public /* synthetic */ a(int i17, int i18, int i19, java.lang.Integer num, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, (i27 & 4) != 0 ? 0 : i19, (i27 & 8) != 0 ? null : num);
    }
}
