package sk2;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final uk2.b f490484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f490485e;

    public a(uk2.b data, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f490484d = data;
        this.f490485e = z17;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
