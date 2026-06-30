package rv0;

/* loaded from: classes5.dex */
public final class l5 implements rv0.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 f481636a;

    public l5(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 c10941x9ba2abc0) {
        this.f481636a = c10941x9ba2abc0;
    }

    @Override // rv0.g5
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a targetTime, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        bx0.h timelineLayoutCalc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetTime, "targetTime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 c10941x9ba2abc0 = this.f481636a;
        c10941x9ba2abc0.getClass();
        if (targetTime.m33983x7b953cf2() && (timelineLayoutCalc = c10941x9ba2abc0.getTimelineLayoutCalc()) != null) {
            c10941x9ba2abc0.post(new rv0.n5(c10941x9ba2abc0, segment.C() == ug.m.ImageClip ? 0.0d : timelineLayoutCalc.f117810d.f117800s.m34345x1629663d(targetTime) - c10941x9ba2abc0.m47432x1e87e5ec().f328577a));
        }
    }
}
