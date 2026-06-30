package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 f93801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f93802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f93803f;

    public x0(p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var, int i17) {
        this.f93803f = g1Var;
        this.f93801d = d1Var;
        this.f93802e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = this.f93803f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = g1Var.f93579x;
        if (c1163xf1deaba4 == null || !c1163xf1deaba4.isAttachedToWindow()) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.d1 d1Var = this.f93801d;
        if (d1Var.f93529q || d1Var.f93523h.m8183xf806b362() == -1) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = g1Var.f93579x.m7949x5701d990();
        if (m7949x5701d990 == null || !m7949x5701d990.p(null)) {
            java.util.ArrayList arrayList = (java.util.ArrayList) g1Var.f93577v;
            int size = arrayList.size();
            boolean z17 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    break;
                }
                if (!((p012xc85e97e9.p103xe821e364.p104xd1075a44.d1) arrayList.get(i17)).f93530r) {
                    z17 = true;
                    break;
                }
                i17++;
            }
            if (!z17) {
                g1Var.f93574s.mo8135x59f07f29(d1Var.f93523h, this.f93802e);
                return;
            }
        }
        g1Var.f93579x.post(this);
    }
}
