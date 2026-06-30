package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC;", "Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "com/tencent/mm/plugin/finder/profile/uic/je", "com/tencent/mm/plugin/finder/profile/uic/ke", "com/tencent/mm/plugin/finder/profile/uic/re", "com/tencent/mm/plugin/finder/profile/uic/se", "com/tencent/mm/plugin/finder/profile/uic/te", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC */
/* loaded from: classes2.dex */
public final class C14900x9bf524dd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {
    public static int D;
    public java.lang.String A;
    public final java.lang.String B;
    public final java.util.HashMap C;

    /* renamed from: v, reason: collision with root package name */
    public boolean f204993v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f204994w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f204995x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f204996y;

    /* renamed from: z, reason: collision with root package name */
    public int f204997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14900x9bf524dd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f204994w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.bg(this));
        this.f204995x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.cg(this));
        java.lang.String string = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.A = string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Provider] username=");
        sb6.append(F7());
        sb6.append(" isSelf=");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58744xb9a8ab96());
            sb6.append(" isSelfFlag=");
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58745x17be6422());
                sb6.append(" isPrivateAccount=");
                ya2.g gVar = ya2.h.f542017a;
                sb6.append(hc2.s.f(gVar.b(F7())));
                sb6.append(" profileContact=");
                sb6.append(gVar.b(F7()) != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
                this.B = xy2.c.e(m80379x76847179());
                this.C = new java.util.HashMap();
                return;
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A7(r45.c23 r13) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.A7(r45.c23):void");
    }

    public final void B7() {
        int intExtra = m158359x1e885992().getIntExtra("key_enter_profile_type", 0);
        java.lang.String F7 = F7();
        java.lang.String str = this.B;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gm0.j1.d().g(new db2.e6(0, intExtra, F7, str, null, 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()));
    }

    public final void C7() {
        int intExtra = m158359x1e885992().getIntExtra("key_enter_profile_type", 0);
        java.lang.String F7 = F7();
        java.lang.String str = this.B;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        gm0.j1.d().g(new db2.f6(0, intExtra, F7, str, null, 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 D7(java.lang.Class clazz) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        java.util.Iterator it = Y6().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj).getClass(), clazz)) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj;
    }

    public final java.lang.String E7(int i17) {
        switch (i17) {
            case 1:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ey7);
            case 2:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3r);
            case 3:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ezg);
            case 4:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573558ez4);
            case 5:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0g);
            case 6:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0h);
            case 7:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0d);
            case 8:
            case 11:
            default:
                return "";
            case 9:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eyu);
            case 10:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573568f06);
            case 12:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573565f03);
            case 13:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eyr);
            case 14:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572851lq0);
            case 15:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573509mr5);
            case 16:
                return m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxr);
        }
    }

    public final java.lang.String F7() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58743x6c03c64c();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final boolean G7() {
        r45.aw0 aw0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        r45.uw2 uw2Var;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R8).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "isEmojiEnabled: " + z17);
        if (z17) {
            this.f204997z = -1272779573;
        }
        ya2.b2 b17 = ya2.h.f542017a.b(F7());
        if (b17 != null && (aw0Var = b17.f69303xb62cee) != null && (m75941xfb821914 = aw0Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).m75939xb282bd08(0) == 5) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var != null && (uw2Var = (r45.uw2) zv0Var.m75936x14adae67(5)) != null) {
                this.f204997z = uw2Var.m75939xb282bd08(0);
                return true;
            }
        }
        return z17;
    }

    public final void H7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re reVar;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        this.f204993v = z17;
        int color = z17 ? m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77656x773eb619) : m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
        int color2 = z17 ? m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77647x5878209d) : m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.t(color, color2);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2 = this.f215191g;
        if (c2718xca2902ff2 != null) {
            c2718xca2902ff2.m20368xc75d81ec(color);
        }
        for (p012xc85e97e9.p093xedfae76a.m1 m1Var : Y6()) {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.je) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.je) m1Var).k(z17);
            }
        }
        java.util.Iterator it = f7().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zx2.i iVar = (zx2.i) it.next();
            reVar = iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) iVar : null;
            if (reVar != null && (textView2 = reVar.f558585j) != null) {
                textView2.setTextColor(color2);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff3 = this.f215191g;
        if (c2718xca2902ff3 != null) {
            java.lang.Object a07 = kz5.n0.a0(f7(), c2718xca2902ff3.m20352xe06bcb0d());
            reVar = a07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) a07 : null;
            if (reVar == null || (textView = reVar.f558585j) == null) {
                return;
            }
            textView.setTextColor(color);
        }
    }

    public final void I7(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        java.util.Iterator it = f7().iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            zx2.i iVar = (zx2.i) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re reVar = iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) iVar : null;
            if (reVar != null && reVar.f205719k == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1 || Y6().contains(fragment)) {
            return;
        }
        fragment.f210798p = i17;
        tw2.b bVar = this.f215194m;
        if (bVar != null) {
            java.util.Iterator it6 = bVar.f503991m.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) it6.next()).f210798p == i17) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (i19 != -1) {
                bVar.a(new tw2.a(1, i19), fragment);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "error no fragment");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void U6() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.df(this, c2718xca2902ff));
            int i17 = 0;
            for (java.lang.Object obj : f7()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zx2.i iVar = (zx2.i) obj;
                iVar.f558573a = i17;
                O6(iVar, -1);
                i17 = i18;
            }
            S6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        if (r2.intValue() != 2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V6() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.V6():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ke(this);
    }

    /* renamed from: isSelfFlag */
    public final boolean m58692x17be6422() {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58745x17be6422();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe;
            c15359x536ace78.m8321x40341e13(20);
            c15359x536ace78.m62442xecae6946(true);
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        android.content.Intent intent;
        int intExtra;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 != null && (intent = m158354x19263085.getIntent()) != null && (45 == (intExtra = intent.getIntExtra("key_enter_profile_type", 0)) || 46 == intExtra || 56 == intExtra || 55 == intExtra || 57 == intExtra)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            jz5.l[] lVarArr = new jz5.l[5];
            iy1.c cVar = iy1.c.MainUI;
            lVarArr[0] = new jz5.l("page_id", java.lang.String.valueOf(40004));
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            lVarArr[2] = new jz5.l("author_finder_name", F7());
            lVarArr[3] = new jz5.l("newlife_enter_profile_source", java.lang.Integer.valueOf(intExtra));
            java.lang.String stringExtra = m158354x19263085().getIntent().getStringExtra("key_search_click_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            lVarArr[4] = new jz5.l("click_id", stringExtra);
            java.util.Map k17 = kz5.c1.k(lVarArr);
            nn3.f fVar = (nn3.f) xVar;
            fVar.getClass();
            if (m158354x192630852 != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(m158354x192630852, 48, new nn3.e(fVar, k17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209231fc;
        if (pm0.v.z(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue(), 1)) {
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).P6()) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.cf(this));
            }
        }
        if (pm0.v.z(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue(), 2)) {
            android.app.Activity context3 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).P6()) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ye(this));
            }
        }
        android.app.Activity context4 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
        pf5.z zVar3 = pf5.z.f435481a;
        if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58744xb9a8ab96();
        int i17 = D;
        if (i17 <= 0) {
            i17 = m158354x19263085().getIntent().getIntExtra("key_enter_profile_tab", 0);
        }
        if (i17 == 4) {
            int i18 = 0;
            for (java.lang.Object obj : Y6()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) obj) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14885xe5c2a94e) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, i18, false, 2, null);
                }
                i18 = i19;
            }
        }
        D = 0;
    }

    public final void w7(zx2.i tab, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        java.util.HashMap hashMap = this.C;
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.re) tab).f205719k;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14888x2544d1c2 c14888x2544d1c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14888x2544d1c2();
            c14888x2544d1c2.f210798p = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "addTabWithEmptyLoadingFragment, tabType: " + i17 + ", tabName: " + E7(i17));
            P6(num.intValue(), tab, c14888x2544d1c2, z17);
            java.lang.Integer num2 = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
            if ((num2 != null && num2.intValue() == 0) || hashMap.size() == 1) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dg(tab, this));
            }
        }
    }

    public final void x7() {
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h17 = c7().h();
        if (h17 != null) {
            h17.setVisibility(8);
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class);
        android.view.View view = obVar != null ? (android.view.View) ((jz5.n) obVar.f205615x1).mo141623x754a37bb() : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = (android.view.View) ((jz5.n) this.f204995x).mo141623x754a37bb();
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC", "changeTabLayoutToJustWatchedMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f215192h;
        if (c1190x18d3c3fe instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) c1190x18d3c3fe).m62441xbae19a3c(false);
        }
    }

    public boolean y7(int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        java.util.Iterator it = Y6().iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) it.next()).f210798p == i17) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            return false;
        }
        java.util.Iterator it6 = Y6().iterator();
        while (true) {
            if (!it6.hasNext()) {
                abstractC15124x7bae6180 = null;
                break;
            }
            abstractC15124x7bae6180 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) it6.next();
            if (abstractC15124x7bae6180.f210798p == i17) {
                break;
            }
        }
        return (abstractC15124x7bae6180 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14888x2544d1c2) ^ true;
    }

    public final void z7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209335l5).mo141623x754a37bb()).r()).intValue() == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkShopTab unSupport shop tab!");
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "checkShopTab isTeenMode!");
        } else {
            I7(12, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14873x5853335c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14900x9bf524dd(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f204994w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.bg(this));
        this.f204995x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.cg(this));
        java.lang.String string = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.A = string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[Provider] username=");
        sb6.append(F7());
        sb6.append(" isSelf=");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58744xb9a8ab96());
            sb6.append(" isSelfFlag=");
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            if (context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class)).m58745x17be6422());
                sb6.append(" isPrivateAccount=");
                ya2.g gVar = ya2.h.f542017a;
                sb6.append(hc2.s.f(gVar.b(F7())));
                sb6.append(" profileContact=");
                sb6.append(gVar.b(F7()) != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", sb6.toString());
                this.B = xy2.c.e(m80379x76847179());
                this.C = new java.util.HashMap();
                return;
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
