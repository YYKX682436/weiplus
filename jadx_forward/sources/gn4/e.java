package gn4;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f355140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gn4.f f355141e;

    public e(gn4.f fVar, java.util.List list) {
        this.f355141e = fVar;
        this.f355140d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        fn4.z0 s47 = this.f355141e.f346025g.s4();
        int e17 = s47.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryFSVideoAdapter", "callbackToSuccess originSize: %d insertSize %d", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(this.f355140d.size()));
        java.util.List list = this.f355140d;
        synchronized (s47) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                ((java.util.LinkedList) s47.b()).addAll(list);
            }
        }
        gn4.f fVar = this.f355141e;
        fVar.m8147xed6e4d18(e17 + fVar.z());
    }
}
