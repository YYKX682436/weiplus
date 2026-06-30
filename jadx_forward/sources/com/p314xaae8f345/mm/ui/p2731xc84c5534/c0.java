package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* loaded from: classes12.dex */
public final /* synthetic */ class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public c0(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.class, "reportClickedToOpenFile", "reportClickedToOpenFile(Lcom/tencent/mm/ui/report/FilePreviewReporter$FilePreviewReportParams;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.o p07 = (com.p314xaae8f345.mm.ui.p2731xc84c5534.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.ui.p2731xc84c5534.d0 d0Var = (com.p314xaae8f345.mm.ui.p2731xc84c5534.d0) this.f72685xcfcbe9ef;
        d0Var.getClass();
        java.util.HashMap c17 = d0Var.c(p07);
        c17.put("click_open_method", java.lang.Integer.valueOf(p07.f291247i.f291180d));
        c17.put("is_normal_render", java.lang.Integer.valueOf(p07.f291246h.f291238d));
        d0Var.a(c17, p07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.FilePreviewReporter", "reportClickedToOpenFile " + c17);
        dy1.r b17 = d0Var.b();
        if (b17 != null) {
            ((cy1.a) b17).Ej("click_open_file", c17, 36223);
        }
        return jz5.f0.f384359a;
    }
}
