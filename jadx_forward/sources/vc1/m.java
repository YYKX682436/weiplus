package vc1;

/* loaded from: classes2.dex */
public class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f516540e;

    public m(vc1.p1 p1Var, boolean z17, android.widget.ImageView imageView) {
        this.f516539d = z17;
        this.f516540e = imageView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f516539d) {
            int action = motionEvent.getAction();
            android.widget.ImageView imageView = this.f516540e;
            if (action == 0) {
                imageView.setColorFilter(android.graphics.Color.parseColor("#88888888"));
            } else if (action == 3 || action == 1) {
                imageView.clearColorFilter();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
