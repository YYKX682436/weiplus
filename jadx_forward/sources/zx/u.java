package zx;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f558502a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f558503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f558504c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l f558505d;

    public u(boolean z17, java.lang.String prefixText, boolean z18, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l data, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixText, "prefixText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f558502a = z17;
        this.f558503b = prefixText;
        this.f558504c = z18;
        this.f558505d = data;
    }

    /* renamed from: equals */
    public boolean m179851xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx.u)) {
            return false;
        }
        zx.u uVar = (zx.u) obj;
        return this.f558502a == uVar.f558502a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558503b, uVar.f558503b) && this.f558504c == uVar.f558504c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558505d, uVar.f558505d);
    }

    /* renamed from: hashCode */
    public int m179852x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f558502a) * 31) + this.f558503b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f558504c)) * 31) + this.f558505d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179853x9616526c() {
        return "QueryItem(isPrefix=" + this.f558502a + ", prefixText=" + this.f558503b + ", isReportVisibilityState=" + this.f558504c + ", data=" + this.f558505d + ')';
    }
}
