package vf0;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f517679a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f517680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f517681c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f517682d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 f517683e;

    public e(boolean z17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 4) != 0 ? 0 : i17;
        str = (i18 & 8) != 0 ? null : str;
        c17683x770f5025 = (i18 & 16) != 0 ? null : c17683x770f5025;
        this.f517679a = z17;
        this.f517680b = c11120x15dce88d;
        this.f517681c = i17;
        this.f517682d = str;
        this.f517683e = c17683x770f5025;
    }

    /* renamed from: equals */
    public boolean m171732xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.e)) {
            return false;
        }
        vf0.e eVar = (vf0.e) obj;
        return this.f517679a == eVar.f517679a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517680b, eVar.f517680b) && this.f517681c == eVar.f517681c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517682d, eVar.f517682d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517683e, eVar.f517683e);
    }

    /* renamed from: hashCode */
    public int m171733x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f517679a) * 31;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f517680b;
        int hashCode2 = (((hashCode + (c11120x15dce88d == null ? 0 : c11120x15dce88d.hashCode())) * 31) + java.lang.Integer.hashCode(this.f517681c)) * 31;
        java.lang.String str = this.f517682d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = this.f517683e;
        return hashCode3 + (c17683x770f5025 != null ? c17683x770f5025.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m171734x9616526c() {
        return "CompressCheckResult(needCompress=" + this.f517679a + ", videoTransPara=" + this.f517680b + ", errorCode=" + this.f517681c + ", errorMsg=" + this.f517682d + ", abaParams=" + this.f517683e + ')';
    }
}
