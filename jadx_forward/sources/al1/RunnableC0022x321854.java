package al1;

/* renamed from: al1.m$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0022x321854 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd f87322d;

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd.f172558e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12759xcecc55cd c12759xcecc55cd = this.f87322d;
        int childCount = c12759xcecc55cd.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                c12759xcecc55cd.setTouchDelegate(null);
                return;
            }
            android.view.View childAt = c12759xcecc55cd.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                childAt.getHitRect(rect);
                rect.left = java.lang.Math.max(0, rect.left - 100);
                rect.right = java.lang.Math.min(c12759xcecc55cd.getWidth(), rect.right + 100);
                rect.top = java.lang.Math.max(0, rect.top - 100);
                rect.bottom = java.lang.Math.min(c12759xcecc55cd.getHeight(), rect.bottom + 100);
                c12759xcecc55cd.setTouchDelegate(new android.view.TouchDelegate(rect, childAt));
                return;
            }
        }
    }
}
