package mm2;

/* loaded from: classes3.dex */
public final class a7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f410283a;

    /* renamed from: b, reason: collision with root package name */
    public final qs5.s f410284b;

    public a7(boolean z17, qs5.s fromScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        this.f410283a = z17;
        this.f410284b = fromScene;
    }

    /* renamed from: equals */
    public boolean m147903xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.a7)) {
            return false;
        }
        mm2.a7 a7Var = (mm2.a7) obj;
        return this.f410283a == a7Var.f410283a && this.f410284b == a7Var.f410284b;
    }

    /* renamed from: hashCode */
    public int m147904x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f410283a) * 31) + this.f410284b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147905x9616526c() {
        return "WishPanelClickData(open=" + this.f410283a + ", fromScene=" + this.f410284b + ')';
    }

    public /* synthetic */ a7(boolean z17, qs5.s sVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i17 & 2) != 0 ? qs5.s.f447997d : sVar);
    }
}
