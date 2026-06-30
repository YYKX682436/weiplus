package te2;

/* loaded from: classes10.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.m9 f499651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(te2.m9 m9Var) {
        super(1);
        this.f499651d = m9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ay1 ay1Var;
        r45.z22 songInfo = (r45.z22) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        te2.m9 m9Var = this.f499651d;
        m9Var.getClass();
        java.lang.String str = null;
        qo0.c.a(m9Var.f499684f, qo0.b.f446944s2, null, 2, null);
        r45.by1 by1Var = songInfo.f473164h;
        if (by1Var != null && (ay1Var = by1Var.f452676d) != null) {
            str = ay1Var.f451884e;
        }
        if (str == null) {
            str = "";
        }
        m9Var.i(str, new te2.h9(songInfo));
        return jz5.f0.f384359a;
    }
}
