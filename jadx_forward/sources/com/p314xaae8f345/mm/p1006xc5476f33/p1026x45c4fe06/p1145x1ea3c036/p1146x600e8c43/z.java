package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class z extends qd.a implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f167085d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f167085d = c11510xdd90c2f2;
    }

    @Override // o91.e
    public java.lang.String T0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (!U0(lVar, str)) {
            return str;
        }
        java.lang.String str2 = (java.lang.String) e(str).second;
        return str2 == null ? "" : str2;
    }

    @Override // o91.e
    public boolean U0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (lVar == null || str == null || str.length() == 0) {
            return false;
        }
        if (!str.startsWith("wxblob://")) {
            java.lang.String str2 = (java.lang.String) e(str).second;
            if (str2 == null) {
                str2 = "";
            }
            if (!str2.startsWith("wxblob://")) {
                return false;
            }
        }
        return true;
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return str != null && str.startsWith("wxblob://");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo48802x59eafec1;
        com.p314xaae8f345.mm.vfs.r6 mo49621x2f1a0d80;
        if (!a(str) || (mo48802x59eafec1 = this.f167085d.mo48802x59eafec1()) == null || (mo49621x2f1a0d80 = mo48802x59eafec1.mo49621x2f1a0d80((java.lang.String) e(str).second)) == null || !mo49621x2f1a0d80.m()) {
            return null;
        }
        java.lang.String o17 = mo49621x2f1a0d80.o();
        if (!o17.startsWith("file://")) {
            o17 = "file://".concat(o17);
        }
        return l01.d0.f396294a.f(o17, rect != null ? new zg1.a(rect.left, rect.top, rect.width(), rect.height()) : null);
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (cVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo48802x59eafec1 = this.f167085d.mo48802x59eafec1();
        if (mo48802x59eafec1 == null) {
            cVar.a(null);
        } else {
            cVar.a(mo48802x59eafec1.mo49627xe22f8cb6((java.lang.String) e(str).second));
        }
    }

    public final android.util.Pair e(java.lang.String str) {
        int lastIndexOf;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (lastIndexOf = str.lastIndexOf("wxblob://")) >= 0) {
            return android.util.Pair.create(str.substring(0, lastIndexOf), str.substring(lastIndexOf));
        }
        return android.util.Pair.create(null, null);
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxBlobImageReader";
    }
}
