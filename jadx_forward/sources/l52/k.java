package l52;

/* loaded from: classes4.dex */
public abstract class k {
    public static final android.view.View a(android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            return ((android.widget.AbsListView) view).getChildAt(i17);
        }
        if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            return ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).getChildAt(i17);
        }
        return null;
    }

    public static final java.lang.Object b(android.view.View view, int i17) {
        java.lang.Object mo75871xfb80e389;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) ((android.widget.AbsListView) view).getAdapter();
            if (listAdapter == null || (mo75871xfb80e389 = listAdapter.getItem(i17)) == null) {
                return null;
            }
        } else {
            if (!(view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
                return null;
            }
            java.lang.Object mo7946xf939df19 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).mo7946xf939df19();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 u3Var = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3) mo7946xf939df19 : null;
            if (u3Var == null || (mo75871xfb80e389 = u3Var.mo75871xfb80e389(i17)) == null) {
                return null;
            }
        }
        return mo75871xfb80e389;
    }

    public static final int c(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) ((android.widget.AbsListView) view).getAdapter();
            if (listAdapter != null) {
                return listAdapter.getCount();
            }
            return 0;
        }
        if (!(view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) || (mo7946xf939df19 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).mo7946xf939df19()) == null) {
            return 0;
        }
        return mo7946xf939df19.mo1894x7e414b06();
    }

    public static final int d(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            return ((android.widget.AbsListView) view).getLastVisiblePosition();
        }
        if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                return c1162x665295de.y();
            }
        }
        return -1;
    }

    public static final boolean e(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (view instanceof android.widget.AbsListView) {
            if (((android.widget.AbsListView) view).getAdapter() != null) {
                return true;
            }
        } else if ((view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) && ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).mo7946xf939df19() != null) {
            return true;
        }
        return false;
    }
}
