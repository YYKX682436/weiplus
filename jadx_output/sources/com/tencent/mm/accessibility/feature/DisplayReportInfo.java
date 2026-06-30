package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lcom/tencent/mm/accessibility/feature/DisplayReportInfo;", "Le14/k;", "", "displayId", "I", "getDisplayId", "()I", "setDisplayId", "(I)V", "", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "displayOwnerPackage", "getDisplayOwnerPackage", "setDisplayOwnerPackage", "displayEventType", "getDisplayEventType", "setDisplayEventType", "", "startTimeMs", "J", "getStartTimeMs", "()J", "setStartTimeMs", "(J)V", "duration", "getDuration", "setDuration", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class DisplayReportInfo extends e14.k {
    int __offset = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "displayId"), com.tencent.mm.protobuf.i.u(-1, "displayName"), com.tencent.mm.protobuf.i.u(-1, "displayOwnerPackage"), com.tencent.mm.protobuf.i.i(-1, "displayEventType"), com.tencent.mm.protobuf.i.n(-1, "startTimeMs"), com.tencent.mm.protobuf.i.n(-1, "duration")});
    private int displayEventType;
    private int displayId;
    private java.lang.String displayName;
    private java.lang.String displayOwnerPackage;
    private long duration;
    private long startTimeMs;

    public DisplayReportInfo() {
        super.set__serialName("DisplayReportInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(this.__offset, new java.lang.Object[]{java.lang.Integer.valueOf(this.displayId), this.displayName, this.displayOwnerPackage, java.lang.Integer.valueOf(this.displayEventType), java.lang.Long.valueOf(this.startTimeMs), java.lang.Long.valueOf(this.duration)});
    }

    public int getDisplayEventType() {
        return super.getInteger(this.__offset + 3);
    }

    public int getDisplayId() {
        return super.getInteger(this.__offset + 0);
    }

    public java.lang.String getDisplayName() {
        return super.getString(this.__offset + 1);
    }

    public java.lang.String getDisplayOwnerPackage() {
        return super.getString(this.__offset + 2);
    }

    public long getDuration() {
        return super.getLong(this.__offset + 5);
    }

    public long getStartTimeMs() {
        return super.getLong(this.__offset + 4);
    }

    public void setDisplayEventType(int i17) {
        super.set(this.__offset + 3, java.lang.Integer.valueOf(i17));
    }

    public void setDisplayId(int i17) {
        super.set(this.__offset + 0, java.lang.Integer.valueOf(i17));
    }

    public void setDisplayName(java.lang.String str) {
        super.set(this.__offset + 1, str);
    }

    public void setDisplayOwnerPackage(java.lang.String str) {
        super.set(this.__offset + 2, str);
    }

    public void setDuration(long j17) {
        super.set(this.__offset + 5, java.lang.Long.valueOf(j17));
    }

    public void setStartTimeMs(long j17) {
        super.set(this.__offset + 4, java.lang.Long.valueOf(j17));
    }
}
