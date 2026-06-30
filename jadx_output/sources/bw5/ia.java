package bw5;

/* loaded from: classes15.dex */
public enum ia implements com.tencent.mm.protobuf.h {
    EmoticonDesignerListDataType_StorePack(1),
    EmoticonDesignerListDataType_SingleEmoji(2),
    EmoticonDesignerListDataType_IPSet(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f28510d;

    ia(int i17) {
        this.f28510d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28510d;
    }
}
