package yf;

/* loaded from: classes7.dex */
public class k0 implements com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f542940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542941c;

    public k0(yf.i0 i0Var, sf.f fVar) {
        this.f542941c = i0Var;
        this.f542940b = fVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.C25487x5a912af7.ITXSnapshotListener
    /* renamed from: onSnapshot */
    public void mo29892xb614f8c3(android.graphics.Bitmap bitmap) {
        sf.f fVar = this.f542940b;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        zf.c cVar = this.f542941c.f542898o;
        if (cVar != null) {
            ((bg1.h) cVar).e(fVar, bitmap);
        }
    }
}
