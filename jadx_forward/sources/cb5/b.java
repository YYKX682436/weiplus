package cb5;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cb5.c f121883d;

    public b(cb5.c cVar) {
        this.f121883d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: user required close the banner");
        cb5.c cVar = this.f121883d;
        cb5.e.l(cVar.f121885e.f121886d, 2);
        c01.d9.b().m().c(e01.c.Main);
        c01.d9.b().m().c(e01.c.Chatting);
        cVar.f121885e.f121886d.k(8);
        yj0.a.h(this, "com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
