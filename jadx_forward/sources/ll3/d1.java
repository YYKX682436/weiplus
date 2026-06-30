package ll3;

/* loaded from: classes10.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll3.e1 f400682d;

    public d1(ll3.e1 e1Var) {
        this.f400682d = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/model/GlobalMusicPlayerFloatBallHelper$initMusicFloatBallView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ll3.e1 e1Var = this.f400682d;
        e1Var.getClass();
        r45.bt4 bt4Var = new r45.bt4();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        bt4Var.f452570e = uuid;
        bt4Var.f452569d = 4;
        android.content.Intent s07 = e1Var.s0();
        s07.putExtra("key_mv_report_data", bt4Var.mo14344x5f01b1f6());
        s07.putExtra("key_music_stop_or_complete", ll3.q0.f400750h);
        s07.putExtra("markTryListen", e1Var.f400690u);
        s07.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ep1.m.b(context, s07, true);
        j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "mv", ".ui.MusicMvMainUI", s07, null);
        yj0.a.h(this, "com/tencent/mm/plugin/music/model/GlobalMusicPlayerFloatBallHelper$initMusicFloatBallView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
