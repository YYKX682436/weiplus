package bw5;

/* loaded from: classes6.dex */
public enum js0 implements com.tencent.mm.protobuf.h {
    StatusXml_InteractionNone(0),
    StatusXml_InteractionUpdate(1),
    StatusXml_InteractionDelete(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f29135d;

    js0(int i17) {
        this.f29135d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29135d;
    }
}
