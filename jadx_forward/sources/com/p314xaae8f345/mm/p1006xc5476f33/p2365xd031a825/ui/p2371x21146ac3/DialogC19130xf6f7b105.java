package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog */
/* loaded from: classes9.dex */
public class DialogC19130xf6f7b105 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f261755d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f261756e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f261757f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f261758g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f261759h;

    /* renamed from: i, reason: collision with root package name */
    public et4.q0 f261760i;

    /* renamed from: m, reason: collision with root package name */
    public et4.r0 f261761m;

    public DialogC19130xf6f7b105(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        c();
    }

    public final void c() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571174d94, null);
        this.f261755d = viewGroup;
        this.f261756e = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ppc);
        this.f261757f = (android.widget.TextView) this.f261755d.findViewById(com.p314xaae8f345.mm.R.id.ppd);
        this.f261758g = (android.widget.ImageView) this.f261755d.findViewById(com.p314xaae8f345.mm.R.id.ppf);
        this.f261759h = (android.widget.TextView) this.f261755d.findViewById(com.p314xaae8f345.mm.R.id.ppe);
        this.f261756e.setOnClickListener(new et4.m0(this));
        setContentView(this.f261755d);
        setCanceledOnTouchOutside(false);
        this.f261760i = new et4.q0(this);
        setOnCancelListener(new et4.k0(this));
        setOnDismissListener(new et4.l0(this));
    }

    public void e() {
        this.f261758g.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80246x9a2437a5, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834)));
        this.f261759h.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroy */
    public void m73905x2711d60c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "activity destroy");
        et4.q0 q0Var = this.f261760i;
        if (q0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
            q0Var.f338188c.mo150320xae7a2e7a();
            ju5.n.c().b();
            q0Var.f338188c = null;
            this.f261760i = null;
        }
        this.f261756e = null;
        this.f261761m = null;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
    /* renamed from: onActivityPause */
    public void m73906xf470b888() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "activity paused, release and dismiss");
        cancel();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        et4.q0 q0Var = this.f261760i;
        q0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "req fingerprint auth 2");
        re4.n.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 38);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        nz2.f fVar = new nz2.f(q0Var.f338187b, 1);
        fVar.f423088c = q0Var.f338186a;
        oVar.z9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, fVar, new et4.p0(q0Var));
    }

    public DialogC19130xf6f7b105(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        c();
    }
}
