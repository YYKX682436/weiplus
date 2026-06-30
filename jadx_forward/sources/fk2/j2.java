package fk2;

/* loaded from: classes3.dex */
public final class j2 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fk2.l2 f344944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f344945b;

    public j2(fk2.l2 l2Var, dk2.zf zfVar) {
        this.f344944a = l2Var;
        this.f344945b = zfVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.v62 v62Var;
        int i17;
        java.lang.Object obj;
        java.util.List a17 = this.f344944a.f526773a.a();
        if (a17 != null) {
            java.util.Iterator it = a17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String m75945x2fec8307 = ((r45.v62) obj).m75945x2fec8307(0);
                java.lang.Object D = this.f344945b.D();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(D, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveAppMsgRecvRedPacketInfo");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(m75945x2fec8307, ((r45.vj1) D).m75945x2fec8307(0))) {
                    break;
                }
            }
            v62Var = (r45.v62) obj;
        } else {
            v62Var = null;
        }
        if (android.text.TextUtils.isEmpty(v62Var != null ? v62Var.m75945x2fec8307(4) : null)) {
            ml2.e5 e5Var = ml2.e5.f408922e;
            i17 = 1;
        } else {
            ml2.e5 e5Var2 = ml2.e5.f408922e;
            i17 = 2;
        }
        return kz5.b1.e(new jz5.l("cur_red_packet_source", java.lang.Integer.valueOf(i17)));
    }
}
