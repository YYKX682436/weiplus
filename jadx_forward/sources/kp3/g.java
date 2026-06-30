package kp3;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f392522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f392523b;

    public g(java.lang.String str, java.lang.String str2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str2 = (i17 & 2) != 0 ? null : str2;
        this.f392522a = str;
        this.f392523b = str2;
        this.f392523b = ((str == null || r26.n0.N(str)) || !com.p314xaae8f345.mm.vfs.w6.j(str)) ? "" : kk.k.g(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1));
    }

    /* renamed from: equals */
    public boolean m144161xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp3.g)) {
            return false;
        }
        kp3.g gVar = (kp3.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392522a, gVar.f392522a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f392523b, gVar.f392523b);
    }

    /* renamed from: hashCode */
    public int m144162x8cdac1b() {
        java.lang.String str = this.f392522a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f392523b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m144163x9616526c() {
        return "VideoResult(videoPath=" + this.f392522a + ", videoMd5=" + this.f392523b + ')';
    }
}
