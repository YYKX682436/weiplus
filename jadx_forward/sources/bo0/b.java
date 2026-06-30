package bo0;

/* loaded from: classes13.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RadioButton f104503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 f104504e;

    public b(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1, android.widget.RadioButton radioButton) {
        this.f104504e = c10839x2f31b3d1;
        this.f104503d = radioButton;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.RadioButton radioButton = this.f104503d;
        radioButton.setChecked(true);
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1 c10839x2f31b3d1 = this.f104504e;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.C10839x2f31b3d1.a(c10839x2f31b3d1, radioButton);
        c10839x2f31b3d1.getClass();
        yj0.a.i(true, this, "com/tencent/mm/live/core/core/trtc/widget/MultiLineRadioGroup$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
