package bw5;

/* loaded from: classes2.dex */
public enum md implements com.tencent.mm.protobuf.h {
    CollectionType_Unknow(0),
    CollectionType_Author(1),
    CollectionType_Smart(2),
    CollectionType_AuthorAudio(3),
    CollectionType_Course(4),
    CollectionType_Drama(5),
    CollectionType_AudioRss(6),
    CollectionType_FinderSmart(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f30189d;

    md(int i17) {
        this.f30189d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30189d;
    }
}
