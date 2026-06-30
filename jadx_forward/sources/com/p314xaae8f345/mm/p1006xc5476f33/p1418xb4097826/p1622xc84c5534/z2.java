package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f207017a;

    /* renamed from: b, reason: collision with root package name */
    public so2.j5 f207018b;

    /* renamed from: c, reason: collision with root package name */
    public int f207019c;

    public z2(boolean z17, so2.j5 j5Var, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        j5Var = (i18 & 2) != 0 ? null : j5Var;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        this.f207017a = z17;
        this.f207018b = j5Var;
        this.f207019c = i17;
    }

    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RefreshReporter", "tab_" + i17 + " refreshCount from " + this.f207019c + " to " + (this.f207019c + 1));
        this.f207019c = this.f207019c + 1;
    }

    /* renamed from: equals */
    public boolean m58920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.z2) obj;
        return this.f207017a == z2Var.f207017a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207018b, z2Var.f207018b) && this.f207019c == z2Var.f207019c;
    }

    /* renamed from: hashCode */
    public int m58921x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f207017a) * 31;
        so2.j5 j5Var = this.f207018b;
        return ((hashCode + (j5Var == null ? 0 : j5Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f207019c);
    }

    /* renamed from: toString */
    public java.lang.String m58922x9616526c() {
        return "ReportInfo(doubleTouchEventHappen=" + this.f207017a + ", doubleTouchFeed=" + this.f207018b + ", refreshCount=" + this.f207019c + ')';
    }
}
