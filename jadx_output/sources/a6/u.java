package a6;

/* loaded from: classes14.dex */
public final class u extends x.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a6.v f1697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a6.v vVar, int i17) {
        super(i17);
        this.f1697a = vVar;
    }

    @Override // x.g
    public void entryRemoved(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        coil.memory.MemoryCache$Key key = (coil.memory.MemoryCache$Key) obj;
        a6.t oldValue = (a6.t) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(oldValue, "oldValue");
        a6.v vVar = this.f1697a;
        s5.c cVar = vVar.f1699c;
        android.graphics.Bitmap bitmap = oldValue.f1694a;
        if (cVar.b(bitmap)) {
            return;
        }
        vVar.f1698b.c(key, bitmap, oldValue.f1695b, oldValue.f1696c);
    }

    @Override // x.g
    public int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        coil.memory.MemoryCache$Key key = (coil.memory.MemoryCache$Key) obj;
        a6.t value = (a6.t) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        return value.f1696c;
    }
}
