package sl;

/* loaded from: classes9.dex */
public class b implements tl.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.j f490552a;

    public b(sl.j jVar) {
        this.f490552a = jVar;
    }

    public void a(long j17) {
        int i17 = 0;
        while (true) {
            sl.j jVar = this.f490552a;
            if (i17 >= ((java.util.ArrayList) jVar.f490572l).size()) {
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.x0) ((com.p314xaae8f345.mm.p944x882e457a.a1) ((java.util.ArrayList) jVar.f490572l).get(i17))).f287759a.f284311x = j17;
            yd5.r.f542682c = j17;
            i17++;
        }
    }
}
