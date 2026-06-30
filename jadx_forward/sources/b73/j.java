package b73;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f99755a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99756b;

    public j(int i17, java.lang.String str) {
        this.f99755a = i17;
        if (str == null || str.trim().length() == 0) {
            this.f99756b = b73.i.f(i17);
            return;
        }
        this.f99756b = str + " (response: " + b73.i.f(i17) + ")";
    }

    public int a() {
        int i17 = this.f99755a;
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
            case com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3 /* -1002 */:
            case com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a /* -1001 */:
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

    /* renamed from: toString */
    public java.lang.String m9922x9616526c() {
        return "IapResult: " + this.f99756b;
    }
}
