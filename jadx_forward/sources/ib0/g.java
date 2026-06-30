package ib0;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.ActivityC10638xd29f3d8b f371567d;

    public g(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui.ActivityC10638xd29f3d8b activityC10638xd29f3d8b) {
        this.f371567d = activityC10638xd29f3d8b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/ui/OpenMsgUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f371567d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ((gb0.n) kVar).getClass();
        ib0.e eVar = ib0.e.f371562a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/5ovo5GKYRLqp7KJZ");
        j45.l.j(mo55332x76847179, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/ui/OpenMsgUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
