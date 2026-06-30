package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonEditorActivityDirectFinder f98574d;

    public z3(com.tencent.mm.plugin.emoji.ui.EmoticonEditorActivityDirectFinder emoticonEditorActivityDirectFinder) {
        this.f98574d = emoticonEditorActivityDirectFinder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.EmoticonEditorActivityDirectFinder emoticonEditorActivityDirectFinder = this.f98574d;
        emoticonEditorActivityDirectFinder.f97772w = true;
        android.util.Size size = (android.util.Size) ((kotlinx.coroutines.flow.h3) emoticonEditorActivityDirectFinder.c7().f351025d).getValue();
        android.graphics.Rect videoClipBounds = emoticonEditorActivityDirectFinder.b7().getVideoClipBounds();
        if (videoClipBounds == null) {
            videoClipBounds = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        emoticonEditorActivityDirectFinder.X6(videoClipBounds);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmoticonEditorActivityDirectFinder$setupButtons$$inlined$onClicked$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
