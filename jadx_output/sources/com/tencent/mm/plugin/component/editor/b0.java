package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f96532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorImageUI f96533g;

    public b0(com.tencent.mm.plugin.component.editor.EditorImageUI editorImageUI, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f96533g = editorImageUI;
        this.f96530d = list;
        this.f96531e = str;
        this.f96532f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (java.lang.String str : this.f96530d) {
            java.lang.String r17 = c01.z1.r();
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            java.lang.String str2 = this.f96533g.f96484m;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            r70.g gVar = new r70.g(str2, 0, r17 == null ? "" : r17, str == null ? "" : str, i0Var);
            gVar.f393108j = "editor_ui_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96531e)) {
                if (w11.t1.a(str)) {
                    w11.r1 a17 = w11.s1.a(str);
                    a17.g(str);
                    a17.e(this.f96531e);
                    a17.h(c01.e2.C(str));
                    a17.b();
                } else {
                    w11.r1 a18 = w11.s1.a(str);
                    a18.g(str);
                    a18.e(this.f96531e);
                    a18.h(c01.e2.C(str));
                    a18.f442131f = 0;
                    a18.f442134i = 4;
                    a18.a().a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.component.editor.a0(this));
        com.tencent.mm.sdk.platformtools.u3.h(this.f96532f);
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult";
    }
}
