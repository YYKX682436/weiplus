package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f98063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f98064e;

    public i4(com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.a aVar) {
        this.f98063d = z2Var;
        this.f98064e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmotionRecommendPrivacyPolicyDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f98063d.B();
        this.f98064e.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmotionRecommendPrivacyPolicyDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
