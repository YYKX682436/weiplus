package gk5;

/* loaded from: classes9.dex */
public final class e extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new lb5.a();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.r(m158354x19263085(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574489if3), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b));
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.lang.String j17 = ((lb5.a) c7()).j();
        if (j17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(j17);
        long k17 = N == null ? com.p314xaae8f345.mm.vfs.w6.k(j17) : com.p314xaae8f345.mm.vfs.w6.k(N.N0());
        java.lang.String N0 = N == null ? j17 : N.N0();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(N0, options);
        boolean z17 = options.outHeight > ip.c.c() || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardEmojiUIC", "emoji is over size. ");
            db5.e1.y(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bvm), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), new gk5.d(this));
            return;
        }
        if (N != null && k17 > ip.c.e()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.h(N, toUser, null);
            return;
        }
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        android.app.Activity m80379x76847179 = m80379x76847179();
        lb5.a aVar = (lb5.a) c7();
        long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
        lb5.a aVar2 = (lb5.a) c7();
        if (((y12.h) wi6).W(m80379x76847179, toUser, j17, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(m75942xfb822ef2, aVar2.m75945x2fec8307(aVar2.f125235d + 1)), ((lb5.a) c7()).l())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardEmojiUIC", "Retransmit emoji failed.");
    }
}
