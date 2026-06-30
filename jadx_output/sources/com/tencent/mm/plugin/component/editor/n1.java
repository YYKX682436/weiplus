package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f96615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96616e;

    public n1(com.tencent.mm.plugin.component.editor.EditorUI editorUI, java.util.ArrayList arrayList) {
        this.f96616e = editorUI;
        this.f96615d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.component.editor.EditorUI editorUI;
        int i17;
        int i18;
        int i19;
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i28 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = this.f96615d;
            int size = arrayList2.size();
            editorUI = this.f96616e;
            if (i28 >= size) {
                break;
            }
            java.lang.String str = (java.lang.String) arrayList2.get(i28);
            ix1.j jVar = new ix1.j();
            jVar.f295328q = true;
            jVar.f295327p = 2;
            jVar.f295323l = nx1.d.q().k();
            jVar.f295311a = hx1.b.a(jVar.toString(), 18);
            editorUI.f96516z = new r45.gp0();
            editorUI.f96516z.h0(2);
            editorUI.f96516z.e0(jVar.f295311a);
            r45.gp0 gp0Var = editorUI.f96516z;
            jVar.f295325n = gp0Var;
            java.lang.String c17 = hx1.b.c(gp0Var);
            kk.j jVar2 = com.tencent.mm.plugin.component.editor.u1.f96637a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                c17 = o72.p5.c() + "/" + (kk.k.g((str + java.lang.System.currentTimeMillis()).getBytes()) + "_HD");
            }
            if (!com.tencent.mm.vfs.w6.j(c17)) {
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
                if (n07 == null || (i17 = n07.outWidth) <= 0 || (i18 = n07.outHeight) <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EditorUtil", "GetImageOptions Error");
                    c17 = null;
                } else {
                    int i29 = i17 > 1280 ? 1280 : i17;
                    int i37 = i18 <= 1280 ? i18 : 1280;
                    if (i18 >= i17) {
                        int i38 = i29;
                        i29 = i37;
                        i37 = i38;
                    }
                    if (com.tencent.mm.sdk.platformtools.q2.d(str) > 0) {
                        int i39 = n07.outHeight;
                        i19 = n07.outWidth;
                        i27 = i39;
                    } else {
                        i19 = i37;
                        i27 = i29;
                    }
                    com.tencent.mm.sdk.platformtools.x.x(str, i27, i19, android.graphics.Bitmap.CompressFormat.JPEG, 95, c17, true);
                }
            }
            jVar.f295322s = c17;
            jVar.f295329r = com.tencent.mm.plugin.component.editor.u1.c(c17, hx1.b.e(editorUI.f96516z));
            jVar.f295326o = com.tencent.mm.vfs.w6.k(jVar.f295322s);
            arrayList.add(jVar);
            i28++;
        }
        android.app.ProgressDialog progressDialog = editorUI.f96515y;
        if (progressDialog == null || !progressDialog.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorActivityUI", "user canceled");
            return;
        }
        if (nx1.d.q().e(arrayList)) {
            editorUI.f7();
        } else {
            nx1.d.q().s(arrayList, editorUI.f96503m.c(), true, true, false, true, false);
        }
        editorUI.k7(true, 100L);
        editorUI.j7(1, 0L);
    }
}
