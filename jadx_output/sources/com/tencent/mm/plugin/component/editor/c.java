package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f96535a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f96536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96537c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f96538d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f96539e;

    /* renamed from: f, reason: collision with root package name */
    public long f96540f;

    /* renamed from: g, reason: collision with root package name */
    public long f96541g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f96542h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f96543i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f96544j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.a f96545k;

    /* renamed from: l, reason: collision with root package name */
    public final int f96546l;

    public c(r45.gp0 gp0Var, boolean z17, com.tencent.mm.plugin.component.editor.a aVar, int i17) {
        this.f96535a = gp0Var;
        this.f96544j = z17;
        this.f96545k = aVar;
        if (aVar == com.tencent.mm.plugin.component.editor.a.TYPE_FILE) {
            this.f96536b = gp0Var.T;
            this.f96540f = gp0Var.R;
            this.f96543i = gp0Var.f375438u;
            this.f96542h = gp0Var.f375434s;
            this.f96538d = hx1.b.c(gp0Var);
            int i18 = gp0Var.I;
            if (i18 == 3) {
                this.f96537c = o72.x1.P(gp0Var.K);
            } else {
                this.f96537c = i18;
            }
        } else {
            this.f96536b = gp0Var.T + "_t";
            this.f96543i = gp0Var.f375420m;
            this.f96542h = gp0Var.f375412h;
            this.f96540f = gp0Var.f375418l1;
            this.f96538d = hx1.b.e(gp0Var);
        }
        this.f96539e = this.f96538d + ".temp";
        if (!z17 && (com.tencent.mm.sdk.platformtools.t8.K0(this.f96543i) || com.tencent.mm.sdk.platformtools.t8.K0(this.f96542h))) {
            com.tencent.mars.xlog.Log.e("Editor.CdnInfo", "getCdnDataInfo, type recv, cdnDataUrl must not be null!");
        }
        if (z17 && com.tencent.mm.sdk.platformtools.t8.K0(this.f96538d)) {
            com.tencent.mars.xlog.Log.e("Editor.CdnInfo", "getCdnDataInfo, type send, path must not be null!");
        }
        this.f96546l = i17;
    }

    public java.lang.String toString() {
        return "CdnInfo{dataId='" + this.f96536b + "', dataType=" + this.f96537c + ", path='" + this.f96538d + "', tempPath='" + this.f96539e + "', totalLen=" + this.f96540f + ", cdnUrl='" + this.f96542h + "', cdnKey='" + this.f96543i + "', isSend=" + this.f96544j + ", mediaType=" + this.f96545k + '}';
    }
}
