package vx3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vx3.d f522803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f522804b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f522805c;

    public c(vx3.d soundType, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soundType, "soundType");
        this.f522803a = soundType;
        this.f522804b = i17;
        this.f522805c = z17;
    }

    /* renamed from: equals */
    public boolean m172886xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx3.c)) {
            return false;
        }
        vx3.c cVar = (vx3.c) obj;
        return this.f522803a == cVar.f522803a && this.f522804b == cVar.f522804b && this.f522805c == cVar.f522805c;
    }

    /* renamed from: hashCode */
    public int m172887x8cdac1b() {
        return (((this.f522803a.hashCode() * 31) + java.lang.Integer.hashCode(this.f522804b)) * 31) + java.lang.Boolean.hashCode(this.f522805c);
    }

    /* renamed from: toString */
    public java.lang.String m172888x9616526c() {
        return "RingtonePlayInfo(soundType=" + this.f522803a + ", streamType=" + this.f522804b + ", isLoop=" + this.f522805c + ')';
    }
}
