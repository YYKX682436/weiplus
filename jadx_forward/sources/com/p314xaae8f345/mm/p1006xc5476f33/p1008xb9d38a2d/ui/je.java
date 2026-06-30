package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class je implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 f155493d;

    public je(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648) {
        this.f155493d = activityC11459xde004648;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648 activityC11459xde004648 = this.f155493d;
        activityC11459xde004648.mo48674x36654fab();
        android.content.Intent intent = new android.content.Intent(activityC11459xde004648, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648.class);
        intent.putExtra("RegScene", activityC11459xde004648.f155089o);
        intent.putExtra("RegTicket", activityC11459xde004648.f155090p);
        intent.putExtra("sessionID", activityC11459xde004648.f155091q);
        intent.putExtra("NickName", activityC11459xde004648.f155092r);
        intent.putExtra("AvatarFileID", activityC11459xde004648.f155093s);
        intent.putExtra("AvatarAESKey", activityC11459xde004648.f155094t);
        intent.putExtra("STEP_ONE", false);
        activityC11459xde004648.startActivityForResult(intent, 702);
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
