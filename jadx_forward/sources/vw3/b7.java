package vw3;

/* loaded from: classes12.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f522428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f522429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f522433i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f522429e = c22621x7603e017;
        this.f522430f = str;
        this.f522431g = str2;
        this.f522432h = str3;
        this.f522433i = repairerUploadTestUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vw3.b7(this.f522429e, this.f522430f, this.f522431g, this.f522432h, this.f522433i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.b7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r05.i iVar;
        v05.b k17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f522428d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f522433i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f522429e;
            android.text.Editable text = c22621x7603e017.getText();
            long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(c22621x7603e017.getText().toString()) : 0L;
            c01.h7 h7Var = new c01.h7();
            h7Var.f118760b = parseLong;
            h7Var.f118762d = this.f522430f;
            l15.c cVar = new l15.c();
            cVar.m126728xdc93280d(this.f522431g);
            if (ot.a.b(cVar) == null) {
                cVar.q(new v05.b());
            }
            v05.b k18 = cVar.k();
            if ((k18 != null ? (v05.a) k18.m75936x14adae67(k18.f513848e + 8) : null) == null && (k17 = cVar.k()) != null) {
                k17.set(k17.f513848e + 8, new v05.a());
            }
            pu.l lVar = new pu.l();
            lVar.f439859a = h7Var;
            v05.b k19 = cVar.k();
            if (k19 != null && (iVar = (r05.i) k19.m75936x14adae67(k19.f513848e + 22)) != null) {
                lVar.f439862d = iVar.j();
                lVar.f439861c = iVar.k();
                lVar.f439860b = iVar.l();
            }
            java.lang.String r17 = c01.z1.r();
            if (r17 == null) {
                r17 = "";
            }
            pu.p pVar = new pu.p(r17, this.f522432h, cVar, new java.lang.ref.WeakReference(repairerUploadTestUI.f), lVar);
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            this.f522428d = 1;
            ((ot.g) g0Var).getClass();
            ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            if (!jm0.g.class.isAssignableFrom(pu.o.class)) {
                throw new java.lang.IllegalArgumentException(ot.g.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(gVar.getViewModel(), new jm0.e(gVar)).a(pu.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            obj = ((pu.o) ((jm0.g) a17)).T6(pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        pu.q qVar = (pu.q) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(repairerUploadTestUI.d, "send app msg result:" + qVar.f439896a);
        if (qVar.f439896a == pu.r.f439899d) {
            repairerUploadTestUI.runOnUiThread(new vw3.z6(repairerUploadTestUI));
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.a7(repairerUploadTestUI));
        }
        return jz5.f0.f384359a;
    }
}
