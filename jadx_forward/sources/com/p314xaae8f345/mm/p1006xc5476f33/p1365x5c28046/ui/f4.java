package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.n3 f179508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f179509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f179510f;

    public f4(com.p314xaae8f345.mm.p2621x8fb0427b.n3 n3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, yz5.a aVar) {
        this.f179508d = n3Var;
        this.f179509e = z2Var;
        this.f179510f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f179508d.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f179509e.B();
        this.f179510f.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
