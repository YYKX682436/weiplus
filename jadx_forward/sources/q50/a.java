package q50;

/* loaded from: classes.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f441669d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441670e;

    public a(java.lang.String userName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f441669d = userName;
        this.f441670e = z17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f441669d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
