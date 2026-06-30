package androidx.media;

/* loaded from: classes13.dex */
public class AudioAttributesImplBaseParcelizer {
    public static androidx.media.AudioAttributesImplBase read(w4.c cVar) {
        androidx.media.AudioAttributesImplBase audioAttributesImplBase = new androidx.media.AudioAttributesImplBase();
        audioAttributesImplBase.f11697a = cVar.f(audioAttributesImplBase.f11697a, 1);
        audioAttributesImplBase.f11698b = cVar.f(audioAttributesImplBase.f11698b, 2);
        audioAttributesImplBase.f11699c = cVar.f(audioAttributesImplBase.f11699c, 3);
        audioAttributesImplBase.f11700d = cVar.f(audioAttributesImplBase.f11700d, 4);
        return audioAttributesImplBase;
    }

    public static void write(androidx.media.AudioAttributesImplBase audioAttributesImplBase, w4.c cVar) {
        cVar.getClass();
        cVar.j(audioAttributesImplBase.f11697a, 1);
        cVar.j(audioAttributesImplBase.f11698b, 2);
        cVar.j(audioAttributesImplBase.f11699c, 3);
        cVar.j(audioAttributesImplBase.f11700d, 4);
    }
}
