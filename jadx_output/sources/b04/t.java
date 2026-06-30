package b04;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.z f16935d;

    public t(b04.z zVar) {
        this.f16935d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$initNewFriendViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        b04.z zVar = this.f16935d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MyQRCodeUIC", "click bar isBarVisible=%b prev=%d", java.lang.Boolean.valueOf(zVar.f16960t), java.lang.Integer.valueOf(zVar.f16964x));
        gm0.j1.u().c().w(143618, 0);
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigAddFriendVerifyRecordToCloud()) == 1) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(zVar.getActivity(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
        } else {
            j45.l.j(zVar.getActivity(), "subapp", ".ui.friend.FMessageConversationUI", new android.content.Intent(), null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/MyQRCodeUIC$initNewFriendViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
