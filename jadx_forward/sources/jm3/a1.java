package jm3;

/* loaded from: classes10.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 f381828d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62) {
        this.f381828d = activityC16654xdc9bdf62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62 = this.f381828d;
        r45.ss4 ss4Var = activityC16654xdc9bdf62.f232416e;
        if ((ss4Var == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0)) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) == null || m76971x25b90ced.m75939xb282bd08(6) != 1) ? false : true) {
            activityC16654xdc9bdf62.getClass();
            android.content.Intent intent = new android.content.Intent(activityC16654xdc9bdf62, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532.class);
            r45.ss4 ss4Var2 = activityC16654xdc9bdf62.f232416e;
            intent.putExtra("key_track_data", ss4Var2 != null ? ss4Var2.mo14344x5f01b1f6() : null);
            intent.putExtra("key_seek_to_start", true);
            intent.putExtra("key_mv_from_scene", 2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16654xdc9bdf62, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFlexPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16654xdc9bdf62.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16654xdc9bdf62, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFlexPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            activityC16654xdc9bdf62.getClass();
            android.content.Intent intent2 = new android.content.Intent(activityC16654xdc9bdf62, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16652x736766a6.class);
            r45.ss4 ss4Var3 = activityC16654xdc9bdf62.f232416e;
            intent2.putExtra("key_track_data", ss4Var3 != null ? ss4Var3.mo14344x5f01b1f6() : null);
            intent2.putExtra("key_seek_to_start", true);
            pm0.v.g(intent2, activityC16654xdc9bdf62.getIntent(), "key_mv_from_scene", 0);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC16654xdc9bdf62, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFixPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16654xdc9bdf62.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC16654xdc9bdf62, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI", "enterFixPreviewUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
