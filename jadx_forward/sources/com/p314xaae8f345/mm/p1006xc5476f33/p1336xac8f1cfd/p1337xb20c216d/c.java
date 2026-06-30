package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f178068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f178069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178070c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f178071d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f178072e;

    /* renamed from: f, reason: collision with root package name */
    public long f178073f;

    /* renamed from: g, reason: collision with root package name */
    public long f178074g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f178075h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f178076i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f178077j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a f178078k;

    /* renamed from: l, reason: collision with root package name */
    public final int f178079l;

    public c(r45.gp0 gp0Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a aVar, int i17) {
        this.f178068a = gp0Var;
        this.f178077j = z17;
        this.f178078k = aVar;
        if (aVar == com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.a.TYPE_FILE) {
            this.f178069b = gp0Var.T;
            this.f178073f = gp0Var.R;
            this.f178076i = gp0Var.f456971u;
            this.f178075h = gp0Var.f456967s;
            this.f178071d = hx1.b.c(gp0Var);
            int i18 = gp0Var.I;
            if (i18 == 3) {
                this.f178070c = o72.x1.P(gp0Var.K);
            } else {
                this.f178070c = i18;
            }
        } else {
            this.f178069b = gp0Var.T + "_t";
            this.f178076i = gp0Var.f456953m;
            this.f178075h = gp0Var.f456945h;
            this.f178073f = gp0Var.f456951l1;
            this.f178071d = hx1.b.e(gp0Var);
        }
        this.f178072e = this.f178071d + ".temp";
        if (!z17 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178076i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178075h))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Editor.CdnInfo", "getCdnDataInfo, type recv, cdnDataUrl must not be null!");
        }
        if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178071d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Editor.CdnInfo", "getCdnDataInfo, type send, path must not be null!");
        }
        this.f178079l = i17;
    }

    /* renamed from: toString */
    public java.lang.String m54582x9616526c() {
        return "CdnInfo{dataId='" + this.f178069b + "', dataType=" + this.f178070c + ", path='" + this.f178071d + "', tempPath='" + this.f178072e + "', totalLen=" + this.f178073f + ", cdnUrl='" + this.f178075h + "', cdnKey='" + this.f178076i + "', isSend=" + this.f178077j + ", mediaType=" + this.f178078k + '}';
    }
}
