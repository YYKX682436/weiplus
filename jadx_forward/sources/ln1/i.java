package ln1;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.l f401307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f401308e;

    public i(ln1.h hVar, ln1.l lVar, java.util.LinkedList linkedList) {
        this.f401307d = lVar;
        this.f401308e = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.l lVar = this.f401307d;
        if (lVar != null) {
            lVar.s2(this.f401308e);
        }
    }
}
