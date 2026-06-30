package yr3;

/* loaded from: classes.dex */
public final class v0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f546591d;

    public v0(android.widget.ImageView imageView) {
        this.f546591d = imageView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$attachAlphaTouch$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.widget.ImageView imageView = this.f546591d;
        if (action == 0) {
            imageView.setAlpha(0.5f);
        } else if (action == 1 || action == 3) {
            imageView.setAlpha(1.0f);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$attachAlphaTouch$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
