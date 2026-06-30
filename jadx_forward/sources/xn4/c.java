package xn4;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f537135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 f537136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537136e = abstractActivityC18781x2874f4a4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xn4.c(this.f537136e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xn4.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f537135d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4 abstractActivityC18781x2874f4a4 = this.f537136e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xn4.c0 c0Var = xn4.c0.f537137a;
            java.lang.String cdnUrl = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl, "cdnUrl");
            java.lang.String g17 = c0Var.g(cdnUrl);
            this.f537135d = 1;
            obj = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ni(g17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "isCdnDownloading: " + booleanValue);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2319xf206e0c9.p2321xbe57a114.AbstractActivityC18781x2874f4a4.f257041g;
        abstractActivityC18781x2874f4a4.getClass();
        if (booleanValue) {
            xn4.c0 c0Var2 = xn4.c0.f537137a;
            java.lang.String cdnUrl2 = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl2, "cdnUrl");
            if (c0Var2.e(cdnUrl2) != 1) {
                java.lang.String cdnUrl3 = abstractActivityC18781x2874f4a4.V6().f462210p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl3, "cdnUrl");
                c0Var2.i(cdnUrl3, 1);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var3 = xn4.c0.f537137a;
            java.lang.String cdnUrl4 = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl4, "cdnUrl");
            if (c0Var3.e(cdnUrl4) == 1) {
                java.lang.String cdnUrl5 = abstractActivityC18781x2874f4a4.V6().f462210p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl5, "cdnUrl");
                c0Var3.i(cdnUrl5, 0);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var4 = xn4.c0.f537137a;
            java.lang.String cdnUrl6 = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl6, "cdnUrl");
            if (abstractActivityC18781x2874f4a4.U6(c0Var4.f(cdnUrl6))) {
                java.lang.String cdnUrl7 = abstractActivityC18781x2874f4a4.V6().f462210p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl7, "cdnUrl");
                c0Var4.i(cdnUrl7, 2);
            }
        }
        if (!booleanValue) {
            xn4.c0 c0Var5 = xn4.c0.f537137a;
            java.lang.String cdnUrl8 = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl8, "cdnUrl");
            if (!abstractActivityC18781x2874f4a4.U6(c0Var5.f(cdnUrl8))) {
                java.lang.String cdnUrl9 = abstractActivityC18781x2874f4a4.V6().f462210p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl9, "cdnUrl");
                c0Var5.i(cdnUrl9, 0);
            }
        }
        abstractActivityC18781x2874f4a4.Z6();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            xn4.c0 c0Var6 = xn4.c0.f537137a;
            java.lang.String cdnUrl10 = abstractActivityC18781x2874f4a4.V6().f462210p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl10, "cdnUrl");
            if (c0Var6.e(cdnUrl10) == 2) {
                java.lang.String cdnUrl11 = abstractActivityC18781x2874f4a4.V6().f462210p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cdnUrl11, "cdnUrl");
                if (abstractActivityC18781x2874f4a4.U6(c0Var6.f(cdnUrl11))) {
                    abstractActivityC18781x2874f4a4.Y6(abstractActivityC18781x2874f4a4.V6());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload but has been success");
                    return f0Var;
                }
            }
        }
        if (booleanValue) {
            abstractActivityC18781x2874f4a4.b7();
        }
        return f0Var;
    }
}
