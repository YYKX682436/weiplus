package p012xc85e97e9.p114xa324943e.p115xd1075a44;

/* loaded from: classes14.dex */
public class i implements n3.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f93971a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f93972b;

    public i(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe) {
        this.f93972b = c1190x18d3c3fe;
    }

    @Override // n3.k0
    public n3.g3 a(android.view.View view, n3.g3 g3Var) {
        n3.g3 i17 = n3.l1.i(view, g3Var);
        if (i17.f415871a.n()) {
            return i17;
        }
        int c17 = i17.c();
        android.graphics.Rect rect = this.f93971a;
        rect.left = c17;
        rect.top = i17.e();
        rect.right = i17.d();
        rect.bottom = i17.b();
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f93972b;
        int childCount = c1190x18d3c3fe.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            n3.g3 b17 = n3.l1.b(c1190x18d3c3fe.getChildAt(i18), i17);
            rect.left = java.lang.Math.min(b17.c(), rect.left);
            rect.top = java.lang.Math.min(b17.e(), rect.top);
            rect.right = java.lang.Math.min(b17.d(), rect.right);
            rect.bottom = java.lang.Math.min(b17.b(), rect.bottom);
        }
        return i17.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
