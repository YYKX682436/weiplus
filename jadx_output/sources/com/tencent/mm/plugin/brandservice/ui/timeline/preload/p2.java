package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.o83 f94407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(r45.o83 o83Var) {
        super(0);
        this.f94407d = o83Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<r45.n83> ReqInfo = this.f94407d.f382027n;
        kotlin.jvm.internal.o.f(ReqInfo, "ReqInfo");
        for (r45.n83 n83Var : ReqInfo) {
            r45.p97 p97Var = new r45.p97();
            p97Var.f382900d = n83Var.f381153e;
            p97Var.f382902f = n83Var.f381159n;
            zw4.n nVar = zw4.n.f476934a;
            p97Var.f382901e = ((java.lang.Number) ((jz5.n) zw4.n.f476937d).getValue()).intValue();
            p97Var.f382907n = n83Var instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.y ? ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.y) n83Var).f94477v : "";
            byte[] byteArray = p97Var.toByteArray();
            com.tencent.mm.sdk.platformtools.v3 v3Var = zw4.n.f476935b;
            ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).H(p97Var.f382900d, byteArray);
            java.lang.String str = p97Var.f382907n;
            if (!(str == null || str.length() == 0)) {
                ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).H(p97Var.f382907n, byteArray);
            }
        }
        return jz5.f0.f302826a;
    }
}
