package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.h3 f290524a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.i3 f290525b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f290526c;

    /* renamed from: d, reason: collision with root package name */
    public int f290527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.k3 f290528e;

    public j3(com.p314xaae8f345.mm.ui.k3 k3Var) {
        this.f290528e = k3Var;
        c();
    }

    public static void a(com.p314xaae8f345.mm.ui.j3 j3Var) {
        int d17;
        synchronized (j3Var) {
            d17 = j3Var.d();
            j3Var.f290526c.clear();
        }
        if (d17 != 2) {
            j3Var.f290524a.mo50305x3d8a09a2(1);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        e95.h f17 = j3Var.f290528e.f();
        com.p314xaae8f345.mm.ui.k3 k3Var = j3Var.f290528e;
        com.p314xaae8f345.mm.ui.f3 h17 = k3Var.h(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k3Var.f290550d, "newcursor fillCursor last : %d  count %d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(h17.a()));
        com.p314xaae8f345.mm.ui.h3 h3Var = j3Var.f290524a;
        h3Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.obj = h17;
        obtain.what = 2;
        h3Var.mo50308x2936bf5f(obtain);
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.i3 i3Var = this.f290525b;
        i3Var.mo50303x856b99f0(i3Var.f290434d);
        i3Var.mo50303x856b99f0(i3Var.f290435e);
        com.p314xaae8f345.mm.ui.h3 h3Var = this.f290524a;
        h3Var.f290305a = true;
        h3Var.mo50303x856b99f0(1);
        h3Var.mo50303x856b99f0(2);
        this.f290526c.clear();
        this.f290527d = 0;
    }

    public final void c() {
        this.f290524a = new com.p314xaae8f345.mm.ui.h3(this, android.os.Looper.getMainLooper());
        if (!(j62.e.g().i("clicfg_cursor_data_adater_work_handler", 0, true, true) == 1)) {
            this.f290525b = new com.p314xaae8f345.mm.ui.i3(this, gm0.j1.e().a());
            return;
        }
        this.f290525b = new com.p314xaae8f345.mm.ui.i3(this, this.f290528e.f290550d + "#WorkerHandler");
    }

    public final int d() {
        if (this.f290526c.size() > 1) {
            return 2;
        }
        if (this.f290526c.size() == 1) {
            return ((java.lang.Integer) this.f290526c.get(0)).intValue();
        }
        return 0;
    }
}
