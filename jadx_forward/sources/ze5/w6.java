package ze5;

/* loaded from: classes9.dex */
public class w6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p653x55bb7a46.p656x6c9280c5.p657xd1075a44.C10390x428ecefb f553816b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22081xf5de6b82 f553817c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f553818d;

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f553816b = (com.p314xaae8f345.mm.p653x55bb7a46.p656x6c9280c5.p657xd1075a44.C10390x428ecefb) view.findViewById(com.p314xaae8f345.mm.R.id.srn);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f553817c = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22081xf5de6b82) view.findViewById(com.p314xaae8f345.mm.R.id.sqi);
        this.f553818d = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567531ui2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.otv);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        linearLayout.addView(a17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        if (z17) {
            layoutParams.gravity = 3;
        } else {
            layoutParams.gravity = 5;
        }
        a17.setLayoutParams(layoutParams);
        m80057x35d80ff(T6);
        lf5.g.a(a17, true, z17);
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f553817c.m80096x9e033a17();
    }
}
