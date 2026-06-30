package pa3;

/* loaded from: classes8.dex */
public class p extends jk3.v {
    public static final pa3.l I = new pa3.l(null);
    public java.lang.String A;
    public long B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f434528x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f434529y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f434530z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ak3.c pageAdapter) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        this.f434528x = "";
        this.f434529y = "";
        this.f434530z = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "liteapp";
    }

    private final void R() {
        if (a() && s()) {
            if (this.f381649i == null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                fk3.o oVar = new fk3.o();
                this.f381649i = oVar;
                ak3.c cVar = this.f381644d;
                if (cVar != null) {
                    oVar.e(cVar, this, this.f381646f);
                }
            }
            this.f381659s = true;
        }
    }

    public static final void c0(pa3.p pVar, java.lang.String str) {
        pVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.h("type", "star");
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(pVar.B, 0L, "tasks.addTask", gVar);
    }

    @Override // jk3.b
    public void B(boolean z17) {
        if (z17) {
            j();
            ((ku5.t0) ku5.t0.f394148d).g(new pa3.n(this));
        }
        super.B(z17);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        R();
        return super.U(i17, z17);
    }

    @Override // jk3.v
    public void Y(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppMultiTaskHelper", "onMultiTaskInfoChangedInner way:" + i17 + " multiTaskInfo:" + c16601x7ed0e40c);
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65445x856bf801(this.f434528x, this.f434529y, this.f434530z, 1);
        }
    }

    @Override // jk3.v
    public boolean Z() {
        ((ku5.t0) ku5.t0.f394148d).g(new pa3.o(this));
        ak3.c cVar = this.f381644d;
        android.app.Activity mo2157x19263085 = cVar != null ? cVar.mo2157x19263085() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 activityC16256xf01eee95 = mo2157x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16256xf01eee95) mo2157x19263085 : null;
        if (activityC16256xf01eee95 != null) {
            activityC16256xf01eee95.f127637l1 = 1;
            activityC16256xf01eee95.d7(180);
        }
        return true;
    }

    public final void d0() {
        android.content.Intent mo2160x1e885992;
        if (a()) {
            ak3.c cVar = this.f381644d;
            if (cVar != null && (mo2160x1e885992 = cVar.mo2160x1e885992()) != null) {
                mo2160x1e885992.putExtra("disable_swipe_back", true);
            }
            if (cVar != null) {
                cVar.i(false);
            }
        }
    }

    public final void e0(java.lang.String bizName) {
        android.content.Intent mo2160x1e885992;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        this.G = bizName;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "ask") ? 29 : 28;
        ak3.c cVar = this.f381644d;
        if (cVar != null && (mo2160x1e885992 = cVar.mo2160x1e885992()) != null) {
            if (!mo2160x1e885992.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
                mo2160x1e885992 = null;
            }
            if (mo2160x1e885992 != null) {
                android.os.Bundle bundleExtra = mo2160x1e885992.getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                mo2160x1e885992.putExtra("key_multi_task_common_info", bundleExtra != null ? bundleExtra.getByteArray("key_multi_task_common_info") : null);
                android.os.Bundle bundleExtra2 = mo2160x1e885992.getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
                this.H = bundleExtra2 != null ? bundleExtra2.getString("coverBitmapPath") : null;
            }
        }
        y(i17, "");
        R();
        d0();
    }

    @Override // jk3.b, jk3.e
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c != null) {
            r45.lr4 v07 = c16601x7ed0e40c.v0();
            v07.set(1, this.D);
            v07.set(0, this.C);
            v07.set(5, this.E);
            r45.p74 p74Var = new r45.p74();
            p74Var.set(0, this.f434528x);
            p74Var.set(1, this.f434529y);
            p74Var.set(2, this.f434530z);
            p74Var.set(3, this.A);
            byte[] mo14344x5f01b1f6 = p74Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            c16601x7ed0e40c.f66790x225a93cf = mo14344x5f01b1f6;
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }
}
