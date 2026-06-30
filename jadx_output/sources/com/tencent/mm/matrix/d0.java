package com.tencent.mm.matrix;

/* loaded from: classes.dex */
public class d0 implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/matrix/MatrixSettingUIHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Matrix.UISettingHandler", "[onClick] FrameDecorator");
        yj0.a.h(this, "com/tencent/mm/matrix/MatrixSettingUIHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
