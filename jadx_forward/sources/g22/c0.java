package g22;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b f349332d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b) {
        this.f349332d = activityC13364x933d260b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b.f179966v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b = this.f349332d;
        activityC13364x933d260b.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC13364x933d260b, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ViewOnClickListenerC13307xada0aded.class);
        intent.putExtra("from_store", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC13364x933d260b, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC13364x933d260b.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC13364x933d260b, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI", "enterMine", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        Di.a(44);
        Di.q("stickernavright");
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeUI$initTitleBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
