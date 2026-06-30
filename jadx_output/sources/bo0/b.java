package bo0;

/* loaded from: classes13.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RadioButton f22970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup f22971e;

    public b(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup, android.widget.RadioButton radioButton) {
        this.f22971e = multiLineRadioGroup;
        this.f22970d = radioButton;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.RadioButton radioButton = this.f22970d;
        radioButton.setChecked(true);
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup = this.f22971e;
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.a(multiLineRadioGroup, radioButton);
        multiLineRadioGroup.getClass();
        yj0.a.i(true, this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
