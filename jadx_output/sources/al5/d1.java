package al5;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMCollapsibleTextView f5878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f5879f;

    public d1(int i17, com.tencent.mm.ui.widget.MMCollapsibleTextView mMCollapsibleTextView, android.view.View view) {
        this.f5877d = i17;
        this.f5878e = mMCollapsibleTextView;
        this.f5879f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = (int) (this.f5877d * 1.5f);
        com.tencent.mm.ui.widget.MMCollapsibleTextView mMCollapsibleTextView = this.f5878e;
        imageView = mMCollapsibleTextView.get_collapseImage();
        imageView.getHitRect(rect);
        rect.top -= i17;
        rect.left -= i17;
        rect.bottom += i17;
        rect.right += i17;
        imageView2 = mMCollapsibleTextView.get_collapseImage();
        this.f5879f.setTouchDelegate(new android.view.TouchDelegate(rect, imageView2));
    }
}
