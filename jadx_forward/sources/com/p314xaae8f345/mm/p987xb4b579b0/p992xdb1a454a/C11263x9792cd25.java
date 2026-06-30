package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram */
/* loaded from: classes9.dex */
public class C11263x9792cd25 {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Req */
    /* loaded from: classes9.dex */
    public static final class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXPreloadMiniProgram.Req";

        /* renamed from: userName */
        public java.lang.String f33010xf01afcf6;

        /* renamed from: path */
        public java.lang.String f33009x346425 = "";

        /* renamed from: miniprogramType */
        public int f33008xc6c9cf27 = 0;

        /* renamed from: extData */
        public java.lang.String f33007xb21df56b = "";

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public final boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f33010xf01afcf6)) {
                str = "userName is null";
            } else {
                int i17 = this.f33008xc6c9cf27;
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
            return 28;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public final void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.f33010xf01afcf6);
            bundle.putString("_launch_wxminiprogram_path", this.f33009x346425);
            bundle.putString("_launch_wxminiprogram_extData", this.f33007xb21df56b);
            bundle.putInt("_launch_wxminiprogram_type", this.f33008xc6c9cf27);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Resp */
    /* loaded from: classes9.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f33011xb32a65a0;

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
            this.f33011xb32a65a0 = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 28;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.f33011xb32a65a0);
        }
    }
}
