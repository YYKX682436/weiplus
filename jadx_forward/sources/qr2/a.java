package qr2;

/* loaded from: classes2.dex */
public final class a extends in5.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f447596d;

    public a(java.util.ArrayList collection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collection, "collection");
        this.f447596d = collection;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f447596d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return qr2.a.class.hashCode();
    }
}
