package bn0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: field_CreateTime */
    private long f4260x81959a6e;

    /* renamed from: field_ExpiredTime */
    private long f4261xc9a553ad;

    /* renamed from: field_ForcePushId */
    private java.lang.String f4262xaeadb4bb;

    /* renamed from: field_Status */
    private int f4263xda05eaf7;

    /* renamed from: field_Type */
    private int f4264x2253a77f;

    public b(java.lang.String field_ForcePushId, long j17, long j18, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(field_ForcePushId, "field_ForcePushId");
        this.f4262xaeadb4bb = field_ForcePushId;
        this.f4260x81959a6e = j17;
        this.f4261xc9a553ad = j18;
        this.f4263xda05eaf7 = i17;
        this.f4264x2253a77f = i18;
    }

    public final java.lang.String a() {
        return this.f4262xaeadb4bb + ';' + this.f4260x81959a6e + ';' + this.f4261xc9a553ad + ';' + this.f4263xda05eaf7 + ';' + this.f4264x2253a77f;
    }

    public final void b(java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        int i17 = 0;
        for (java.lang.Object obj : r26.n0.f0(content, new java.lang.String[]{";"}, false, 0, 6, null)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            if (i17 == 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                this.f4262xaeadb4bb = str;
            } else if (i17 == 1) {
                this.f4260x81959a6e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str);
            } else if (i17 == 2) {
                this.f4261xc9a553ad = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str);
            } else if (i17 == 3) {
                this.f4263xda05eaf7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
            } else if (i17 == 4) {
                this.f4264x2253a77f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
            }
            i17 = i18;
        }
    }

    public final boolean c() {
        return this.f4263xda05eaf7 == 1;
    }

    public final boolean d() {
        return java.lang.System.currentTimeMillis() >= this.f4261xc9a553ad;
    }

    /* renamed from: equals */
    public boolean m10854xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0.b)) {
            return false;
        }
        bn0.b bVar = (bn0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f4262xaeadb4bb, bVar.f4262xaeadb4bb) && this.f4260x81959a6e == bVar.f4260x81959a6e && this.f4261xc9a553ad == bVar.f4261xc9a553ad && this.f4263xda05eaf7 == bVar.f4263xda05eaf7 && this.f4264x2253a77f == bVar.f4264x2253a77f;
    }

    /* renamed from: hashCode */
    public int m10855x8cdac1b() {
        return (((((((this.f4262xaeadb4bb.hashCode() * 31) + java.lang.Long.hashCode(this.f4260x81959a6e)) * 31) + java.lang.Long.hashCode(this.f4261xc9a553ad)) * 31) + java.lang.Integer.hashCode(this.f4263xda05eaf7)) * 31) + java.lang.Integer.hashCode(this.f4264x2253a77f);
    }

    /* renamed from: toString */
    public java.lang.String m10856x9616526c() {
        return "LightPushForceNotifyData(field_ForcePushId=" + this.f4262xaeadb4bb + ", field_CreateTime=" + this.f4260x81959a6e + ", field_ExpiredTime=" + this.f4261xc9a553ad + ", field_Status=" + this.f4263xda05eaf7 + ", field_Type=" + this.f4264x2253a77f + ')';
    }
}
