package androidx.compose.foundation.lazy.layout;

/* loaded from: classes5.dex */
public final class b0 implements androidx.compose.foundation.lazy.layout.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f10391a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f10392b;

    /* renamed from: c, reason: collision with root package name */
    public int f10393c;

    public b0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f10391a = arrayList;
        this.f10392b = arrayList;
    }

    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 0) {
            return;
        }
        androidx.compose.foundation.lazy.layout.c cVar = new androidx.compose.foundation.lazy.layout.c(this.f10393c, i17, obj);
        this.f10393c += i17;
        ((java.util.ArrayList) this.f10391a).add(cVar);
    }
}
