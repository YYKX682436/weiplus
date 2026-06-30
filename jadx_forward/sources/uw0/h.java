package uw0;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.o f513096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.a f513097e;

    public h(uw0.o oVar, uw0.a aVar) {
        this.f513096d = oVar;
        this.f513097e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 z76;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddContentDescPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uw0.o oVar = this.f513096d;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = oVar.f513122y;
        if (c4181x2248e1a3 != null && (z76 = oVar.z7(c4181x2248e1a3)) != null) {
            oVar.R7();
            oVar.M7(z76);
            oVar.G7(this.f513097e, z76);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddContentDescPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
