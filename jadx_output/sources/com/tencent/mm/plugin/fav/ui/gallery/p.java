package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes9.dex */
public final class p extends com.tencent.mm.plugin.fav.ui.gallery.r {

    /* renamed from: a, reason: collision with root package name */
    public final o72.r2 f101046a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.gp0 f101047b;

    public p(o72.r2 r2Var, r45.gp0 gp0Var) {
        this.f101046a = r2Var;
        this.f101047b = gp0Var;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public boolean a(o72.b3 b3Var) {
        if (b3Var != null) {
            return b3Var.a(this.f101046a, false, false);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public boolean b() {
        o72.r2 r2Var = this.f101046a;
        return r2Var != null && r2Var.t0();
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public boolean c() {
        o72.r2 r2Var = this.f101046a;
        return r2Var != null && r2Var.u0();
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public android.graphics.Bitmap d(boolean z17) {
        return com.tencent.mm.plugin.fav.ui.ra.g(this.f101047b, this.f101046a, z17);
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String e() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.f375438u;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String f() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.f375434s;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String g() {
        java.lang.String str;
        r45.gp0 gp0Var = this.f101047b;
        return (gp0Var == null || (str = gp0Var.f375420m) == null) ? "" : str;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String h() {
        java.lang.String str;
        r45.gp0 gp0Var = this.f101047b;
        return (gp0Var == null || (str = gp0Var.f375412h) == null) ? "" : str;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String i() {
        java.lang.String str;
        r45.gp0 gp0Var = this.f101047b;
        return (gp0Var == null || (str = gp0Var.T) == null) ? "" : str;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String j() {
        java.lang.String x17;
        r45.gp0 gp0Var = this.f101047b;
        return (gp0Var == null || (x17 = o72.x1.x(gp0Var)) == null) ? "" : x17;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public int k() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.I;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public int l() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.X1;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public int m() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.f375448y;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public r45.gp0 n() {
        return this.f101047b;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public int o() {
        o72.r2 r2Var = this.f101046a;
        if (r2Var != null) {
            return r2Var.field_id;
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public o72.r2 p() {
        return this.f101046a;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public long q() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.R;
        }
        return 0L;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public int r() {
        o72.r2 r2Var = this.f101046a;
        if (r2Var != null) {
            return r2Var.field_itemStatus;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public long s() {
        o72.r2 r2Var = this.f101046a;
        if (r2Var != null) {
            return r2Var.field_localId;
        }
        return 0L;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String t() {
        r45.gp0 gp0Var = this.f101047b;
        return gp0Var != null ? gp0Var.f375431q2 : "";
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public android.graphics.Bitmap u() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return com.tencent.mm.plugin.fav.ui.ra.i(gp0Var, this.f101046a);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public long v() {
        r45.gp0 gp0Var = this.f101047b;
        if (gp0Var != null) {
            return gp0Var.f375418l1;
        }
        return 0L;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public java.lang.String w() {
        java.lang.String X;
        r45.gp0 gp0Var = this.f101047b;
        return (gp0Var == null || (X = o72.x1.X(gp0Var)) == null) ? "" : X;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public boolean x() {
        return (this.f101047b == null || this.f101046a == null) ? false : true;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.r
    public void y() {
        r45.gp0 gp0Var;
        o72.r2 r2Var = this.f101046a;
        if (r2Var == null || (gp0Var = this.f101047b) == null) {
            return;
        }
        o72.x1.y0(r2Var, gp0Var, true);
    }
}
