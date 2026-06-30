package zt3;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f557120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f557121b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f557122c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f557123d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f557124e;

    public c(int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19) {
        this.f557120a = i17;
        this.f557121b = z17;
        this.f557122c = bundle;
        this.f557123d = z18;
        this.f557124e = z19;
    }

    /* renamed from: equals */
    public boolean m179454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt3.c)) {
            return false;
        }
        zt3.c cVar = (zt3.c) obj;
        return this.f557120a == cVar.f557120a && this.f557121b == cVar.f557121b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557122c, cVar.f557122c) && this.f557123d == cVar.f557123d && this.f557124e == cVar.f557124e;
    }

    /* renamed from: hashCode */
    public int m179455x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f557120a) * 31) + java.lang.Boolean.hashCode(this.f557121b)) * 31;
        android.os.Bundle bundle = this.f557122c;
        return ((((hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f557123d)) * 31) + java.lang.Boolean.hashCode(this.f557124e);
    }

    /* renamed from: toString */
    public java.lang.String m179456x9616526c() {
        return "MenuInfo(type=" + this.f557120a + ", selected=" + this.f557121b + ", extra=" + this.f557122c + ", isCanSelect=" + this.f557123d + ", isSelectStateChange=" + this.f557124e + ')';
    }

    public /* synthetic */ c(int i17, boolean z17, android.os.Bundle bundle, boolean z18, boolean z19, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? null : bundle, (i18 & 8) != 0 ? true : z18, (i18 & 16) != 0 ? true : z19);
    }
}
