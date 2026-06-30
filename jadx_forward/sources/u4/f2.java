package u4;

/* loaded from: classes13.dex */
public class f2 implements u4.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowId f506010a;

    public f2(android.view.View view) {
        this.f506010a = view.getWindowId();
    }

    /* renamed from: equals */
    public boolean m167510xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof u4.f2) && ((u4.f2) obj).f506010a.equals(this.f506010a);
    }

    /* renamed from: hashCode */
    public int m167511x8cdac1b() {
        return this.f506010a.hashCode();
    }
}
