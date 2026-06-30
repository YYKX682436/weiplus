package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public class l1 implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.n1 f81091a;

    public l1(com.tencent.mm.plugin.appbrand.jsapi.file.n1 n1Var) {
        this.f81091a = n1Var;
    }

    @Override // kk3.b
    public void a(java.util.List list) {
        rh1.a aVar;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next();
            if (multiTaskInfo != null && multiTaskInfo.field_type == 4 && multiTaskInfo.field_data != null) {
                r45.qs0 qs0Var = new r45.qs0();
                try {
                    qs0Var.parseFrom(multiTaskInfo.field_data);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOpenDocument", "handleMultiTaskInfoClicked", th6);
                }
                java.lang.String string = qs0Var.getString(3);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                com.tencent.mm.plugin.appbrand.jsapi.file.n1 n1Var = this.f81091a;
                if (string.equals(n1Var.f81101g) && (aVar = n1Var.f81102h) != null) {
                    aVar.c0(bm5.f1.a());
                }
            }
        }
    }
}
