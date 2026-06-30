package bm2;

/* loaded from: classes3.dex */
public final class m3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f103628d;

    /* renamed from: e, reason: collision with root package name */
    public final bm2.h3 f103629e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f103630f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f103631g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f103632h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f103633i;

    public m3(android.content.Context context, bm2.h3 fastCommentScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fastCommentScene, "fastCommentScene");
        this.f103628d = context;
        this.f103629e = fastCommentScene;
        this.f103630f = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103630f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.i3 holder = (bm2.i3) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f103630f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        bm2.j3 j3Var = (bm2.j3) obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f103502d;
        android.widget.TextView textView = holder.f103503e;
        if (j3Var.f103539b == 2) {
            textView.setText(j3Var.f103538a);
            textView.setTextColor(this.f103628d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            c22699x3dcdb352.setVisibility(8);
            return;
        }
        bm2.h3 fastCommentScene = this.f103629e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fastCommentScene, "fastCommentScene");
        int ordinal = fastCommentScene.ordinal();
        if (ordinal == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 10, j3Var.b());
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(1, j3Var.f103539b == 0 ? 7 : 8, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.M, j3Var.a(i17), null, null, null, null, false, 124, null);
        } else if (ordinal == 1) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ak(1, j3Var.c());
        }
        bm2.k3 k3Var2 = new bm2.k3(j3Var, i17, this);
        android.widget.FrameLayout frameLayout = holder.f103504f;
        frameLayout.setOnClickListener(k3Var2);
        frameLayout.setOnTouchListener(new bm2.l3(holder));
        textView.setText(j3Var.f103538a);
        textView.setTextColor(android.graphics.Color.parseColor("#BDD9FF"));
        c22699x3dcdb352.setVisibility(0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.asz, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.i3(inflate);
    }

    public final void x(java.lang.String str) {
        int i17;
        java.util.ArrayList arrayList = this.f103630f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.j3) listIterator.previous()).f103539b == 0) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        jz5.f0 f0Var = null;
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFastCommentAdapter", "no poi item");
            return;
        }
        int intValue = valueOf.intValue();
        this.f103632h = str;
        java.lang.String str2 = this.f103633i;
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            if (str == null) {
                java.lang.String str3 = ((bm2.j3) arrayList.get(intValue)).f103538a;
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, r26.n0.u0(string).toString())) {
                    bm2.j3 j3Var = (bm2.j3) arrayList.get(intValue);
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, str2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    java.lang.String obj = r26.n0.u0(string2).toString();
                    j3Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
                    j3Var.f103538a = obj;
                    m8147xed6e4d18(intValue);
                }
            } else {
                java.lang.String t17 = r26.i0.t(str, "<%@>", str2, false);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((bm2.j3) arrayList.get(intValue)).f103538a, t17)) {
                    bm2.j3 j3Var2 = (bm2.j3) arrayList.get(intValue);
                    j3Var2.getClass();
                    j3Var2.f103538a = t17;
                    m8147xed6e4d18(intValue);
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            bm2.j3 j3Var3 = (bm2.j3) arrayList.get(intValue);
            java.lang.String string3 = this.f103628d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.deu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            j3Var3.getClass();
            j3Var3.f103538a = string3;
        }
    }

    public final void y(r45.ze2 ze2Var) {
        int i17;
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        jz5.f0 f0Var2;
        java.util.ArrayList arrayList = this.f103630f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.j3) listIterator.previous()).f103539b == 0) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFastCommentAdapter", "no poi item");
            return;
        }
        int intValue = valueOf.intValue();
        if (ze2Var == null || (m75945x2fec8307 = ze2Var.m75945x2fec8307(2)) == null) {
            f0Var = null;
        } else {
            this.f103633i = m75945x2fec8307;
            java.lang.String str = this.f103632h;
            if (!(true ^ (str == null || str.length() == 0))) {
                str = null;
            }
            f0Var = jz5.f0.f384359a;
            if (str != null) {
                java.lang.String t17 = r26.i0.t(str, "<%@>", m75945x2fec8307, false);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((bm2.j3) arrayList.get(intValue)).f103538a, t17)) {
                    bm2.j3 j3Var = (bm2.j3) arrayList.get(intValue);
                    j3Var.getClass();
                    j3Var.f103538a = t17;
                    m8147xed6e4d18(intValue);
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                java.lang.String str2 = ((bm2.j3) arrayList.get(intValue)).f103538a;
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, m75945x2fec8307);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, r26.n0.u0(string).toString())) {
                    bm2.j3 j3Var2 = (bm2.j3) arrayList.get(intValue);
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, m75945x2fec8307);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    java.lang.String obj = r26.n0.u0(string2).toString();
                    j3Var2.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
                    j3Var2.f103538a = obj;
                    m8147xed6e4d18(intValue);
                }
            }
        }
        if (f0Var == null) {
            this.f103633i = null;
        }
    }

    public final void z(java.util.ArrayList itemList, java.lang.String str) {
        bm2.j3 j3Var;
        java.lang.Object obj;
        java.lang.Object obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f103630f;
        arrayList.addAll(arrayList2);
        if (str == null || str.length() == 0) {
            j3Var = null;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            j3Var = new bm2.j3(str, 2, 0L, 0, null, 20, null);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bm2.j3) obj).f103539b == 0) {
                    break;
                }
            }
        }
        bm2.j3 j3Var2 = (bm2.j3) obj;
        arrayList2.clear();
        if (j3Var != null) {
            arrayList2.add(j3Var);
        }
        java.util.Iterator it6 = itemList.iterator();
        while (it6.hasNext()) {
            ol2.c cVar = (ol2.c) it6.next();
            java.lang.String str2 = cVar.f427678a;
            java.lang.Integer num = cVar.f427679b;
            if (str2 != null && num != null) {
                int intValue = num.intValue();
                java.util.Iterator it7 = arrayList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    bm2.j3 j3Var3 = (bm2.j3) obj2;
                    if (j3Var3.f103539b == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j3Var3.f103538a, str2) && j3Var3.f103541d == intValue) {
                        break;
                    }
                }
                bm2.j3 j3Var4 = (bm2.j3) obj2;
                arrayList2.add(new bm2.j3(str2, 1, j3Var4 != null ? j3Var4.f103540c : 0L, intValue, cVar.f427680c));
            }
        }
        if (j3Var2 != null) {
            arrayList2.add(j3Var2);
        }
        m8146xced61ae5();
    }
}
