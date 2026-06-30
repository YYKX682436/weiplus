package kl2;

/* loaded from: classes3.dex */
public final class m extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f390323d;

    public m(kl2.n nVar) {
        this.f390323d = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        df2.ox oxVar;
        pk2.o9 o9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        kl2.n nVar = this.f390323d;
        nVar.a();
        il2.r rVar = (il2.r) nVar.f390324h;
        r45.f82 f82Var = ((mm2.v5) rVar.P0(mm2.v5.class)).f411019i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRestrictConsumePlugin", "showConsumeManagerWidget restrictConsumeDialogData: " + f82Var);
        if (f82Var != null && (oxVar = (df2.ox) rVar.U0(df2.ox.class)) != null && (o9Var = oxVar.f312549q) != null) {
            pk2.ta.a(o9Var, false, null, 3, null);
        }
        il2.s.f373619a.a(zl2.e5.f555275i, nVar.f390330q);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#576B95"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
