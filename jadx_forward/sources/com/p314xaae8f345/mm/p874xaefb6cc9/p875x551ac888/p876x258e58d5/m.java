package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i {

    /* renamed from: CTRL_INDEX */
    public static final int f29756x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f29757x24728b = "onWVAPkgDownloadStateChange";

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i.f160491m.containsKey(e9Var.mo48798x74292566())) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "listen -> " + e9Var.mo48798x74292566());
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m mVar = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m();
        mVar.y(e9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i.x(e9Var, mVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i
    public void y(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f160493i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0() { // from class: com.tencent.mm.minigame.download.mmdownloader.m$$a
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
            public final void a(java.lang.Object obj) {
                com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m mVar = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                mVar.getClass();
                if (e9Var2 != null && (obj instanceof com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7)) {
                    com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7 c10919x62749ac7 = (com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10919x62749ac7) obj;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "onCustomDataNotify, state: %s, appId: %s, downloadId: %d, moduleName: %s, pkgPath: %s", c10919x62749ac7.f160312d, c10919x62749ac7.f160314f, java.lang.Long.valueOf(c10919x62749ac7.f160313e), c10919x62749ac7.f150567m, c10919x62749ac7.f150568n);
                    if (!"download_succ".equals(c10919x62749ac7.f160312d)) {
                        org.json.JSONObject a17 = c10919x62749ac7.a();
                        mVar.u(e9Var2);
                        mVar.f163907f = a17.toString();
                        mVar.m();
                        return;
                    }
                    java.lang.String str = c10919x62749ac7.f150567m;
                    java.lang.String str2 = c10919x62749ac7.f150568n;
                    if (str == null || str.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: special handling for old version");
                        org.json.JSONObject a18 = c10919x62749ac7.a();
                        mVar.u(e9Var2);
                        mVar.f163907f = a18.toString();
                        mVar.m();
                        return;
                    }
                    if (str2 == null || str2.isEmpty()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: pkgPath is empty for downloadId=" + c10919x62749ac7.f160313e);
                        c10919x62749ac7.f160312d = "download_failed";
                        c10919x62749ac7.f150573s = "pkgPath is empty";
                        org.json.JSONObject a19 = c10919x62749ac7.a();
                        mVar.u(e9Var2);
                        mVar.f163907f = a19.toString();
                        mVar.m();
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var2.t3();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t37, "<this>");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a4 o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(t37, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la laVar = o17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la) o17 : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var = laVar != null ? laVar.f157188a : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = y3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac) y3Var : null;
                    if (acVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: mergeDirReader is null for appId=" + c10919x62749ac7.f160314f);
                        c10919x62749ac7.f160312d = "download_failed";
                        c10919x62749ac7.f150573s = "mergeDirReader is null";
                        org.json.JSONObject a27 = c10919x62749ac7.a();
                        mVar.u(e9Var2);
                        mVar.f163907f = a27.toString();
                        mVar.m();
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e();
                    c11656xaf63146e.f33454x337a8b = str;
                    c11656xaf63146e.f33455xe121c411 = str2;
                    arrayList.add(c11656xaf63146e);
                    acVar.o(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVADownloadAppStateChangeEvent", "handleDownloadSuccess: merged module " + str + ", pkgPath=" + str2);
                    org.json.JSONObject a28 = c10919x62749ac7.a();
                    mVar.u(e9Var2);
                    mVar.f163907f = a28.toString();
                    mVar.m();
                }
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.B(e9Var.mo48798x74292566(), this.f160493i);
        e9Var.t3().N.a(new u81.f() { // from class: com.tencent.mm.minigame.download.mmdownloader.m$$b
            @Override // u81.f
            public final void D(java.lang.String str, u81.b bVar) {
                com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m mVar = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.m.this;
                mVar.getClass();
                if (bVar == u81.b.DESTROYED) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = e9Var;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(e9Var2.mo48798x74292566(), mVar.f160493i);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i.A(e9Var2);
                }
            }
        });
    }
}
