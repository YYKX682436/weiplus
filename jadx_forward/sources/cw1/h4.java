package cw1;

/* loaded from: classes12.dex */
public final class h4 implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f304497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f304498b;

    public h4(cw1.q4 q4Var) {
        this.f304498b = q4Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        boolean z18 = z17 ^ this.f304497a;
        cw1.q4 q4Var = this.f304498b;
        java.util.List list = q4Var.f304800f;
        int e17 = kz5.c0.e(list, 0, list.size(), new cw1.g4(java.lang.Integer.valueOf(i17)));
        if (e17 >= 0) {
            return;
        }
        int i18 = i17 + e17 + 1;
        if (q4Var.f304802h.get(i18) == z18) {
            return;
        }
        int i19 = (-e17) - 2;
        bw1.l lVar = (bw1.l) q4Var.f304799e.get(i18);
        if (z18) {
            q4Var.f304803i += lVar.f106342a;
            q4Var.f304804m++;
        } else {
            q4Var.f304803i -= lVar.f106342a;
            q4Var.f304804m--;
        }
        q4Var.f304798d.h7(q4Var.f304803i, q4Var.f304799e.size(), q4Var.f304804m);
        q4Var.f304802h.set(i18, z18);
        q4Var.m8148xed6e4d18(i17, "");
        if (i19 >= 0) {
            q4Var.m8148xed6e4d18(((java.lang.Number) ((jz5.l) q4Var.f304800f.get(i19)).f384366d).intValue(), "");
        }
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return this.f304498b.mo863xcdaf1228(i17) == 0;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        cw1.q4 q4Var = this.f304498b;
        java.util.List list = q4Var.f304800f;
        int e17 = kz5.c0.e(list, 0, list.size(), new cw1.f4(java.lang.Integer.valueOf(i17)));
        if (e17 >= 0) {
            return false;
        }
        return q4Var.f304802h.get((i17 + e17) + 1) ^ this.f304497a;
    }
}
