package xn5;

/* loaded from: classes13.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f537179a;

    public a1(java.util.List cacheList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 1) != 0) {
            cacheList = java.util.Collections.synchronizedList(new java.util.ArrayList());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheList, "synchronizedList(...)");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheList, "cacheList");
        this.f537179a = cacheList;
    }
}
