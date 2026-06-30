package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram */
/* loaded from: classes8.dex */
public class C11255xf99ecb99 {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req */
    /* loaded from: classes9.dex */
    public static final class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: MINIPROGRAM_TYPE_PREVIEW */
        public static final int f32974x939b1075 = 2;

        /* renamed from: MINIPROGRAM_TYPE_TEST */
        public static final int f32975xf4a016e5 = 1;

        /* renamed from: MINIPTOGRAM_TYPE_RELEASE */
        public static final int f32976x82e81836 = 0;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXLaunchMiniProgram.Req";

        /* renamed from: userName */
        public java.lang.String f32980xf01afcf6;

        /* renamed from: path */
        public java.lang.String f32979x346425 = "";

        /* renamed from: miniprogramType */
        public int f32978xc6c9cf27 = 0;

        /* renamed from: extData */
        public java.lang.String f32977xb21df56b = "";

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public final boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32980xf01afcf6)) {
                str = "userName is null";
            } else {
                int i17 = this.f32978xc6c9cf27;
                if (i17 >= 0 && i17 <= 2) {
                    return true;
                }
                str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public final int mo48426xfb85f7b0() {
            return 19;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public final void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.f32980xf01afcf6);
            bundle.putString("_launch_wxminiprogram_path", this.f32979x346425);
            bundle.putString("_launch_wxminiprogram_extData", this.f32977xb21df56b);
            bundle.putInt("_launch_wxminiprogram_type", this.f32978xc6c9cf27);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp */
    /* loaded from: classes8.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f32981xb32a65a0;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public final boolean mo48428x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public final void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f32981xb32a65a0 = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 19;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.f32981xb32a65a0);
        }
    }
}
