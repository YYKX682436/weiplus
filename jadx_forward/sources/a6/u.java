package a6;

/* loaded from: classes14.dex */
public final class u extends x.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a6.v f83230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a6.v vVar, int i17) {
        super(i17);
        this.f83230a = vVar;
    }

    @Override // x.g
    /* renamed from: entryRemoved */
    public void mo722x78d6a38e(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key = (p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc) obj;
        a6.t oldValue = (a6.t) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldValue, "oldValue");
        a6.v vVar = this.f83230a;
        s5.c cVar = vVar.f83232c;
        android.graphics.Bitmap bitmap = oldValue.f83227a;
        if (cVar.b(bitmap)) {
            return;
        }
        vVar.f83231b.c(key, bitmap, oldValue.f83228b, oldValue.f83229c);
    }

    @Override // x.g
    /* renamed from: sizeOf */
    public int mo723xca3dedb8(java.lang.Object obj, java.lang.Object obj2) {
        p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc key = (p135x2eae8f.p136xbfc2bd01.AbstractC1415x223acdfc) obj;
        a6.t value = (a6.t) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        return value.f83229c;
    }
}
