package b04;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.z f98468d;

    public t(b04.z zVar) {
        this.f98468d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$initNewFriendViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b04.z zVar = this.f98468d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MyQRCodeUIC", "click bar isBarVisible=%b prev=%d", java.lang.Boolean.valueOf(zVar.f98493t), java.lang.Integer.valueOf(zVar.f98497x));
        gm0.j1.u().c().w(143618, 0);
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20239x152d18ed()) == 1) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(zVar.m158354x19263085(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            j45.l.j(zVar.m158354x19263085(), "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$initNewFriendViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
