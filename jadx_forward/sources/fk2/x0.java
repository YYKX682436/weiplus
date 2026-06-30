package fk2;

/* loaded from: classes3.dex */
public abstract class x0 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f345044m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f345045n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f345046o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(we2.a liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f345044m = "CommentItemGiftWall";
        this.f345045n = jz5.h.b(fk2.t0.f345013d);
        this.f345046o = jz5.h.b(fk2.u0.f345023d);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        java.lang.String str = "";
        if (D instanceof r45.pi1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.pi1 pi1Var = (r45.pi1) D;
            r45.kv1 kv1Var = (r45.kv1) pi1Var.m75936x14adae67(0);
            if (kv1Var != null && (m75945x2fec83072 = kv1Var.m75945x2fec8307(0)) != null) {
                str = m75945x2fec83072;
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(pi1Var.m75945x2fec8307(1));
            java.lang.String sb7 = sb6.toString();
            holder.f3639x46306858.setTag(sb7);
            android.content.Context context2 = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            r((r45.kv1) pi1Var.m75936x14adae67(0), s(context2, pi1Var.m75945x2fec8307(1), msg, holder), holder, sb7);
        } else if (D instanceof r45.wi1) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            r45.wi1 wi1Var = (r45.wi1) D;
            r45.kv1 kv1Var2 = (r45.kv1) wi1Var.m75936x14adae67(0);
            if (kv1Var2 != null && (m75945x2fec8307 = kv1Var2.m75945x2fec8307(0)) != null) {
                str = m75945x2fec8307;
            }
            sb8.append(str);
            sb8.append('_');
            sb8.append(wi1Var.m75945x2fec8307(1));
            java.lang.String sb9 = sb8.toString();
            holder.f3639x46306858.setTag(sb9);
            android.content.Context context3 = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            r((r45.kv1) wi1Var.m75936x14adae67(0), s(context3, wi1Var.m75945x2fec8307(1), msg, holder), holder, sb9);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f345044m, "invalid type");
        }
        android.view.ViewParent parent = holder.f103460e.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) parent;
        relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.v7(msg);
    }

    public final java.lang.String q() {
        return (java.lang.String) ((jz5.n) this.f345046o).mo141623x754a37bb();
    }

    public final void r(r45.kv1 kv1Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, bm2.h1 h1Var, java.lang.String str) {
        java.lang.String str2;
        if (kv1Var == null || (str2 = kv1Var.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        android.content.Context context = h1Var.f3639x46306858.getContext();
        h1Var.f103460e.b(f0Var);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.n(str2, null, 2, null));
        fk2.w0 w0Var = new fk2.w0(h1Var, str, this, context, f0Var);
        a17.getClass();
        a17.f529406d = w0Var;
        a17.f();
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 s(android.content.Context context, java.lang.String str, dk2.zf zfVar, bm2.h1 h1Var) {
        r45.xn1 r17 = zfVar.r();
        java.util.LinkedList m75941xfb821914 = r17 != null ? r17.m75941xfb821914(11) : null;
        gm2.c1 c1Var = gm2.c1.f354853a;
        java.util.List r18 = gm2.c1.r(c1Var, m75941xfb821914, new int[]{2, 4, 6}, null, null, 4, h1Var.f103460e, null, 0, 0, null, null, 1996, null);
        java.lang.String str2 = q() + c1Var.o(r18);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2 + str + ' '));
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
            int i17 = length + 1;
            f0Var.c((android.text.style.ImageSpan) it.next(), length, i17, 33);
            length = i17;
        }
        return f0Var;
    }
}
