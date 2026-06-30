package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class fl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18076xb3f22a41 f249882d;

    public fl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18076xb3f22a41 activityC18076xb3f22a41) {
        this.f249882d = activityC18076xb3f22a41;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18076xb3f22a41 activityC18076xb3f22a41 = this.f249882d;
        intent.setClass(activityC18076xb3f22a41, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd.class);
        intent.putExtra("KSnsPostManu", true);
        intent.putExtra("KTouchCameraTime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        intent.putExtra("sns_comment_type", 1);
        intent.putExtra("Ksnsupload_type", 9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18076xb3f22a41 activityC18076xb3f22a412 = this.f249882d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18076xb3f22a412, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18076xb3f22a412.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18076xb3f22a412, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18076xb3f22a41.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsLongMsgUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsLongMsgUI$1");
    }
}
