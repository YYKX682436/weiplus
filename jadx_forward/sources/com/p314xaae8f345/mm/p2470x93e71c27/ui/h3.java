package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 f272396d;

    public h3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193) {
        this.f272396d = c19652xe1933193;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = this.f272396d;
        if (c19652xe1933193.getVisibility() == 8) {
            c19652xe1933193.setVisibility(0);
        }
        if (c19652xe1933193.f271376p.getVisibility() == 0) {
            c19652xe1933193.j();
        }
        if (c19652xe1933193.f271375o.getVisibility() == 0) {
            c19652xe1933193.i();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
