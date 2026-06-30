package bt1;

/* loaded from: classes4.dex */
public final class h implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f24160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Message f24161b;

    public h(java.util.Map.Entry entry, android.os.Message message) {
        this.f24160a = entry;
        this.f24161b = message;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((ct1.x) nVar).pi((java.util.LinkedList) this.f24160a.getValue(), this.f24161b.arg1 == 1);
        return false;
    }
}
