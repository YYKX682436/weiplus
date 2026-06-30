package jm4;

/* loaded from: classes3.dex */
public class w5 extends com.p314xaae8f345.p3118xeeebfacc.C26830xc629eb9c implements jm4.u5 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f381970d = 0;

    static {
        new jm4.v5(null);
    }

    public void a(byte[] imageData, bw5.tq0 imageInfo, yz5.l lVar) {
        jm4.x1 x1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
        byte[] mo14344x5f01b1f6 = imageInfo.mo14344x5f01b1f6();
        if (lVar == null) {
            x1Var = null;
        } else {
            jm4.x1 x1Var2 = new jm4.x1();
            x1Var2.f381983p = lVar;
            x1Var = x1Var2;
        }
        long m105978x2737f10 = m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        p3380x6a61f93.p3381xf512d0a5.C30462x21b41440.m169137x21b38b4b(m105978x2737f10, imageData, mo14344x5f01b1f6, x1Var);
    }
}
