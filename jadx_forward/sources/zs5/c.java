package zs5;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f556859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556860b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 f556861c;

    /* renamed from: d, reason: collision with root package name */
    public final at5.b f556862d;

    public c(long j17, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 sessionInfo, at5.b decodeCallBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeCallBack, "decodeCallBack");
        this.f556859a = j17;
        this.f556860b = i17;
        this.f556861c = sessionInfo;
        this.f556862d = decodeCallBack;
    }

    /* renamed from: equals */
    public boolean m179410xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs5.c)) {
            return false;
        }
        zs5.c cVar = (zs5.c) obj;
        return this.f556859a == cVar.f556859a && this.f556860b == cVar.f556860b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556861c, cVar.f556861c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556862d, cVar.f556862d);
    }

    /* renamed from: hashCode */
    public int m179411x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f556859a) * 31) + java.lang.Integer.hashCode(this.f556860b)) * 31) + this.f556861c.hashCode()) * 31) + this.f556862d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179412x9616526c() {
        return "SessionInfoWrapper(session=" + this.f556859a + ", tabType=" + this.f556860b + ", sessionInfo=" + this.f556861c + ", decodeCallBack=" + this.f556862d + ')';
    }
}
