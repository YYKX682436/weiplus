package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/search/RepairerConfigResetMusicGuideState;", "Lq55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.search.RepairerConfigResetMusicGuideState */
/* loaded from: classes.dex */
public final class C20678x1d821cc7 extends q55.a {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ResetMusicGuideState";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "重置听一听引导词状态";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20919xb7181f8d.class;
    }

    @Override // q55.a
    public void h(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("taskbar_config");
        M.putInt("music_guide_show_count", 0);
        M.putLong("music_guide_first_show_time", 0L);
        M.putBoolean("music_guide_initialized", false);
        M.putBoolean("music_guide_clicked", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerConfigResetMusicGuideState", "resetMusicGuideState: all music guide state cleared");
        dp.a.m125854x26a183b(context, "已重置听一听引导词状态", 0).show();
    }
}
