package sr2;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.f f493074d;

    public e(sr2.f fVar) {
        this.f493074d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/FinderPostAccountUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sr2.f fVar = this.f493074d;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostAccountUIC", "[onClickSwitch]");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = fVar.f493085f.iterator();
        while (it.hasNext()) {
            m92.b bVar = (m92.b) it.next();
            arrayList2.add(new j92.a(bVar, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f68723xdec927b, fVar.f493083d)));
        }
        fVar.f493090n = arrayList2;
        if (fVar.f493089m == null) {
            h92.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec.f183232y;
            android.app.Activity m80379x76847179 = fVar.m80379x76847179();
            android.view.Window window = fVar.m80379x76847179().getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec a17 = bVar2.a(m80379x76847179, window, new jb2.b());
            fVar.f493089m = a17;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa = a17.m82798x4905e9fa();
            m82798x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(fVar.m80379x76847179()));
            java.util.ArrayList arrayList3 = fVar.f493090n;
            if (arrayList3 != null) {
                fVar.f493091o = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.post.FinderPostAccountUIC$buildConvert$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new i92.b(null, false);
                    }
                }, arrayList3, false);
            }
            m82798x4905e9fa.mo7960x6cab2c8d(fVar.f493091o);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = fVar.f493091o;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.f374638o = new sr2.d(fVar);
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = fVar.f493091o;
            if (c22848x6ddd90cf2 != null) {
                java.util.List m82898xfb7e5820 = c22848x6ddd90cf2.m82898xfb7e5820();
                m82898xfb7e5820.clear();
                java.util.ArrayList arrayList4 = fVar.f493090n;
                if (arrayList4 != null) {
                    java.util.Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        m82898xfb7e5820.add((j92.a) it6.next());
                    }
                }
                c22848x6ddd90cf2.m8146xced61ae5();
            }
        }
        java.util.ArrayList arrayList5 = fVar.f493090n;
        int size = arrayList5 != null ? arrayList5.size() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec = fVar.f493089m;
        if (c13638xb683e9ec != null) {
            c13638xb683e9ec.m55420xbd04defe(size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec c13638xb683e9ec2 = fVar.f493089m;
        if (c13638xb683e9ec2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.s(c13638xb683e9ec2, false, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/FinderPostAccountUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
