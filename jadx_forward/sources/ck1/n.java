package ck1;

/* loaded from: classes4.dex */
public final class n extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final ck1.t0 f123886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ck1.t0 usageInfoItem) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usageInfoItem, "usageInfoItem");
        this.f123886a = usageInfoItem;
    }

    /* renamed from: equals */
    public boolean m14995xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123886a, ((ck1.n) obj).f123886a);
    }

    /* renamed from: hashCode */
    public int m14996x8cdac1b() {
        return this.f123886a.m15003x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m14997x9616526c() {
        return "UserInfo(usageInfoItem=" + this.f123886a + ')';
    }
}
