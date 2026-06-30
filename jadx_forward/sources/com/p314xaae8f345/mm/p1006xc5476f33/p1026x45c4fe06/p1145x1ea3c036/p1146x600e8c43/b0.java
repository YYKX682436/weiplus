package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class b0 extends qd.a implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f167048d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f167048d = c11510xdd90c2f2;
    }

    @Override // o91.e
    public java.lang.String T0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (!U0(lVar, str)) {
            return str;
        }
        return str + "?appId=" + lVar.mo48798x74292566();
    }

    @Override // o91.e
    public boolean U0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        return (lVar == null || str == null || str.length() == 0 || !str.startsWith("wxfile://") || str.startsWith("wxfile://ad")) ? false : true;
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return (str == null || !str.startsWith("wxfile://") || str.startsWith("wxfile://ad")) ? false : true;
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo48802x59eafec1;
        if (!a(str) || (mo48802x59eafec1 = this.f167048d.mo48802x59eafec1()) == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("?appId=");
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = mo48802x59eafec1.mo49620x1d537609((java.lang.String) android.util.Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second);
        if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
            return null;
        }
        java.lang.String o17 = mo49620x1d537609.o();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo48802x59eafec1 = this.f167048d.mo48802x59eafec1();
        if (mo48802x59eafec1 == null) {
            cVar.a(null);
            return;
        }
        int lastIndexOf = str.lastIndexOf("?appId=");
        cVar.a(mo48802x59eafec1.mo49627xe22f8cb6((java.lang.String) android.util.Pair.create(str.substring(lastIndexOf + 7), str.substring(0, lastIndexOf)).second));
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxFileImageReader";
    }
}
