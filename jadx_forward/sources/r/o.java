package r;

/* loaded from: classes16.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 f449490d;

    public o(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569) {
        this.f449490d = c11205xa3c55569;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/open_voice_control/card/SendMsgCard$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("confirm send: ");
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = this.f449490d;
        sb6.append(c11205xa3c55569.f153790u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SendMsgCard", sb6.toString());
        w11.r1 b17 = w11.s1.b(c11205xa3c55569.n0(), null, 2, null);
        b17.f523663e = 1;
        b17.f523664f = 0;
        b17.e(c11205xa3c55569.f153790u);
        b17.g(c11205xa3c55569.n0());
        b17.f523666h = null;
        b17.f523673o = null;
        b17.f523667i = 5;
        boolean a17 = b17.a().a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SendMsgCard", "send result: success=" + a17);
        yz5.p pVar = c11205xa3c55569.f153789t;
        if (pVar != null) {
            pVar.mo149xb9724478(c11205xa3c55569.n0(), java.lang.Boolean.valueOf(a17));
        }
        yj0.a.h(this, "com/tencent/mm/open_voice_control/card/SendMsgCard$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
