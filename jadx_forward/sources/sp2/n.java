package sp2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f492635d;

    public n(sp2.p pVar) {
        this.f492635d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        sp2.p pVar = this.f492635d;
        zy2.zb.qd(zbVar, 18, pVar.f492704c, pVar.f492703b, null, 8, null);
        pVar.f492705d.mo152xb9724478();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) pVar.f492707f).mo141623x754a37bb()).h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
