package aw1;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f14483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14485c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14486d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14487e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14488f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14489g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sight.base.ABAPrams f14490h;

    public a(int i17, int i18, int i19, int i27, float f17, int i28, boolean z17, com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams) {
        this.f14483a = i17;
        this.f14484b = i18;
        this.f14485c = i19;
        this.f14486d = i27;
        this.f14487e = f17;
        this.f14488f = i28;
        this.f14489g = z17;
        this.f14490h = aBAPrams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1.a)) {
            return false;
        }
        aw1.a aVar = (aw1.a) obj;
        return this.f14483a == aVar.f14483a && this.f14484b == aVar.f14484b && this.f14485c == aVar.f14485c && this.f14486d == aVar.f14486d && java.lang.Float.compare(this.f14487e, aVar.f14487e) == 0 && this.f14488f == aVar.f14488f && this.f14489g == aVar.f14489g && kotlin.jvm.internal.o.b(this.f14490h, aVar.f14490h);
    }

    public int hashCode() {
        int hashCode = ((((((((((((java.lang.Integer.hashCode(this.f14483a) * 31) + java.lang.Integer.hashCode(this.f14484b)) * 31) + java.lang.Integer.hashCode(this.f14485c)) * 31) + java.lang.Integer.hashCode(this.f14486d)) * 31) + java.lang.Float.hashCode(this.f14487e)) * 31) + java.lang.Integer.hashCode(this.f14488f)) * 31) + java.lang.Boolean.hashCode(this.f14489g)) * 31;
        com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = this.f14490h;
        return hashCode + (aBAPrams == null ? 0 : aBAPrams.hashCode());
    }

    public java.lang.String toString() {
        return "ABAResult(errCode=" + this.f14483a + ", width=" + this.f14484b + ", height=" + this.f14485c + ", bitrate=" + this.f14486d + ", crf=" + this.f14487e + ", vbvbuffersize=" + this.f14488f + ", skipCompress=" + this.f14489g + ", abaParams=" + this.f14490h + ')';
    }
}
