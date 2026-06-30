package vp;

/* loaded from: classes14.dex */
public class p implements vp.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp.k f520355a;

    public p(vp.k kVar) {
        this.f520355a = kVar;
    }

    @Override // vp.c0
    public void a(wp.a danmaku) {
        vp.v0 v0Var = this.f520355a.f520325h;
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        if (v0Var.f520383l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DanmakuAsyncDataSource", "addFollowDanmaku: ignored because dataSource is closed");
            return;
        }
        danmaku.m174284x9616526c();
        if (v0Var.f520383l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DanmakuAsyncDataSource", "addFollowDanmakuToDrawListAsync: ignored because dataSource is closed");
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(v0Var.f520382k, null, null, new vp.o0(v0Var, danmaku, null), 3, null);
        }
    }
}
