package ck1;

/* loaded from: classes4.dex */
public final class m extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f123881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String nickName) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        this.f123881a = nickName;
    }

    /* renamed from: equals */
    public boolean m14992xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123881a, ((ck1.m) obj).f123881a);
    }

    /* renamed from: hashCode */
    public int m14993x8cdac1b() {
        return this.f123881a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14994x9616526c() {
        return "PluginTitle(nickName=" + this.f123881a + ')';
    }
}
