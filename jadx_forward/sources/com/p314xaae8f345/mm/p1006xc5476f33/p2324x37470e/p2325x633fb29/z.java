package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f257326a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f257327b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f257328c;

    /* renamed from: d, reason: collision with root package name */
    public int f257329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f257330e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f257331f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257332g;

    public z(boolean z17, boolean z18, boolean z19, int i17, boolean z27, boolean z28, boolean z29, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        z27 = (i18 & 16) != 0 ? false : z27;
        z28 = (i18 & 32) != 0 ? false : z28;
        z29 = (i18 & 64) != 0 ? false : z29;
        this.f257326a = z17;
        this.f257327b = z18;
        this.f257328c = z19;
        this.f257329d = i17;
        this.f257330e = z27;
        this.f257331f = z28;
        this.f257332g = z29;
    }

    /* renamed from: equals */
    public boolean m72520xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z zVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z) obj;
        return this.f257326a == zVar.f257326a && this.f257327b == zVar.f257327b && this.f257328c == zVar.f257328c && this.f257329d == zVar.f257329d && this.f257330e == zVar.f257330e && this.f257331f == zVar.f257331f && this.f257332g == zVar.f257332g;
    }

    /* renamed from: hashCode */
    public int m72521x8cdac1b() {
        return (((((((((((java.lang.Boolean.hashCode(this.f257326a) * 31) + java.lang.Boolean.hashCode(this.f257327b)) * 31) + java.lang.Boolean.hashCode(this.f257328c)) * 31) + java.lang.Integer.hashCode(this.f257329d)) * 31) + java.lang.Boolean.hashCode(this.f257330e)) * 31) + java.lang.Boolean.hashCode(this.f257331f)) * 31) + java.lang.Boolean.hashCode(this.f257332g);
    }

    /* renamed from: toString */
    public java.lang.String m72522x9616526c() {
        return "ExportResult(success=" + this.f257326a + ", canRetry=" + this.f257327b + ", isCancel=" + this.f257328c + ", result=" + this.f257329d + ", videoSoft=" + this.f257330e + ", audioSoft=" + this.f257331f + ", parallelExport=" + this.f257332g + ')';
    }
}
