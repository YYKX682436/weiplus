package bw5;

/* loaded from: classes11.dex */
public enum bj0 implements com.tencent.mm.protobuf.h {
    NOTIFY_CODE_NONE(0),
    NOTIFY_CODE_PREPARE_DONE(1),
    NOTIFY_CODE_START(2),
    NOTIFY_CODE_PAUSE(3),
    NOTIFY_CODE_FINISH(4),
    NOTIFY_CODE_CANCEL(5),
    NOTIFY_CODE_ERROR(6),
    NOTIFY_CODE_UI_PREPARING(7),
    NOTIFY_CODE_CONV_DONE(8),
    NOTIFY_CODE_IMPORTING(9),
    NOTIFY_CODE_CHOOSE_IS_QUICK(10),
    NOTIFY_CODE_WAIT_CHOOSE_SESSION(11),
    NOTIFY_CODE_CHOOSE_SESSION(12),
    NOTIFY_CODE_UI_SHOW_QRCODE(13),
    NOTIFY_CODE_UI_IMMIGRATION_GUIDE(14),
    NOTIFY_CODE_UI_WAIT_PC_RESP(15),
    NOTIFY_CODE_UI_READY(16),
    NOTIFY_CODE_UI_DIRECT_CONNECT_GUIDE(17),
    NOTIFY_CODE_ON_PIPELINE_UPDATED(18);


    /* renamed from: d, reason: collision with root package name */
    public final int f25713d;

    bj0(int i17) {
        this.f25713d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25713d;
    }
}
