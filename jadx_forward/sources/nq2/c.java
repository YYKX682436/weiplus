package nq2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f420512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Intent intent) {
        super(1);
        this.f420512d = intent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String invokeSource = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "startPreloadSquareTabs invoke:".concat(invokeSource));
        pq2.h hVar = nq2.d.f420514b;
        if (hVar != null) {
            hVar.i();
        }
        pq2.h hVar2 = new pq2.h();
        nq2.d.f420514b = hVar2;
        android.content.Intent intent = this.f420512d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        hVar2.f439129o = new r45.qt2();
        if (c92.g.f121271a.b()) {
            r45.qt2 qt2Var = hVar2.f439129o;
            if (qt2Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            qt2Var.set(2, "8001-" + c01.id.c());
            r45.qt2 qt2Var2 = hVar2.f439129o;
            if (qt2Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            qt2Var2.set(5, java.lang.Integer.valueOf(((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, 0)));
        } else {
            r45.qt2 qt2Var3 = hVar2.f439129o;
            if (qt2Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            wo2.n0 n0Var = wo2.n0.f529638a;
            qt2Var3.set(2, n0Var.d() + '-' + c01.id.c());
            r45.qt2 qt2Var4 = hVar2.f439129o;
            if (qt2Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            qt2Var4.set(5, java.lang.Integer.valueOf(n0Var.a()));
        }
        r45.qt2 qt2Var5 = hVar2.f439129o;
        if (qt2Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).nk();
        }
        qt2Var5.set(1, stringExtra);
        r45.qt2 qt2Var6 = hVar2.f439129o;
        if (qt2Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        if (!android.text.TextUtils.isEmpty(qt2Var6.m75945x2fec8307(1))) {
            dp2.a aVar = dp2.a.f323716a;
            r45.qt2 qt2Var7 = hVar2.f439129o;
            if (qt2Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                throw null;
            }
            java.lang.String m75945x2fec8307 = qt2Var7.m75945x2fec8307(1);
            hVar2.f439132r = (java.lang.String) r26.n0.f0(m75945x2fec8307 == null ? "" : m75945x2fec8307, new java.lang.String[]{"-"}, false, 0, 6, null).get(0);
        }
        r45.qt2 qt2Var8 = hVar2.f439129o;
        if (qt2Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        qt2Var8.set(0, Ri);
        r45.qt2 qt2Var9 = hVar2.f439129o;
        if (qt2Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var9.set(9, "");
        r45.qt2 qt2Var10 = hVar2.f439129o;
        if (qt2Var10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var10.set(11, "");
        r45.qt2 qt2Var11 = hVar2.f439129o;
        if (qt2Var11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
            throw null;
        }
        qt2Var11.set(12, "");
        hVar2.f439130p = intent.getIntExtra("key_request_scene", 0);
        pq2.h hVar3 = nq2.d.f420514b;
        if (hVar3 != null) {
            hVar3.h();
        }
        return jz5.f0.f384359a;
    }
}
