package co1;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.u0 f43779a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.t0 f43780b;

    public h(bw5.u0 msgItem, bw5.t0 mediaInfo) {
        kotlin.jvm.internal.o.g(msgItem, "msgItem");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        this.f43779a = msgItem;
        this.f43780b = mediaInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.h)) {
            return false;
        }
        co1.h hVar = (co1.h) obj;
        return kotlin.jvm.internal.o.b(this.f43779a, hVar.f43779a) && kotlin.jvm.internal.o.b(this.f43780b, hVar.f43780b);
    }

    public int hashCode() {
        return (this.f43779a.hashCode() * 31) + this.f43780b.hashCode();
    }

    public java.lang.String toString() {
        return "RoamMediaMsgItem(msgItem=" + this.f43779a + ", mediaInfo=" + this.f43780b + ')';
    }
}
