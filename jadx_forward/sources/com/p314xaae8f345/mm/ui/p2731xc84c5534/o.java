package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f291239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f291240b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f291241c;

    /* renamed from: d, reason: collision with root package name */
    public final long f291242d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.g f291243e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.m f291244f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.l f291245g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.n f291246h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.h f291247i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.c f291248j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.j f291249k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2731xc84c5534.e f291250l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f291251m;

    public o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.String fileExt, java.lang.String dataId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileExt, "fileExt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataId, "dataId");
        this.f291239a = msgInfo;
        this.f291240b = fileExt;
        this.f291241c = dataId;
        this.f291242d = j17;
        this.f291243e = com.p314xaae8f345.mm.ui.p2731xc84c5534.g.f291173f;
        this.f291244f = com.p314xaae8f345.mm.ui.p2731xc84c5534.m.f291228h;
        this.f291245g = com.p314xaae8f345.mm.ui.p2731xc84c5534.l.f291219g;
        this.f291246h = com.p314xaae8f345.mm.ui.p2731xc84c5534.n.f291234e;
        this.f291247i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h.f291176e;
        this.f291248j = com.p314xaae8f345.mm.ui.p2731xc84c5534.c.f291154e;
        this.f291249k = com.p314xaae8f345.mm.ui.p2731xc84c5534.j.f291208g;
        this.f291250l = com.p314xaae8f345.mm.ui.p2731xc84c5534.e.f291163g;
    }

    /* renamed from: equals */
    public boolean m80940xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2731xc84c5534.o)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = (com.p314xaae8f345.mm.ui.p2731xc84c5534.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f291239a, oVar.f291239a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f291240b, oVar.f291240b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f291241c, oVar.f291241c) && this.f291242d == oVar.f291242d;
    }

    /* renamed from: hashCode */
    public int m80941x8cdac1b() {
        return (((((this.f291239a.hashCode() * 31) + this.f291240b.hashCode()) * 31) + this.f291241c.hashCode()) * 31) + java.lang.Long.hashCode(this.f291242d);
    }

    /* renamed from: toString */
    public java.lang.String m80942x9616526c() {
        return "FilePreviewReportParams(msgInfo=" + this.f291239a + ", fileExt=" + this.f291240b + ", dataId=" + this.f291241c + ", fileSize=" + this.f291242d + ')';
    }

    public /* synthetic */ o(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f9Var, str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? 0L : j17);
    }
}
