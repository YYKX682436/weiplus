package zy4;

/* loaded from: classes.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc f559214d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2443x6bc77ff.ui.ActivityC19512xacf356cc activityC19512xacf356cc) {
        this.f559214d = activityC19512xacf356cc;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_d));
        intent.putExtra("rawUrl", this.f559214d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_9, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), java.lang.Integer.valueOf(o45.wf.f424562g)));
        intent.putExtra("showShare", false);
        j45.l.j(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
