package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f;

/* loaded from: classes15.dex */
public class d implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 f125963d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125964e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f125965f;

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2688xcad50f45 c2688xcad50f45 = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2688xcad50f45();
        c2688xcad50f45.f125955d = this.f125963d.m20063x4c6a16ff();
        return c2688xcad50f45;
    }

    @Override // o.g0
    public void c(boolean z17) {
        if (this.f125964e) {
            return;
        }
        if (z17) {
            this.f125963d.a();
            return;
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 c2687x66de7c83 = this.f125963d;
        o.r rVar = c2687x66de7c83.D;
        if (rVar == null || c2687x66de7c83.f125945q == null) {
            return;
        }
        int size = rVar.size();
        if (size != c2687x66de7c83.f125945q.length) {
            c2687x66de7c83.a();
            return;
        }
        int i17 = c2687x66de7c83.f125946r;
        for (int i18 = 0; i18 < size; i18++) {
            android.view.MenuItem item = c2687x66de7c83.D.getItem(i18);
            if (item.isChecked()) {
                c2687x66de7c83.f125946r = item.getItemId();
                c2687x66de7c83.f125947s = i18;
            }
        }
        if (i17 != c2687x66de7c83.f125946r) {
            u4.g1.a(c2687x66de7c83, c2687x66de7c83.f125935d);
        }
        int i19 = c2687x66de7c83.f125944p;
        boolean z18 = i19 != -1 ? i19 == 0 : c2687x66de7c83.D.l().size() > 3;
        for (int i27 = 0; i27 < size; i27++) {
            c2687x66de7c83.C.f125964e = true;
            c2687x66de7c83.f125945q[i27].m20047x8ef6e427(c2687x66de7c83.f125944p);
            c2687x66de7c83.f125945q[i27].m20048x574262a2(z18);
            c2687x66de7c83.f125945q[i27].a((o.u) c2687x66de7c83.D.getItem(i27), 0);
            c2687x66de7c83.C.f125964e = false;
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f125963d.D = rVar;
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2688xcad50f45) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2687x66de7c83 c2687x66de7c83 = this.f125963d;
            int i17 = ((com.p176xb6135e39.p177xcca8366f.p244x11d36527.p248xe6452a7f.C2688xcad50f45) parcelable).f125955d;
            int size = c2687x66de7c83.D.size();
            for (int i18 = 0; i18 < size; i18++) {
                android.view.MenuItem item = c2687x66de7c83.D.getItem(i18);
                if (i17 == item.getItemId()) {
                    c2687x66de7c83.f125946r = i17;
                    c2687x66de7c83.f125947s = i18;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return this.f125965f;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}
