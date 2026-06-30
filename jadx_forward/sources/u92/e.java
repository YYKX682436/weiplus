package u92;

/* loaded from: classes2.dex */
public class e extends bz2.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f507357h;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f507358g;

    static {
        new u92.d(null);
        f507357h = jz5.h.b(u92.c.f507356d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(yz5.a r1, p3325xe03a0797.p3326xc267989b.r2 r2, p012xc85e97e9.p093xedfae76a.y r3, u92.f r4, int r5, p3321xbce91901.jvm.p3324x21ffc6bd.i r6) {
        /*
            r0 = this;
            r4 = r5 & 2
            r6 = 0
            if (r4 == 0) goto L6
            r2 = r6
        L6:
            r4 = r5 & 4
            if (r4 == 0) goto Lb
            r3 = r6
        Lb:
            java.lang.String r4 = "initTask"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = "FinderGetTopicInfoFutureTask"
            r0.f507358g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u92.e.<init>(yz5.a, kotlinx.coroutines.r2, androidx.lifecycle.y, u92.f, int, kotlin.jvm.internal.i):void");
    }

    @Override // ay1.l
    public by1.d a() {
        return new u92.b((java.lang.String) c());
    }

    @Override // ay1.l
    public java.lang.String f() {
        return this.f507358g;
    }

    @Override // ay1.l
    public void g(java.lang.Object obj) {
        r45.r03 r03Var;
        r45.q03 q03Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f cgiBack = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507358g, "[onPreloadEnd] topicType:null errType:" + cgiBack.f152148a + " errCode:" + cgiBack.f152149b + " errMsg:" + cgiBack.f152150c);
        if (cgiBack.f152148a != 0 || cgiBack.f152149b != 0 || (r03Var = (r45.r03) ((r45.ma1) cgiBack.f152151d).m75936x14adae67(1)) == null || (q03Var = (r45.q03) r03Var.m75936x14adae67(20)) == null || (m75941xfb821914 = q03Var.m75941xfb821914(0)) == null) {
            return;
        }
    }
}
