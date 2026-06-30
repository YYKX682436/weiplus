package com.tencent.mm.plugin.facedetect.ui;

/* loaded from: classes.dex */
public final class FaceHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.Button M;
    public android.view.View N;
    public android.view.View.OnClickListener P;
    public java.lang.String Q;

    public FaceHeaderPreference(android.content.Context context) {
        this(context, null);
    }

    public void M(android.view.View.OnClickListener onClickListener) {
        this.P = onClickListener;
        android.widget.Button button = this.M;
        if (button == null || this.N == null) {
            return;
        }
        if (button == null || onClickListener == null) {
            button.setVisibility(8);
            android.view.View view = this.N;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        button.setOnClickListener(onClickListener);
        this.M.setVisibility(0);
        android.view.View view2 = this.N;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void N(java.lang.String str, java.lang.String str2) {
        this.Q = str;
        if (this.L != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.L.setVisibility(8);
            } else {
                this.L.setText(this.Q);
                this.L.setVisibility(0);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        super.t(view);
        this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.doa);
        this.M = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.m3m);
        this.N = view.findViewById(com.tencent.mm.R.id.f483528b42);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            this.L.setVisibility(8);
        } else {
            this.L.setText(this.Q);
            this.L.setVisibility(0);
        }
        android.widget.Button button = this.M;
        if (button == null || (onClickListener = this.P) == null) {
            if (button != null) {
                button.setVisibility(8);
            }
            android.view.View view2 = this.N;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        button.setOnClickListener(onClickListener);
        this.M.setVisibility(0);
        android.view.View view3 = this.N;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public FaceHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = null;
        this.Q = "";
        this.G = com.tencent.mm.R.layout.aag;
    }
}
