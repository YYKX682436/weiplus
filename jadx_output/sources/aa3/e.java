package aa3;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2511a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.Animation f2512b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f2513c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2514d;

    public e(boolean z17, android.view.animation.Animation animation, yz5.a aVar, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        animation = (i17 & 2) != 0 ? null : animation;
        aVar = (i17 & 4) != 0 ? null : aVar;
        z18 = (i17 & 8) != 0 ? false : z18;
        this.f2511a = z17;
        this.f2512b = animation;
        this.f2513c = aVar;
        this.f2514d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa3.e)) {
            return false;
        }
        aa3.e eVar = (aa3.e) obj;
        return this.f2511a == eVar.f2511a && kotlin.jvm.internal.o.b(this.f2512b, eVar.f2512b) && kotlin.jvm.internal.o.b(this.f2513c, eVar.f2513c) && this.f2514d == eVar.f2514d;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f2511a) * 31;
        android.view.animation.Animation animation = this.f2512b;
        int hashCode2 = (hashCode + (animation == null ? 0 : animation.hashCode())) * 31;
        yz5.a aVar = this.f2513c;
        return ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f2514d);
    }

    public java.lang.String toString() {
        return "AnimationState(isAnimating=" + this.f2511a + ", currentAnimation=" + this.f2512b + ", pendingCallback=" + this.f2513c + ", isShowingAnimation=" + this.f2514d + ')';
    }
}
