package ga3;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351392a;

    public k(ga3.v vVar) {
        this.f351392a = vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k
    public void a() {
        ga3.v vVar = this.f351392a;
        if (vVar.f351429v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "is interrupting");
        } else {
            vVar.f351429v = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionBegin");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.k
    public void b() {
        ga3.v vVar = this.f351392a;
        if (!vVar.f351429v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "not call onInterruptionEnd");
        } else {
            vVar.f351429v = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onInterruptionEnd");
        }
    }
}
