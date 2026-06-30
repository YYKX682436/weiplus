package cb5;

/* loaded from: classes5.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cb5.c f40350d;

    public b(cb5.c cVar) {
        this.f40350d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitoredBanner", "hy: user required close the banner");
        cb5.c cVar = this.f40350d;
        cb5.e.l(cVar.f40352e.f40353d, 2);
        c01.d9.b().m().c(e01.c.Main);
        c01.d9.b().m().c(e01.c.Chatting);
        cVar.f40352e.f40353d.k(8);
        yj0.a.h(this, "com/tencent/mm/ui/banner/ChattingMonitoredBanner$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
