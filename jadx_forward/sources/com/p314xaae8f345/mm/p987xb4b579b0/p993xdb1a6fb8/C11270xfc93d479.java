package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.SendTdiAuth */
/* loaded from: classes6.dex */
public class C11270xfc93d479 {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp */
    /* loaded from: classes9.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp {

        /* renamed from: KEY_AUTH_BUFFER */
        private static final java.lang.String f33053xd9a49cb7 = "_wxapi_sendauth_resp_tdi_buffer";
        private static final java.lang.String TAG = "MicroMsg.SDK.SendTdiAuth.Resp";

        /* renamed from: tdiAuthBuffer */
        public byte[] f33054xf74e38e1;

        public Resp(android.os.Bundle bundle) {
            super(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public final boolean mo48428x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public final void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f33054xf74e38e1 = bundle.getByteArray(f33053xd9a49cb7);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 31;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp, com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putByteArray(f33053xd9a49cb7, this.f33054xf74e38e1);
        }
    }

    private C11270xfc93d479() {
    }
}
