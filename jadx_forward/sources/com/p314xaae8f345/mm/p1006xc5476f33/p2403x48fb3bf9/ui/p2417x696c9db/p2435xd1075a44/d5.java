package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 f268689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ck f268690e;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var, r45.ck ckVar) {
        this.f268689d = l5Var;
        this.f268690e = ckVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var = this.f268689d;
        l5Var.f268917f.s(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = l5Var.f268917f;
        l5Var.getClass();
        r45.ck info = this.f268690e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String str = info.f453138i;
        r45.r60 r60Var = info.f453143q;
        if (r60Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r60Var.f466102d)) {
            int size = info.f453143q.f466102d.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                if (((r45.q60) info.f453143q.f466102d.get(size)).f465242o == 0) {
                    str = ((r45.q60) info.f453143q.f466102d.get(size)).f465234d;
                    break;
                }
                size--;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        z5Var.w(str, info.f453134e, true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
