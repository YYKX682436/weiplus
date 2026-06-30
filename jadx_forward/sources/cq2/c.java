package cq2;

/* loaded from: classes2.dex */
public final class c implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302910d;

    public c(yz5.l lVar) {
        this.f302910d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        gm0.j1.d().q(6479, this);
        yz5.l lVar = this.f302910d;
        if (i17 == 0 && i18 == 0 && (scene instanceof db2.q5)) {
            java.util.LinkedList M = ((db2.q5) scene).M();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KtvStreamDataRequester", "requestKtvStreamData: 请求成功，获取到 " + M.size() + " 个直播间");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new cq2.a(lVar, M));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KtvStreamDataRequester", "requestKtvStreamData: 请求失败 errType=" + i17 + ", errCode=" + i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new cq2.b(lVar));
    }
}
