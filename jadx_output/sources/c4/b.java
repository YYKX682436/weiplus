package c4;

/* loaded from: classes14.dex */
public class b implements c4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioAttributes.Builder f38263a = new android.media.AudioAttributes.Builder();

    @Override // c4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c4.b a(int i17) {
        if (i17 == 16) {
            i17 = 12;
        }
        this.f38263a.setUsage(i17);
        return this;
    }

    @Override // c4.a
    public androidx.media.AudioAttributesImpl build() {
        return new androidx.media.AudioAttributesImplApi21(this.f38263a.build(), -1);
    }
}
