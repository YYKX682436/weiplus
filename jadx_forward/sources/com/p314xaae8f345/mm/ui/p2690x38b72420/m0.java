package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes4.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2 f288554d;

    public m0(com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2 c22291x3eba42e2) {
        this.f288554d = c22291x3eba42e2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2 c22291x3eba42e2 = this.f288554d;
        long j17 = c22291x3eba42e2.f287869f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c22291x3eba42e2.f287869f = android.os.SystemClock.elapsedRealtime();
        if (c22291x3eba42e2.c()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6936x5d31fefc c6936x5d31fefc = mf4.d.f407696d;
            c6936x5d31fefc.f142467t = c6936x5d31fefc.b("SessionId", c22291x3eba42e2.f287870g, true);
            mf4.d.f407696d.f142452e = 6L;
            android.content.Context context = c22291x3eba42e2.getContext();
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(new java.util.ArrayList());
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93.f253395h;
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93.class);
                intent.putExtra("user_list", arrayList2);
                intent.putExtra("delete_when_first_empty", false);
                intent.putExtra("gallery_session_id", (java.lang.String) null);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/story/api/LaunchStory", "startStoryBrowse", "(Landroid/content/Context;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LaunchStory", e17, "startStoryBrowse failed", new java.lang.Object[0]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/CategoryTipView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
