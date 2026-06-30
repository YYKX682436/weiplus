package ca5;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f121609e;

    public b(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, int i17) {
        this.f121609e = c21330xc127fb4d;
        this.f121608d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f121609e;
        java.util.ArrayList arrayList = c21330xc127fb4d.f277962f;
        c21330xc127fb4d.g(((java.lang.Integer) arrayList.get(r2)).intValue(), (java.util.List) ((java.util.ArrayList) c21330xc127fb4d.f277966m).get(this.f121608d));
    }
}
