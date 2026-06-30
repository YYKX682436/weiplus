package qx1;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448816e;

    public d(qx1.q qVar, int i17) {
        this.f448816e = qVar;
        this.f448815d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        qx1.q qVar = this.f448816e;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) qVar.f448841b.findViewById(com.p314xaae8f345.mm.R.id.d8a);
        android.view.View findViewById = qVar.f448841b.findViewById(com.p314xaae8f345.mm.R.id.f566717gu1);
        android.widget.LinearLayout linearLayout = qVar.f448843d;
        int i17 = this.f448815d;
        if (i17 == 0) {
            linearLayout.setVisibility(8);
            if (qVar.f448848i) {
                android.view.View view = qVar.f448841b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = qVar.f448841b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 1) {
            imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f79022x94c4c16a);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = qVar.f448841b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            android.view.View view4 = qVar.f448841b;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(8);
            return;
        }
        if (i17 != 3) {
            return;
        }
        imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f79021x4f452063);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = qVar.f448841b;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$12", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(0);
    }
}
