package androidx.activity;

/* loaded from: classes14.dex */
public class h implements androidx.activity.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.g f9037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.i f9038e;

    public h(androidx.activity.i iVar, androidx.activity.g gVar) {
        this.f9038e = iVar;
        this.f9037d = gVar;
    }

    @Override // androidx.activity.a
    public void cancel() {
        java.util.ArrayDeque arrayDeque = this.f9038e.f9040b;
        androidx.activity.g gVar = this.f9037d;
        arrayDeque.remove(gVar);
        gVar.removeCancellable(this);
    }
}
