package c4;

/* loaded from: classes15.dex */
public class k extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f38316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat, java.lang.Object obj, android.support.v4.os.ResultReceiver resultReceiver) {
        super(obj);
        this.f38316e = resultReceiver;
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        int i17 = this.f38352d & 4;
        android.support.v4.os.ResultReceiver resultReceiver = this.f38316e;
        if (i17 != 0 || list == null) {
            resultReceiver.b(-1, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArray("search_results", (android.os.Parcelable[]) list.toArray(new android.support.v4.media.MediaBrowserCompat$MediaItem[0]));
        resultReceiver.b(0, bundle);
    }
}
