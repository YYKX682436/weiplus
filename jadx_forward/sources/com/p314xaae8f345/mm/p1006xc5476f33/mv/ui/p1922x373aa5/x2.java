package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233520d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233520d = c16693xf5eb90b6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f233520d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class)).S6();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
