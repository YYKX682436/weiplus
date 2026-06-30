package df2;

/* loaded from: classes3.dex */
public final class tk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f312986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f312987f;

    public tk(df2.pl plVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f312985d = plVar;
        this.f312986e = c0Var;
        this.f312987f = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$delCustomText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f312985d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(plVar.f312620m, "[delCustomText] ok click");
        this.f312986e.f391645d = true;
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(k0Var, null, null, new df2.sk(plVar, null), 3, null);
        }
        this.f312987f.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$delCustomText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
