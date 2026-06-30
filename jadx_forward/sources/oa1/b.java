package oa1;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f425339d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        this.f425339d = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteGameCapsuleWidget", "this is home button click");
        mi1.v vVar = this.f425339d.f156354z;
        if (vVar != null) {
            mi1.i iVar = vVar.f408237c;
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("capsuleBarView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12761x677a1998 m147348x52294648 = iVar.m147348x52294648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m147348x52294648, "getCapsuleHomeButton(...)");
            m147348x52294648.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
