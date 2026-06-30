package so5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte f492318a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f492319b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f492320c;

    /* renamed from: d, reason: collision with root package name */
    public final byte f492321d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f492322e;

    /* renamed from: f, reason: collision with root package name */
    public final byte f492323f;

    /* renamed from: g, reason: collision with root package name */
    public final int f492324g;

    public a(byte b17, byte b18, byte b19, byte b27, byte b28, byte b29, int i17) {
        this.f492318a = b17;
        this.f492319b = b18;
        this.f492320c = b19;
        this.f492321d = b27;
        this.f492322e = b28;
        this.f492323f = b29;
        this.f492324g = i17;
    }

    /* renamed from: equals */
    public boolean m164996xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.a)) {
            return false;
        }
        so5.a aVar = (so5.a) obj;
        return this.f492318a == aVar.f492318a && this.f492319b == aVar.f492319b && this.f492320c == aVar.f492320c && this.f492321d == aVar.f492321d && this.f492322e == aVar.f492322e && this.f492323f == aVar.f492323f && this.f492324g == aVar.f492324g;
    }

    /* renamed from: hashCode */
    public int m164997x8cdac1b() {
        return (((((((((((java.lang.Byte.hashCode(this.f492318a) * 31) + java.lang.Byte.hashCode(this.f492319b)) * 31) + java.lang.Byte.hashCode(this.f492320c)) * 31) + java.lang.Byte.hashCode(this.f492321d)) * 31) + java.lang.Byte.hashCode(this.f492322e)) * 31) + java.lang.Byte.hashCode(this.f492323f)) * 31) + java.lang.Integer.hashCode(this.f492324g);
    }

    /* renamed from: toString */
    public java.lang.String m164998x9616526c() {
        return "CodecConfig(codecIdx=" + ((int) this.f492318a) + ", sizeIdx=" + ((int) this.f492319b) + ", fps=" + ((int) this.f492320c) + ", iPeriod=" + ((int) this.f492321d) + ", interval=" + ((int) this.f492322e) + ", rsLevel=" + ((int) this.f492323f) + ", bitrate=" + this.f492324g + ')';
    }
}
