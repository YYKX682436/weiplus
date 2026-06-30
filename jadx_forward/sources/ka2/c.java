package ka2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public r45.dd1 f387547a;

    /* renamed from: b, reason: collision with root package name */
    public r45.dd1 f387548b;

    public final boolean a(ka2.f streamType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamType, "streamType");
        int ordinal = streamType.ordinal();
        if (ordinal == 0) {
            r45.dd1 dd1Var = this.f387547a;
            if (dd1Var == null || dd1Var.m75939xb282bd08(2) != 1) {
                return false;
            }
        } else if (ordinal != 1) {
            r45.dd1 dd1Var2 = this.f387547a;
            if (!(dd1Var2 != null && dd1Var2.m75939xb282bd08(2) == 1)) {
                r45.dd1 dd1Var3 = this.f387548b;
                if (!(dd1Var3 != null && dd1Var3.m75939xb282bd08(2) == 1)) {
                    return false;
                }
            }
        } else {
            r45.dd1 dd1Var4 = this.f387548b;
            if (dd1Var4 == null || dd1Var4.m75939xb282bd08(2) != 1) {
                return false;
            }
        }
        return true;
    }
}
