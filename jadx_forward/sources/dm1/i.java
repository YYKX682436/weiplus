package dm1;

/* loaded from: classes14.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323171d;

    public i(dm1.m mVar) {
        this.f323171d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dm1.m window = this.f323171d;
        dm1.a aVar = window.f323190l;
        if (aVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "click reject button");
            cm1.t tVar = cm1.t.f124849a;
            java.lang.String roomId = ((cm1.g) aVar).f124830b.f124816b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomId, "roomId");
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            r45.ze7 ze7Var = new r45.ze7();
            ze7Var.f473496e = 4;
            ze7Var.f473495d = roomId;
            lVar.f152197a = ze7Var;
            lVar.f152198b = new r45.af7();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaruntime/updatenativevoiproomstatus";
            lVar.f152200d = 5036;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), bm1.a.f103275d, true);
            tVar.c();
            tVar.d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/wmpfvoip/notify/ui/WMPFVoipCallInPopupWindow$show$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
