package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f64591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f64592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI f64593f;

    public v4(com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI, java.lang.CharSequence charSequence, android.widget.TextView textView) {
        this.f64593f = modRemarkRoomNameUI;
        this.f64591d = charSequence;
        this.f64592e = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI modRemarkRoomNameUI = this.f64593f;
        modRemarkRoomNameUI.f63817d.setText(this.f64591d);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = modRemarkRoomNameUI.f63817d;
        mMClearEditText.setSelection(mMClearEditText.getText().length());
        this.f64592e.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ModRemarkRoomNameUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
