package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class a0 extends qd.a implements o91.e {
    @Override // o91.e
    public java.lang.String T0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        U0(lVar, str);
        return str;
    }

    @Override // o91.e
    public boolean U0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (lVar == null || str == null || str.length() == 0) {
            return false;
        }
        return str.startsWith("wxfile://ad");
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return str != null && str.startsWith("wxfile://ad");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (!a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileAdImageReader", "read, not match, url:%s", str);
            return null;
        }
        i81.m0 m0Var = (i81.m0) i95.n0.c(i81.m0.class);
        if (m0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileAdImageReader", "read, no ad service");
            return null;
        }
        ((i81.f) m0Var).getClass();
        java.util.Map map = i81.j.f371125a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = i81.i.f371123a;
        if (j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileAdImageReader", "read, no ad file system");
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49301x1d537609 = j3Var.mo49301x1d537609(str, false);
        if (mo49301x1d537609 == null || !mo49301x1d537609.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileAdImageReader", "read, file not exist, url:%s", str);
            return null;
        }
        java.lang.String o17 = mo49301x1d537609.o();
        if (!o17.startsWith("file://")) {
            o17 = "file://".concat(o17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileAdImageReader", "read, url:%s, path:%s", str, o17);
        return l01.d0.f396294a.f(o17, rect != null ? new zg1.a(rect.left, rect.top, rect.width(), rect.height()) : null);
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (!a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxFileAdImageReader", "openRead, not match, url:%s", str);
            return;
        }
        if (cVar == null) {
            return;
        }
        i81.m0 m0Var = (i81.m0) i95.n0.c(i81.m0.class);
        if (m0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileAdImageReader", "openRead, no ad service");
            return;
        }
        ((i81.f) m0Var).getClass();
        java.util.Map map = i81.j.f371125a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var = i81.i.f371123a;
        if (j3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileAdImageReader", "openRead, no ad file system");
        } else {
            cVar.a(j3Var.mo49627xe22f8cb6(str));
        }
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxFileAdImageReader";
    }
}
