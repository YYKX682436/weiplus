package eb5;

/* loaded from: classes5.dex */
public abstract class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f332454d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public eb5.c f332455e = null;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f332456f;

    public abstract android.view.View B(android.view.ViewGroup viewGroup, int i17);

    public void E(java.util.List list) {
        if (list != null) {
            this.f332454d = list;
            m8146xced61ae5();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f332454d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.mo8156x4147ed22(c1163xf1deaba4);
        this.f332456f = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        eb5.e eVar = new eb5.e(B(viewGroup, i17));
        eVar.f374659m = this.f332456f;
        return eVar;
    }

    public java.lang.Object x(int i17) {
        return this.f332454d.get(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(eb5.e eVar, int i17) {
        eVar.f3639x46306858.setOnClickListener(new eb5.a(this, eVar));
        eVar.f3639x46306858.setOnLongClickListener(new eb5.b(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo8157xe5e2e48d(eb5.e eVar, int i17, java.util.List list) {
        super.mo8157xe5e2e48d(eVar, i17, list);
        eVar.f374659m = this.f332456f;
    }
}
