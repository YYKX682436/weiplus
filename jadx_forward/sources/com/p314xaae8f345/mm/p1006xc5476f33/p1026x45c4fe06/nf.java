package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class nf {
    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMapUtil", "hy: getting sourcemap %s, %s", str, str2);
        if (c11510xdd90c2f2 == null || str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SourceMapUtil", "runtime or jsRuntime or filePath is null.");
            return "";
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(c11510xdd90c2f2.f156338p.f158814g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        }
        java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.p(c11510xdd90c2f2, str.concat(".map"));
        if (p17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMapUtil", "sourceMap of the script(%s) is null or nil.", str);
            return "";
        }
        return java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap['%s'] = %s)", str2 + str, p17);
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d3.b(tVar, null, c(yVar), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mf());
        tVar.mo14660x738236e6(java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", android.os.Build.VERSION.RELEASE), null);
    }

    public static java.lang.String c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMapUtil", "hy: injecting sourcemap.js");
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SourceMapUtil", "hy: not valid runtime");
            return "";
        }
        if (yVar.t3() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SourceMapUtil", "hy: runtime not prepared. do not try to inject sourcemap.js. maybe preloading");
            return "";
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(yVar.t3().f156338p.f158814g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
        if (interfaceC11702x4ae7c33 != null) {
            return interfaceC11702x4ae7c33.M("WASourceMap.js");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SourceMapUtil", "execSourceMapScript NULL reader");
        return "";
    }
}
