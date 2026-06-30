package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public class va implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 f289735e;

    public va(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22383x63d1b835 activityC22383x63d1b835, java.lang.String str) {
        this.f289735e = activityC22383x63d1b835;
        this.f289734d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Search_Scene", 2);
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f289735e.mo55332x76847179();
        ((s50.g0) vVar).getClass();
        o13.n.q(mo55332x76847179, ".ui.FTSServiceNotifyUI", intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 6, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, this.f289734d);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/ServiceNotifyConversationUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
