package wf;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf.f f527007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf.b f527008b;

    public m(wf.b bVar, sf.f fVar) {
        this.f527008b = bVar;
        this.f527007a = fVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25485x5a0a6891.ITXSnapshotListener
    /* renamed from: onSnapshot */
    public void mo94544xb614f8c3(android.graphics.Bitmap bitmap) {
        sf.f fVar = this.f527007a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePlayerPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        xf.a aVar = this.f527008b.f526954o;
        if (aVar != null) {
            ((yf1.e) aVar).d(fVar, bitmap);
        }
    }
}
