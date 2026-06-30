package ol5;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f427741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f427742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ol5.e f427743f;

    public a(ol5.e eVar, android.view.WindowManager.LayoutParams layoutParams, int i17) {
        this.f427743f = eVar;
        this.f427741d = layoutParams;
        this.f427742e = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/happybubble/BubbleDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        ol5.e eVar = this.f427743f;
        if (!eVar.f427759m) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/happybubble/BubbleDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int i17 = this.f427741d.x;
        float f17 = i17 < 0 ? 0.0f : i17;
        float width = view.getWidth() + f17;
        int i18 = this.f427742e;
        if (width > i18) {
            f17 = i18 - view.getWidth();
        }
        motionEvent.setLocation(f17 + motionEvent.getX(), r1.y + motionEvent.getY());
        eVar.f427762p.getWindow().getDecorView().dispatchTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/happybubble/BubbleDialog$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
