package gk5;

/* loaded from: classes9.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f354214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f354215g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354216h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f354217i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType f354218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.String str, boolean z17, long j17, java.lang.String str2, gk5.r0 r0Var, com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71.WWAppType wWAppType, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354213e = str;
        this.f354214f = z17;
        this.f354215g = j17;
        this.f354216h = str2;
        this.f354217i = r0Var;
        this.f354218m = wWAppType;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gk5.l0(this.f354213e, this.f354214f, this.f354215g, this.f354216h, this.f354217i, this.f354218m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354212d;
        gk5.r0 r0Var = this.f354217i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f354213e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            bVar.f425659e = str;
            boolean z17 = this.f354214f;
            bVar.f425662h = z17;
            if (!z17) {
                bVar.f425657c = this.f354215g;
                bVar.f425658d = this.f354216h;
            }
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f425661g = new bt3.g0();
            ym5.a1.f(new gk5.i0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f354212d = 1;
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
        ym5.a1.f(new gk5.j0(r0Var));
        if (cVar.f425664a == oc0.d.f425666d) {
            try {
                r45.w43 w43Var = new r45.w43();
                w43Var.f470405d = java.lang.String.valueOf(c01.id.c());
                w43Var.f470406e = 49;
                java.lang.String str2 = cVar.f425665b;
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                byte[] bytes = str2.getBytes(forName);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                w43Var.f470407f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(w43Var);
                ((dk5.s5) tg3.t1.a()).wi(r0Var.m158354x19263085(), com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.c(this.f354218m), arrayList, new gk5.k0(r0Var));
            } catch (java.lang.Exception e17) {
                r0Var.V6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardNoteToWeWorkUIC", e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            r0Var.V6();
        }
        return jz5.f0.f384359a;
    }
}
