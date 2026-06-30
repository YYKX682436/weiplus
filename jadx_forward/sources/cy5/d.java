package cy5;

/* loaded from: classes13.dex */
public class d extends cy5.h {
    @Override // cy5.h
    public void b() {
        by5.c4.f(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, "checkFiles, skip");
    }

    @Override // cy5.h
    public java.lang.String g(int i17, boolean z17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            return "";
        }
        if (z17) {
            return o17 + java.io.File.separator + "patch";
        }
        return o17 + java.io.File.separator + "xweb_fullscreen_video.js";
    }

    @Override // cy5.h
    public java.util.List j(int i17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(o17 + java.io.File.separator + "xweb_fullscreen_video.js");
        return arrayList;
    }

    @Override // cy5.h
    public java.lang.String m() {
        return com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450;
    }

    @Override // cy5.h
    public boolean p() {
        return true;
    }

    @Override // cy5.h
    public boolean q() {
        return true;
    }

    @Override // cy5.h
    public int s(by5.n0 n0Var) {
        by5.c4.f(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, "performInstall version " + n0Var.f118107m.f118070e);
        by5.m0 m0Var = n0Var.f118107m;
        if (by5.x.a(m0Var.f118088w, n0Var.f118100f)) {
            u(m0Var.f118070e, true);
            by5.c4.f(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, "performInstall " + this.f306412a + " success");
            return 0;
        }
        by5.c4.c(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, "performInstall failed, md5 not match");
        java.io.File file = new java.io.File(m0Var.f118088w);
        if (file.exists()) {
            file.delete();
        }
        by5.s0.g(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450, false);
        return -2;
    }
}
