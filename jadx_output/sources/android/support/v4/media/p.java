package android.support.v4.media;

/* loaded from: classes15.dex */
public abstract class p {
    public static android.net.Uri a(android.media.MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(android.media.MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setMediaUri(uri);
    }
}
