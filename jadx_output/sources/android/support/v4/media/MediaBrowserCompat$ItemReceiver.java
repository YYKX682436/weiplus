package android.support.v4.media;

/* loaded from: classes15.dex */
class MediaBrowserCompat$ItemReceiver extends android.support.v4.os.ResultReceiver {
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
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        android.os.Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof android.support.v4.media.MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
