package os3;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c f429616d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c) {
        this.f429616d = activityC16930x4222da3c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = this.f429616d;
        if (activityC16930x4222da3c.f236356t) {
            android.content.Intent intent = new android.content.Intent(activityC16930x4222da3c.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16932x23233efa.class);
            intent.putExtra("mail_id", activityC16930x4222da3c.f236358v);
            intent.putExtra("attach_id", activityC16930x4222da3c.f236359w);
            intent.putExtra("attach_size", activityC16930x4222da3c.f236361y);
            intent.putExtra("attach_name", activityC16930x4222da3c.f236357u);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16930x4222da3c.mo55332x76847179();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo55332x76847179, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String[] strArr = {"mailid=" + activityC16930x4222da3c.f236358v, "attachid=" + activityC16930x4222da3c.f236359w, "texttype=html"};
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("uri", "/cgi-bin/viewdocument");
            intent2.putExtra("params", strArr);
            intent2.putExtra("baseurl", ks3.k0.c());
            intent2.putExtra(ya.b.f77491x8758c4e1, "get");
            intent2.putExtra("singleColumn", com.p314xaae8f345.mm.sdk.p2603x2137b148.g1.a(activityC16930x4222da3c.f236357u));
            intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC16930x4222da3c.f236357u);
            intent2.setClass(activityC16930x4222da3c, com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC16930x4222da3c, arrayList3.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16930x4222da3c.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC16930x4222da3c, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
