package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f170115a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f170116b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.z f170117c;

    /* renamed from: d, reason: collision with root package name */
    public final long f170118d;

    public v0(java.lang.String posterTaskId, java.lang.String savePath, p3325xe03a0797.p3326xc267989b.z deferred, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 8) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterTaskId, "posterTaskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savePath, "savePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deferred, "deferred");
        this.f170115a = posterTaskId;
        this.f170116b = savePath;
        this.f170117c = deferred;
        this.f170118d = j17;
    }

    /* renamed from: equals */
    public boolean m52543xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170115a, v0Var.f170115a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170116b, v0Var.f170116b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170117c, v0Var.f170117c) && this.f170118d == v0Var.f170118d;
    }

    /* renamed from: hashCode */
    public int m52544x8cdac1b() {
        return (((((this.f170115a.hashCode() * 31) + this.f170116b.hashCode()) * 31) + this.f170117c.hashCode()) * 31) + java.lang.Long.hashCode(this.f170118d);
    }

    /* renamed from: toString */
    public java.lang.String m52545x9616526c() {
        return "PosterTask(posterTaskId=" + this.f170115a + ", savePath=" + this.f170116b + ", deferred=" + this.f170117c + ", timestamp=" + this.f170118d + ')';
    }
}
