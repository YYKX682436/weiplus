package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.u0 f272854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.v0 f272855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272856f;

    public t0(com.p314xaae8f345.mm.p2470x93e71c27.ui.u0 u0Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.v0 v0Var, int i17) {
        this.f272854d = u0Var;
        this.f272855e = v0Var;
        this.f272856f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u0 u0Var = this.f272854d;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove() called with: data = ");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.v0 data = this.f272855e;
        sb6.append(data);
        sb6.append(", position = ");
        int i17 = this.f272856f;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilePreviewItemConvert", sb6.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.q0 q0Var = u0Var.f273559e;
        if (q0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501.f271300i;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501 activityC19638x462df501 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.w0) q0Var).f273568a;
            activityC19638x462df501.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorPreviewUI", "remove() called with: data = " + data + ", position = " + i17);
            c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).i("INTENT_KEY_DATA_LIST", activityC19638x462df501.f271303f);
            activityC19638x462df501.f271303f.remove(data);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC19638x462df501.f271301d;
            if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            android.widget.TextView textView = activityC19638x462df501.f271302e;
            if (textView != null) {
                textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC19638x462df501.f271303f) ? 0 : 8);
            }
            activityC19638x462df501.U6();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(activityC19638x462df501.f271303f)) {
                activityC19638x462df501.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
