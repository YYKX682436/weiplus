package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class rd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f f284183d;

    public rd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f) {
        this.f284183d = activityC21642xe60a98f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f activityC21642xe60a98f = this.f284183d;
        wl5.x xVar = activityC21642xe60a98f.f279863i;
        if (xVar != null) {
            if (!xVar.M || !xVar.N) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.X6(activityC21642xe60a98f);
            } else {
                if (activityC21642xe60a98f.B) {
                    activityC21642xe60a98f.B = false;
                    yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                activityC21642xe60a98f.finish();
            }
        } else {
            if (activityC21642xe60a98f.B) {
                activityC21642xe60a98f.B = false;
                yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            activityC21642xe60a98f.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
