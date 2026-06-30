package bw5;

/* loaded from: classes15.dex */
public enum io0 implements com.tencent.mm.protobuf.h {
    PREVIEW_RUNNING(0),
    PREVIEW_SUCCESS(1),
    PREVIEW_NEED_PASSWORD(2),
    PREVIEW_ERROR(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f28657d;

    io0(int i17) {
        this.f28657d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28657d;
    }
}
