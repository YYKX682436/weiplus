package b93;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b93.b f18584d;

    public a(b93.b bVar) {
        this.f18584d = bVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelManagerImpl", "onSceneEnd");
        int type = m1Var.getType();
        b93.b bVar = this.f18584d;
        if (type == 635) {
            if (i17 == 0 && i18 == 0) {
                bVar.l(bVar.f18585a, bVar.f18586b);
                return;
            } else {
                bVar.k();
                com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact lable faild");
                return;
            }
        }
        if (type != 638) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = bVar.f18587c;
            int size = (arrayList == null || arrayList.isEmpty()) ? 0 : bVar.f18587c.size();
            java.util.ArrayList arrayList2 = bVar.f18586b;
            int size2 = (arrayList2 == null || arrayList2.isEmpty()) ? 0 : bVar.f18586b.size() - size;
            if (size > 0 || size2 > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11220, c01.z1.r(), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2), 0, 0);
            }
        }
        bVar.k();
    }
}
