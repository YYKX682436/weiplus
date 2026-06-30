package vc0;

/* loaded from: classes10.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f516432d;

    public j(java.util.LinkedList linkedList) {
        this.f516432d = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f516432d);
        gm0.j1.d().g(new i21.a(vc0.a.f516425a, linkedList));
    }
}
