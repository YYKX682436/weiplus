package fk2;

/* loaded from: classes3.dex */
public final class s0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f345002m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f345003n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f345004o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(we2.a liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f345002m = "CommentItemGiftFunding";
        this.f345003n = jz5.h.b(fk2.o0.f344975d);
        this.f345004o = jz5.h.b(fk2.p0.f344983d);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        boolean z17 = D instanceof r45.di1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        if (z17) {
            android.view.View view = holder.f3639x46306858;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.di1 di1Var = (r45.di1) D;
            sb6.append(di1Var.m75945x2fec8307(0));
            sb6.append('_');
            sb6.append(di1Var.m75945x2fec8307(1));
            sb6.append('_');
            sb6.append(di1Var.m75939xb282bd08(2));
            view.setTag(sb6.toString());
            android.content.Context context2 = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.String m75945x2fec8307 = di1Var.m75945x2fec8307(1);
            int m75939xb282bd08 = di1Var.m75939xb282bd08(2);
            r45.xn1 r17 = msg.r();
            java.util.LinkedList m75941xfb821914 = r17 != null ? r17.m75941xfb821914(11) : null;
            gm2.c1 c1Var = gm2.c1.f354853a;
            java.util.List r18 = gm2.c1.r(c1Var, m75941xfb821914, new int[]{2, 4, 6}, null, null, 4, holder.f103460e, null, 0, 0, null, null, 1996, null);
            java.lang.String str2 = q() + c1Var.o(r18);
            if (m75939xb282bd08 == 1) {
                str = str2 + m75945x2fec8307 + ' ';
            } else {
                str = str2 + ' ' + m75945x2fec8307;
            }
            jz5.l lVar = m75939xb282bd08 == 1 ? new jz5.l(java.lang.Integer.valueOf(str.length() - 1), java.lang.Integer.valueOf(str.length())) : new jz5.l(java.lang.Integer.valueOf(str2.length()), java.lang.Integer.valueOf(str2.length() + 1));
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, str));
            gm2.u uVar = gm2.v.f355031f;
            java.lang.String q17 = q();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "<get-giftStr>(...)");
            android.graphics.drawable.Drawable a17 = gm2.u.a(uVar, q17, 0.0f, 0.0f, 6, null);
            java.lang.String q18 = q();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q18, "<get-giftStr>(...)");
            float f17 = gm2.w.f355044k;
            f0Var.b(new gm2.v(a17, new gm2.w(q18, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0), gm2.w.f355043j, 0.0f, 128, null)), q(), 0, 33);
            int length = q().length();
            java.util.Iterator it = r18.iterator();
            while (it.hasNext()) {
                int i18 = length + 1;
                f0Var.c((android.text.style.ImageSpan) it.next(), length, i18, 33);
                length = i18;
            }
            java.lang.String m75945x2fec83072 = di1Var.m75945x2fec8307(0);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            ce2.i iVar = (ce2.i) dk2.u7.f315718e.get(m75945x2fec83072);
            java.lang.String str3 = iVar != null ? iVar.f67819x7194d06c : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            android.content.Context context3 = holder.f3639x46306858.getContext();
            c22624x85d69039.b(f0Var);
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.n(str4, null, 2, null));
            a18.f529406d = new fk2.r0(di1Var, holder, this, context3, lVar, f0Var);
            a18.f();
            holder.f103462g.setBackground(context3.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345002m, "invalid type");
        }
        android.view.ViewParent parent = c22624x85d69039.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new fk2.j3(msg);
    }

    @Override // we2.o
    public int n() {
        return 20098;
    }

    public final java.lang.String q() {
        return (java.lang.String) ((jz5.n) this.f345004o).mo141623x754a37bb();
    }
}
