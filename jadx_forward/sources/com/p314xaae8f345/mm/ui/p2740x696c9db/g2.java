package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f291969d;

    public g2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f291969d = activityC22499xed564269;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269.f291530t;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = this.f291969d;
        long longExtra = activityC22499xed564269.getIntent().getLongExtra("CropImage_Msg_Id", 0L);
        long longExtra2 = activityC22499xed564269.getIntent().getLongExtra("CropImage_Msg_Svr_Id", 0L);
        java.lang.String stringExtra = activityC22499xed564269.getIntent().getStringExtra("CropImage_Username");
        android.content.Intent intent = new android.content.Intent(activityC22499xed564269, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21633xf1b658b7.class);
        intent.putExtra("img_msg_id", longExtra);
        intent.putExtra("img_server_id", longExtra2);
        intent.putExtra("img_download_compress_type", 1);
        intent.putExtra("img_download_username", stringExtra);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC22499xed564269, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22499xed564269.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC22499xed564269, "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
