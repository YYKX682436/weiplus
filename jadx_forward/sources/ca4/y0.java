package ca4;

/* loaded from: classes3.dex */
public class y0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f121597a;

    public y0(java.lang.Float f17) {
        this.f121597a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f121597a.floatValue());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
    }
}
