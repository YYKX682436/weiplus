package lt3;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f402730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, lt3.f0 f0Var) {
        super(1);
        this.f402730d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean z17 = str == null || str.length() == 0;
        lt3.f0 f0Var = this.f402730d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.VideoMixer", "remux failed, ret path is null");
            yz5.r rVar = f0Var.f402746b;
            if (rVar != null) {
                rVar.C("", "", java.lang.Boolean.FALSE, -1);
            }
        } else {
            mt3.a aVar = f0Var.f402745a;
            mt3.a aVar2 = f0Var.f402745a;
            aVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            aVar.f412826e = str;
            zv3.g gVar = f0Var.f402749e;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameRetriever");
                throw null;
            }
            gVar.c();
            try {
                dw3.d0 a17 = dw3.e0.f325735a.a(aVar2.f412826e);
                if (a17 != null) {
                    nu3.l.f421761a.a(f0Var.f402750f.f494070h, a17.f325727e, a17.f325728f);
                }
            } catch (java.lang.Exception unused) {
            }
            java.lang.String b17 = lt3.f0.b(f0Var);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "mix create thumb failed");
                yz5.r rVar2 = f0Var.f402746b;
                if (rVar2 != null) {
                    rVar2.C(aVar2.f412826e, "", java.lang.Boolean.FALSE, -1);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "mix create thumb succ");
                yz5.r rVar3 = f0Var.f402746b;
                if (rVar3 != null) {
                    java.lang.String str2 = aVar2.f412826e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                    rVar3.C(str2, b17, java.lang.Boolean.TRUE, -1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
