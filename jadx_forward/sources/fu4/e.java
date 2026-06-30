package fu4;

/* loaded from: classes9.dex */
public class e implements re4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu4.f f348421a;

    public e(fu4.f fVar) {
        this.f348421a = fVar;
    }

    @Override // re4.z
    public void h(int i17, java.lang.String str) {
        fu4.f fVar = this.f348421a;
        if (fVar.f348426h) {
            return;
        }
        if (i17 == 0) {
            re4.v a17 = re4.u.a();
            gm0.j1.d().g(new fu4.i(a17.f476086a, a17.f476087b));
        } else {
            fu4.g gVar = fVar.f348422d;
            if (gVar != null) {
                gVar.h(2, "init soter failed");
            }
        }
    }
}
