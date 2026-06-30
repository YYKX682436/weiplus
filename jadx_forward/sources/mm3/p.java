package mm3;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm3.w f411201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.b f411202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.q f411203f;

    public p(mm3.w wVar, fm3.b bVar, mm3.q qVar) {
        this.f411201d = wVar;
        this.f411202e = bVar;
        this.f411203f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm3.w wVar = this.f411201d;
        wVar.E(false);
        fm3.b bVar = this.f411202e;
        wVar.f411214r = bVar != null ? bVar.f345561a : null;
        mm3.q qVar = this.f411203f;
        qVar.m8151xc67946d3(0, qVar.mo1894x7e414b06());
        wVar.f411212p.mo149xb9724478(bVar, java.lang.Boolean.FALSE);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFlexTransitionEditDialog$EffectsAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
