package dz0;

/* loaded from: classes5.dex */
public final class s2 implements pp0.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce f326538a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f326539b;

    public s2(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce mjSpeechManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjSpeechManager, "mjSpeechManager");
        this.f326538a = mjSpeechManager;
    }

    public void a() {
        synchronized (this) {
            if (this.f326539b) {
                return;
            }
            this.f326538a.a();
        }
    }

    public int b(java.lang.String submitTaskID, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 iLinkAppRequest, java.lang.String iLinkCmd, java.nio.ByteBuffer contextBuff, com.p314xaae8f345.p457x3304c6.p482xca9708e2.b complete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(submitTaskID, "submitTaskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkAppRequest, "iLinkAppRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkCmd, "iLinkCmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextBuff, "contextBuff");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(complete, "complete");
        synchronized (this) {
            if (this.f326539b) {
                return 0;
            }
            return this.f326538a.d(submitTaskID, iLinkAppRequest, iLinkCmd, contextBuff, complete);
        }
    }

    public void c() {
        synchronized (this) {
            if (this.f326539b) {
                return;
            }
            this.f326539b = true;
            this.f326538a.e();
        }
    }

    public int d(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4196x49e12c71 ttsInfo, com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 iLinkAppRequest, java.lang.String iLinkCmd, com.p314xaae8f345.p457x3304c6.p482xca9708e2.c complete) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ttsInfo, "ttsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkAppRequest, "iLinkAppRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLinkCmd, "iLinkCmd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(complete, "complete");
        synchronized (this) {
            if (this.f326539b) {
                return 0;
            }
            return this.f326538a.i(ttsInfo, iLinkAppRequest, iLinkCmd, complete);
        }
    }
}
