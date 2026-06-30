package bb2;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final r45.oo f18926a;

    public o(r45.oo bulletCommentInfo) {
        kotlin.jvm.internal.o.g(bulletCommentInfo, "bulletCommentInfo");
        this.f18926a = bulletCommentInfo;
    }

    public final long a() {
        return this.f18926a.getLong(0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[id=");
        r45.oo ooVar = this.f18926a;
        sb6.append(pm0.v.u(ooVar.getLong(0)));
        sb6.append(", content=");
        sb6.append(ooVar.getString(2));
        sb6.append(", videoTimestamp=");
        sb6.append(ooVar.getLong(3));
        sb6.append(", identity=");
        sb6.append(ooVar.getInteger(6));
        sb6.append(']');
        return sb6.toString();
    }
}
