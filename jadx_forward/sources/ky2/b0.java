package ky2;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f395044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f395045b;

    public b0(java.lang.String choiceName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choiceName, "choiceName");
        this.f395044a = choiceName;
        this.f395045b = i17;
    }

    /* renamed from: equals */
    public boolean m144610xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.b0)) {
            return false;
        }
        ky2.b0 b0Var = (ky2.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395044a, b0Var.f395044a) && this.f395045b == b0Var.f395045b;
    }

    /* renamed from: hashCode */
    public int m144611x8cdac1b() {
        return (this.f395044a.hashCode() * 31) + java.lang.Integer.hashCode(this.f395045b);
    }

    /* renamed from: toString */
    public java.lang.String m144612x9616526c() {
        return "VoteChoiceItem(choiceName=" + this.f395044a + ", choiceCount=" + this.f395045b + ')';
    }
}
