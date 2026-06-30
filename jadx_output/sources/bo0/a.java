package bo0;

/* loaded from: classes13.dex */
public class a implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f22968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup f22969e;

    public a(com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup, android.view.View view) {
        this.f22969e = multiLineRadioGroup;
        this.f22968d = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.View view2 = this.f22968d;
        ((android.widget.RadioButton) view2).setChecked(true);
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup multiLineRadioGroup = this.f22969e;
        com.tencent.mm.live.core.core.trtc.widget.MultiLineRadioGroup.a(multiLineRadioGroup, (android.widget.RadioButton) view2);
        multiLineRadioGroup.getClass();
        yj0.a.i(true, this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
