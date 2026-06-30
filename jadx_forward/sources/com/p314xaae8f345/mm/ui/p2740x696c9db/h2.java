package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f291984d;

    public h2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f291984d = activityC22499xed564269;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = this.f291984d;
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269.T6(activityC22499xed564269)) {
            if (activityC22499xed564269.f291540p || activityC22499xed564269.f291541q || !activityC22499xed564269.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
                if (1 == activityC22499xed564269.f291531d) {
                    activityC22499xed564269.f291533f.b(activityC22499xed564269.f291539o, activityC22499xed564269.f291538n);
                    activityC22499xed564269.f291534g.setVisibility(8);
                    activityC22499xed564269.f291533f.setVisibility(0);
                    android.widget.ImageView imageView = activityC22499xed564269.f291536i;
                    imageView.setTag(java.lang.Integer.valueOf(imageView.getVisibility()));
                    activityC22499xed564269.f291536i.setVisibility(8);
                    activityC22499xed564269.f291535h.setVisibility(8);
                    android.view.View findViewById = activityC22499xed564269.f291533f.findViewById(com.p314xaae8f345.mm.R.id.f565524cn3);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/tools/CropImageNewUI", "switchToCropFilterMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            if (activityC22499xed564269.f291533f.m81077xcae45837() == null) {
                activityC22499xed564269.f291533f.b(activityC22499xed564269.f291539o, activityC22499xed564269.f291538n);
            }
            activityC22499xed564269.f291534g.setVisibility(8);
            activityC22499xed564269.f291533f.setVisibility(0);
            android.widget.ImageView imageView2 = activityC22499xed564269.f291536i;
            imageView2.setTag(java.lang.Integer.valueOf(imageView2.getVisibility()));
            activityC22499xed564269.f291536i.setVisibility(8);
            activityC22499xed564269.f291535h.setVisibility(8);
            if (activityC22499xed564269.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("CropImage_Filter_Show", true)) {
                return;
            }
            android.view.View findViewById2 = activityC22499xed564269.f291533f.findViewById(com.p314xaae8f345.mm.R.id.f565524cn3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/tools/CropImageNewUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
