package gx0;

/* loaded from: classes5.dex */
public final class v7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eu0.q f358597e;

    public v7(gx0.w8 w8Var, eu0.q qVar) {
        this.f358596d = w8Var;
        this.f358597e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$setupReeditBubbleIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.w8 w8Var = this.f358596d;
        w8Var.getClass();
        i95.m c17 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj("post_modify_effect", "view_clk", w8Var.x7(), 1, false);
        w8Var.getClass();
        java.lang.String jSONObject = this.f358597e.b().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "openReeditLiteApp: query: ".concat(jSONObject));
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.app.Activity m80379x76847179 = w8Var.m80379x76847179();
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = "wxalite94c410838e79a4cecb3dcd66bc6054a3";
        d0Var.f442183b = "pages/home/entry";
        d0Var.f442190i = 0;
        d0Var.f442184c = jSONObject;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).lk(m80379x76847179, d0Var, new gx0.g7(w8Var));
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$setupReeditBubbleIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
