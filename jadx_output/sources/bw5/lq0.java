package bw5;

/* loaded from: classes15.dex */
public enum lq0 implements com.tencent.mm.protobuf.h {
    unknown(0),
    Prepare(1),
    Ready(2),
    PlayStart(3),
    PlayEnd(4),
    Pause(5),
    Resume(6),
    BufferStart(7),
    BufferEnd(8),
    SeekStart(9),
    SeekEnd(10),
    Stop(11),
    Error(12),
    Preempted(13);


    /* renamed from: d, reason: collision with root package name */
    public final int f29930d;

    lq0(int i17) {
        this.f29930d = i17;
    }

    public static bw5.lq0 a(int i17) {
        switch (i17) {
            case 0:
                return unknown;
            case 1:
                return Prepare;
            case 2:
                return Ready;
            case 3:
                return PlayStart;
            case 4:
                return PlayEnd;
            case 5:
                return Pause;
            case 6:
                return Resume;
            case 7:
                return BufferStart;
            case 8:
                return BufferEnd;
            case 9:
                return SeekStart;
            case 10:
                return SeekEnd;
            case 11:
                return Stop;
            case 12:
                return Error;
            case 13:
                return Preempted;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29930d;
    }
}
