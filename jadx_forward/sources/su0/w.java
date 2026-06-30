package su0;

/* loaded from: classes5.dex */
public final class w implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494241a;

    public w(yz5.l lVar) {
        this.f494241a = lVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.c
    public void a(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4195xcab2df48 c4195xcab2df48, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        yz5.l lVar = this.f494241a;
        if (c4093x6b88526b != null || c4195xcab2df48 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onComplete: message ");
            sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSubtitleTaskExecutor", sb6.toString());
            lVar.mo146xb9724478(null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSubtitleTaskExecutor", "submitAsyncSpeechRequest onComplete: responseInfo taskID " + c4195xcab2df48.f130077b + " submitTaskID " + c4195xcab2df48.f130076a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("submitAsyncSpeechRequest onComplete: responseInfo queryIntervalMillis ");
        sb7.append(c4195xcab2df48.f130078c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSubtitleTaskExecutor", sb7.toString());
        lVar.mo146xb9724478(c4195xcab2df48);
    }
}
