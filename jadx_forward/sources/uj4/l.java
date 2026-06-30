package uj4;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f509973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f509974e;

    public l(android.view.ViewGroup viewGroup, android.widget.LinearLayout linearLayout) {
        this.f509973d = viewGroup;
        this.f509974e = linearLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f509973d.removeView(this.f509974e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
