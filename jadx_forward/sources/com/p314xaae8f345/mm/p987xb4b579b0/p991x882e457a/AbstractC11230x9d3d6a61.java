package com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a;

/* renamed from: com.tencent.mm.opensdk.modelbase.BaseResp */
/* loaded from: classes8.dex */
public abstract class AbstractC11230x9d3d6a61 {

    /* renamed from: errCode */
    public int f32867xa7c470f2;

    /* renamed from: errStr */
    public java.lang.String f32868xb2d5068c;

    /* renamed from: openId */
    public java.lang.String f32869xc3c3c505;

    /* renamed from: transaction */
    public java.lang.String f32870x7fa0d2de;

    /* renamed from: com.tencent.mm.opensdk.modelbase.BaseResp$ErrCode */
    /* loaded from: classes8.dex */
    public interface ErrCode {

        /* renamed from: ERR_AUTH_DENIED */
        public static final int f32871xb3ba1618 = -4;

        /* renamed from: ERR_BAN */
        public static final int f32872xd2ab11f5 = -6;

        /* renamed from: ERR_COMM */
        public static final int f32873x82b7d5c6 = -1;

        /* renamed from: ERR_OK */
        public static final int f32874x7a689f16 = 0;

        /* renamed from: ERR_SENT_FAILED */
        public static final int f32875x4f5a2eca = -3;

        /* renamed from: ERR_UNSUPPORT */
        public static final int f32876xb64c887c = -5;

        /* renamed from: ERR_USER_CANCEL */
        public static final int f32877xc9e11d74 = -2;
    }

    /* renamed from: checkArgs */
    public abstract boolean mo48428x17b96605();

    /* renamed from: fromBundle */
    public void mo48429x63aa4ccc(android.os.Bundle bundle) {
        this.f32867xa7c470f2 = bundle.getInt("_wxapi_baseresp_errcode");
        this.f32868xb2d5068c = bundle.getString("_wxapi_baseresp_errstr");
        this.f32870x7fa0d2de = bundle.getString("_wxapi_baseresp_transaction");
        this.f32869xc3c3c505 = bundle.getString("_wxapi_baseresp_openId");
    }

    /* renamed from: getType */
    public abstract int mo48430xfb85f7b0();

    /* renamed from: toBundle */
    public void mo48431x792022dd(android.os.Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo48430xfb85f7b0());
        bundle.putInt("_wxapi_baseresp_errcode", this.f32867xa7c470f2);
        bundle.putString("_wxapi_baseresp_errstr", this.f32868xb2d5068c);
        bundle.putString("_wxapi_baseresp_transaction", this.f32870x7fa0d2de);
        bundle.putString("_wxapi_baseresp_openId", this.f32869xc3c3c505);
    }
}
