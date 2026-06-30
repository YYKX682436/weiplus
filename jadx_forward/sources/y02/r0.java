package y02;

/* loaded from: classes9.dex */
public class r0 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements y02.p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final y02.q0 f540159d = new y02.q0(null);

    public bw5.e6[] a(java.lang.String[] keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        byte[][] m170389x21b906b4 = p3380x6a61f93.p3387xf51c6630.C30629x21b48624.m170389x21b906b4(m105978x2737f10(), keys);
        int length = m170389x21b906b4.length;
        bw5.e6[] e6VarArr = new bw5.e6[length];
        for (int i17 = 0; i17 < length; i17++) {
            e6VarArr[i17] = new bw5.e6();
        }
        for (int i18 = 0; i18 < length; i18++) {
            y02.k.b(m170389x21b906b4[i18], e6VarArr[i18]);
        }
        return e6VarArr;
    }

    public void d(bw5.m7 cgiPreloadInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiPreloadInfo, "cgiPreloadInfo");
        byte[] mo14344x5f01b1f6 = cgiPreloadInfo.mo14344x5f01b1f6();
        long m105978x2737f10 = m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3387xf51c6630.C30629x21b48624.m170387x21b88b00(m105978x2737f10, mo14344x5f01b1f6);
    }

    public void e(bw5.m7 cgiPreloadInfo, bw5.d6 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiPreloadInfo, "cgiPreloadInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        byte[] mo14344x5f01b1f6 = cgiPreloadInfo.mo14344x5f01b1f6();
        byte[] mo14344x5f01b1f62 = config.mo14344x5f01b1f6();
        long m105978x2737f10 = m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f62);
        p3380x6a61f93.p3387xf51c6630.C30629x21b48624.m170391x21ba65c4(m105978x2737f10, mo14344x5f01b1f6, mo14344x5f01b1f62);
    }
}
