package et4;

/* loaded from: classes9.dex */
public class j0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f338168d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f338169e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f338170f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f338171g;

    public j0(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f571173d93, null);
        this.f338168d = inflate;
        this.f338170f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ppa);
        this.f338171g = (android.view.ViewGroup) this.f338168d.findViewById(com.p314xaae8f345.mm.R.id.ppb);
        this.f338169e = (android.widget.TextView) this.f338168d.findViewById(com.p314xaae8f345.mm.R.id.pgk);
        android.widget.ImageView imageView = this.f338170f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.f261731y0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(imageView, i17, i17, i17, i17);
        this.f338170f.setOnClickListener(new et4.i0(this));
        setContentView(this.f338168d);
        setCanceledOnTouchOutside(false);
    }
}
