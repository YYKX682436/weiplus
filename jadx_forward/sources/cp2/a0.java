package cp2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f302303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ym5.s3 s3Var, cp2.v0 v0Var) {
        super(0);
        this.f302303d = s3Var;
        this.f302304e = v0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.AbstractCollection m56387xe6796cde;
        ym5.s3 s3Var = this.f302303d;
        if (s3Var == null) {
            s3Var = new ym5.s3(0);
            s3Var.f545051c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
        }
        cp2.v0 v0Var = this.f302304e;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = ((cp2.q1) v0Var.z()).g();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = g17 != null ? g17.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        boolean z17 = (c22848x6ddd90cf != null ? c22848x6ddd90cf.x() : 0) <= 0;
        boolean z18 = s3Var.f545049a != 2 && s3Var.f545050b == -2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "[checkEmptyHeader] isEmpty=" + z17 + " reason=" + s3Var + " refreshAndNoPermission:" + z18);
        so2.s sVar = v0Var.D;
        if (z17 || z18) {
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = v0Var.f302476w;
                if (c14500x958689dc != null && (m56387xe6796cde = c14500x958689dc.m56387xe6796cde()) != null) {
                    m56387xe6796cde.clear();
                }
                if (c22848x6ddd90cf != null) {
                    c22848x6ddd90cf.m8146xced61ae5();
                }
            }
            mn5.a m82914x4c6bcf83 = ((cp2.q1) v0Var.z()).j().m82914x4c6bcf83();
            if (m82914x4c6bcf83 != null) {
                m82914x4c6bcf83.f411727d = false;
            }
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            sVar.getClass();
            sVar.f492115d = string;
            sVar.f492116e = s3Var.f545050b;
            sVar.f492117f = 1001;
            java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.era);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            sVar.f492115d = string2;
            r45.dd2 dd2Var = v0Var.f302467n;
            if (dd2Var != null) {
                java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6v, dd2Var.m75945x2fec8307(1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                sVar.getClass();
                sVar.f492115d = string3;
                sVar.f492119h = 1000;
                java.lang.Object obj = s3Var.f545052d;
                if (obj instanceof r45.wc1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpLiveTab");
                    r45.dd2 dd2Var2 = (r45.dd2) ((r45.wc1) obj).m75936x14adae67(1);
                    if (dd2Var2 != null) {
                        if (dd2Var.m75939xb282bd08(0) == dd2Var2.m75939xb282bd08(0)) {
                            sVar.f492119h = 1000;
                            java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6v, dd2Var.m75945x2fec8307(1));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                            sVar.f492115d = string4;
                        } else {
                            sVar.f492119h = 2000;
                            sVar.f492115d = java.lang.String.valueOf(dd2Var.m75945x2fec8307(1));
                            sVar.f492120i = new cp2.z(v0Var, dd2Var2);
                        }
                    }
                }
            }
            if ((c22848x6ddd90cf == null || c22848x6ddd90cf.W(sVar)) ? false : true) {
                c22848x6ddd90cf.Q(sVar, false);
            } else if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.c0(sVar.hashCode());
            }
        } else if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.i0(sVar.hashCode(), false);
        }
        ((cp2.q1) v0Var.z()).j().setNestedScrollingEnabled((s3Var.f545050b == -1 && z17) ? false : true);
        return jz5.f0.f384359a;
    }
}
