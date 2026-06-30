package c4;

/* loaded from: classes15.dex */
public class q extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f38333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c4.s sVar, java.lang.Object obj, c4.a0 a0Var) {
        super(obj);
        this.f38333e = a0Var;
    }

    @Override // c4.z
    public void a() {
        this.f38333e.f38262a.detach();
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem> list = (java.util.List) obj;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            for (android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f38333e.a(arrayList);
    }
}
