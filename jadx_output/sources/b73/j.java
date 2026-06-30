package b73;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f18222a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f18223b;

    public j(int i17, java.lang.String str) {
        this.f18222a = i17;
        if (str == null || str.trim().length() == 0) {
            this.f18223b = b73.i.f(i17);
            return;
        }
        this.f18223b = str + " (response: " + b73.i.f(i17) + ")";
    }

    public int a() {
        int i17 = this.f18222a;
        if (i17 == -2001) {
            return 3;
        }
        if (i17 == -1009) {
            return 5;
        }
        if (i17 == -1004) {
            return 3;
        }
        switch (i17) {
            case com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR /* -1002 */:
            case com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND /* -1001 */:
            case -1000:
                return 5;
            default:
                switch (i17) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        return 5;
                    case 5:
                        return 6;
                    case 7:
                        return 100000002;
                    case 8:
                        return 106;
                    default:
                        return i17;
                }
        }
    }

    public java.lang.String toString() {
        return "IapResult: " + this.f18223b;
    }
}
