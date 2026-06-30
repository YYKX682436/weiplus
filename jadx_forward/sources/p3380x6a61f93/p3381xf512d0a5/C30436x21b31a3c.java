package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\tH\u0007J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001c"}, d2 = {"Lurgen/ur_0025/UR_6330;", "", "<init>", "()V", "URB_ED05", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "response", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, "", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, "URB_0828", com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "", "status", "", "URB_FED7", "peakPower", "", "URB_9453", "event", "URB_23E0", "position", "duration", "loudness", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: urgen.ur_0025.UR_6330 */
/* loaded from: classes16.dex */
public final class C30436x21b31a3c {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30436x21b31a3c f77033x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30436x21b31a3c();

    private C30436x21b31a3c() {
    }

    /* renamed from: URB_0828 */
    public static final void m168932xe5741d08(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, java.lang.String sessionId, int status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(status != 0 ? status != 1 ? status != 2 ? status != 3 ? status != 4 ? null : bw5.e.AICHAT_STATUS_WAITING : bw5.e.AICHAT_STATUS_SPEAKING : bw5.e.AICHAT_STATUS_THINKING : bw5.e.AICHAT_STATUS_LISTENING : bw5.e.AICHAT_STATUS_IDLE);
    }

    /* renamed from: URB_23E0 */
    public static final void m168933xe574f546(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, int position, int duration, double loudness) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
    }

    /* renamed from: URB_9453 */
    public static final void m168934xe57825b3(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, int event, byte[] extraData) {
        bw5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        switch (event) {
            case 0:
                dVar = bw5.d.AICHAT_BIZ_EVENT_UNKNOWN;
                break;
            case 1:
                dVar = bw5.d.AICHAT_BIZ_EVENT_FIRST_SPEAKING;
                break;
            case 2:
                dVar = bw5.d.AICHAT_BIZ_EVENT_LISTENING_STATUS_CHANGED;
                break;
            case 3:
                dVar = bw5.d.AICHAT_BIZ_EVENT_IS_SPEAKING_CHANGED;
                break;
            case 4:
                dVar = bw5.d.AICHAT_BIZ_EVENT_DID_START_RECORDING_CHANGED;
                break;
            case 5:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RECORD_TIME_TOO_SHORT;
                break;
            case 6:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RECORDING_NOT_STARTED;
                break;
            case 7:
                dVar = bw5.d.AICHAT_BIZ_EVENT_DISPLAY_TEXT_UPDATED;
                break;
            case 8:
                dVar = bw5.d.AICHAT_BIZ_EVENT_RESIGN_AUDIO_MODULE;
                break;
            case 9:
                dVar = bw5.d.AICHAT_BIZ_EVENT_TASK_FINISH;
                break;
            case 10:
                dVar = bw5.d.AICHAT_BIZ_EVENT_READY_PLAY_MUSIC;
                break;
            default:
                dVar = null;
                break;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
    }

    /* renamed from: URB_ED05 */
    public static final void m168935xe57dd59e(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, byte[] response, long errorCode, byte[] extraData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
    }

    /* renamed from: URB_FED7 */
    public static final void m168936xe57e502c(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, java.lang.String sessionId, float peakPower) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
    }
}
