package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoBizPkgManagement;", "Llc3/f0;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement */
/* loaded from: classes7.dex */
public class C16427x6ba5962c extends lc3.f0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229446e;

    /* renamed from: f, reason: collision with root package name */
    public final wc3.c f229447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16427x6ba5962c(java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f229446e = "MagicBrushDemoPkgManagement";
        if (((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicBrushDemo").length() > 0) {
            this.f229447f = new wc3.c(instanceName);
        }
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 u1Var;
        wc3.c cVar = this.f229447f;
        return (cVar == null || (u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1) ((jz5.n) cVar.f399448g).mo141623x754a37bb()) == null) ? new wc3.a() : u1Var;
    }

    @Override // jc3.x
    public java.lang.String d() {
        return "MagicBrushDemo";
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f229446e, "provideMainScript");
        if (this.f229447f != null) {
            ik1.b0 b0Var = new ik1.b0();
            b().mo49306xcc440832("/index.js", 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, b0Var);
            if (b0Var.f373357a != null) {
                byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "arrayOfByteBuffer(...)");
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
                cb6.mo146xb9724478(kz5.b0.c(new lc3.j0(new java.lang.String(a17, UTF_8))));
                return;
            }
        }
        java.lang.String e17 = ik1.f.e("magicbrush-demo.js");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getAssetAsString(...)");
        cb6.mo146xb9724478(kz5.b0.c(new lc3.j0(e17)));
    }

    @Override // jc3.x
    public java.lang.String g() {
        return "MagicBrushDemo";
    }

    @Override // jc3.x
    /* renamed from: release */
    public void mo66315x41012807() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.m5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d4.class))).wi(this.f399427d);
    }
}
