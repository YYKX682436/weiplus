package bw5;

/* loaded from: classes10.dex */
public enum kb implements com.tencent.mm.protobuf.h {
    Media_Image_Only(1),
    Media_Video_Only(2),
    Media_All(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f29328d;

    kb(int i17) {
        this.f29328d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29328d;
    }
}
