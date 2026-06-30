package co1;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final co1.d f125295a = new co1.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q1 f125296b;

    static {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q1 q1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.q1.f297499b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q1Var, "getInstance(...)");
        f125296b = q1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0023. Please report as an issue. */
    public final do1.b a(int i17) {
        int c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(i17);
        if (c17 != 1) {
            if (c17 == 3) {
                return new do1.g();
            }
            if (c17 == 34) {
                return new do1.k();
            }
            if (c17 != 37 && c17 != 40) {
                if (c17 != 62) {
                    if (c17 != 66) {
                        if (c17 != 570425393) {
                            switch (c17) {
                                case 42:
                                    break;
                                case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                                case 44:
                                    break;
                                default:
                                    switch (c17) {
                                        case 47:
                                            return new do1.f();
                                        case 48:
                                        case 50:
                                            break;
                                        case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                                            return new do1.e();
                                        default:
                                            switch (c17) {
                                                case 10000:
                                                case 10001:
                                                case 10002:
                                                    break;
                                                default:
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupItemFactory", "unknown type, type:" + i17);
                                                    return null;
                                            }
                                    }
                            }
                        }
                        return new do1.i();
                    }
                }
                return new do1.j();
            }
        }
        return new do1.h();
    }

    public final boolean b(int i17) {
        return i17 == 3 || i17 == 43 || i17 == 44 || i17 == 62 || i17 == 34 || com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.c(i17) == 49;
    }
}
