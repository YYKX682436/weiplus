package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes10.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f205910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f205909d = j3Var;
        this.f205910e = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ss4 mvTrackData = (r45.ss4) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvTrackData, "mvTrackData");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_track_data", mvTrackData.mo14344x5f01b1f6());
        intent.putExtra("key_mv_from_scene", 1);
        intent.putExtra("key_mv_enter_maker_ui_from_scene", 2);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var = this.f205909d;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) eVar).Di(j3Var.m158354x19263085(), "MusicMvRouterUI", 7, r45.bt4.class);
        if (bt4Var != null) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            bt4Var.f452570e = uuid;
            bt4Var.f452571f = 86;
        }
        int i17 = this.f205910e.f391649d;
        if (i17 == 2 || i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = j3Var.m158354x19263085();
            i0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            try {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.f232422g;
                intent.putExtra("KEY_MUSIC_ROUTER", 7);
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16655xf855844b.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterMusicMvPostUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.ClassNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.ActivityRouter", "enterMusicMvPostUI : " + e17);
            }
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Qk(j3Var.m158354x19263085(), intent);
        }
        return jz5.f0.f384359a;
    }
}
