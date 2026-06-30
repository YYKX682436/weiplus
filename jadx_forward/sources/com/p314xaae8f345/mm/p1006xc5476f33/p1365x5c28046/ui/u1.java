package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f179740e;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f179739d = activityC13304x9b00dd62;
        this.f179740e = c22699x3dcdb352;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f179739d;
        activityC13304x9b00dd62.a7().m54737x3c1d5425(!activityC13304x9b00dd62.a7().f178986e);
        this.f179740e.m82040x7541828(activityC13304x9b00dd62.a7().f178986e ? activityC13304x9b00dd62.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq) : -1);
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupButtons$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
