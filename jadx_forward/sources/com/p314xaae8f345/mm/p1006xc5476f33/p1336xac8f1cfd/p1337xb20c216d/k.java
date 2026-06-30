package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd f178114d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd) {
        this.f178114d = activityC13154xb3ef6cfd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd = this.f178114d;
        java.lang.String c17 = hx1.b.c(activityC13154xb3ef6cfd.f178003s);
        new android.content.Intent().setAction("android.intent.action.VIEW");
        if (4 == activityC13154xb3ef6cfd.T6()) {
            activityC13154xb3ef6cfd.f178007w = false;
            activityC13154xb3ef6cfd.X6();
        } else {
            activityC13154xb3ef6cfd.getClass();
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(activityC13154xb3ef6cfd, c17, activityC13154xb3ef6cfd.f178003s.K, 5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/EditorFileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
