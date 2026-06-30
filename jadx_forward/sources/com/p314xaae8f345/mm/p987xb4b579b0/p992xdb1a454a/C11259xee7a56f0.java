package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView */
/* loaded from: classes8.dex */
public class C11259xee7a56f0 {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req */
    /* loaded from: classes8.dex */
    public static final class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXOpenBusinessView.Req";

        /* renamed from: businessType */
        public java.lang.String f32995xd7e6e31a;

        /* renamed from: extInfo */
        public java.lang.String f32996xb2206a6f;

        /* renamed from: query */
        public java.lang.String f32997x66f18c8;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public final boolean mo48424x17b96605() {
            if (!com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32995xd7e6e31a)) {
                return true;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "businessType is null");
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public final void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32995xd7e6e31a = bundle.getString("_openbusinessview_businessType");
            this.f32997x66f18c8 = bundle.getString("_openbusinessview__query_info");
            this.f32996xb2206a6f = bundle.getString("_openbusinessview_extInfo");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public final int mo48426xfb85f7b0() {
            return 26;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public final void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_openbusinessview_businessType", this.f32995xd7e6e31a);
            bundle.putString("_openbusinessview__query_info", this.f32997x66f18c8);
            bundle.putString("_openbusinessview_extInfo", this.f32996xb2206a6f);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp */
    /* loaded from: classes8.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: businessType */
        public java.lang.String f32998xd7e6e31a;

        /* renamed from: extMsg */
        public java.lang.String f32999xb32a65a0;

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
            this.f32999xb32a65a0 = bundle.getString("_openbusinessview_ext_msg");
            this.f32998xd7e6e31a = bundle.getString("_openbusinessview_business_type");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 26;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_openbusinessview_ext_msg", this.f32999xb32a65a0);
            bundle.putString("_openbusinessview_business_type", this.f32998xd7e6e31a);
        }
    }
}
