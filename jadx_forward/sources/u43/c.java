package u43;

/* loaded from: classes8.dex */
public final class c extends j43.a {
    @Override // j43.d
    public java.lang.String a() {
        return "INSERT OR REPLACE INTO `ApkChannelPatchInfo` (`pkgName`,`isServerPatch`,`patchPath`,`newChannelApkPath`,`taskStatus`) VALUES (?,?,?,?,?)";
    }

    @Override // j43.a
    public void b(p75.k stmt, java.lang.Object obj) {
        u43.b entity = (u43.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stmt, "stmt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity, "entity");
        ((p75.e0) stmt).a(new java.lang.Object[]{entity.f67993x55b38832, java.lang.Boolean.valueOf(entity.f67989xf72be4b6), entity.f67992x7c02bf88, entity.f67990x867b0399, java.lang.Integer.valueOf(entity.f67997xf2f12e3c)});
    }
}
