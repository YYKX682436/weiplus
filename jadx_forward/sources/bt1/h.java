package bt1;

/* loaded from: classes4.dex */
public final class h implements fs.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f105693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Message f105694b;

    public h(java.util.Map.Entry entry, android.os.Message message) {
        this.f105693a = entry;
        this.f105694b = message;
    }

    @Override // fs.o
    public boolean a(fs.n nVar) {
        ((ct1.x) nVar).pi((java.util.LinkedList) this.f105693a.getValue(), this.f105694b.arg1 == 1);
        return false;
    }
}
