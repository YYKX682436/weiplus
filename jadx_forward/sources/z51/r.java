package z51;

/* loaded from: classes10.dex */
public final class r extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public boolean f551744f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f551745g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f551746h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f551747i;

    /* renamed from: j, reason: collision with root package name */
    public y51.f f551748j;

    /* renamed from: k, reason: collision with root package name */
    public int f551749k;

    /* renamed from: l, reason: collision with root package name */
    public int f551750l;

    /* renamed from: m, reason: collision with root package name */
    public int f551751m;

    /* renamed from: n, reason: collision with root package name */
    public int f551752n;

    /* renamed from: o, reason: collision with root package name */
    public int f551753o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y51.a pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MircoMsg.LivePhotoTagViewPc";
    }

    @Override // z51.x
    public void d(a61.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        super.d(config);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needTagView: ");
        sb6.append(this.f551744f);
        sb6.append(" has customTagView: ");
        sb6.append(this.f551745g != null);
        sb6.append(" fixedPosition: ");
        a61.d dVar = config.f83250a;
        sb6.append(dVar.f83259c);
        f(sb6.toString());
        this.f551744f = dVar.f83257a;
        this.f551745g = dVar.f83258b;
        this.f551746h = dVar.f83259c;
    }

    public final void k(int i17) {
        int b17;
        android.view.View view;
        f("calculateLocation >> bottomHeight: " + i17 + " locationDepends: " + this.f551749k + " thumbWidth: " + this.f551750l + " thumbHeight: " + this.f551751m + " startMargin:" + this.f551753o + " bottomMargin: " + this.f551752n + " tagViewIsFixedPosition: " + this.f551746h);
        if (!this.f551744f || this.f551748j == null || (b17 = i17 + i65.a.b(b(), 16)) == this.f551752n) {
            return;
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(b());
        y51.f fVar = this.f551748j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        int b18 = fVar.b();
        int i18 = a17.f278668a;
        int ceil = (int) java.lang.Math.ceil(((i18 * 1.0f) / this.f551750l) * this.f551751m);
        float f17 = ceil > b18 ? 0.0f : (b18 - ceil) / 2.0f;
        if (this.f551753o == 0) {
            if (ceil <= b18) {
                z51.p pVar = (z51.p) a(z51.p.class);
                int i19 = ceil + 2;
                pVar.f("changeVideoContainerHeight >> " + i19);
                android.widget.FrameLayout frameLayout = pVar.f551732f;
                if (frameLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.height = i19;
                android.widget.FrameLayout frameLayout2 = pVar.f551732f;
                if (frameLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
                    throw null;
                }
                frameLayout2.setLayoutParams(layoutParams2);
                this.f551753o = i65.a.b(b(), 16);
            } else {
                float f18 = ((this.f551750l * b18) / this.f551751m) * 1.0f;
                z51.p pVar2 = (z51.p) a(z51.p.class);
                int ceil2 = ((int) java.lang.Math.ceil(f18)) + 2;
                pVar2.f("changeVideoContainerWidth >> " + ceil2);
                android.widget.FrameLayout frameLayout3 = pVar2.f551732f;
                if (frameLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.width = ceil2;
                android.widget.FrameLayout frameLayout4 = pVar2.f551732f;
                if (frameLayout4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
                    throw null;
                }
                frameLayout4.setLayoutParams(layoutParams4);
                this.f551753o = i65.a.b(b(), 16);
            }
        }
        int b19 = (int) (f17 + i65.a.b(b(), 16));
        f("screenWidth: " + i18 + " showMaxHeight: " + b18 + " showHeight: " + ceil + " outSideSafeBottomMargin: " + b17 + " dependsThumbBottomMargin: " + b19 + " startMargin: " + this.f551753o);
        if (b19 > b17) {
            b17 = b19;
        }
        this.f551752n = b17;
        if (this.f551746h || (view = this.f551747i) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams6 = (android.widget.RelativeLayout.LayoutParams) layoutParams5;
        layoutParams6.setMarginStart(this.f551753o);
        layoutParams6.bottomMargin = this.f551752n;
        view.setLayoutParams(layoutParams6);
        this.f551749k = 1;
    }

    public android.widget.RelativeLayout.LayoutParams l() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        if (this.f551746h) {
            layoutParams.setMarginStart(i65.a.b(b(), 16));
            layoutParams.bottomMargin = i65.a.b(b(), 16);
        }
        return layoutParams;
    }
}
