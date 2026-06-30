package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f289561d;

    public r(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8) {
        this.f289561d = activityC22359x66709fa8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = this.f289561d;
        z17 = activityC22359x66709fa8.f39543x88e85d54;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(activityC22359x66709fa8.f39558x36f01005);
        activityC22359x66709fa8.finish();
        yj0.a.h(this, "com/tencent/mm/ui/conversation/BaseConversationUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
