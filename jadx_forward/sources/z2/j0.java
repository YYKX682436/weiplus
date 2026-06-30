package z2;

/* loaded from: classes13.dex */
public abstract class j0 {
    public static android.media.AudioAttributes a(android.media.AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static android.media.AudioAttributes.Builder b() {
        return new android.media.AudioAttributes.Builder();
    }

    public static android.media.AudioAttributes.Builder c(android.media.AudioAttributes.Builder builder, int i17) {
        return builder.setContentType(i17);
    }

    public static android.media.AudioAttributes.Builder d(android.media.AudioAttributes.Builder builder, int i17) {
        return builder.setLegacyStreamType(i17);
    }

    public static android.media.AudioAttributes.Builder e(android.media.AudioAttributes.Builder builder, int i17) {
        return builder.setUsage(i17);
    }
}
