package we5;

/* loaded from: classes5.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao f526886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526887e;

    public l0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, yb5.d dVar) {
        this.f526886d = aoVar;
        this.f526887e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextTo$filling$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar = this.f526886d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTextTo", "sourceTV click msgId:%s", aoVar.f284912b.getTag(com.p314xaae8f345.mm.R.id.bon));
        java.lang.Object tag = aoVar.f284912b.getTag(com.p314xaae8f345.mm.R.id.rfh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.String");
        java.lang.Object tag2 = aoVar.f284912b.getTag(com.p314xaae8f345.mm.R.id.bon);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) tag2).longValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.m(this.f526887e, (java.lang.String) tag, longValue, 1);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/asyncitem/ChattingItemText$ChattingItemTextTo$filling$9$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
