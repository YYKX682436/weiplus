package rk4;

/* loaded from: classes10.dex */
public final class l1 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478345a;

    public l1(yz5.l lVar) {
        this.f478345a = lVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        try {
            rk4.k5.e("showAddContactDialog, res:" + i17, "FlutterTingInteractPlugin");
            yz5.l lVar = this.f478345a;
            if (i17 == 1) {
                rk4.k5.e("add OK, result send success", "FlutterTingInteractPlugin");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            }
        } catch (java.lang.Exception e17) {
            rk4.k5.d("showAddContactDialog, tingResult send exception e:" + e17.getMessage(), "FlutterTingInteractPlugin");
        }
    }
}
