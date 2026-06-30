package k50;

/* loaded from: classes.dex */
public final class y0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f385803d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f385804e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f385805f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f385806g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f385807h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f385808i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f385803d = jz5.h.b(new k50.v0(this));
        this.f385804e = jz5.h.b(k50.x0.f385801d);
        this.f385805f = jz5.h.b(k50.w0.f385799d);
        this.f385806g = jz5.h.b(new k50.s0(this));
        this.f385807h = kz5.p0.f395529d;
        this.f385808i = new java.util.LinkedHashMap();
    }

    public final void T6(java.lang.String username) {
        k50.g0.f385747a.b(k50.o0.f385779g);
        jz5.g gVar = px.g.f440280a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String concat = "forward_clawbot_last_used_".concat(username);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object mo141623x754a37bb = ((jz5.n) px.g.f440280a).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).B(concat, currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Forward.ClawBotUsage", "recordUsage: " + username + ", time=" + currentTimeMillis);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("selected_app", "CLAWBOT");
        intent.putExtra("selected_clawbot_username", username);
        m158354x19263085().setResult(-1, intent);
        m158354x19263085().finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570644ef2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1001 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra != null) {
                T6(stringExtra);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.y0.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
