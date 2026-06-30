package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219798d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        this.f219798d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = this.f219798d.f219866y;
        a0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSActionBarAISearchViewModel", "handleSettingOptionClick");
        android.content.Context context = a0Var.f219775a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((i23.e) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(i23.e.class)).f369612d.f().i();
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
