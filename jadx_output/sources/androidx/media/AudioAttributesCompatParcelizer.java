package androidx.media;

/* loaded from: classes13.dex */
public class AudioAttributesCompatParcelizer {
    public static androidx.media.AudioAttributesCompat read(w4.c cVar) {
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat();
        w4.e eVar = audioAttributesCompat.f11694a;
        if (cVar.e(1)) {
            eVar = cVar.h();
        }
        audioAttributesCompat.f11694a = (androidx.media.AudioAttributesImpl) eVar;
        return audioAttributesCompat;
    }

    public static void write(androidx.media.AudioAttributesCompat audioAttributesCompat, w4.c cVar) {
        cVar.getClass();
        androidx.media.AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f11694a;
        cVar.i(1);
        cVar.l(audioAttributesImpl);
    }
}
