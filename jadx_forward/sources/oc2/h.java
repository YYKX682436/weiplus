package oc2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f425722a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f425723b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f425724c;

    /* renamed from: d, reason: collision with root package name */
    public oc2.f f425725d = oc2.f.f425699e;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f425726e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f03 f425727f;

    public h(int i17, boolean z17, boolean z18) {
        this.f425722a = i17;
        this.f425723b = z18;
    }

    /* renamed from: equals */
    public boolean m150992xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.h)) {
            return false;
        }
        oc2.h hVar = (oc2.h) obj;
        return this.f425722a == hVar.f425722a && this.f425723b == hVar.f425723b;
    }

    /* renamed from: hashCode */
    public int m150993x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f425722a) * 31) + java.lang.Boolean.hashCode(false)) * 31) + java.lang.Boolean.hashCode(this.f425723b);
    }

    /* renamed from: toString */
    public java.lang.String m150994x9616526c() {
        return "RenderParam(maxSize=" + this.f425722a + ", isShort=false, dropOverSizeRedDot=" + this.f425723b + ')';
    }
}
