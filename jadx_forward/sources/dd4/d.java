package dd4;

/* loaded from: classes4.dex */
public final class d extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 {

    /* renamed from: q2, reason: collision with root package name */
    public final android.content.Context f310512q2;

    /* renamed from: r2, reason: collision with root package name */
    public int f310513r2;

    /* renamed from: s2, reason: collision with root package name */
    public ik4.p f310514s2;

    /* renamed from: t2, reason: collision with root package name */
    public xc4.p f310515t2;

    /* renamed from: u2, reason: collision with root package name */
    public android.view.View.OnLongClickListener f310516u2;

    /* renamed from: v2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 f310517v2;

    /* renamed from: w2, reason: collision with root package name */
    public r45.jj4 f310518w2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context, 1, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f310512q2 = context;
        n(false);
        this.V1 = true;
        this.U1 = true;
        android.widget.LinearLayout linearLayout = this.U;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            this.U.removeAllViews();
            this.U.setGravity(17);
            android.view.View inflate = android.view.LayoutInflater.from(this.f293403m).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570805by3, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
            textView.setText("视频Debug面板");
            textView.setGravity(81);
            if (this.f293390e2) {
                textView.setTextColor(this.f293403m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            }
            this.U.addView(inflate, -1, -2);
        }
        this.f293405n = dd4.a.f310500d;
        this.f293414s = new dd4.b(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0
    public void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryShow", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
        android.view.Window window = this.f293397i.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        super.v();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryShow", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
    }
}
