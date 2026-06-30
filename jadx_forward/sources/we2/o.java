package we2;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: i, reason: collision with root package name */
    public static final we2.i f526769i = new we2.i(null);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f526770j = jz5.h.b(we2.h.f526761d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f526771k = jz5.h.b(we2.g.f526760d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f526772l;

    /* renamed from: a, reason: collision with root package name */
    public final we2.a f526773a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f526774b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f526775c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f526776d;

    /* renamed from: e, reason: collision with root package name */
    public final int f526777e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.style.ForegroundColorSpan f526778f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f526779g;

    /* renamed from: h, reason: collision with root package name */
    public final int f526780h;

    static {
        jz5.h.b(we2.f.f526759d);
        f526772l = jz5.h.b(we2.e.f526758d);
    }

    public o(we2.a commentItemDependency) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
        this.f526773a = commentItemDependency;
        this.f526774b = "FinderLiveCommentItem";
        this.f526775c = jz5.h.b(we2.k.f526763d);
        this.f526776d = jz5.h.b(we2.j.f526762d);
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta);
        this.f526777e = color;
        this.f526778f = new android.text.style.ForegroundColorSpan(color);
        this.f526779g = jz5.h.b(we2.n.f526768d);
        this.f526780h = zl2.r4.f555483a.w1() ? 17 : 14;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 a(android.content.Context context, java.util.List spanItemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanItemList, "spanItemList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList<we2.m> arrayList = new java.util.ArrayList();
        java.util.Iterator it = spanItemList.iterator();
        while (it.hasNext()) {
            we2.d dVar = (we2.d) it.next();
            if (dVar != null) {
                int length = sb6.length();
                sb6.append(dVar.f526755a);
                arrayList.add(new we2.m(length, sb6.length(), dVar));
            }
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, sb7)));
        for (we2.m mVar : arrayList) {
            we2.d dVar2 = mVar.f526767c;
            yz5.q qVar = dVar2.f526757c;
            int i17 = mVar.f526766b;
            int i18 = mVar.f526765a;
            if (qVar != null) {
                qVar.mo147xb9724478(f0Var, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            } else {
                java.lang.Object obj = dVar2.f526756b;
                if (obj != null) {
                    f0Var.c(obj, i18, i17, 33);
                }
            }
        }
        return f0Var;
    }

    public final java.lang.String b(java.lang.String anchorTag, java.util.List list, java.lang.String userTag, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorTag, "anchorTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userTag, "userTag");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (anchorTag.length() > 0) {
            sb6.append(anchorTag);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("anchorTag:");
            sb7.append(anchorTag);
            sb7.append(',');
        }
        int size = list != null ? list.size() : 0;
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append(" ");
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("badgeSpanSize:");
        sb8.append(size);
        sb8.append(',');
        sb6.append(userTag);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("userTag:");
        sb9.append(userTag);
        sb9.append(',');
        sb6.append(str == null ? "" : str);
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("content:");
        sb10.append(str);
        sb10.append('!');
        java.lang.String sb11 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb11, "toString(...)");
        zl2.r4.f555483a.M2(this.f526774b, "#createTextMsg result=".concat(sb11));
        return sb11;
    }

    public yz5.l c(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return null;
    }

    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#fillItem name=");
        sb6.append(msg.k());
        sb6.append(" content=");
        sb6.append(msg.j());
        sb6.append(" badge=");
        r45.xn1 r17 = msg.r();
        if (r17 != null && (m75941xfb821914 = r17.m75941xfb821914(11)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                sb6.append(java.lang.String.valueOf(((r45.yl1) it.next()).m75939xb282bd08(0)));
                sb6.append("|");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f526774b, sb6.toString());
        holder.f103460e.m84185x3abfd950(this.f526780h);
    }

    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return null;
    }

    public dk2.zf f(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return null;
    }

    public final java.lang.String g() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final gm2.i1 h() {
        int i17 = gm2.i1.f354944f;
        gm2.e1 e1Var = new gm2.e1();
        e1Var.f354891a.f354915m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
        e1Var.f354891a.f354905c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        e1Var.f((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1));
        e1Var.c((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
        e1Var.e(i());
        return e1Var.a();
    }

    public final java.lang.String i() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public final al5.w j() {
        return (al5.w) ((jz5.n) this.f526779g).mo141623x754a37bb();
    }

    public final gm2.i1 k(int i17) {
        int i18 = gm2.i1.f354944f;
        gm2.e1 e1Var = new gm2.e1();
        e1Var.f354891a.f354905c = android.graphics.Color.parseColor("#B4ECCE");
        e1Var.f((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561321f9));
        e1Var.c((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oub);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        e1Var.e(string);
        gm2.h1 h1Var = e1Var.f354891a;
        h1Var.f354911i = 0;
        h1Var.f354920r = i17;
        return e1Var.a();
    }

    public final boolean l() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null) {
            return c1Var.D3;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r7 == null || r7.length() == 0) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(bm2.h1 r5, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            zl2.a r0 = zl2.a.f555165a
            r1 = 0
            r2 = 0
            android.widget.ImageView r5 = r5.f103468p
            if (r6 == 0) goto L30
            if (r7 != 0) goto L23
            java.lang.String r7 = r6.m76175x6d346f39()
            r3 = 1
            if (r7 == 0) goto L1f
            int r7 = r7.length()
            if (r7 != 0) goto L1d
            goto L1f
        L1d:
            r7 = r1
            goto L20
        L1f:
            r7 = r3
        L20:
            if (r7 != 0) goto L23
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L27
            goto L28
        L27:
            r6 = r2
        L28:
            if (r6 == 0) goto L30
            r0.a(r5, r6)
            jz5.f0 r6 = jz5.f0.f384359a
            goto L31
        L30:
            r6 = r2
        L31:
            if (r6 != 0) goto L36
            r0.a(r5, r2)
        L36:
            r5.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we2.o.m(bm2.h1, com.tencent.mm.protocal.protobuf.FinderContact, boolean):void");
    }

    public abstract int n();

    public void o() {
    }

    public void p(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
    }
}
