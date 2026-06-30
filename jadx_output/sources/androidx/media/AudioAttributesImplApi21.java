package androidx.media;

/* loaded from: classes14.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioAttributes f11695a;

    /* renamed from: b, reason: collision with root package name */
    public int f11696b;

    public AudioAttributesImplApi21() {
        this.f11696b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i17 = this.f11696b;
        return i17 != -1 ? i17 : androidx.media.AudioAttributesCompat.c(false, this.f11695a.getFlags(), this.f11695a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public java.lang.Object b() {
        return this.f11695a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media.AudioAttributesImplApi21) {
            return this.f11695a.equals(((androidx.media.AudioAttributesImplApi21) obj).f11695a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11695a.hashCode();
    }

    public java.lang.String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f11695a;
    }

    public AudioAttributesImplApi21(android.media.AudioAttributes audioAttributes, int i17) {
        this.f11695a = audioAttributes;
        this.f11696b = i17;
    }
}
