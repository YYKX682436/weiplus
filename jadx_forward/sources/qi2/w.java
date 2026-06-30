package qi2;

/* loaded from: classes10.dex */
public final class w extends qi2.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(context, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
    }

    @Override // qi2.c0
    public void B() {
        java.util.LinkedList linkedList = this.f445039o;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f445040p;
        linkedList2.clear();
        dk2.u4 u4Var = ((mm2.o4) this.f445035h.P0(mm2.o4.class)).Z;
        if (u4Var != null) {
            r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f315696j, 0);
            if (r22Var != null) {
                java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    java.lang.String m75945x2fec8307 = ((r45.wk6) it.next()).m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    km2.q I = I(m75945x2fec8307);
                    if (I != null) {
                        linkedList.add(I);
                    }
                }
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f315696j, 1);
            if (r22Var2 != null) {
                java.util.LinkedList m75941xfb8219142 = r22Var2.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMembers(...)");
                java.util.Iterator it6 = m75941xfb8219142.iterator();
                while (it6.hasNext()) {
                    java.lang.String m75945x2fec83072 = ((r45.wk6) it6.next()).m75945x2fec8307(1);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    km2.q I2 = I(m75945x2fec83072);
                    if (I2 != null) {
                        linkedList2.add(I2);
                    }
                }
            }
        }
    }

    @Override // qi2.c0
    public void D(qi2.z viewHolder) {
        java.util.List list;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        dk2.u4 u4Var = ((mm2.o4) this.f445035h.P0(mm2.o4.class)).Z;
        if (u4Var == null || (list = u4Var.f315692f) == null) {
            return;
        }
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = ((km2.k) next).f390647a;
                km2.q qVar = viewHolder.f445197g;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, qVar != null ? qVar.f390705c : null)) {
                    obj = next;
                    break;
                }
            }
        }
        km2.k kVar = (km2.k) obj;
        if (kVar != null) {
            boolean z17 = kVar.f390651e;
            viewHolder.f445195e.setVisibility(4);
            android.view.ViewGroup viewGroup = viewHolder.f445198h;
            if (z17) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
        }
    }

    @Override // qi2.c0
    public void G() {
        km2.k e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f445035h;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        if (u4Var == null || (e17 = u4Var.e(((mm2.c1) lVar.P0(mm2.c1.class)).f410385o)) == null) {
            return;
        }
        android.content.Context context = this.f199914d;
        if (e17.f390654h) {
            this.f445042r = 2;
            fg2.g gVar = this.f445038n;
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            gVar.f343570e.setVisibility(0);
            fg2.g gVar2 = this.f445038n;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            gVar2.f343575j.setVisibility(8);
            fg2.g gVar3 = this.f445038n;
            if (gVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            gVar3.f343568c.setVisibility(8);
            fg2.g gVar4 = this.f445038n;
            if (gVar4 != null) {
                gVar4.f343569d.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6o));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        if (e17.f390651e) {
            this.f445042r = 4;
            fg2.g gVar5 = this.f445038n;
            if (gVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            gVar5.f343575j.setVisibility(0);
            fg2.g gVar6 = this.f445038n;
            if (gVar6 != null) {
                gVar6.f343570e.setVisibility(4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        this.f445042r = 3;
        fg2.g gVar7 = this.f445038n;
        if (gVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar7.f343570e.setVisibility(0);
        fg2.g gVar8 = this.f445038n;
        if (gVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar8.f343575j.setVisibility(8);
        fg2.g gVar9 = this.f445038n;
        if (gVar9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        gVar9.f343568c.setVisibility(8);
        fg2.g gVar10 = this.f445038n;
        if (gVar10 != null) {
            gVar10.f343569d.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6l));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    @Override // qi2.c0
    public void H() {
        java.util.Iterator it = this.f445041q.entrySet().iterator();
        while (it.hasNext()) {
            D((qi2.z) ((java.util.Map.Entry) it.next()).getValue());
        }
    }

    public final km2.q I(java.lang.String str) {
        java.lang.Object obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.o4) this.f445035h.P0(mm2.o4.class)).a7().f390703a)) {
            return ((mm2.o4) this.f445035h.P0(mm2.o4.class)).a7();
        }
        java.util.List list = ((mm2.o4) this.f445035h.P0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390703a, str)) {
                    break;
                }
            }
        }
        return (km2.q) obj;
    }
}
