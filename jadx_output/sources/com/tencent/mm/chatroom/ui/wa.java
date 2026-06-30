package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class wa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI f64623d;

    public wa(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        this.f64623d = seeAccessVerifyInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = this.f64623d;
        seeAccessVerifyInfoUI.E = db5.e1.Q(seeAccessVerifyInfoUI.getContext(), seeAccessVerifyInfoUI.getString(com.tencent.mm.R.string.f490573yv), seeAccessVerifyInfoUI.getString(com.tencent.mm.R.string.f489806c8), true, false, null);
        if (com.tencent.mm.storage.z3.q4(seeAccessVerifyInfoUI.f63922u)) {
            ab0.y yVar = (ab0.y) i95.n0.c(ab0.y.class);
            java.lang.String str = seeAccessVerifyInfoUI.f63916o;
            java.lang.String str2 = seeAccessVerifyInfoUI.f63922u;
            java.lang.String str3 = seeAccessVerifyInfoUI.f63924w;
            java.util.LinkedList linkedList = new java.util.LinkedList(com.tencent.mm.sdk.platformtools.t8.O1(seeAccessVerifyInfoUI.f63911g, ","));
            ((za0.i) yVar).getClass();
            o41.a aVar = new o41.a(str, str2, str3, linkedList);
            aVar.f70649i = true;
            aVar.l().f(seeAccessVerifyInfoUI).h(new com.tencent.mm.chatroom.ui.ua(this));
        } else {
            kn.d dVar = new kn.d(seeAccessVerifyInfoUI.f63921t, seeAccessVerifyInfoUI.f63916o, seeAccessVerifyInfoUI.f63922u, seeAccessVerifyInfoUI.f63924w, new java.util.LinkedList(com.tencent.mm.sdk.platformtools.t8.P1(seeAccessVerifyInfoUI.f63911g.split(","))));
            dVar.f70649i = true;
            dVar.l().f(seeAccessVerifyInfoUI).h(new com.tencent.mm.chatroom.ui.va(this));
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
