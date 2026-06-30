package ea3;

/* loaded from: classes10.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332208d;

    public t(ea3.p pVar) {
        this.f332208d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ea3.p pVar = this.f332208d;
        pVar.a(pVar.B);
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
