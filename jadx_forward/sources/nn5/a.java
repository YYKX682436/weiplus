package nn5;

/* loaded from: classes15.dex */
public final class a extends tn5.g {
    private final boolean c(android.view.View view, android.graphics.PointF pointF, boolean z17) {
        if (view == null) {
            return false;
        }
        if (view.canScrollHorizontally(1) && view.getVisibility() == 0) {
            return false;
        }
        if (view instanceof android.view.ViewGroup) {
            if (!(!(view instanceof on5.g) && ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView) || (view instanceof n3.o0) || (view instanceof android.webkit.WebView) || (view instanceof n3.e0))) && pointF != null) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                android.graphics.PointF pointF2 = new android.graphics.PointF();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.View childAt = viewGroup.getChildAt(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                    if (e(view, childAt, pointF.x, pointF.y, pointF2)) {
                        pointF.offset(pointF2.x, pointF2.y);
                        boolean c17 = c(childAt, pointF, z17);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return c17;
                    }
                }
            }
        }
        return z17 || view.canScrollHorizontally(-1);
    }

    private final boolean d(android.view.View view, android.graphics.PointF pointF) {
        if (view == null) {
            return false;
        }
        if (view.canScrollHorizontally(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof android.view.ViewGroup) || pointF == null) {
            return true;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        android.graphics.PointF pointF2 = new android.graphics.PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
            if (e(view, childAt, pointF.x, pointF.y, pointF2)) {
                pointF.offset(pointF2.x, pointF2.y);
                boolean d17 = d(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return d17;
            }
        }
        return true;
    }

    @Override // tn5.g, on5.h
    public boolean a(android.view.View view) {
        return c(view, this.f502406a, this.f502408c);
    }

    @Override // tn5.g, on5.h
    public boolean b(android.view.View view) {
        return d(view, this.f502406a);
    }
}
