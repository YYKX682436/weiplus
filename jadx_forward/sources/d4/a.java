package d4;

/* loaded from: classes13.dex */
public abstract class a {
    public static android.app.Notification.MediaStyle a() {
        return new android.app.Notification.MediaStyle();
    }

    public static android.app.Notification.MediaStyle b(android.app.Notification.MediaStyle mediaStyle, int[] iArr, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989) {
        if (iArr != null) {
            e(mediaStyle, iArr);
        }
        if (c0047xab30f989 != null) {
            c(mediaStyle, (android.media.session.MediaSession.Token) c0047xab30f989.f90477e);
        }
        return mediaStyle;
    }

    public static void c(android.app.Notification.MediaStyle mediaStyle, android.media.session.MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static void d(android.app.Notification.Builder builder, android.app.Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void e(android.app.Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
