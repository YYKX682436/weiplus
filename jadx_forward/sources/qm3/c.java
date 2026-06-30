package qm3;

/* loaded from: classes10.dex */
public final class c extends x.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm3.i f446300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qm3.i iVar) {
        super(100);
        this.f446300a = iVar;
    }

    @Override // x.g
    /* renamed from: entryRemoved */
    public void mo722x78d6a38e(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qm3.b key = (qm3.b) obj;
        java.lang.Object oldValue = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldValue, "oldValue");
        super.mo722x78d6a38e(z17, key, oldValue, (android.graphics.Bitmap) obj3);
        if (z17) {
            qm3.a a17 = this.f446300a.a(key.f446298a);
            a17.f446295d.remove(java.lang.Long.valueOf(key.f446299b));
        }
    }
}
