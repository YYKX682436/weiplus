package bw5;

/* loaded from: classes11.dex */
public enum ks0 implements com.tencent.mm.protobuf.h {
    StatusXmlUpdateNone(0),
    StatusXmlUpdateExtInfo(1),
    StatusXmlDelete(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f29542d;

    ks0(int i17) {
        this.f29542d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29542d;
    }
}
