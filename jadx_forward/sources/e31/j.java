package e31;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f328608a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f328609b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f328610c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f328611d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f328612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f328613f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f328614g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f328615h;

    /* renamed from: i, reason: collision with root package name */
    public int f328616i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f328617j = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f328618k;

    public j(boolean z17, boolean z18) {
        this.f328608a = z17;
        this.f328609b = z18;
    }

    /* renamed from: equals */
    public boolean m126845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e31.j)) {
            return false;
        }
        e31.j jVar = (e31.j) obj;
        return this.f328608a == jVar.f328608a && this.f328609b == jVar.f328609b;
    }

    /* renamed from: hashCode */
    public int m126846x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f328608a) * 31) + java.lang.Boolean.hashCode(this.f328609b);
    }

    /* renamed from: toString */
    public java.lang.String m126847x9616526c() {
        return "SubscribeStatusResult(isSubscribed=" + this.f328608a + ", isSwitchOpened=" + this.f328609b + ')';
    }
}
