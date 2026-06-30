package sp2;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f492650d;

    public o(sp2.p pVar) {
        this.f492650d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sp2.p pVar = this.f492650d;
        yz5.a aVar = pVar.f492706e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) pVar.f492707f).mo141623x754a37bb()).h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveChatCreateAccountBottomSheet$createContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
