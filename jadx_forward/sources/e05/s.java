package e05;

/* loaded from: classes9.dex */
public class s implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e05.t f327723a;

    public s(e05.t tVar) {
        this.f327723a = tVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        e05.t tVar = this.f327723a;
        if (i17 == 0) {
            at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
            java.lang.String str = tVar.f327724d.f270078i.f69225xed6d60f6;
            fj6.getClass();
            tVar.f327724d.getClass();
            return;
        }
        if (i17 != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19556xc9270018 activityC19556xc9270018 = tVar.f327724d;
        android.os.Bundle bundle = activityC19556xc9270018.f270077h.f295334c;
        bundle.putBoolean("offline_pay", false);
        bundle.putBoolean("key_is_show_detail", false);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19556xc9270018, c05.s.class, bundle, null);
    }
}
