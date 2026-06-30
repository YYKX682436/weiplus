package com.tencent.maas.instamovie.base;

/* loaded from: classes5.dex */
public class MJError {

    /* renamed from: ec, reason: collision with root package name */
    public com.tencent.maas.instamovie.base.MJError.MaasEC f48175ec;
    public java.lang.String message;

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

        private final int errorCode;

        MaasEC(int i17) {
            this.errorCode = i17;
        }

        public static com.tencent.maas.instamovie.base.MJError.MaasEC fromInt(int i17) {
            for (com.tencent.maas.instamovie.base.MJError.MaasEC maasEC : values()) {
                if (maasEC.getErrorCode() == i17) {
                    return maasEC;
                }
            }
            return None;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    public MJError(int i17, java.lang.String str) {
        this.f48175ec = com.tencent.maas.instamovie.base.MJError.MaasEC.fromInt(i17);
        this.message = str;
    }

    public int getErrorCode() {
        return this.f48175ec.getErrorCode();
    }

    public java.lang.String getMessage() {
        return this.message;
    }
}
