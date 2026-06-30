package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdDialog */
/* loaded from: classes14.dex */
public class DialogC15522xdfb03a79 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.C15519x2d7425ac f218519d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f218520e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f218521f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f218522g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f218523h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f218524i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f218525m;

    /* renamed from: n, reason: collision with root package name */
    public final lz2.w f218526n;

    public DialogC15522xdfb03a79(android.content.Context context, lz2.a aVar) {
        this(context, aVar, null);
    }

    public final void c() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aao, null);
        this.f218524i = inflate;
        this.f218525m = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.e1e);
        this.f218519d = (com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.C15519x2d7425ac) this.f218524i.findViewById(com.p314xaae8f345.mm.R.id.e1a);
        this.f218520e = (android.widget.TextView) this.f218524i.findViewById(com.p314xaae8f345.mm.R.id.e1d);
        this.f218521f = (android.widget.TextView) this.f218524i.findViewById(com.p314xaae8f345.mm.R.id.e1c);
        this.f218522g = (android.widget.TextView) this.f218524i.findViewById(com.p314xaae8f345.mm.R.id.e1b);
        this.f218523h = (android.view.ViewGroup) this.f218524i.findViewById(com.p314xaae8f345.mm.R.id.e1_);
        com.p314xaae8f345.mm.ui.bk.r0(this.f218522g.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(this.f218521f.getPaint(), 0.8f);
        this.f218524i.setBackgroundColor(0);
        this.f218522g.setOnClickListener(new lz2.o(this));
        this.f218521f.setOnClickListener(new lz2.p(this));
    }

    public void e(android.view.animation.Animation.AnimationListener animationListener) {
        this.f218519d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c2h);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559310b6);
        this.f218519d.startAnimation(loadAnimation);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onActivityStop */
    public void m63465xd657db30() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdDialog", "activity pause");
        this.f218526n.f403891e.mo148659x428ac225();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f218524i);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    public DialogC15522xdfb03a79(android.content.Context context, lz2.a aVar, android.os.Bundle bundle) {
        this(context);
        lz2.w wVar = new lz2.w(this, aVar, bundle);
        this.f218526n = wVar;
        setOnShowListener(wVar);
        setOnDismissListener(wVar);
        setOnCancelListener(wVar);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    private DialogC15522xdfb03a79(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575712gb);
        c();
    }

    private DialogC15522xdfb03a79(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575712gb);
        c();
    }
}
