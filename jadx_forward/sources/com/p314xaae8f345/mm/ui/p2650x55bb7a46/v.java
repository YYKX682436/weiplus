package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes3.dex */
public class v implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f284292d;

    public v(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6) {
        this.f284292d = activityC21601xaeea84d6;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f284292d;
        if (activityC21601xaeea84d6.S1 == null) {
            activityC21601xaeea84d6.S1 = new rl5.r(activityC21601xaeea84d6.mo55332x76847179());
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d62 = this.f284292d;
        activityC21601xaeea84d62.S1.h(view, activityC21601xaeea84d62, activityC21601xaeea84d62.V1, activityC21601xaeea84d62.T1, activityC21601xaeea84d62.U1);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
