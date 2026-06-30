package nm2;

/* loaded from: classes10.dex */
public final class b extends nm2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f420003a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f420004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String songMid, boolean z17) {
        super(songMid, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
        this.f420003a = songMid;
        this.f420004b = z17;
    }

    @Override // nm2.a
    public java.lang.String b() {
        return this.f420003a;
    }

    @Override // nm2.a
    public boolean d() {
        return this.f420004b;
    }
}
