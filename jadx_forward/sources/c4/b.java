package c4;

/* loaded from: classes14.dex */
public class b implements c4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioAttributes.Builder f119796a = new android.media.AudioAttributes.Builder();

    @Override // c4.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c4.b a(int i17) {
        if (i17 == 16) {
            i17 = 12;
        }
        this.f119796a.setUsage(i17);
        return this;
    }

    @Override // c4.a
    /* renamed from: build */
    public p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d mo14107x59bc66e() {
        return new p012xc85e97e9.p096x62f6fe4.C1128x431106c(this.f119796a.build(), -1);
    }
}
