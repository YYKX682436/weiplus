package p05;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f432148a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432149b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432150c;

    public m0(int i17, java.lang.String giftImgPath, java.lang.String luaResPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftImgPath, "giftImgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(luaResPath, "luaResPath");
        this.f432148a = i17;
        this.f432149b = giftImgPath;
        this.f432150c = luaResPath;
    }

    /* renamed from: equals */
    public boolean m157574xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.m0)) {
            return false;
        }
        p05.m0 m0Var = (p05.m0) obj;
        return this.f432148a == m0Var.f432148a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432149b, m0Var.f432149b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432150c, m0Var.f432150c);
    }

    /* renamed from: hashCode */
    public int m157575x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f432148a) * 31) + this.f432149b.hashCode()) * 31) + this.f432150c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157576x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cnt = ");
        sb6.append(this.f432148a);
        sb6.append(", giftImgPath = ");
        sb6.append(this.f432149b);
        sb6.append(", giftImgExist = ");
        java.lang.String str = this.f432150c;
        sb6.append(com.p314xaae8f345.mm.vfs.w6.j(str));
        sb6.append(", luaResPath = ");
        sb6.append(str);
        sb6.append(", luaFileExist = ");
        sb6.append(com.p314xaae8f345.mm.vfs.w6.j(str));
        return sb6.toString();
    }
}
