package b11;

/* loaded from: classes9.dex */
public final class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f17036d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "msgId"), com.tencent.mm.protobuf.i.u(-1, "talker"), com.tencent.mm.protobuf.i.u(-1, "groupId"), com.tencent.mm.protobuf.i.u(-1, "groupItemUniqueId"), com.tencent.mm.protobuf.i.n(-1, "createTime"), com.tencent.mm.protobuf.i.c(-1, "isSender")});
        this.f17036d = appendAttrs;
        super.set__serialName("mediaInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, null, null, null, 0L, java.lang.Boolean.FALSE});
    }

    public final long getCreateTime() {
        return super.getLong(this.f17036d + 4);
    }

    public final java.lang.String getGroupId() {
        return super.getString(this.f17036d + 2);
    }

    public final java.lang.String getTalker() {
        return super.getString(this.f17036d + 1);
    }

    public final java.lang.String j() {
        return super.getString(this.f17036d + 3);
    }

    public final long k() {
        return super.getLong(this.f17036d + 0);
    }

    public final boolean l() {
        return super.getBoolean(this.f17036d + 5);
    }

    public final void n(long j17) {
        super.set(this.f17036d + 4, java.lang.Long.valueOf(j17));
    }

    public final void o(java.lang.String str) {
        super.set(this.f17036d + 2, str);
    }

    public final void p(java.lang.String str) {
        super.set(this.f17036d + 3, str);
    }

    public final void q(long j17) {
        super.set(this.f17036d + 0, java.lang.Long.valueOf(j17));
    }

    public final void r(boolean z17) {
        super.set(this.f17036d + 5, java.lang.Boolean.valueOf(z17));
    }

    public final void s(java.lang.String str) {
        super.set(this.f17036d + 1, str);
    }
}
