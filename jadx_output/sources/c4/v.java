package c4;

/* loaded from: classes15.dex */
public class v extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.a0 f38344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f38345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c4.x f38346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c4.x xVar, java.lang.Object obj, c4.a0 a0Var, android.os.Bundle bundle) {
        super(obj);
        this.f38346g = xVar;
        this.f38344e = a0Var;
        this.f38345f = bundle;
    }

    @Override // c4.z
    public void a() {
        this.f38344e.f38262a.detach();
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem> list = (java.util.List) obj;
        c4.a0 a0Var = this.f38344e;
        if (list == null) {
            a0Var.a(null);
            return;
        }
        if ((this.f38352d & 1) != 0) {
            list = this.f38346g.f38348f.a(list, this.f38345f);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        a0Var.a(arrayList);
    }
}
