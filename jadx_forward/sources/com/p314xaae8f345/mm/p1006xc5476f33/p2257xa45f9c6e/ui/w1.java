package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class w1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final rh4.j0 f254275d = new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.v1(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254276e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        this.f254276e = c18557xc00aa3f3;
        mo8164xbbdced85(true);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f254276e.f254058e2.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((java.lang.Integer) this.f254276e.f254058e2.get(i17)).intValue();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254276e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList = c18557xc00aa3f3.f254058e2;
            if (i17 < arrayList.size()) {
                return ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.f254052c3;
            c18557xc00aa3f3.getClass();
        }
        return -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        lh4.a aVar;
        rh4.j0 j0Var = this.f254275d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254276e;
        switch (i17) {
            case 1:
                android.content.Context context = c18557xc00aa3f3.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                rh4.n0 n0Var = new rh4.n0(context, c18557xc00aa3f3, i17, null, 0);
                c18557xc00aa3f3.f254064k2 = n0Var;
                n0Var.m162453xbdee5c96(j0Var);
                aVar = new lh4.a(c18557xc00aa3f3.f254064k2);
                break;
            case 2:
                android.content.Context context2 = c18557xc00aa3f3.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                rh4.o oVar = new rh4.o(context2, c18557xc00aa3f3, i17, null, 0);
                c18557xc00aa3f3.f254065l2 = oVar;
                oVar.m162453xbdee5c96(j0Var);
                aVar = new lh4.a(c18557xc00aa3f3.f254065l2);
                break;
            case 3:
                aVar = new lh4.a(new lh4.i(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17));
                break;
            case 4:
                c18557xc00aa3f3.f254067n2 = new ph4.e(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17);
                aVar = new lh4.a(c18557xc00aa3f3.f254067n2);
                break;
            case 5:
            case 10:
                aVar = new lh4.a(new rh4.q(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17));
                break;
            case 6:
            case 8:
                c18557xc00aa3f3.f254068o2 = new oh4.j(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17);
                aVar = new lh4.a(c18557xc00aa3f3.f254068o2);
                break;
            case 7:
                rh4.m mVar = new rh4.m(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17);
                c18557xc00aa3f3.f254066m2 = mVar;
                mVar.m162453xbdee5c96(j0Var);
                aVar = new lh4.a(c18557xc00aa3f3.f254066m2);
                break;
            case 9:
                aVar = new lh4.a(new lh4.l(c18557xc00aa3f3.getContext(), c18557xc00aa3f3, i17));
                break;
            default:
                return null;
        }
        lh4.n a17 = c18557xc00aa3f3.f254056c2.a(i17);
        if (a17 == null) {
            return aVar;
        }
        android.view.View view = aVar.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.TaskBarSectionBaseView");
        ((lh4.h) view).m145781xfcfee142(a17);
        return aVar;
    }

    public final java.lang.String x(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            cl1.n0 n0Var = (cl1.n0) it.next();
            if (n0Var.f124421a != null) {
                str = str + n0Var.f124421a.f157898h + " ";
            } else {
                str = str + "info null ";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r6 != 8) goto L28;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(lh4.a r5, int r6) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.w1.mo864xe5e2e48d(lh4.a, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        lh4.a aVar = (lh4.a) k3Var;
        if (list.size() == 0) {
            mo864xe5e2e48d(aVar, i17);
        }
    }
}
