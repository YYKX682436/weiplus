package com.tencent.mm.plugin.appbrand.jsapi.video.progressbar;

/* loaded from: classes15.dex */
public class VideoPlayerSeekBar extends com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar implements oe1.g1 {
    public int A;
    public int B;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.pointers.PInt f83651y;

    /* renamed from: z, reason: collision with root package name */
    public int f83652z;

    public VideoPlayerSeekBar(android.content.Context context) {
        super(context);
        this.f83651y = new com.tencent.mm.pointers.PInt();
        this.f83652z = -1;
        this.A = -1;
        this.B = -1;
    }

    private int getBarPointPaddingLeft() {
        if (this.A == -1) {
            this.A = this.f83631h.getPaddingLeft();
        }
        return this.A;
    }

    private int getBarPointPaddingRight() {
        if (this.B == -1) {
            this.B = this.f83631h.getPaddingRight();
        }
        return this.B;
    }

    public static int s(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar videoPlayerSeekBar, int i17, com.tencent.mm.pointers.PInt pInt) {
        int barPointPaddingLeft = ((android.widget.FrameLayout.LayoutParams) videoPlayerSeekBar.f83630g.getLayoutParams()).leftMargin - videoPlayerSeekBar.getBarPointPaddingLeft();
        int i18 = i17 - barPointPaddingLeft;
        int i19 = videoPlayerSeekBar.f83635o;
        int barLen = (int) (((i18 * 1.0d) / videoPlayerSeekBar.getBarLen()) * i19);
        pInt.value = barLen;
        if (barLen <= 0) {
            pInt.value = 0;
            if (i18 > barPointPaddingLeft) {
                barPointPaddingLeft = i18;
            }
            return barPointPaddingLeft;
        }
        if (barLen < i19) {
            return i18;
        }
        pInt.value = i19;
        return videoPlayerSeekBar.getBarLen() - (((videoPlayerSeekBar.getBarPointWidth() - videoPlayerSeekBar.getBarPointPaddingLeft()) - videoPlayerSeekBar.getBarPointPaddingRight()) / 2);
    }

    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f83635o;
        if (i17 >= i18) {
            i17 = i18;
        }
        if (this.f83636p != i17) {
            this.f83636p = i17;
            q();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public int getBarPointWidth() {
        if (this.f83652z == -1) {
            this.f83652z = this.f83631h.getWidth();
        }
        return this.f83652z;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488113hi;
    }

    public android.widget.ImageView getPlayBtn() {
        return this.f83632i;
    }

    public android.widget.TextView getPlaytimeTv() {
        return this.f83633m;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public void o() {
        android.view.View inflate = android.view.View.inflate(getContext(), getLayoutId(), this);
        this.f83628e = inflate;
        this.f83629f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kxj);
        this.f83630g = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxi);
        this.f83631h = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kxm);
        this.f83632i = (android.widget.ImageView) this.f83628e.findViewById(com.tencent.mm.R.id.kwj);
        this.f83633m = (android.widget.TextView) this.f83628e.findViewById(com.tencent.mm.R.id.kwl);
        this.f83634n = (android.widget.TextView) this.f83628e.findViewById(com.tencent.mm.R.id.kxa);
        this.f83631h.setOnTouchListener(new df1.g(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar
    public void q() {
        if (this.f83635o == 0 || this.f83639s || this.f83631h == null || getBarLen() == 0) {
            return;
        }
        this.f83633m.setText(p(this.f83636p / 60) + ":" + p(this.f83636p % 60));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f83631h.getLayoutParams();
        int barLen = getBarLen();
        layoutParams.leftMargin = t(this.f83636p, barLen);
        this.f83631h.setLayoutParams(layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.f83629f.getLayoutParams();
        layoutParams2.width = (int) (((this.f83636p * 1.0d) / this.f83635o) * barLen);
        this.f83629f.setLayoutParams(layoutParams2);
        requestLayout();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.f1
    public void setIsPlay(boolean z17) {
        super.setIsPlay(z17);
    }

    public void setPlayBtnOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.f83632i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar, oe1.g1
    public void setVideoTotalTime(int i17) {
        this.f83635o = i17;
        this.f83636p = 0;
        this.f83634n.setText(p(this.f83635o / 60) + ":" + p(this.f83635o % 60));
        q();
    }

    public int t(int i17, int i18) {
        if (i17 <= 0) {
            return 0;
        }
        int i19 = this.f83635o;
        return i17 >= i19 ? i18 - (((getBarPointWidth() - getBarPointPaddingLeft()) - getBarPointPaddingRight()) / 2) : (int) (((i17 * 1.0d) / i19) * i18);
    }

    public VideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83651y = new com.tencent.mm.pointers.PInt();
        this.f83652z = -1;
        this.A = -1;
        this.B = -1;
    }

    public VideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f83651y = new com.tencent.mm.pointers.PInt();
        this.f83652z = -1;
        this.A = -1;
        this.B = -1;
    }
}
