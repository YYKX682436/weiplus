package al5;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc f87411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f87412f;

    public d1(int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc c22619x353059dc, android.view.View view) {
        this.f87410d = i17;
        this.f87411e = c22619x353059dc;
        this.f87412f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView m81331x8237ac85;
        android.widget.ImageView m81331x8237ac852;
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = (int) (this.f87410d * 1.5f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22619x353059dc c22619x353059dc = this.f87411e;
        m81331x8237ac85 = c22619x353059dc.m81331x8237ac85();
        m81331x8237ac85.getHitRect(rect);
        rect.top -= i17;
        rect.left -= i17;
        rect.bottom += i17;
        rect.right += i17;
        m81331x8237ac852 = c22619x353059dc.m81331x8237ac85();
        this.f87412f.setTouchDelegate(new android.view.TouchDelegate(rect, m81331x8237ac852));
    }
}
