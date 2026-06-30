package mi1;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12760xe1c3d9d9 implements mi1.q0, pq5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f408105i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d f408106m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 f408107n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f408108o;

    /* renamed from: p, reason: collision with root package name */
    public final int f408109p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f408110q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f408111r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.ViewStub f408112s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 f408113t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f408114u;

    public i(android.content.Context context) {
        super(context);
        this.f408105i = 0;
        this.f408114u = false;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569547eg, (android.view.ViewGroup) this, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d c12762x8fe39d2d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d) findViewById(com.p314xaae8f345.mm.R.id.f564050go);
        this.f408106m = c12762x8fe39d2d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 c12761x677a1998 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998) findViewById(com.p314xaae8f345.mm.R.id.f564049gn);
        this.f408107n = c12761x677a1998;
        this.f408108o = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.f564045gk);
        this.f408110q = findViewById(com.p314xaae8f345.mm.R.id.f564048gm);
        this.f408111r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.e5d);
        this.f408112s = (android.view.ViewStub) findViewById(com.p314xaae8f345.mm.R.id.f564051f91);
        c12762x8fe39d2d.m53339xeee35248(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571555iq));
        c12761x677a1998.m53339xeee35248(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571551im));
        this.f408109p = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561569m8);
    }

    /* renamed from: setTranslateLayoutStyleColor */
    private void m147346x1584228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32 = this.f408113t;
        if (c12763x195d5f32 != null) {
            c12763x195d5f32.m53348x23320e34(i17);
        }
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    /* renamed from: getCapsuleContentAreaView */
    public android.view.View m147347xbe6f1d74() {
        return this.f408108o;
    }

    /* renamed from: getCapsuleHomeButton */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 m147348x52294648() {
        return this.f408107n;
    }

    /* renamed from: getOptionBtn */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d m147349x6d6c1ef1() {
        return this.f408106m;
    }

    /* renamed from: getTranslateLayout */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 m147350x764ff7e2() {
        if (this.f408113t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32 c12763x195d5f32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12763x195d5f32) this.f408112s.inflate().findViewById(com.p314xaae8f345.mm.R.id.f564051f91);
            this.f408113t = c12763x195d5f32;
            c12763x195d5f32.m53344x150a9c57(findViewById(com.p314xaae8f345.mm.R.id.emv));
            this.f408113t.m53348x23320e34(this.f408105i);
        }
        return this.f408113t;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (view.getId() == com.p314xaae8f345.mm.R.id.f564045gk) {
            view.getLayoutParams().height = this.f408109p;
        }
        super.measureChildWithMargins(view, i17, i18, i19, i27);
    }

    /* renamed from: setCapsuleContentAreaMarginEnd */
    public void m147351x5e721652(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = m147347xbe6f1d74().getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.getMarginEnd() == i17 && marginLayoutParams.rightMargin == i17) {
                return;
            }
            marginLayoutParams.rightMargin = i17;
            marginLayoutParams.setMarginEnd(i17);
            m147347xbe6f1d74().setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: setHomeButtonOnClickListener */
    public void m147352x4dad334a(android.view.View.OnClickListener onClickListener) {
        this.f408107n.setOnClickListener(onClickListener);
    }

    /* renamed from: setOptionButtonOnClickListener */
    public void m147353x39261f4(android.view.View.OnClickListener onClickListener) {
        this.f408106m.setOnClickListener(onClickListener);
    }

    /* renamed from: setStyleColor */
    public void m147354x23320e34(int i17) {
        if (i17 == this.f408105i) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 c12761x677a1998 = this.f408107n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d c12762x8fe39d2d = this.f408106m;
        android.widget.TextView textView = this.f408111r;
        android.view.View view = this.f408110q;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f408108o;
        if (i17 == -1) {
            this.f408105i = -1;
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560166cs);
            textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560174ov));
            if (this.f408114u) {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562306yk);
            } else {
                c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562320cl);
            }
            c12762x8fe39d2d.m53340x52d2f021(-1);
            c12761x677a1998.m53340x52d2f021(-1);
            m147346x1584228(-1);
            return;
        }
        this.f408105i = -16777216;
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560167ct);
        textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.afd));
        if (this.f408114u) {
            c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aen);
        } else {
            c1073x7e08a787.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562321cm);
        }
        c12762x8fe39d2d.m53340x52d2f021(-16777216);
        c12761x677a1998.m53340x52d2f021(-16777216);
        m147346x1584228(-16777216);
    }
}
