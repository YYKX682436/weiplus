package bm2;

/* loaded from: classes10.dex */
public final class i6 extends in5.r0 implements hn2.l {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a f103512e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f103513f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f103514g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f103515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(bm2.o6 o6Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.v9l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a) findViewById;
        this.f103512e = c14424xe21e01a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) itemView.findViewById(com.p314xaae8f345.mm.R.id.slp);
        this.f103513f = c22661xa3a2b3c0;
        this.f103514g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) itemView.findViewById(com.p314xaae8f345.mm.R.id.ree);
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.p314xaae8f345.mm.R.id.opx);
        this.f103515h = textView;
        c14424xe21e01a.B();
        c22661xa3a2b3c0.setText(o6Var.f103728h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnb));
        textView.setText(o6Var.f103728h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnh));
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView */
    public android.view.View getF201314w() {
        return this.f103512e.getF201314w();
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayView */
    public android.view.View mo10748xe32858dc() {
        return this.f103512e.mo10748xe32858dc();
    }

    @Override // hn2.l
    /* renamed from: getAuditionPlayingAnim */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c() {
        return this.f103512e.mo10749x89e0979c();
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView */
    public android.view.View getF201316y() {
        return this.f103512e.getF201316y();
    }
}
