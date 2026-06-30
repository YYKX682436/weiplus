package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f187120a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187121b;

    /* renamed from: c, reason: collision with root package name */
    public int f187122c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f187123d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u5 f187124e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x5 f187125f;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb redDotCtrInfo, java.lang.String dicPath, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotCtrInfo, "redDotCtrInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dicPath, "dicPath");
        this.f187120a = redDotCtrInfo;
        this.f187121b = dicPath;
        this.f187122c = i17;
        this.f187123d = z17;
        this.f187124e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u5.f187420e;
        this.f187125f = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x5.f187523e;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f187120a;
        java.lang.String str = this.f187121b;
        r45.f03 I0 = jbVar.I0(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" (ignoreLimit=");
        boolean z17 = false;
        if (I0 != null && I0.f455432s == 1) {
            z17 = true;
        }
        sb6.append(z17);
        sb6.append(",businessType=");
        sb6.append(jbVar.f65873xe412923f);
        sb6.append(",expose=");
        sb6.append(this.f187122c);
        sb6.append(",time=");
        sb6.append(jbVar.f65879x2261f6f2);
        sb6.append(",is_exempt=");
        sb6.append(I0 != null ? java.lang.Boolean.valueOf(I0.I) : null);
        sb6.append(",win_type=");
        sb6.append(this.f187124e);
        sb6.append(",sub=");
        sb6.append(this.f187125f);
        sb6.append(')');
        return sb6.toString();
    }

    /* renamed from: equals */
    public boolean m55840xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i4 i4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187120a, i4Var.f187120a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187121b, i4Var.f187121b) && this.f187122c == i4Var.f187122c && this.f187123d == i4Var.f187123d;
    }

    /* renamed from: hashCode */
    public int m55841x8cdac1b() {
        return (((((this.f187120a.hashCode() * 31) + this.f187121b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f187122c)) * 31) + java.lang.Boolean.hashCode(this.f187123d);
    }

    /* renamed from: toString */
    public java.lang.String m55842x9616526c() {
        return "LocalRedDotCollectWrapper(redDotCtrInfo=" + this.f187120a + ", dicPath=" + this.f187121b + ", exposeCnt=" + this.f187122c + ", ban=" + this.f187123d + ')';
    }
}
