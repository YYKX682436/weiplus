package r;

/* loaded from: classes16.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 f449489d;

    public n(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569) {
        this.f449489d = c11205xa3c55569;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SendMsgCard$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeBtn clicked, onCloseClick=");
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = this.f449489d;
        sb6.append(c11205xa3c55569.f153788s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SendMsgCard", sb6.toString());
        yz5.a aVar = c11205xa3c55569.f153788s;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SendMsgCard$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
