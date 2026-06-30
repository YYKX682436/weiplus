package j12;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s f378682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j12.b f378683e;

    public a(j12.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar) {
        this.f378683e = bVar;
        this.f378682d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar = this.f378682d;
        if (sVar == null) {
            return;
        }
        j12.b bVar = this.f378683e;
        bVar.getClass();
        bVar.f378685e = new j12.f(sVar);
        bVar.notifyDataSetChanged();
    }
}
