package hd2;

/* loaded from: classes.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cr6 f362014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362015e;

    public i0(r45.cr6 cr6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3) {
        this.f362014d = cr6Var;
        this.f362015e = c14135xb71edba3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$needCompleteAccountUi$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.cr6 cr6Var = this.f362014d;
        if (cr6Var == null || (str = cr6Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.n(this.f362015e.mo7430x19263085(), "webview", ".ui.tools.WebViewUI", intent, 31121);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$needCompleteAccountUi$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
