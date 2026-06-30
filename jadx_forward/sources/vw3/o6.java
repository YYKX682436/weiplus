package vw3;

/* loaded from: classes9.dex */
public final class o6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f522587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f522588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(long j17, java.lang.String str, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522588e = j17;
        this.f522589f = str;
        this.f522590g = repairerUploadTestUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw3.o6(this.f522588e, this.f522589f, this.f522590g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.o6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522587d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522590g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oc0.b bVar = new oc0.b();
            bVar.f425656b = 0L;
            bVar.f425657c = this.f522588e;
            bVar.f425658d = "ForwardUsername";
            bVar.f425660f = "ForwardUsername";
            java.lang.String str = this.f522589f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f425659e = str;
            bVar.f425662h = false;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f425661g = new bt3.g0();
            repairerUploadTestUI.runOnUiThread(new vw3.l6(repairerUploadTestUI));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f522587d = 1;
            obj = ((zs3.z) kVar).hj(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        oc0.c cVar = (oc0.c) obj;
        repairerUploadTestUI.runOnUiThread(new vw3.m6(repairerUploadTestUI));
        if (cVar.f425664a == oc0.d.f425666d) {
            try {
                java.lang.String format = java.lang.String.format("record_attach_upload_xml_" + c01.id.c() + ".txt", java.util.Arrays.copyOf(new java.lang.Object[0], 0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
                byte[] bytes = cVar.f425665b.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                ((zc0.h) i1Var).aj(format, bytes, true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(repairerUploadTestUI.d, e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.n6(repairerUploadTestUI));
        }
        return jz5.f0.f384359a;
    }
}
