package c4;

/* loaded from: classes15.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.service.media.MediaBrowserService.Result f38262a;

    public a0(android.service.media.MediaBrowserService.Result result) {
        this.f38262a = result;
    }

    public void a(java.lang.Object obj) {
        boolean z17 = obj instanceof java.util.List;
        java.util.ArrayList arrayList = null;
        android.service.media.MediaBrowserService.Result result = this.f38262a;
        if (!z17) {
            if (!(obj instanceof android.os.Parcel)) {
                result.sendResult(null);
                return;
            }
            android.os.Parcel parcel = (android.os.Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        java.util.List<android.os.Parcel> list = (java.util.List) obj;
        if (list != null) {
            arrayList = new java.util.ArrayList(list.size());
            for (android.os.Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((android.media.browse.MediaBrowser.MediaItem) android.media.browse.MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }
}
