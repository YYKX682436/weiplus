package android.support.v4.media;

/* loaded from: classes15.dex */
class MediaBrowserCompat$SearchResultReceiver extends android.support.v4.os.ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public void a(int i17, android.os.Bundle bundle) {
        if (bundle != null) {
            android.support.v4.media.session.f0.a(bundle);
            try {
                bundle.isEmpty();
            } catch (android.os.BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i17 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
        for (android.os.Parcelable parcelable : parcelableArray) {
            arrayList.add((android.support.v4.media.MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
