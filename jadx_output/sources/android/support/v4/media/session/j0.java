package android.support.v4.media.session;

/* loaded from: classes15.dex */
public abstract class j0 {
    public static android.os.Bundle a(android.media.session.PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(android.media.session.PlaybackState.Builder builder, android.os.Bundle bundle) {
        builder.setExtras(bundle);
    }
}
