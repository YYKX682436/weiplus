package dt1;

/* loaded from: classes12.dex */
public class c extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f324669i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f324670m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f324671n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f324672o;

    /* renamed from: p, reason: collision with root package name */
    public final m11.d f324673p;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, m11.d r15) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.c.<init>(int, java.lang.String, java.lang.String, java.lang.String, m11.d):void");
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSendImage", "[onSendFailed] bizType=" + this.f324669i + " sessionId=" + this.f324670m + " toUsername=" + this.f324672o + " fromUsername=" + this.f324671n + " errCode:" + i18 + " errMsg:" + str);
        ((e80.j) this.f324673p.f404203u).a(resp.f466663d, c01.id.e(), i17, i18, "");
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendImage", "[onSendSuccessfully] bizType=" + this.f324669i + " msgSvrId=" + resp.f466663d + "  sessionId=" + this.f324670m + " toUsername=" + this.f324672o + " fromUsername=" + this.f324671n);
        ((e80.j) this.f324673p.f404203u).a(resp.f466663d, c01.id.e(), 0, 0, "");
    }
}
