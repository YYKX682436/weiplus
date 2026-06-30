package io.p3284xd2ae381c.p3319x36f002;

/* renamed from: io.flutter.util.ViewUtils */
/* loaded from: classes14.dex */
public final class C28973x1922e4ec {

    /* renamed from: io.flutter.util.ViewUtils$DisplayUpdater */
    /* loaded from: classes14.dex */
    public interface DisplayUpdater {
        /* renamed from: updateDisplayMetrics */
        void mo137464x3890b2ca(float f17, float f18, float f19);
    }

    /* renamed from: io.flutter.util.ViewUtils$ViewVisitor */
    /* loaded from: classes14.dex */
    public interface ViewVisitor {
        boolean run(android.view.View view);
    }

    /* renamed from: calculateMaximumDisplayMetrics */
    public static void m139424x1d99141b(android.content.Context context, io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.DisplayUpdater displayUpdater) {
        if (context != null) {
            android.graphics.Point m139427x69e01b6b = m139427x69e01b6b(context);
            displayUpdater.mo137464x3890b2ca(m139427x69e01b6b.x, m139427x69e01b6b.y, context.getResources().getDisplayMetrics().density);
        }
    }

    /* renamed from: childHasFocus */
    public static boolean m139425x7337df9a(android.view.View view) {
        return m139431xe8536ce3(view, new ez5.C28311x2ca3e0());
    }

    /* renamed from: getActivity */
    public static android.app.Activity m139426x19263085(android.content.Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.content.ContextWrapper) {
            return m139426x19263085(((android.content.ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: getDisplayRealSize */
    public static android.graphics.Point m139427x69e01b6b(android.content.Context context) {
        android.graphics.Point point = new android.graphics.Point();
        if (context == null) {
            return point;
        }
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: hasChildViewOfType */
    public static boolean m139428x42e1a0f8(android.view.View view, final java.lang.Class<? extends android.view.View>[] clsArr) {
        return m139431xe8536ce3(view, new io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.ViewVisitor() { // from class: ez5.a$$b
            @Override // io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.ViewVisitor
            public final boolean run(android.view.View view2) {
                boolean m139430x6d406c42;
                m139430x6d406c42 = io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139430x6d406c42(clsArr, view2);
                return m139430x6d406c42;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$hasChildViewOfType$1 */
    public static /* synthetic */ boolean m139430x6d406c42(java.lang.Class[] clsArr, android.view.View view) {
        for (java.lang.Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: traverseHierarchy */
    public static boolean m139431xe8536ce3(android.view.View view, io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                if (m139431xe8536ce3(viewGroup.getChildAt(i17), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
