package gk5;

/* loaded from: classes9.dex */
public final class s0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new dc5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        l15.c k17 = ((dc5.a) c7()).k();
        return (k17 == null || (m126747x696739c = k17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gk5.r0 r0Var = (gk5.r0) pf5.z.f435481a.a(activity).a(gk5.r0.class);
        java.lang.String d76 = d7();
        dc5.a aVar = (dc5.a) c7();
        long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
        dc5.a aVar2 = (dc5.a) c7();
        r0Var.U6(d76, m75942xfb822ef2, aVar2.m75945x2fec8307(aVar2.f125235d + 1), ((dc5.a) c7()).m123921x7520bed6() == 1, com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            ((ez.w0) ot0.j1.a()).wi(Z6, Z6.f430179d, Z6.H, toUser, "", null, true);
        }
    }
}
