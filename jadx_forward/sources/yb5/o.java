package yb5;

/* loaded from: classes9.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {
    static {
        yb5.f fVar = yb5.f.f542266a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o() {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            r2.<init>(r0)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r0)
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "ChattingMMHandler can only be created for mainThread"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yb5.o.<init>():void");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: afterDispatchMessage */
    public void mo77778x5520f4b1(android.os.Message message) {
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: beforeDispatchMessage */
    public void mo77779x9394e0ae(android.os.Message message) {
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: beforeSendMessage */
    public void mo77780x6839d260(android.os.Message message, long j17) {
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: postUI */
    public void mo77785xc570fb34(java.lang.Runnable runnable) {
        mo50293x3498a0(runnable);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: postUIDelayed */
    public void mo77786xdceccb8e(java.lang.Runnable runnable, long j17) {
        mo50297x7c4d7ca2(runnable, j17);
    }
}
