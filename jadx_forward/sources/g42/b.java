package g42;

/* loaded from: classes13.dex */
public class b extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g42.f f350246d;

    public b(g42.f fVar) {
        this.f350246d = fVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        if (g42.i.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingMgr", "[onAppBackground]");
            g42.f fVar = this.f350246d;
            fVar.f350262o.mo50303x856b99f0(1004);
            fVar.f350262o.mo50307xb9e94560(1004, 1000L);
            fVar.f350262o.mo50303x856b99f0(1001);
            fVar.f350262o.mo50307xb9e94560(1001, 1000L);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        if (g42.i.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingMgr", "[onAppForeground]");
            g42.f fVar = this.f350246d;
            fVar.f350262o.mo50303x856b99f0(1004);
            fVar.f350262o.mo50303x856b99f0(1001);
        }
    }
}
