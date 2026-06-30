package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class w6 extends com.p314xaae8f345.mm.ui.p2740x696c9db.fd {

    /* renamed from: q, reason: collision with root package name */
    public final android.view.LayoutInflater f292409q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.v6 f292410r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292411s;

    /* renamed from: t, reason: collision with root package name */
    public final db5.g4 f292412t;

    /* renamed from: u, reason: collision with root package name */
    public db5.o4 f292413u;

    /* renamed from: v, reason: collision with root package name */
    public db5.t4 f292414v;

    public w6(android.content.Context context) {
        super(context);
        this.f292411s = true;
        this.f292409q = com.p314xaae8f345.mm.ui.id.b(context);
        this.f292412t = new db5.g4(context);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.fd
    public android.widget.BaseAdapter b() {
        if (this.f292410r == null) {
            this.f292410r = new com.p314xaae8f345.mm.ui.p2740x696c9db.v6(this, null);
        }
        return this.f292410r;
    }

    public boolean e() {
        db5.o4 o4Var = this.f292413u;
        db5.g4 g4Var = this.f292412t;
        if (o4Var != null) {
            o4Var.mo887xc459429a(g4Var);
        }
        java.lang.CharSequence charSequence = g4Var.f309878e;
        this.f292411s = charSequence != null && charSequence.length() > 0;
        d(com.p314xaae8f345.mm.ui.zk.e(this.f291957e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        boolean z17 = this.f292411s;
        if (z17 && i17 == 0) {
            return;
        }
        if (z17) {
            i17--;
        }
        db5.t4 t4Var = this.f292414v;
        if (t4Var != null) {
            t4Var.mo888x34063ac(this.f292412t.getItem(i17), i17);
        }
        a();
    }
}
