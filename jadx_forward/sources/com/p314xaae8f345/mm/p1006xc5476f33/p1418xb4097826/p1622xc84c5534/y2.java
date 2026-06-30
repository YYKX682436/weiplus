package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qt2 f207000a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.j5 f207001b;

    /* renamed from: c, reason: collision with root package name */
    public final int f207002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f207003d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3 f207004e;

    public y2(r45.qt2 qt2Var, so2.j5 j5Var, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.a3 type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f207000a = qt2Var;
        this.f207001b = j5Var;
        this.f207002c = i17;
        this.f207003d = i18;
        this.f207004e = type;
    }

    /* renamed from: equals */
    public boolean m58913xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2 y2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207000a, y2Var.f207000a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207001b, y2Var.f207001b) && this.f207002c == y2Var.f207002c && this.f207003d == y2Var.f207003d && this.f207004e == y2Var.f207004e;
    }

    /* renamed from: hashCode */
    public int m58914x8cdac1b() {
        r45.qt2 qt2Var = this.f207000a;
        int hashCode = (qt2Var == null ? 0 : qt2Var.hashCode()) * 31;
        so2.j5 j5Var = this.f207001b;
        return ((((((hashCode + (j5Var != null ? j5Var.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f207002c)) * 31) + java.lang.Integer.hashCode(this.f207003d)) * 31) + this.f207004e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m58915x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_context_id=");
        r45.qt2 qt2Var = this.f207000a;
        sb6.append(qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        sb6.append(",feed=");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c3.f206511a.b(this.f207001b));
        sb6.append(",playPercent=");
        sb6.append(this.f207002c);
        sb6.append(",count=");
        sb6.append(this.f207003d);
        sb6.append(",type=");
        sb6.append(this.f207004e);
        return sb6.toString();
    }
}
