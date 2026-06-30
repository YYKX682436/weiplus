package z53;

/* loaded from: classes8.dex */
public final class i extends dm.n5 {
    public static final l75.e0 I = dm.n5.m125337x3593deb(z53.i.class);
    public y53.m F;
    public java.lang.CharSequence G;
    public java.lang.String H;

    /* renamed from: equals */
    public boolean m178416xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z53.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.conversation.GameLifeConversation");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f67669xbed8694c, ((z53.i) obj).f67669xbed8694c);
    }

    @Override // dm.n5, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return I;
    }

    /* renamed from: hashCode */
    public int m178417x8cdac1b() {
        java.lang.String str = this.f67669xbed8694c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final long t0() {
        return u0() ? 103L : 101L;
    }

    /* renamed from: toString */
    public java.lang.String m178418x9616526c() {
        return "GameLifeConversation(talker:" + this.f67670x114ef53e + " sessionId:" + this.f67669xbed8694c + " self:" + this.f67668x5568d387 + " nickname:" + this.H + ')';
    }

    public final boolean u0() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f67669xbed8694c, "@gamelifehistory");
    }
}
