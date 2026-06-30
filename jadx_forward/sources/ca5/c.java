package ca5;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f121610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d f121611e;

    public c(com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d, int i17) {
        this.f121611e = c21330xc127fb4d;
        this.f121610d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = this.f121611e;
        java.util.ArrayList arrayList = c21330xc127fb4d.f277962f;
        c21330xc127fb4d.g(((java.lang.Integer) arrayList.get(r2)).intValue(), (java.util.List) ((java.util.ArrayList) c21330xc127fb4d.f277966m).get(this.f121610d));
    }
}
