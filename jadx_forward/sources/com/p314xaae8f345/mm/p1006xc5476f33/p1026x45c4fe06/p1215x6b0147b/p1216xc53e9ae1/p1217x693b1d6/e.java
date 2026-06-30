package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l f172413d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar) {
        this.f172413d = lVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener
    /* renamed from: onSubtitleData */
    public final void mo53279xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar = this.f172413d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f172422r, "onSubtitleData, subtitleData: " + c26193x359f687e.f50983x861be3e2);
        ye1.o oVar = lVar.f542707m;
        if (oVar != null) {
            java.lang.String str = c26193x359f687e.f50983x861be3e2;
            bg.e0 e0Var = (bg.e0) oVar;
            e0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "onSubtitleDataChange subtitleContent:%s", str);
            e0Var.f101291a.Q(new bg.d0(e0Var, str));
        }
    }
}
