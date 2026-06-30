package mz4;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f414810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f414811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414812g;

    public f(mz4.d dVar, int i17, boolean z17, boolean z18) {
        this.f414812g = dVar;
        this.f414809d = i17;
        this.f414810e = z17;
        this.f414811f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        lz4.a aVar;
        lz4.a aVar2;
        synchronized (this) {
            if (this.f414812g.f414762a == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "setHighLightStatus, post:%d, isHighLight:%s, needNotify:%s", java.lang.Integer.valueOf(this.f414809d), java.lang.Boolean.valueOf(this.f414810e), java.lang.Boolean.valueOf(this.f414811f));
            int i17 = this.f414809d;
            if (i17 >= 0 && i17 < this.f414812g.f414762a.size()) {
                iz4.c cVar = (iz4.c) this.f414812g.f414762a.get(this.f414809d);
                if (cVar != null) {
                    boolean z17 = cVar.f377644i;
                    boolean z18 = this.f414810e;
                    if (z17 != z18) {
                        cVar.f377644i = z18;
                        if (this.f414811f && (aVar2 = this.f414812g.f414763b) != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar2).j3(this.f414809d, 0L);
                        }
                    }
                }
            } else if (this.f414809d == -1) {
                for (int i18 = 0; i18 < this.f414812g.f414762a.size(); i18++) {
                    iz4.c cVar2 = (iz4.c) this.f414812g.f414762a.get(i18);
                    if (cVar2 != null) {
                        boolean z19 = cVar2.f377644i;
                        boolean z27 = this.f414810e;
                        if (z19 != z27) {
                            cVar2.f377644i = z27;
                            if (this.f414811f && (aVar = this.f414812g.f414763b) != null) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).j3(i18, 0L);
                            }
                        }
                    }
                }
            }
        }
    }
}
