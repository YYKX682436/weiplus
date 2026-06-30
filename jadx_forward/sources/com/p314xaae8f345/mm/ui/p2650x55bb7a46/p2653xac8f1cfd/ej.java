package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.p1.class)
/* loaded from: classes9.dex */
public class ej extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.p1, ot0.f3 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f280509o = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f280510e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f280511f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f280512g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f280513h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f280514i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f280515m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f280516n = new java.util.HashMap();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (this.f280510e) {
            tn1.f.f().c();
        }
    }

    @Override // ot0.f3
    public boolean G3() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        if (this.f280510e) {
            this.f280113d.p().mo75769x1a2696e2(null);
            this.f280511f = true;
            this.f280510e = false;
            this.f280515m = false;
        }
    }

    @Override // ot0.f3
    public boolean I6() {
        return false;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "failDoJob %s", e3Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f280510e = this.f280113d.f542250l.m78383x21a1233e("key_record_msg_select", false).booleanValue();
        this.f280512g = this.f280113d.f542250l.m78388x5a3fc3e("key_record_select_min_msg_id", -1L);
        this.f280513h = this.f280113d.f542250l.m78386x9c19e6d7("key_record_select_msg_num", 0);
        this.f280514i = this.f280113d.f542250l.m78394x7e63ed49("Chat_User");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "isRecordSelect:%s lastSelectMinMsgId:%s lastSelectMsgNum:%s ", java.lang.Boolean.valueOf(this.f280510e), java.lang.Long.valueOf(this.f280512g), java.lang.Integer.valueOf(this.f280513h));
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "requestExitSelectedMode %s", e3Var);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (this.f280510e) {
            if (!this.f280515m && !n0()) {
                a14.a.a().f82115a.f141894h = m0();
            }
            this.f280515m = true;
        }
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "doInBackground %s", e3Var);
    }

    public int m0() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).W;
        if (copyOnWriteArraySet == null) {
            return 0;
        }
        return copyOnWriteArraySet.size();
    }

    public boolean n0() {
        return (this.f280512g == -1 || this.f280513h == 0) ? false : true;
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bundle != null ? bundle.toString() : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "doOnlySelectRecordMsg %s", objArr);
        this.f280511f = false;
        this.f280113d.d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (this.f280510e) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class));
            kVar.X = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.cj(this);
            kVar.T = true;
            kVar.h(null);
            kVar.B1 = null;
            kVar.D1 = null;
            kVar.F1 = null;
            kVar.H1 = null;
            kVar.J1 = null;
            kVar.U = true;
            kVar.W.clear();
            if (n0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "onChattingEnterAnimEnd isEnterLastPosition:%s", java.lang.Boolean.valueOf(n0()));
                sb5.y yVar = new sb5.y();
                yVar.f487129a = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class))).T0(this.f280514i, this.f280512g, hd5.n.ACTION_POSITION, yVar);
            }
        }
    }
}
