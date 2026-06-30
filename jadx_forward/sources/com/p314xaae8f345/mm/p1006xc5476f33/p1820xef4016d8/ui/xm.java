package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class xm extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm {

    /* renamed from: e, reason: collision with root package name */
    public final int f229231e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f229232f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f229233g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f229234h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f229235i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f229236m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f229237n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f229238o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f229239p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, android.view.View view, int i17) {
        super(view);
        this.f229239p = activityC16390x60cac25d;
        this.f229231e = i17;
        this.f229232f = view.findViewById(com.p314xaae8f345.mm.R.id.ij_);
        this.f229233g = view.findViewById(com.p314xaae8f345.mm.R.id.ija);
        this.f229234h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ijc);
        this.f229235i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ije);
        this.f229236m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ijd);
        this.f229237n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ijf);
        this.f229238o = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ijg);
        if (i17 == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f229232f.getLayoutParams();
            layoutParams.width = activityC16390x60cac25d.Q;
            layoutParams.height = activityC16390x60cac25d.R;
            this.f229232f.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f229233g.getLayoutParams();
            layoutParams2.width = activityC16390x60cac25d.S;
            layoutParams2.height = activityC16390x60cac25d.T;
            this.f229233g.setLayoutParams(layoutParams2);
            this.f229233g.setMinimumHeight(activityC16390x60cac25d.R);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f229234h.getLayoutParams();
            double d17 = activityC16390x60cac25d.S * 0.7d;
            layoutParams3.width = (int) d17;
            layoutParams3.height = (int) (d17 * 0.871d);
            layoutParams3.topMargin = (int) (activityC16390x60cac25d.T * 0.13d);
            this.f229234h.setLayoutParams(layoutParams3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18892, 31, java.lang.Integer.valueOf(activityC16390x60cac25d.f228068w + 1), java.lang.Integer.valueOf(activityC16390x60cac25d.f228067v + 1), activityC16390x60cac25d.K, activityC16390x60cac25d.b7(), activityC16390x60cac25d.f228048J, java.lang.Integer.valueOf(activityC16390x60cac25d.f228057n.mo1894x7e414b06() - 1), java.lang.Integer.valueOf(activityC16390x60cac25d.a7()), java.lang.Integer.valueOf(activityC16390x60cac25d.k7()), activityC16390x60cac25d.j7());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar, int i17) {
        this.f3639x46306858.setSelected(zmVar.f229325a);
        r45.wv3 wv3Var = zmVar.f229326b;
        if (wv3Var != null) {
            this.f229235i.setText(wv3Var.f471046v);
            this.f229236m.setText(zmVar.f229326b.f471047w);
            com.p314xaae8f345.mm.ui.bk.r0(this.f229235i.getPaint(), 0.8f);
            com.p314xaae8f345.mm.ui.bk.r0(this.f229236m.getPaint(), 0.8f);
            if (this.f229231e == 1) {
                this.f229235i.setTextSize(1, 12.0f);
                this.f229236m.setTextSize(1, 10.0f);
            }
            this.f229238o.setClickable(true);
            this.f229238o.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.wm(this, zmVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm
    public void n(boolean z17) {
    }
}
