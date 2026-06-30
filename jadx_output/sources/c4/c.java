package c4;

/* loaded from: classes14.dex */
public class c extends c4.b {
    @Override // c4.b, c4.a
    public c4.a a(int i17) {
        this.f38263a.setUsage(i17);
        return this;
    }

    @Override // c4.b
    /* renamed from: b */
    public c4.b a(int i17) {
        this.f38263a.setUsage(i17);
        return this;
    }

    @Override // c4.b, c4.a
    public androidx.media.AudioAttributesImpl build() {
        return new androidx.media.AudioAttributesImplApi26(this.f38263a.build());
    }
}
