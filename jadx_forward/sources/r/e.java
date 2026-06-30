package r;

/* loaded from: classes16.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c f449483d;

    public e(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c c11200x558f7a4c) {
        this.f449483d = c11200x558f7a4c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/LoadingCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maskView clicked, onCloseClick=");
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c c11200x558f7a4c = this.f449483d;
        sb6.append(c11200x558f7a4c.X1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.LoadingCard", sb6.toString());
        yz5.a aVar = c11200x558f7a4c.X1;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/LoadingCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
