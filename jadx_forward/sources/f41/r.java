package f41;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 f341043d;

    public r(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094) {
        this.f341043d = c11202x49ad0094;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SelectContactCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeBtn clicked, onCloseClick=");
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094 = this.f341043d;
        sb6.append(c11202x49ad0094.f153775o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SelectContactCard", sb6.toString());
        yz5.a aVar = c11202x49ad0094.f153775o;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SelectContactCard$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
