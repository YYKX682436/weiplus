package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f96565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorFileUI f96566g;

    public h(com.tencent.mm.plugin.component.editor.EditorFileUI editorFileUI, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f96566g = editorFileUI;
        this.f96563d = list;
        this.f96564e = str;
        this.f96565f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String c17 = hx1.b.c(this.f96566g.f96470s);
        com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = new com.tencent.mm.opensdk.modelmsg.WXFileObject();
        wXFileObject.setFilePath(c17);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        r45.gp0 gp0Var = this.f96566g.f96470s;
        wXMediaMessage.title = gp0Var.f375404d;
        wXMediaMessage.description = gp0Var.f375408f;
        wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.x1(hx1.b.e(gp0Var));
        for (java.lang.String str : this.f96563d) {
            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage, "", "", str, 3, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96564e)) {
                if (w11.t1.a(str)) {
                    w11.r1 a17 = w11.s1.a(str);
                    a17.g(str);
                    a17.e(this.f96564e);
                    a17.h(c01.e2.C(str));
                    a17.b();
                } else {
                    w11.r1 a18 = w11.s1.a(str);
                    a18.g(str);
                    a18.e(this.f96564e);
                    a18.h(c01.e2.C(str));
                    a18.f442131f = 0;
                    a18.f442134i = 4;
                    a18.a().a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.component.editor.g(this));
        com.tencent.mm.sdk.platformtools.u3.h(this.f96565f);
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult2";
    }
}
