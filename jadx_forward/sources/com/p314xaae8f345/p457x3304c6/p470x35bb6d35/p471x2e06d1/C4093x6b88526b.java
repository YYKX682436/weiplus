package com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1;

/* renamed from: com.tencent.maas.instamovie.base.MJError */
/* loaded from: classes5.dex */
public class C4093x6b88526b {

    /* renamed from: ec, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC f129708ec;

    /* renamed from: message */
    public java.lang.String f16057x38eb0007;

    /* renamed from: com.tencent.maas.instamovie.base.MJError$MaasEC */
    /* loaded from: classes5.dex */
    public enum MaasEC {
        None(-1),
        NoError(0),
        GeneralError(1),
        LoadAssetFailed(4),
        FileExists(36),
        InvalidArgument(45),
        NetworkDown(50),
        TimedOut(87),
        InvalidState(101),
        NetworkFailed(115),
        VideoEncodeFailed(144);


        /* renamed from: errorCode */
        private final int f16070x139cb015;

        MaasEC(int i17) {
            this.f16070x139cb015 = i17;
        }

        /* renamed from: fromInt */
        public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC m33749xdc92efe5(int i17) {
            for (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC : m33751xcee59d22()) {
                if (maasEC.m33752x130a215f() == i17) {
                    return maasEC;
                }
            }
            return None;
        }

        /* renamed from: getErrorCode */
        public int m33752x130a215f() {
            return this.f16070x139cb015;
        }
    }

    public C4093x6b88526b(int i17, java.lang.String str) {
        this.f129708ec = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.m33749xdc92efe5(i17);
        this.f16057x38eb0007 = str;
    }

    /* renamed from: getErrorCode */
    public int m33746x130a215f() {
        return this.f129708ec.m33752x130a215f();
    }

    /* renamed from: getMessage */
    public java.lang.String m33747x76b83bd1() {
        return this.f16057x38eb0007;
    }
}
