package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93371d;

    /* renamed from: e, reason: collision with root package name */
    public int f93372e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93373f = true;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd f93374g;

    public t(p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd abstractC1149x21d497cd) {
        this.f93374g = abstractC1149x21d497cd;
    }

    public final boolean d(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(view);
        boolean z17 = false;
        if (!((w07 instanceof p012xc85e97e9.p100xa8fcbcdb.f0) && ((p012xc85e97e9.p100xa8fcbcdb.f0) w07).f93347f)) {
            return false;
        }
        boolean z18 = this.f93373f;
        int indexOfChild = c1163xf1deaba4.indexOfChild(view);
        if (indexOfChild >= c1163xf1deaba4.getChildCount() - 1) {
            return z18;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w08 = c1163xf1deaba4.w0(c1163xf1deaba4.getChildAt(indexOfChild + 1));
        if ((w08 instanceof p012xc85e97e9.p100xa8fcbcdb.f0) && ((p012xc85e97e9.p100xa8fcbcdb.f0) w08).f93346e) {
            z17 = true;
        }
        return z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (d(view, c1163xf1deaba4)) {
            rect.bottom = this.f93372e;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas canvas, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (this.f93371d == null) {
            return;
        }
        int childCount = c1163xf1deaba4.getChildCount();
        int width = c1163xf1deaba4.getWidth();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            if (d(childAt, c1163xf1deaba4)) {
                int y17 = ((int) childAt.getY()) + childAt.getHeight();
                this.f93371d.setBounds(0, y17, width, this.f93372e + y17);
                this.f93371d.draw(canvas);
            }
        }
    }
}
