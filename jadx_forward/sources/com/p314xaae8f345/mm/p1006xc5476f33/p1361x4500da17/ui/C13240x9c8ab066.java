package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView */
/* loaded from: classes8.dex */
public class C13240x9c8ab066 extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f178889i = 0;

    /* renamed from: d, reason: collision with root package name */
    public c02.g f178890d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178891e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f178892f;

    /* renamed from: g, reason: collision with root package name */
    public int f178893g;

    /* renamed from: h, reason: collision with root package name */
    public int f178894h;

    public C13240x9c8ab066(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getDisplayHeight */
    private int m54711x3de938d3() {
        return com.p314xaae8f345.mm.ui.bl.b(getContext()).y;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178891e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dh8);
        this.f178892f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.dh6);
        float q17 = i65.a.q(getContext());
        this.f178892f.getLayoutParams().height = (int) (this.f178892f.getLayoutParams().height * q17);
        this.f178892f.getLayoutParams().width = (int) (this.f178892f.getLayoutParams().width * q17);
        this.f178892f.requestLayout();
        this.f178894h = ((m54711x3de938d3() - com.p314xaae8f345.mm.ui.bl.a(getContext())) - com.p314xaae8f345.mm.ui.bl.h(getContext())) - com.p314xaae8f345.mm.ui.bl.c(getContext());
        this.f178893g = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561669pb);
        getViewTreeObserver().addOnGlobalLayoutListener(new r02.a(this));
        setOnClickListener(new r02.c(this));
    }

    /* renamed from: setData */
    public void m54712x76491f2c(c02.g gVar) {
        if (gVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f119130d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f119131e)) {
            setVisibility(8);
            return;
        }
        this.f178890d = gVar;
        setVisibility(0);
        this.f178891e.setText(this.f178890d.f119130d);
    }
}
