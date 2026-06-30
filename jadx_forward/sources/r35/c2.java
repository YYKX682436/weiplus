package r35;

/* loaded from: classes3.dex */
public class c2 implements android.view.View.OnTouchListener {
    public c2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19661x1bd3340a c19661x1bd3340a) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ContactListCustomPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/applet/ContactListCustomPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
