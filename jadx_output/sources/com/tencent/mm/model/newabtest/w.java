package com.tencent.mm.model.newabtest;

/* loaded from: classes12.dex */
public class w implements en1.j {
    @Override // en1.j
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        if (!z17) {
            if (ugVar == null || ugVar.getSceneStatus() != 16) {
                return;
            }
            com.tencent.mm.model.newabtest.d.e();
            return;
        }
        if (ugVar != null && (ugVar instanceof o45.mg) && ugVar.getSceneStatus() == 12) {
            com.tencent.mm.model.newabtest.d.e();
        }
    }

    @Override // en1.j
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
