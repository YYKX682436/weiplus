package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class i2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f292010a;

    public i2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f292010a = activityC22499xed564269;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = this.f292010a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            int i18 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269.f291530t;
            java.lang.String stringExtra = activityC22499xed564269.getIntent().getStringExtra("CropImage_ImgPath");
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(stringExtra, activityC22499xed564269, null);
            return;
        }
        int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269.f291530t;
        java.lang.String stringExtra2 = activityC22499xed564269.getIntent().getStringExtra("CropImage_ImgPath");
        int intExtra = activityC22499xed564269.getIntent().getIntExtra("CropImage_CompressType", 0);
        int intExtra2 = activityC22499xed564269.getIntent().getIntExtra("CropImage_Msg_Id", -1);
        android.content.Intent intent = new android.content.Intent(activityC22499xed564269, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        intent.putExtra("Retr_File_Name", stringExtra2);
        intent.putExtra("Retr_Msg_Id", intExtra2);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_Compress_Type", intExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC22499xed564269, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC22499xed564269.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC22499xed564269, "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
