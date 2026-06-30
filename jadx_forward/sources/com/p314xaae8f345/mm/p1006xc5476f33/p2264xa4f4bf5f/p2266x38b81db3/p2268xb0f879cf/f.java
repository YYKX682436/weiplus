package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf;

/* loaded from: classes11.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i f254765d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar) {
        this.f254765d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.text.Editable text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2268xb0f879cf.i iVar = this.f254765d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = iVar.f254771i;
        if (c22621x7603e017 == null || (text = c22621x7603e017.getText()) == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ok: ");
        sb6.append(str);
        sb6.append(' ');
        java.lang.String iconId = iVar.f254772m;
        sb6.append(iconId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q7 q7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q7) iVar.f254767e;
        q7Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "onCustomStatusConfirm onItemClick() called with: iconId = " + iconId + ", customStatusWord = " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = q7Var.f255757a;
        activityC18635xb8188ef9.getClass();
        activityC18635xb8188ef9.f255074i = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.X6(q7Var.f255757a, iconId, false, false, 6, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.r7) iVar.f254768f).a("ACTION_EXIT");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
