package bn0;

/* loaded from: classes8.dex */
public final class b {
    private long field_CreateTime;
    private long field_ExpiredTime;
    private java.lang.String field_ForcePushId;
    private int field_Status;
    private int field_Type;

    public b(java.lang.String field_ForcePushId, long j17, long j18, int i17, int i18) {
        kotlin.jvm.internal.o.g(field_ForcePushId, "field_ForcePushId");
        this.field_ForcePushId = field_ForcePushId;
        this.field_CreateTime = j17;
        this.field_ExpiredTime = j18;
        this.field_Status = i17;
        this.field_Type = i18;
    }

    public final java.lang.String a() {
        return this.field_ForcePushId + ';' + this.field_CreateTime + ';' + this.field_ExpiredTime + ';' + this.field_Status + ';' + this.field_Type;
    }

    public final void b(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        int i17 = 0;
        for (java.lang.Object obj : r26.n0.f0(content, new java.lang.String[]{";"}, false, 0, 6, null)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) obj;
            if (i17 == 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                this.field_ForcePushId = str;
            } else if (i17 == 1) {
                this.field_CreateTime = com.tencent.mm.sdk.platformtools.t8.E1(str);
            } else if (i17 == 2) {
                this.field_ExpiredTime = com.tencent.mm.sdk.platformtools.t8.E1(str);
            } else if (i17 == 3) {
                this.field_Status = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            } else if (i17 == 4) {
                this.field_Type = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
            }
            i17 = i18;
        }
    }

    public final boolean c() {
        return this.field_Status == 1;
    }

    public final boolean d() {
        return java.lang.System.currentTimeMillis() >= this.field_ExpiredTime;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0.b)) {
            return false;
        }
        bn0.b bVar = (bn0.b) obj;
        return kotlin.jvm.internal.o.b(this.field_ForcePushId, bVar.field_ForcePushId) && this.field_CreateTime == bVar.field_CreateTime && this.field_ExpiredTime == bVar.field_ExpiredTime && this.field_Status == bVar.field_Status && this.field_Type == bVar.field_Type;
    }

    public int hashCode() {
        return (((((((this.field_ForcePushId.hashCode() * 31) + java.lang.Long.hashCode(this.field_CreateTime)) * 31) + java.lang.Long.hashCode(this.field_ExpiredTime)) * 31) + java.lang.Integer.hashCode(this.field_Status)) * 31) + java.lang.Integer.hashCode(this.field_Type);
    }

    public java.lang.String toString() {
        return "LightPushForceNotifyData(field_ForcePushId=" + this.field_ForcePushId + ", field_CreateTime=" + this.field_CreateTime + ", field_ExpiredTime=" + this.field_ExpiredTime + ", field_Status=" + this.field_Status + ", field_Type=" + this.field_Type + ')';
    }
}
