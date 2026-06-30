package ul5;

/* loaded from: classes15.dex */
public abstract class c0 {
    public static final boolean a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.plp);
        if (tag instanceof ul5.b) {
            return ((ul5.b) tag).a();
        }
        boolean z17 = true;
        if (view instanceof android.widget.ScrollView) {
            return !((android.widget.ScrollView) view).canScrollVertically(1);
        }
        if (view instanceof android.widget.AbsListView) {
            android.widget.AbsListView absListView = (android.widget.AbsListView) view;
            if (absListView.getChildCount() <= 0) {
                return false;
            }
            int childCount = absListView.getChildCount();
            int count = absListView.getCount();
            int firstVisiblePosition = absListView.getFirstVisiblePosition() + childCount;
            int bottom = absListView.getChildAt(childCount - 1).getBottom();
            if (firstVisiblePosition < count || bottom > absListView.getHeight() - absListView.getListPaddingBottom()) {
                z17 = false;
            }
        }
        return z17;
    }

    public static final boolean b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.plq);
        if (tag instanceof ul5.c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4 o4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c4) ((ul5.c) tag)).f268658a;
            if (!o4Var.D || !o4Var.B) {
                return false;
            }
        } else {
            if (view instanceof android.widget.ScrollView) {
                return !((android.widget.ScrollView) view).canScrollVertically(-1);
            }
            if (view instanceof android.widget.AbsListView) {
                android.widget.AbsListView absListView = (android.widget.AbsListView) view;
                if (absListView.getChildCount() > 0) {
                    int top = absListView.getChildAt(0).getTop();
                    if (absListView.getFirstVisiblePosition() > 0 || top < absListView.getListPaddingTop()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
