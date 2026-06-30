package mx0;

/* loaded from: classes5.dex */
public final class g8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f413540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p910x4941b224.C10990x39b653c9 f413541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413542f;

    public g8(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p910x4941b224.C10990x39b653c9 c10990x39b653c9, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        this.f413540d = c0Var;
        this.f413541e = c10990x39b653c9;
        this.f413542f = c10977x8e40eced;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f413540d.f391645d = true;
        this.f413541e.setEnabled(false);
        xx0.n nVar = this.f413542f.K1;
        if (nVar != null) {
            nVar.b();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingPluginLayout$openMoreTemplatePanel$fakeView$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
