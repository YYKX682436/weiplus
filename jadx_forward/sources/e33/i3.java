package e33;

/* loaded from: classes10.dex */
public class i3 implements kk.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.l3 f328819a;

    public i3(e33.l3 l3Var) {
        this.f328819a = l3Var;
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled() || this.f328819a.f328858h.indexOfKey(bitmap.hashCode()) >= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageAdapter", "bitmap recycle %s", bitmap.toString());
        bitmap.recycle();
    }
}
