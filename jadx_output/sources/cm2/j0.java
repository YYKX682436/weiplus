package cm2;

/* loaded from: classes3.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f43355d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f43356e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f43357f;

    public j0(java.lang.String title, java.lang.String desc, java.lang.String subTitle, int i17, kotlin.jvm.internal.i iVar) {
        desc = (i17 & 2) != 0 ? "" : desc;
        subTitle = (i17 & 4) != 0 ? "" : subTitle;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(subTitle, "subTitle");
        this.f43355d = title;
        this.f43356e = desc;
        this.f43357f = subTitle;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return cm2.k0.class.hashCode();
    }
}
