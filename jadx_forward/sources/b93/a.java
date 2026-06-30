package b93;

/* loaded from: classes11.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b93.b f100117d;

    public a(b93.b bVar) {
        this.f100117d = bVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelManagerImpl", "onSceneEnd");
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        b93.b bVar = this.f100117d;
        if (mo808xfb85f7b0 == 635) {
            if (i17 == 0 && i18 == 0) {
                bVar.l(bVar.f100118a, bVar.f100119b);
                return;
            } else {
                bVar.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact lable faild");
                return;
            }
        }
        if (mo808xfb85f7b0 != 638) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = bVar.f100120c;
            int size = (arrayList == null || arrayList.isEmpty()) ? 0 : bVar.f100120c.size();
            java.util.ArrayList arrayList2 = bVar.f100119b;
            int size2 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : bVar.f100119b.size() - size;
            if (size > 0 || size2 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11220, c01.z1.r(), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), 0, 0);
            }
        }
        bVar.k();
    }
}
