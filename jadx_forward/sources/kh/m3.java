package kh;

/* loaded from: classes12.dex */
public final class m3 extends kh.o3 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f389401c;

    /* renamed from: d, reason: collision with root package name */
    public final kh.i3 f389402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.String pattern, kh.i3 i3Var) {
        super(i3Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        this.f389401c = pattern;
        this.f389402d = i3Var;
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        kh.i3 i3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (!r26.i0.y(name, this.f389401c, false) || (i3Var = this.f389402d) == null) {
            return null;
        }
        return i3Var.a(this, name);
    }

    public /* synthetic */ m3(java.lang.String str, kh.i3 i3Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? kh.h3.f389357a : i3Var);
    }
}
