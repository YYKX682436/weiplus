package rj5;

/* loaded from: classes10.dex */
public abstract class c implements rj5.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f477909a;

    /* renamed from: b, reason: collision with root package name */
    public rj5.f f477910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2734x9d861347.C22477xdcb09b9d f477911c;

    public c(com.p314xaae8f345.mm.ui.p2734x9d861347.C22477xdcb09b9d c22477xdcb09b9d) {
        this.f477911c = c22477xdcb09b9d;
        this.f477909a = c22477xdcb09b9d;
    }

    public final void c(rj5.a state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.Iterator it = this.f477911c.f291321d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c) it.next()).c(state);
        }
    }
}
