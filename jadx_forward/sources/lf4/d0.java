package lf4;

/* loaded from: classes4.dex */
public final class d0 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f399912b;

    public d0(lf4.q0 q0Var, java.util.List list) {
        this.f399911a = q0Var;
        this.f399912b = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "onChanged: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f399911a;
        q0Var.f399998i.clear();
        q0Var.f399998i.addAll(this.f399912b);
        ((sf4.a1) q0Var.f399995f).h(0, q0Var.f399998i);
        ((sf4.a1) q0Var.f399995f).d();
        ((sf4.a1) q0Var.f399995f).e(0, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "onInserted: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f399911a;
        q0Var.f399998i.clear();
        java.util.ArrayList arrayList = q0Var.f399998i;
        arrayList.addAll(this.f399912b);
        lf4.h hVar = q0Var.f399995f;
        ((sf4.a1) hVar).h(0, arrayList);
        ((sf4.a1) hVar).d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = ((sf4.a1) hVar).f488944a;
        if (c18497x85806502.f253635u != 0) {
            c18497x85806502.f253640y.post(new sf4.x0(c18497x85806502, 0));
        } else {
            pf4.x xVar = c18497x85806502.f253632r;
            if (xVar != null) {
                xVar.m8153xd399a4d9(i17, i18);
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "onRemoved: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f399911a;
        q0Var.f399998i.clear();
        q0Var.f399998i.addAll(this.f399912b);
        ((sf4.a1) q0Var.f399995f).h(0, q0Var.f399998i);
        ((sf4.a1) q0Var.f399995f).d();
        ((sf4.a1) q0Var.f399995f).f(0, i17, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfGalleryPresenter", "onMoved: " + i17 + ' ' + i18);
    }
}
