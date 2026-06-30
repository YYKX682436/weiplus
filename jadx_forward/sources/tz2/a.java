package tz2;

/* loaded from: classes14.dex */
public class a implements com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser f504791a;

    public a(tz2.e eVar, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f504791a = iYtSDKKitNetResponseParser;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser
    /* renamed from: onNetworkResponseEvent */
    public void mo120776xd218dbca(java.util.HashMap hashMap, java.lang.Exception exc) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  result:%s", hashMap);
        this.f504791a.mo120776xd218dbca(hashMap, exc);
    }
}
