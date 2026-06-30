package u4;

/* loaded from: classes13.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f506080a;

    /* renamed from: b, reason: collision with root package name */
    public final float f506081b;

    /* renamed from: c, reason: collision with root package name */
    public final float f506082c;

    /* renamed from: d, reason: collision with root package name */
    public final float f506083d;

    /* renamed from: e, reason: collision with root package name */
    public final float f506084e;

    /* renamed from: f, reason: collision with root package name */
    public final float f506085f;

    /* renamed from: g, reason: collision with root package name */
    public final float f506086g;

    /* renamed from: h, reason: collision with root package name */
    public final float f506087h;

    public t(android.view.View view) {
        this.f506080a = view.getTranslationX();
        this.f506081b = view.getTranslationY();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        this.f506082c = n3.a1.l(view);
        this.f506083d = view.getScaleX();
        this.f506084e = view.getScaleY();
        this.f506085f = view.getRotationX();
        this.f506086g = view.getRotationY();
        this.f506087h = view.getRotation();
    }

    /* renamed from: equals */
    public boolean m167519xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof u4.t)) {
            return false;
        }
        u4.t tVar = (u4.t) obj;
        return tVar.f506080a == this.f506080a && tVar.f506081b == this.f506081b && tVar.f506082c == this.f506082c && tVar.f506083d == this.f506083d && tVar.f506084e == this.f506084e && tVar.f506085f == this.f506085f && tVar.f506086g == this.f506086g && tVar.f506087h == this.f506087h;
    }

    /* renamed from: hashCode */
    public int m167520x8cdac1b() {
        float f17 = this.f506080a;
        int floatToIntBits = (f17 != 0.0f ? java.lang.Float.floatToIntBits(f17) : 0) * 31;
        float f18 = this.f506081b;
        int floatToIntBits2 = (floatToIntBits + (f18 != 0.0f ? java.lang.Float.floatToIntBits(f18) : 0)) * 31;
        float f19 = this.f506082c;
        int floatToIntBits3 = (floatToIntBits2 + (f19 != 0.0f ? java.lang.Float.floatToIntBits(f19) : 0)) * 31;
        float f27 = this.f506083d;
        int floatToIntBits4 = (floatToIntBits3 + (f27 != 0.0f ? java.lang.Float.floatToIntBits(f27) : 0)) * 31;
        float f28 = this.f506084e;
        int floatToIntBits5 = (floatToIntBits4 + (f28 != 0.0f ? java.lang.Float.floatToIntBits(f28) : 0)) * 31;
        float f29 = this.f506085f;
        int floatToIntBits6 = (floatToIntBits5 + (f29 != 0.0f ? java.lang.Float.floatToIntBits(f29) : 0)) * 31;
        float f37 = this.f506086g;
        int floatToIntBits7 = (floatToIntBits6 + (f37 != 0.0f ? java.lang.Float.floatToIntBits(f37) : 0)) * 31;
        float f38 = this.f506087h;
        return floatToIntBits7 + (f38 != 0.0f ? java.lang.Float.floatToIntBits(f38) : 0);
    }
}
