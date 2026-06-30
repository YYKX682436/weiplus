package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class xd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f287776d;

    public xd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f287776d = activityC21642xe60a98f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(this.f287776d.f279872u, view.getContext(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.xd$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.xd.this.f287776d;
                if (activityC21642xe60a98f.f279872u != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.U6(activityC21642xe60a98f, activityC21642xe60a98f.mo55332x76847179(), activityC21642xe60a98f.f279860f.toString());
                }
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
