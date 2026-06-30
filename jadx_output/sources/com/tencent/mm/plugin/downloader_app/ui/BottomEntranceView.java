package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class BottomEntranceView extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f97356i = 0;

    /* renamed from: d, reason: collision with root package name */
    public c02.g f97357d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f97358e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f97359f;

    /* renamed from: g, reason: collision with root package name */
    public int f97360g;

    /* renamed from: h, reason: collision with root package name */
    public int f97361h;

    public BottomEntranceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getDisplayHeight() {
        return com.tencent.mm.ui.bl.b(getContext()).y;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f97358e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dh8);
        this.f97359f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dh6);
        float q17 = i65.a.q(getContext());
        this.f97359f.getLayoutParams().height = (int) (this.f97359f.getLayoutParams().height * q17);
        this.f97359f.getLayoutParams().width = (int) (this.f97359f.getLayoutParams().width * q17);
        this.f97359f.requestLayout();
        this.f97361h = ((getDisplayHeight() - com.tencent.mm.ui.bl.a(getContext())) - com.tencent.mm.ui.bl.h(getContext())) - com.tencent.mm.ui.bl.c(getContext());
        this.f97360g = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480136pb);
        getViewTreeObserver().addOnGlobalLayoutListener(new r02.a(this));
        setOnClickListener(new r02.c(this));
    }

    public void setData(c02.g gVar) {
        if (gVar == null || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f37597d) || com.tencent.mm.sdk.platformtools.t8.K0(gVar.f37598e)) {
            setVisibility(8);
            return;
        }
        this.f97357d = gVar;
        setVisibility(0);
        this.f97358e.setText(this.f97357d.f37597d);
    }
}
