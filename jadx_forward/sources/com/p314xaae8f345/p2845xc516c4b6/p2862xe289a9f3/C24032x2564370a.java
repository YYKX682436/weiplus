package com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u000b"}, d2 = {"createConnectionError", "Lcom/tencent/pigeon/flutter_pag/FlutterError;", "channelName", "", "wrapError", "", "", "exception", "", "wrapResult", "result", "mm_auto_gen_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.flutter_pag.FlutterPagPagMessagePigeonKt */
/* loaded from: classes16.dex */
public final class C24032x2564370a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createConnectionError */
    public static final com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24029x7709af6c m88928x1eff7d2e(java.lang.String str) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24029x7709af6c("channel-error", "Unable to establish connection on channel: '" + str + "'.", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapError */
    public static final java.util.List<java.lang.Object> m88929xfc72afde(java.lang.Throwable th6) {
        if (th6 instanceof com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24029x7709af6c) {
            return kz5.c0.i(((com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24029x7709af6c) th6).getCode(), th6.getMessage(), ((com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24029x7709af6c) th6).getDetails());
        }
        return kz5.c0.i(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapResult */
    public static final java.util.List<java.lang.Object> m88930xa75ba507(java.lang.Object obj) {
        return kz5.b0.c(obj);
    }
}
