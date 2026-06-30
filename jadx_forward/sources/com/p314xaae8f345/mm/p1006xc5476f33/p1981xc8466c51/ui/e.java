package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class e implements o72.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f f236912d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f fVar) {
        this.f236912d = fVar;
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f fVar = this.f236912d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b) fVar.f236941q;
        long j17 = e2Var.f67088x958756b0;
        if (j17 != bVar.f236883c.f67645x88be67a1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavRecordAdapter", "not equal Id %d %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(bVar.f236883c.f67645x88be67a1));
            return;
        }
        if (4 == e2Var.f67093x10a0fed7) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f.f236918y;
            java.lang.String str = e2Var.f67085xf604e54a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "null";
            }
            hashMap.put(str, java.lang.Boolean.TRUE);
        }
        boolean w07 = e2Var.w0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = fVar.f236934g;
        if (w07) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d(this, e2Var));
        }
        n3Var.mo50293x3498a0(fVar.f236947w);
    }
}
