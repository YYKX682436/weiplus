package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class q4 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294668e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22760xc8958b72 f294670g;

    public q4(com.p314xaae8f345.mm.vfs.C22760xc8958b72 c22760xc8958b72, com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294670g = c22760xc8958b72;
        this.f294668e = q2Var;
        this.f294669f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294669f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294668e;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        long s17 = com.p314xaae8f345.mm.vfs.e8.s("qq-music-cache-clean");
        if (s17 < 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.QQMusicCacheCleanupFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", java.lang.Long.valueOf(s17), 1209600000L);
        } else {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e = mo82286x32b09e("");
            if (mo82286x32b09e == null) {
                mo82286x32b09e = java.util.Collections.emptyList();
            }
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("mediaHttpCommonPlayer[0-9]+tmp");
            int i17 = 0;
            long j17 = 0;
            long j18 = 0;
            int i18 = 0;
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : mo82286x32b09e) {
                if (!x1Var.f294769f) {
                    boolean matches = compile.matcher(x1Var.f294765b).matches();
                    long j19 = x1Var.f294767d;
                    if (matches) {
                        x1Var.a();
                        i17++;
                        j17 += j19;
                    } else {
                        i18++;
                        j18 += j19;
                    }
                    cancellationSignal.throwIfCanceled();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.QQMusicCacheCleanupFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18));
            J(2, "deletedFiles", java.lang.Integer.valueOf(i17), "deletedSize", java.lang.Long.valueOf(j17), "keptFiles", java.lang.Integer.valueOf(i18), "keptSize", java.lang.Long.valueOf(j18));
            com.p314xaae8f345.mm.vfs.e8.t("qq-music-cache-clean");
        }
        cancellationSignal.throwIfCanceled();
        super.q(cancellationSignal);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "qqMusicCacheGC <- " + this.f294668e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294670g;
    }
}
