package y35;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f540726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y35.d0 f540727e;

    public c0(y35.d0 d0Var, java.util.LinkedList linkedList) {
        this.f540727e = d0Var;
        this.f540726d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        y35.d0 d0Var = this.f540727e;
        ((java.util.LinkedList) d0Var.f540739e.Z).clear();
        ((java.util.LinkedList) d0Var.f540739e.Z).addAll(this.f540726d);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19713xa55b1053 c19713xa55b1053 = d0Var.f540739e;
        c19713xa55b1053.N(c19713xa55b1053.Z);
    }
}
