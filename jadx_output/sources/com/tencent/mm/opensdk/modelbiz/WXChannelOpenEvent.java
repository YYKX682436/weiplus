package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes9.dex */
public class WXChannelOpenEvent {

    /* loaded from: classes9.dex */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String Key_EventId = "_wxapi_finder_open_event_eventId";
        private static final java.lang.String Key_ExtInfo = "_wxapi_finder_open_event_extInfo";
        private static final java.lang.String Key_Username = "_wxapi_finder_open_event_username";
        private static final int LENGTH_LIMIT = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelOpenEvent.Req";
        public java.lang.String eventId;
        public java.lang.String extInfo;
        public java.lang.String username;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            java.lang.String str;
            if (com.tencent.mm.opensdk.utils.d.b(this.username)) {
                str = "username is null";
            } else if (this.username.length() > 1024) {
                str = "username exceeds the limit";
            } else if (com.tencent.mm.opensdk.utils.d.b(this.eventId)) {
                str = "eventId is null";
            } else {
                if (this.eventId.length() <= 1024) {
                    return true;
                }
                str = "eventId exceeds the limit";
            }
            com.tencent.mm.opensdk.utils.Log.e(TAG, str);
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.username = bundle.getString(Key_Username);
            this.eventId = bundle.getString(Key_EventId);
            this.extInfo = bundle.getString(Key_ExtInfo);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 41;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(Key_Username, this.username);
            bundle.putString(Key_EventId, this.eventId);
            bundle.putString(Key_ExtInfo, this.extInfo);
        }
    }

    /* loaded from: classes9.dex */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        private static final java.lang.String Key_ExtMsg = "_wxapi_finder_open_event_extMsg";
        public java.lang.String extMsg;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString(Key_ExtMsg);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 41;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString(Key_ExtMsg, this.extMsg);
        }
    }
}
