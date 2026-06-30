package c4;

/* loaded from: classes15.dex */
public class j extends c4.z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.os.ResultReceiver f38311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat, java.lang.Object obj, android.support.v4.os.ResultReceiver resultReceiver) {
        super(obj);
        this.f38311e = resultReceiver;
    }

    @Override // c4.z
    public void c(java.lang.Object obj) {
        android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (android.support.v4.media.MediaBrowserCompat$MediaItem) obj;
        int i17 = this.f38352d & 2;
        android.support.v4.os.ResultReceiver resultReceiver = this.f38311e;
        if (i17 != 0) {
            resultReceiver.b(-1, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
        resultReceiver.b(0, bundle);
    }
}
