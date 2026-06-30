package androidx.media;

/* loaded from: classes16.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static androidx.media.AudioAttributesImplApi21 read(w4.c cVar) {
        androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21 = new androidx.media.AudioAttributesImplApi21();
        audioAttributesImplApi21.f11695a = (android.media.AudioAttributes) cVar.g(audioAttributesImplApi21.f11695a, 1);
        audioAttributesImplApi21.f11696b = cVar.f(audioAttributesImplApi21.f11696b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(androidx.media.AudioAttributesImplApi21 audioAttributesImplApi21, w4.c cVar) {
        cVar.getClass();
        cVar.k(audioAttributesImplApi21.f11695a, 1);
        cVar.j(audioAttributesImplApi21.f11696b, 2);
    }
}
