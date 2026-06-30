package nh5;

/* loaded from: classes3.dex */
public class e0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22442xfd39a897 f418672d;

    public e0(com.p314xaae8f345.mm.ui.p2715xbf8d97c1.C22442xfd39a897 c22442xfd39a897, android.widget.ImageView imageView) {
        this.f418672d = c22442xfd39a897;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f418672d.getClass();
        yj0.a.i(true, this, "com/tencent/mm/ui/matrix/MatrixSettingHeaderPreference$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
