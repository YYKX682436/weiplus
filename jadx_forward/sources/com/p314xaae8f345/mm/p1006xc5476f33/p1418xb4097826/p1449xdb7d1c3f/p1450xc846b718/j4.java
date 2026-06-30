package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.at2 f187140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f187141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f187142c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f187143d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f187144e;

    public j4(r45.at2 at2Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f187140a = at2Var;
        this.f187141b = z17;
        this.f187142c = z18;
        this.f187143d = z19;
        this.f187144e = z27;
    }

    /* renamed from: equals */
    public boolean m55851xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j4 j4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187140a, j4Var.f187140a) && this.f187141b == j4Var.f187141b && this.f187142c == j4Var.f187142c && this.f187143d == j4Var.f187143d && this.f187144e == j4Var.f187144e;
    }

    /* renamed from: hashCode */
    public int m55852x8cdac1b() {
        r45.at2 at2Var = this.f187140a;
        return ((((((((at2Var == null ? 0 : at2Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f187141b)) * 31) + java.lang.Boolean.hashCode(this.f187142c)) * 31) + java.lang.Boolean.hashCode(this.f187143d)) * 31) + java.lang.Boolean.hashCode(this.f187144e);
    }

    /* renamed from: toString */
    public java.lang.String m55853x9616526c() {
        return "ServerSyncConfigInfo(serverFreqConfig=" + this.f187140a + ", needUpdateFreqConfig=" + this.f187141b + ", needCleanXStrategy=" + this.f187142c + ", needUpdateXStrategy=" + this.f187143d + ", needUpdateBizXStrategy=" + this.f187144e + ')';
    }
}
