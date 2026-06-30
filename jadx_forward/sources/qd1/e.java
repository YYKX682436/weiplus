package qd1;

/* loaded from: classes7.dex */
public class e implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 f443158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.f f443159e;

    public e(qd1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var) {
        this.f443159e = fVar;
        this.f443158d = k0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        qd1.f fVar = this.f443159e;
        int i17 = fVar.f443162f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 k0Var = this.f443158d;
        k0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ActionSheetManager", "removeBottomSheet id:" + i17);
        k0Var.f173280a.remove(i17);
        fVar.f443160d.a(fVar.f443166m, fVar.f443167n.o("fail cancel"));
    }
}
