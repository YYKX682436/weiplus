package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class zb implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f243354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 f243355b;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46, float f17) {
        this.f243355b = activityC17420x3d09cd46;
        this.f243354a = f17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            j65.e.j(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46 = this.f243355b;
            if (!i65.a.l(activityC17420x3d09cd46.mo55332x76847179())) {
                activityC17420x3d09cd46.f241923i = activityC17420x3d09cd46.f241922h;
            }
            if (activityC17420x3d09cd46.f241922h != this.f243354a) {
                activityC17420x3d09cd46.f241918d = 1;
            } else {
                activityC17420x3d09cd46.f241918d = 0;
            }
            f14.e.d(activityC17420x3d09cd46.mo55332x76847179(), activityC17420x3d09cd46.f241922h, activityC17420x3d09cd46.f241924m);
            activityC17420x3d09cd46.f241919e = i65.a.o(activityC17420x3d09cd46.mo55332x76847179());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(activityC17420x3d09cd46.f241918d), java.lang.Integer.valueOf(activityC17420x3d09cd46.f241919e), 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", 11609, java.lang.Integer.valueOf(activityC17420x3d09cd46.f241918d), java.lang.Integer.valueOf(activityC17420x3d09cd46.f241919e));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).vk();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17420x3d09cd46.mo55332x76847179();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FontSizeService", "fontSizeAfter=" + f14.e.a(mo55332x76847179));
            int b17 = f14.e.b(mo55332x76847179);
            int g17 = j65.f.g();
            int c17 = f14.e.c(b17);
            if (c17 != g17) {
                j65.f.k(c17);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Intro_Need_Clear_Top ", true);
                ((com.p314xaae8f345.mm.app.y7) f14.g.b()).d(intent, mo55332x76847179);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Intro_Need_Clear_Top ", true);
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).u(intent2, mo55332x76847179);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5561x602ef176 c5561x602ef176 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5561x602ef176();
            c5561x602ef176.f135880g.getClass();
            c5561x602ef176.e();
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.s0.b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
        }
    }
}
