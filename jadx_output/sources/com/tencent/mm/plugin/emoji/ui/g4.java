package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.n3 f98040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f98041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f98042f;

    public g4(com.tencent.mm.storage.n3 n3Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.a aVar) {
        this.f98040d = n3Var;
        this.f98041e = z2Var;
        this.f98042f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f98040d.x(com.tencent.mm.storage.u3.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.storage.z4.f196391j.h(true);
        this.f98041e.B();
        this.f98042f.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
