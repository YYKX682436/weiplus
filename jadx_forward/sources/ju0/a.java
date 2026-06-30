package ju0;

/* loaded from: classes5.dex */
public final class a extends ju0.f {

    /* renamed from: f, reason: collision with root package name */
    public final ju0.b f383212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ju0.b imageListAdapter, ju0.e callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageListAdapter, "imageListAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f383212f = imageListAdapter;
    }

    public final boolean a(int i17, int i18) {
        boolean z17;
        java.util.List list = this.f383212f.f332454d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getItems(...)");
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ku0.a) it.next()).f393593a.f557194a.m33754xb600079() == qg.a.Unknown) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 && i17 == i18 - 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: getMovementFlags */
    public int mo8119x457acf62(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        int m8183xf806b362 = viewHolder.m8183xf806b362();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        return (mo1894x7e414b06 == 2 || a(m8183xf806b362, mo1894x7e414b06)) ? p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(0, 0) : p012xc85e97e9.p103xe821e364.p104xd1075a44.a1.m8110x3388cfca(51, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        int m8183xf806b362 = target.m8183xf806b362();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if (a(m8183xf806b362, mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0)) {
            return false;
        }
        int m8183xf806b3622 = viewHolder.m8183xf806b362();
        int m8183xf806b3623 = target.m8183xf806b362();
        if (this.f383219d == -1) {
            this.f383219d = m8183xf806b3622;
        }
        this.f383220e = m8183xf806b3623;
        nu0.b4 b4Var = ((nu0.g2) this.f383216a).f421476a;
        ju0.b bVar = b4Var.K;
        bVar.f332454d.add(m8183xf806b3623, (ku0.a) bVar.f332454d.remove(m8183xf806b3622));
        bVar.m8150x87567217(m8183xf806b3622, m8183xf806b3623);
        java.util.ArrayList arrayList = b4Var.f421420w;
        java.lang.Object remove = arrayList.remove(m8183xf806b3622);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
        arrayList.add(m8183xf806b3623, (zu0.a) remove);
        return true;
    }
}
