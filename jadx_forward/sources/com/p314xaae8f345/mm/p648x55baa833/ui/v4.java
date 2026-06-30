package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f146124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f146125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc f146126f;

    public v4(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc, java.lang.CharSequence charSequence, android.widget.TextView textView) {
        this.f146126f = activityC10348x266bd9bc;
        this.f146124d = charSequence;
        this.f146125e = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10348x266bd9bc activityC10348x266bd9bc = this.f146126f;
        activityC10348x266bd9bc.f145350d.setText(this.f146124d);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = activityC10348x266bd9bc.f145350d;
        c21486x59d05a04.setSelection(c21486x59d05a04.getText().length());
        this.f146125e.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
