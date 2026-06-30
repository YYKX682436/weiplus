package ll3;

/* loaded from: classes11.dex */
public class o1 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll3.r1 f400737a;

    public o1(ll3.r1 r1Var) {
        this.f400737a = r1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(bVar.f441067d != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicImageLoader", "onImageLoadFinish %s %b", objArr);
        if (view == null) {
            return;
        }
        ql3.a aVar = (ql3.a) view.getTag();
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap == null || aVar == null) {
            return;
        }
        ll3.r1 r1Var = this.f400737a;
        r1Var.c(aVar, bitmap);
        ka0.k0 k0Var = r1Var.f400758c;
        if (k0Var != null) {
            android.graphics.Bitmap bitmap2 = bVar.f441067d;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.i iVar = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.i) k0Var;
            um5.d dVar = iVar.f232479a;
            try {
                dVar.b(bitmap2);
                int i17 = iVar.f232480b;
                int i18 = iVar.f232481c;
                dVar.f510674b = i17;
                dVar.f510675c = i18;
                dVar.f510677e.f510726b.d();
                dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.h(iVar));
            } catch (java.lang.Exception unused) {
            }
        }
        int[] c17 = com.p314xaae8f345.mm.ui.bk.c(bVar.f441067d, 4, 4);
        if (!(aVar.f66993x12571f84 == c17[0] && aVar.f66998x375331e == c17[1])) {
            ll3.o2.Ai().L0(aVar.f66983xc8c6afdb, c17[0], c17[1]);
        }
        if (r1Var.f400757b != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ll3.n1(this, aVar, c17));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
