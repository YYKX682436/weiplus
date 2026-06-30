package androidx.media;

/* loaded from: classes16.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static androidx.media.AudioAttributesImplApi26 read(w4.c cVar) {
        androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26 = new androidx.media.AudioAttributesImplApi26();
        audioAttributesImplApi26.f11695a = (android.media.AudioAttributes) cVar.g(audioAttributesImplApi26.f11695a, 1);
        audioAttributesImplApi26.f11696b = cVar.f(audioAttributesImplApi26.f11696b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(androidx.media.AudioAttributesImplApi26 audioAttributesImplApi26, w4.c cVar) {
        cVar.getClass();
        cVar.k(audioAttributesImplApi26.f11695a, 1);
        cVar.j(audioAttributesImplApi26.f11696b, 2);
    }
}
