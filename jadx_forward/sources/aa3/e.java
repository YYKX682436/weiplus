package aa3;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84044a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.Animation f84045b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f84046c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84047d;

    public e(boolean z17, android.view.animation.Animation animation, yz5.a aVar, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        animation = (i17 & 2) != 0 ? null : animation;
        aVar = (i17 & 4) != 0 ? null : aVar;
        z18 = (i17 & 8) != 0 ? false : z18;
        this.f84044a = z17;
        this.f84045b = animation;
        this.f84046c = aVar;
        this.f84047d = z18;
    }

    /* renamed from: equals */
    public boolean m893xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa3.e)) {
            return false;
        }
        aa3.e eVar = (aa3.e) obj;
        return this.f84044a == eVar.f84044a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f84045b, eVar.f84045b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f84046c, eVar.f84046c) && this.f84047d == eVar.f84047d;
    }

    /* renamed from: hashCode */
    public int m894x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f84044a) * 31;
        android.view.animation.Animation animation = this.f84045b;
        int hashCode2 = (hashCode + (animation == null ? 0 : animation.hashCode())) * 31;
        yz5.a aVar = this.f84046c;
        return ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f84047d);
    }

    /* renamed from: toString */
    public java.lang.String m895x9616526c() {
        return "AnimationState(isAnimating=" + this.f84044a + ", currentAnimation=" + this.f84045b + ", pendingCallback=" + this.f84046c + ", isShowingAnimation=" + this.f84047d + ')';
    }
}
