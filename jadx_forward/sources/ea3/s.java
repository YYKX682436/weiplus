package ea3;

/* loaded from: classes10.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332207d;

    public s(ea3.p pVar) {
        this.f332207d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea3.p pVar = this.f332207d;
        if (!z2.h.b(pVar.f332183f, pVar.f332181d) || (android.os.Build.VERSION.SDK_INT >= 34 && pVar.getContext().getApplicationInfo().targetSdkVersion >= 34)) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = pVar.getContext();
            ((sb0.f) jVar).getClass();
            j35.u.g(context);
        } else {
            pVar.f332186i = pVar.d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
