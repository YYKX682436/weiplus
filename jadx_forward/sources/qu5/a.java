package qu5;

/* loaded from: classes12.dex */
public interface a {
    /* renamed from: dispatchMessage */
    void mo50277x8245362d(android.os.Message message);

    /* renamed from: dump */
    void mo50278x2f39f4(android.util.Printer printer, java.lang.String str);

    /* renamed from: executeOrSendMessage */
    boolean mo50279x9b89c07(android.os.Message message);

    /* renamed from: getLooper */
    android.os.Looper mo50280x23b2dd47();

    /* renamed from: getMessageName */
    java.lang.String mo50281xa5c8d9fc(android.os.Message message);

    /* renamed from: getSelf */
    android.os.Handler mo50282xfb8537c2();

    /* renamed from: getSerial */
    xu5.b mo50283x2f1920ea();

    /* renamed from: getSerialTag */
    java.lang.String mo50284xdd3e8650();

    /* renamed from: hasMessages */
    boolean mo50285x8fc9be06(int i17);

    /* renamed from: hasMessages */
    boolean mo50286x8fc9be06(int i17, java.lang.Object obj);

    /* renamed from: isQuit */
    boolean mo50287xb9a7fe99();

    /* renamed from: obtainMessage */
    android.os.Message mo50288x733c63a2();

    /* renamed from: obtainMessage */
    android.os.Message mo50289x733c63a2(int i17);

    /* renamed from: obtainMessage */
    android.os.Message mo50290x733c63a2(int i17, int i18, int i19);

    /* renamed from: obtainMessage */
    android.os.Message mo50291x733c63a2(int i17, int i18, int i19, java.lang.Object obj);

    /* renamed from: obtainMessage */
    android.os.Message mo50292x733c63a2(int i17, java.lang.Object obj);

    /* renamed from: post */
    boolean mo50293x3498a0(java.lang.Runnable runnable);

    /* renamed from: postAtFrontOfQueue */
    boolean mo50294x9395cba4(java.lang.Runnable runnable);

    /* renamed from: postAtTime */
    boolean mo50295x41bd0e60(java.lang.Runnable runnable, long j17);

    /* renamed from: postAtTime */
    boolean mo50296x41bd0e60(java.lang.Runnable runnable, java.lang.Object obj, long j17);

    /* renamed from: postDelayed */
    boolean mo50297x7c4d7ca2(java.lang.Runnable runnable, long j17);

    /* renamed from: postDelayed */
    boolean mo50298x7c4d7ca2(java.lang.Runnable runnable, java.lang.Object obj, long j17);

    /* renamed from: quit */
    boolean mo50299x35224f();

    /* renamed from: removeCallbacks */
    void mo50300x3fa464aa(java.lang.Runnable runnable);

    /* renamed from: removeCallbacks */
    void mo50301x3fa464aa(java.lang.Runnable runnable, java.lang.Object obj);

    /* renamed from: removeCallbacksAndMessages */
    void mo50302x6b17ad39(java.lang.Object obj);

    /* renamed from: removeMessages */
    void mo50303x856b99f0(int i17);

    /* renamed from: removeMessages */
    void mo50304x856b99f0(int i17, java.lang.Object obj);

    /* renamed from: sendEmptyMessage */
    boolean mo50305x3d8a09a2(int i17);

    /* renamed from: sendEmptyMessageAtTime */
    boolean mo50306x754635e2(int i17, long j17);

    /* renamed from: sendEmptyMessageDelayed */
    boolean mo50307xb9e94560(int i17, long j17);

    /* renamed from: sendMessage */
    boolean mo50308x2936bf5f(android.os.Message message);

    /* renamed from: sendMessageAtFrontOfQueue */
    boolean mo50309x6d91b823(android.os.Message message);

    /* renamed from: sendMessageAtTime */
    boolean mo50310xc5d0e9df(android.os.Message message, long j17);

    /* renamed from: sendMessageDelayed */
    boolean mo50311x7ab51103(android.os.Message message, long j17);
}
