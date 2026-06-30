package e11;

/* loaded from: classes15.dex */
public class e implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final long f327914d;

    /* renamed from: e, reason: collision with root package name */
    public final long f327915e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327916f;

    /* renamed from: g, reason: collision with root package name */
    public final long f327917g;

    public e(long j17, long j18, int i17, long j19) {
        this.f327914d = 0L;
        this.f327915e = 0L;
        this.f327916f = 0;
        this.f327914d = j17;
        this.f327915e = j18;
        this.f327916f = i17;
        this.f327917g = j19;
    }

    /* renamed from: toString */
    public java.lang.String m126701x9616526c() {
        return java.lang.String.format("serverTime:%s,time:%s,type:%s,recvTime:%s", e11.b.c(this.f327914d), e11.b.c(this.f327915e), java.lang.Integer.valueOf(this.f327916f), java.lang.Long.valueOf(this.f327917g));
    }
}
