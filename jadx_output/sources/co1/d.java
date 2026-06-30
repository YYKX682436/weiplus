package co1;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final co1.d f43762a = new co1.d();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.q1 f43763b;

    static {
        com.tencent.wechat.aff.affroam.q1 q1Var = com.tencent.wechat.aff.affroam.q1.f215966b;
        kotlin.jvm.internal.o.f(q1Var, "getInstance(...)");
        f43763b = q1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0023. Please report as an issue. */
    public final do1.b a(int i17) {
        int c17 = com.tencent.mm.pluginsdk.model.app.k0.c(i17);
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
                                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                                case 44:
                                    break;
                                default:
                                    switch (c17) {
                                        case 47:
                                            return new do1.f();
                                        case 48:
                                        case 50:
                                            break;
                                        case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                            return new do1.e();
                                        default:
                                            switch (c17) {
                                                case 10000:
                                                case 10001:
                                                case 10002:
                                                    break;
                                                default:
                                                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemFactory", "unknown type, type:" + i17);
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
        return i17 == 3 || i17 == 43 || i17 == 44 || i17 == 62 || i17 == 34 || com.tencent.mm.pluginsdk.model.app.k0.c(i17) == 49;
    }
}
