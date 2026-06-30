package yd;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd.n f542487d;

    public m(yd.n nVar) {
        this.f542487d = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        yd.n nVar = this.f542487d;
        ((java.util.ArrayList) nVar.f542488g).clear();
        yd.r rVar = nVar.f542490i;
        if (rVar != null) {
            java.util.List list = nVar.f542488g;
            ce.t tVar = (ce.t) rVar;
            tVar.getClass();
            try {
                tVar.f122257b.X(((ae.a) tVar.f122256a).w(), list);
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.List list2 = nVar.f542488g;
        java.lang.StringBuilder sb6 = nVar.f542489h;
        sb6.setLength(0);
        java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
        while (it.hasNext()) {
            yd.v vVar = (yd.v) it.next();
            sb6.append(vVar.f542505a);
            sb6.append(": ");
            sb6.append(vVar.f542506b);
            sb6.append("\n");
        }
        nVar.setText(sb6);
        return true;
    }
}
