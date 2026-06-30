package wx0;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.f f531991d;

    public c(wx0.f fVar) {
        this.f531991d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wx0.f fVar = this.f531991d;
        if (!fVar.f532015o || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.f532014n, fVar.f532013m)) {
            wx0.d.a(wx0.f.f532009p, false, null, 2, null);
        } else {
            fVar.f532014n = fVar.f532013m;
            fVar.b();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BackgroundPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
