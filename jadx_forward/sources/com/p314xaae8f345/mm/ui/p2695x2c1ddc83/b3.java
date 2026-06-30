package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public android.animation.ValueAnimator f288992a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f288993b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.drawable.ColorDrawable f288994c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f288995d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f288996e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 f288997f;

    public final void a(java.lang.String username, android.view.View view, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 x2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f288993b = username;
        this.f288995d = view;
        this.f288997f = x2Var;
        int color = view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        int color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.f560849vw);
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            color2 = view.getContext().getResources().getColor((x2Var == null || !x2Var.a()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560392j5 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560368ik);
        }
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.p314xaae8f345.mm.ui.uk.b(color, color2));
        this.f288994c = colorDrawable;
        view.setBackground(colorDrawable);
    }

    public final void b(int i17) {
        if (!((this.f288993b == null && this.f288995d == null) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationClickStatusController", "[requestDismissClickStatus] pass!");
            return;
        }
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
        t0Var.getClass();
        t0Var.z(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a3(this), i17, false);
    }

    public final void c(yf5.n holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String str = this.f288993b;
        if (str != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, holder.f543459m) && (this.f288996e == null || this.f288995d == holder.f543463q)) {
            holder.f543463q.setBackground(this.f288994c);
            this.f288995d = holder.f543463q;
        } else if (holder.f543460n) {
            holder.f543463q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
        } else {
            holder.f543463q.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562862qp);
        }
    }
}
