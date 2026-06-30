package ub0;

@j95.b
/* loaded from: classes7.dex */
public final class p extends i95.w implements ub0.o {
    public boolean Ai(java.lang.String filePath) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(com.p314xaae8f345.mm.vfs.w6.i(filePath, false));
        if (n07 == null || (str = n07.outMimeType) == null) {
            return false;
        }
        return r26.i0.n(str, "jpeg", false) || r26.i0.n(str, "jpg", false) || r26.i0.n(str, "png", false) || r26.i0.n(str, "heic", false);
    }

    public int wi(java.lang.String scrFile, java.lang.String dstFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scrFile, "scrFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dstFile, "dstFile");
        if (com.p314xaae8f345.mm.vfs.w6.j(dstFile)) {
            com.p314xaae8f345.mm.vfs.w6.h(dstFile);
        }
        int m72740xa1dcb9d9 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18868xa42b29bd.m72740xa1dcb9d9(com.p314xaae8f345.mm.vfs.w6.i(scrFile, false), dstFile);
        ub0.n[] nVarArr = ub0.n.f507535d;
        if (m72740xa1dcb9d9 != 0 || com.p314xaae8f345.mm.vfs.w6.j(dstFile)) {
            return m72740xa1dcb9d9;
        }
        ub0.n[] nVarArr2 = ub0.n.f507535d;
        return 10001;
    }
}
