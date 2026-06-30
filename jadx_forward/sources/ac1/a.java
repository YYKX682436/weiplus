package ac1;

/* loaded from: classes7.dex */
public class a implements android.view.View.OnTouchListener {
    public a(ac1.b bVar) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/container/JsApiInsertPositioningContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() != 0) {
            if1.s.b((android.view.ViewGroup) view, motionEvent);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/jsapi/container/JsApiInsertPositioningContainer$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
