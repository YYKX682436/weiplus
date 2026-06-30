package cq2;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f302908e;

    public a(yz5.l lVar, java.util.LinkedList linkedList) {
        this.f302907d = lVar;
        this.f302908e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = this.f302908e;
        if (!(!linkedList.isEmpty())) {
            linkedList = null;
        }
        this.f302907d.mo146xb9724478(linkedList);
    }
}
