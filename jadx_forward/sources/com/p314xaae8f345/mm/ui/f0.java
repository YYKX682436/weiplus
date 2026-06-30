package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f f289939a;

    public f0(com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f) {
        this.f289939a = activityC21341x70473b8f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f = this.f289939a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "[onChanged] size:%s", java.lang.Integer.valueOf(activityC21341x70473b8f.f278105g.mo1894x7e414b06()));
        if (activityC21341x70473b8f.f278105g.mo1894x7e414b06() == 0) {
            android.view.View view = activityC21341x70473b8f.f278104f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC21341x70473b8f.f278102d.setVisibility(8);
            return;
        }
        android.view.View view2 = activityC21341x70473b8f.f278104f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/AllRemindMsgUI$1", "onChanged", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC21341x70473b8f.f278102d.setVisibility(0);
    }
}
