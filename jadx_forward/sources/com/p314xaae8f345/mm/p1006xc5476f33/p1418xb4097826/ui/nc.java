package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class nc implements uy0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f211080a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3 f211081b;

    public nc(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3 activityC15053x15a6cfc3) {
        this.f211080a = intent;
        this.f211081b = activityC15053x15a6cfc3;
    }

    @Override // uy0.f
    public void a(android.app.Activity context, int i17, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostRouterUI", "start template post, enter album");
        intent.putExtras(this.f211080a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15053x15a6cfc3 activityC15053x15a6cfc3 = this.f211081b;
        intent.putExtra("key_finder_context_id", activityC15053x15a6cfc3.f210189x);
        intent.putExtra("key_finder_session_id", activityC15053x15a6cfc3.f210190y);
        intent.putExtra("key_finder_post_id", activityC15053x15a6cfc3.f210188w);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", activityC15053x15a6cfc3.B);
        intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", activityC15053x15a6cfc3.C);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", activityC15053x15a6cfc3.f210191z);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", activityC15053x15a6cfc3.A);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", activityC15053x15a6cfc3.D);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", activityC15053x15a6cfc3.H);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", activityC15053x15a6cfc3.I);
        intent.putExtra("KEY_FINDER_MEMBER_VIDEO", activityC15053x15a6cfc3.f210184J);
        qs2.v.f447860a.g(context, intent, 3, true, i17);
    }
}
