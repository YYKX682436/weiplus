package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes13.dex */
public abstract class t {
    public static float a(android.media.Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(android.media.Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(android.media.Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(android.media.Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(android.media.Rating rating) {
        return rating.isRated();
    }

    public static boolean f(android.media.Rating rating) {
        return rating.isThumbUp();
    }

    public static android.media.Rating g(boolean z17) {
        return android.media.Rating.newHeartRating(z17);
    }

    public static android.media.Rating h(float f17) {
        return android.media.Rating.newPercentageRating(f17);
    }

    public static android.media.Rating i(int i17, float f17) {
        return android.media.Rating.newStarRating(i17, f17);
    }

    public static android.media.Rating j(boolean z17) {
        return android.media.Rating.newThumbRating(z17);
    }

    public static android.media.Rating k(int i17) {
        return android.media.Rating.newUnratedRating(i17);
    }
}
