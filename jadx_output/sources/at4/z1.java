package at4;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f14038a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.model.Bankcard f14039b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.model.Bankcard f14040c;

    /* renamed from: d, reason: collision with root package name */
    public final at4.v1 f14041d;

    /* renamed from: e, reason: collision with root package name */
    public final ss4.e0 f14042e;

    /* renamed from: f, reason: collision with root package name */
    public final at4.a2 f14043f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14044g;

    public z1(java.util.ArrayList bankcardList, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2, at4.v1 userInfo, ss4.e0 e0Var, at4.a2 resultType, boolean z17) {
        kotlin.jvm.internal.o.g(bankcardList, "bankcardList");
        kotlin.jvm.internal.o.g(userInfo, "userInfo");
        kotlin.jvm.internal.o.g(resultType, "resultType");
        this.f14038a = bankcardList;
        this.f14039b = bankcard;
        this.f14040c = bankcard2;
        this.f14041d = userInfo;
        this.f14042e = e0Var;
        this.f14043f = resultType;
        this.f14044g = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.z1)) {
            return false;
        }
        at4.z1 z1Var = (at4.z1) obj;
        return kotlin.jvm.internal.o.b(this.f14038a, z1Var.f14038a) && kotlin.jvm.internal.o.b(this.f14039b, z1Var.f14039b) && kotlin.jvm.internal.o.b(this.f14040c, z1Var.f14040c) && kotlin.jvm.internal.o.b(this.f14041d, z1Var.f14041d) && kotlin.jvm.internal.o.b(this.f14042e, z1Var.f14042e) && this.f14043f == z1Var.f14043f && this.f14044g == z1Var.f14044g;
    }

    public int hashCode() {
        int hashCode = this.f14038a.hashCode() * 31;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f14039b;
        int hashCode2 = (hashCode + (bankcard == null ? 0 : bankcard.hashCode())) * 31;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = this.f14040c;
        int hashCode3 = (((hashCode2 + (bankcard2 == null ? 0 : bankcard2.hashCode())) * 31) + this.f14041d.hashCode()) * 31;
        ss4.e0 e0Var = this.f14042e;
        return ((((hashCode3 + (e0Var != null ? e0Var.hashCode() : 0)) * 31) + this.f14043f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f14044g);
    }

    public java.lang.String toString() {
        return "Result(bankcardList=" + this.f14038a + ", balance=" + this.f14039b + ", lqtInfo=" + this.f14040c + ", userInfo=" + this.f14041d + ", netScene=" + this.f14042e + ", resultType=" + this.f14043f + ", isOk=" + this.f14044g + ')';
    }
}
