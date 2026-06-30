package vh4;

/* loaded from: classes.dex */
public class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f518702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f518703b;

    public w1(vh4.t1 t1Var, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f518702a = runnable;
        this.f518703b = runnable2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "checkContactIsAdultAge cgiBack: " + ((r45.y04) fVar.f152151d).mo12245xcc313de3());
        if ((fVar.f152148a == 0 && fVar.f152149b == 0) && ((r45.y04) fVar.f152151d).f472216d == 0) {
            java.lang.Runnable runnable = this.f518702a;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f518703b;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        return fVar;
    }
}
