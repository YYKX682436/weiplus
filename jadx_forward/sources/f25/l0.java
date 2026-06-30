package f25;

/* loaded from: classes2.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f340638b;

    public l0(java.lang.String requestScene, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestScene, "requestScene");
        this.f340637a = requestScene;
        this.f340638b = i17;
    }

    /* renamed from: equals */
    public boolean m128926xb2c87fbf(java.lang.Object obj) {
        f25.l0 l0Var = obj instanceof f25.l0 ? (f25.l0) obj : null;
        return l0Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var.f340637a, this.f340637a) && l0Var.f340638b == this.f340638b;
    }

    /* renamed from: hashCode */
    public int m128927x8cdac1b() {
        return this.f340637a.hashCode() + this.f340638b;
    }

    /* renamed from: toString */
    public java.lang.String m128928x9616526c() {
        return "IPluginAudioFocusManager.RequestScene(requestScene:" + this.f340637a + ",featureFlag:" + this.f340638b + ')';
    }
}
