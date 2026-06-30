package i13;

/* loaded from: classes8.dex */
public abstract class g extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368814h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368815i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Bitmap f368816m;

    /* renamed from: n, reason: collision with root package name */
    public final int f368817n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String id6, java.lang.String title, java.lang.String desc, android.graphics.Bitmap bitmap, int i17, long j17) {
        super(id6, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f368814h = title;
        this.f368815i = desc;
        this.f368816m = bitmap;
        this.f368817n = i17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }

    @Override // i13.c
    public void k(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    public abstract void r(in5.s0 s0Var, int i17, int i18, boolean z17, java.util.List list);
}
