package bb2;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final r45.oo f100459a;

    public o(r45.oo bulletCommentInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletCommentInfo, "bulletCommentInfo");
        this.f100459a = bulletCommentInfo;
    }

    public final long a() {
        return this.f100459a.m75942xfb822ef2(0);
    }

    /* renamed from: toString */
    public java.lang.String m10146x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[id=");
        r45.oo ooVar = this.f100459a;
        sb6.append(pm0.v.u(ooVar.m75942xfb822ef2(0)));
        sb6.append(", content=");
        sb6.append(ooVar.m75945x2fec8307(2));
        sb6.append(", videoTimestamp=");
        sb6.append(ooVar.m75942xfb822ef2(3));
        sb6.append(", identity=");
        sb6.append(ooVar.m75939xb282bd08(6));
        sb6.append(']');
        return sb6.toString();
    }
}
