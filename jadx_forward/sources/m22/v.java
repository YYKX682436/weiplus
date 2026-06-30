package m22;

/* loaded from: classes9.dex */
public final class v implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404602d;

    public v(android.view.View view) {
        this.f404602d = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/widget/EmojiSortDragGesture$attach$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getActionMasked() == 0) {
            android.content.ClipData clipData = new android.content.ClipData("", new java.lang.String[]{"text/plain"}, new android.content.ClipData.Item(""));
            android.view.View view2 = this.f404602d;
            view2.startDragAndDrop(clipData, new m22.t(view2), null, 0);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiSortDragGesture$attach$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
