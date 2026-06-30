package qg1;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f444318a;

    /* renamed from: b, reason: collision with root package name */
    public int f444319b;

    /* renamed from: c, reason: collision with root package name */
    public int f444320c;

    /* renamed from: equals */
    public boolean m159988xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof qg1.o)) {
            return false;
        }
        qg1.o oVar = (qg1.o) obj;
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f444318a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f444318a) && this.f444318a.equals(oVar.f444318a) && this.f444319b == oVar.f444319b && this.f444320c == oVar.f444320c;
    }

    /* renamed from: hashCode */
    public int m159989x8cdac1b() {
        return this.f444318a.hashCode() + this.f444319b + this.f444320c;
    }
}
