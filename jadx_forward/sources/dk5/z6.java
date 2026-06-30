package dk5;

/* loaded from: classes.dex */
public class z6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af f316556d;

    public z6(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af activityC22574x21ac54af) {
        this.f316556d = activityC22574x21ac54af;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af.f292571m;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af activityC22574x21ac54af = this.f316556d;
        activityC22574x21ac54af.getClass();
        android.content.Intent intent = new android.content.Intent(activityC22574x21ac54af, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.class);
        intent.putExtra("key_image_path", activityC22574x21ac54af.f292572d);
        intent.putExtra("show_menu", false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC22574x21ac54af, arrayList2.toArray(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22574x21ac54af.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC22574x21ac54af, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
