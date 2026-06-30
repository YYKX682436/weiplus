package e33;

/* loaded from: classes10.dex */
public class d4 implements al5.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.e4 f328732a;

    public d4(e33.e4 e4Var) {
        this.f328732a = e4Var;
    }

    @Override // al5.a4
    public void a() {
        e33.e4 e4Var = this.f328732a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "onLongPress down %d", e4Var.f328744d.f220126o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = e4Var.f328744d;
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        int intValue = activityC15656x6f26b561.f220126o.intValue();
        y51.c j17 = v2Var.j(intValue);
        if (j17 != null) {
            y51.b bVar = (y51.b) j17;
            if (!((z51.p) bVar.a(z51.p.class)).k()) {
                bVar.c();
                v2Var.f329045w = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17 = v2Var.k(intValue);
                if (k17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) {
                    v2Var.p((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) k17, 3);
                    return;
                }
                return;
            }
        }
        v2Var.f329045w = false;
    }

    @Override // al5.a4
    public void b() {
        e33.e4 e4Var = this.f328732a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewUI", "onLongPress up %d", e4Var.f328744d.f220126o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = e4Var.f328744d;
        e33.v2 v2Var = activityC15656x6f26b561.f220112e;
        y51.c j17 = v2Var.j(activityC15656x6f26b561.f220126o.intValue());
        if (j17 == null || !v2Var.f329045w) {
            return;
        }
        ((y51.b) j17).b();
        v2Var.f329045w = false;
    }
}
