package w11;

/* loaded from: classes5.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f523516a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f523517b;

    /* renamed from: c, reason: collision with root package name */
    public long f523518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f523519d;

    public b1(boolean z17, boolean z18, long j17, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        j17 = (i17 & 4) != 0 ? -1L : j17;
        z19 = (i17 & 8) != 0 ? true : z19;
        this.f523516a = z17;
        this.f523517b = z18;
        this.f523518c = j17;
        this.f523519d = z19;
    }

    /* renamed from: equals */
    public boolean m173071xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w11.b1)) {
            return false;
        }
        w11.b1 b1Var = (w11.b1) obj;
        return this.f523516a == b1Var.f523516a && this.f523517b == b1Var.f523517b && this.f523518c == b1Var.f523518c && this.f523519d == b1Var.f523519d;
    }

    /* renamed from: hashCode */
    public int m173072x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f523516a) * 31) + java.lang.Boolean.hashCode(this.f523517b)) * 31) + java.lang.Long.hashCode(this.f523518c)) * 31) + java.lang.Boolean.hashCode(this.f523519d);
    }

    /* renamed from: toString */
    public java.lang.String m173073x9616526c() {
        return "MsgRevokeStatus(isSendingMsgCgi=" + this.f523516a + ", isRevokeBeforeSendingMsg=" + this.f523517b + ", revokeStartTime=" + this.f523518c + ", isRevokeAfterSend=" + this.f523519d + ')';
    }
}
