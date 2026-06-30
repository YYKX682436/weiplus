package i84;

/* loaded from: classes3.dex */
public final class c extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f371185a;

    public c(int i17) {
        this.f371185a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutline", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$RoundCornerOutlineProvider");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
        if (outline != null) {
            outline.setRoundRect(rect, this.f371185a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$RoundCornerOutlineProvider");
    }
}
