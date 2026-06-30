package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13323x5e994e71 f180107d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13323x5e994e71 activityC13323x5e994e71) {
        this.f180107d = activityC13323x5e994e71;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13323x5e994e71 activityC13323x5e994e71 = this.f180107d;
        activityC13323x5e994e71.f179305w = true;
        android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) activityC13323x5e994e71.c7().f432558d).mo144003x754a37bb();
        android.graphics.Rect videoClipBounds = activityC13323x5e994e71.b7().getVideoClipBounds();
        if (videoClipBounds == null) {
            videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        activityC13323x5e994e71.X6(videoClipBounds);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
