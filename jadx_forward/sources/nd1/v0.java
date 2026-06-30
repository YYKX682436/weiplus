package nd1;

/* loaded from: classes7.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 f417939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f417940f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417941g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nd1.w0 f417942h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f417943i;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, boolean z17, int i17, nd1.w0 w0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f417938d = e9Var;
        this.f417939e = w2Var;
        this.f417940f = z17;
        this.f417941g = i17;
        this.f417942h = w0Var;
        this.f417943i = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417938d;
        if (e9Var.mo32091x9a3f0ba2().x0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("JsApiSetNavigateBackConfirmDialog", "pageContainer is null, return");
            return;
        }
        oi1.l lVar = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var = this.f417939e;
        java.lang.String mo14683xad58292c = w2Var != null ? w2Var.mo14683xad58292c() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
        if (android.text.TextUtils.equals(mo14683xad58292c, m52169xfdaa7672 != null ? m52169xfdaa7672.mo14683xad58292c() : null)) {
            boolean z17 = this.f417940f;
            if (z17) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = kz5.c0.i("scene_actionbar_back", "scene_back_key_pressed", "scene_jsapi_navigate_back").iterator();
                while (it.hasNext()) {
                    arrayList.add(new oi1.m(z17, (java.lang.String) it.next()));
                }
            } else {
                arrayList = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa76722 = e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672();
            if (m52169xfdaa76722 != null) {
                oi1.n nVar = oi1.n.f427141e;
                if (arrayList != null) {
                    java.lang.Object element = this.f417943i.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                    lVar = new oi1.l((java.lang.String) element, arrayList);
                }
                m52169xfdaa76722.K(nVar, lVar);
            }
            e9Var.a(this.f417941g, this.f417942h.o("ok"));
        }
    }
}
