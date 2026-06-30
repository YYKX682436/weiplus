package ir;

/* loaded from: classes7.dex */
public final class x0 implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f375446d = new java.util.LinkedList();

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelLifeCycle", "clear: ");
        java.util.LinkedList linkedList = this.f375446d;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).mo10668x2efc64();
        }
        linkedList.clear();
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a iLifeCycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iLifeCycle, "iLifeCycle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PanelLifeCycle", "keep: " + iLifeCycle);
        java.util.LinkedList linkedList = this.f375446d;
        if (linkedList.contains(iLifeCycle)) {
            return;
        }
        linkedList.add(iLifeCycle);
    }
}
