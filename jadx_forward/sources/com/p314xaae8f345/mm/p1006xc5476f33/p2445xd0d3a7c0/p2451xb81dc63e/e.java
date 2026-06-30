package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e;

/* loaded from: classes8.dex */
public final class e extends jk3.v {
    public java.lang.String A;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.ref.WeakReference f269665x;

    /* renamed from: y, reason: collision with root package name */
    public int f269666y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f269667z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, ak3.c pageAdapter) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        this.f269665x = new java.lang.ref.WeakReference(activity);
        this.f269667z = "";
        this.A = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "create, NoteEditorUI:%s", java.lang.Integer.valueOf(activity.hashCode()));
    }

    @Override // jk3.v
    public void O(jk3.g gVar) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        if (a() && (abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f269665x.get()) != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
        super.O(gVar);
    }

    public final boolean c0(int i17, java.lang.String title, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f269665x.get();
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        }
        this.A = title;
        j();
        return U(i17, z17);
    }

    @Override // jk3.b, jk3.e
    public void j() {
        if (this.f269666y == 0) {
            return;
        }
        try {
            r45.sw4 sw4Var = new r45.sw4();
            sw4Var.set(0, java.lang.Integer.valueOf(this.f269666y));
            sw4Var.set(1, this.f269667z);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            r45.lr4 v07 = c16601x7ed0e40c != null ? c16601x7ed0e40c.v0() : null;
            if (v07 != null) {
                v07.set(1, this.A);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f381610a;
            if (c16601x7ed0e40c2 == null) {
                return;
            }
            c16601x7ed0e40c2.f66790x225a93cf = sw4Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NoteMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e17.getMessage());
        }
    }

    @Override // jk3.b
    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteMultiTaskHelper", "not ended update historyTaskInfo");
            m(bitmap);
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        android.app.Activity mo2157x19263085;
        android.app.Activity mo2157x192630852;
        android.view.Window window;
        android.view.View decorView;
        super.y(i17, str);
        boolean a17 = a();
        ak3.c cVar = this.f381644d;
        if (a17) {
            if (cVar != null && (mo2157x192630852 = cVar.mo2157x19263085()) != null && (window = mo2157x192630852.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundColor(0);
            }
            if (cVar != null && (mo2157x19263085 = cVar.mo2157x19263085()) != null) {
                mo2157x19263085.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc, 0);
            }
            db5.f.c(cVar != null ? cVar.mo2157x19263085() : null, null);
        }
        if (cVar != null) {
            cVar.l();
        }
    }
}
