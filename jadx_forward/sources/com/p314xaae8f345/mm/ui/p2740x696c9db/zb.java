package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class zb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292481d;

    public zb(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292481d = activityC22543x95896a72;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShowVideoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292481d;
        if (activityC22543x95896a72.f291769x != null) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(activityC22543x95896a72, activityC22543x95896a72.f291769x, 2, 2, 4, new java.util.HashMap());
        }
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ri(activityC22543x95896a72, activityC22543x95896a72.f291769x, 2, "pic_video_close");
        activityC22543x95896a72.Z6();
        yj0.a.h(this, "com/tencent/mm/ui/tools/ShowVideoUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
