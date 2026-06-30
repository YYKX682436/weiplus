package ox1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f431136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431137e;

    public j(ox1.s sVar, boolean z17) {
        this.f431137e = sVar;
        this.f431136d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ox1.s sVar = this.f431137e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = sVar.i();
        if (i17 == null) {
            return;
        }
        for (int i18 = 0; i18 < i17.getChildCount(); i18++) {
            android.view.View childAt = i17.getChildAt(i18);
            ox1.d a17 = ox1.t.a(childAt);
            if (a17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = a17.f431125a;
                if (c13158x154ec45a == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = a17.f431126b;
                    if (c13158x154ec45a2 != null && a17.f431127c != null) {
                        sVar.D((android.widget.LinearLayout) childAt.findViewById(com.p314xaae8f345.mm.R.id.kmx), (android.widget.LinearLayout) childAt.findViewById(com.p314xaae8f345.mm.R.id.kn7), (android.widget.LinearLayout) childAt.findViewById(com.p314xaae8f345.mm.R.id.f567749kn1), c13158x154ec45a2.m54592x1c481d6b());
                    }
                } else if (this.f431136d) {
                    c13158x154ec45a.postInvalidate();
                }
            }
        }
    }
}
