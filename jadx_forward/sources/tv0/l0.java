package tv0;

/* loaded from: classes5.dex */
public final class l0 implements rv0.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d f503749a;

    public l0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d) {
        this.f503749a = c10942x373bdc1d;
    }

    @Override // rv0.g5
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a targetTime, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetTime, "targetTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d = this.f503749a;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c10942x373bdc1d.f150817z;
        bx0.h timelineLayoutCalc = c10942x373bdc1d.getTimelineLayoutCalc();
        if (!targetTime.m33983x7b953cf2() || c4181x2248e1a3 == null || timelineLayoutCalc == null) {
            return;
        }
        c10942x373bdc1d.post(new tv0.m0(c10942x373bdc1d, timelineLayoutCalc.f117810d.f117800s.m34345x1629663d(targetTime.sub(c4181x2248e1a3.x1().m34009x8082fb99())) - c10942x373bdc1d.m47432x1e87e5ec().f328577a));
    }
}
