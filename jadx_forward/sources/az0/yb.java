package az0;

/* loaded from: classes5.dex */
public final class yb {

    /* renamed from: a, reason: collision with root package name */
    public boolean f97623a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 f97624b;

    public yb(boolean z17, com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        c4119x51ad3274 = (i17 & 2) != 0 ? null : c4119x51ad3274;
        this.f97623a = z17;
        this.f97624b = c4119x51ad3274;
    }

    /* renamed from: equals */
    public boolean m9389xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az0.yb)) {
            return false;
        }
        az0.yb ybVar = (az0.yb) obj;
        return this.f97623a == ybVar.f97623a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f97624b, ybVar.f97624b);
    }

    /* renamed from: hashCode */
    public int m9390x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f97623a) * 31;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4119x51ad3274 c4119x51ad3274 = this.f97624b;
        return hashCode + (c4119x51ad3274 == null ? 0 : c4119x51ad3274.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m9391x9616526c() {
        return "TemplateBuildResultWrapper(isCompleteSuccess=" + this.f97623a + ", mjBuildResult=" + this.f97624b + ')';
    }
}
