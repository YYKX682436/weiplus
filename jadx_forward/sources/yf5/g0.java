package yf5;

/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f543409a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f543410b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.ColorStateList[] f543411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f543412d;

    /* renamed from: e, reason: collision with root package name */
    public final int f543413e;

    /* renamed from: f, reason: collision with root package name */
    public final float f543414f;

    /* renamed from: g, reason: collision with root package name */
    public final float f543415g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f543416h;

    /* renamed from: i, reason: collision with root package name */
    public final db5.v8 f543417i;

    public g0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f543409a = context;
        this.f543410b = "MicroMsg.ConversationAdapter.ConversationItemBuilder";
        this.f543411c = r0;
        this.f543414f = -1.0f;
        this.f543415g = -1.0f;
        android.content.res.ColorStateList[] colorStateListArr = {i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk), i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31), i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c), i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk)};
        if (i65.a.E(context)) {
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561150as);
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else if (i65.a.D(context)) {
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561149ar);
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561151at);
        } else {
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561148aq);
            context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561152au);
        }
        this.f543412d = (int) (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9) + 0.5f);
        this.f543413e = (int) (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561405hl) + 0.5f);
        this.f543414f = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        this.f543415g = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9);
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80020xba5d8e3b, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560227eb));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getColorDrawable(...)");
        this.f543416h = e17;
        this.f543417i = new yf5.e0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r29, yf5.n r30, yf5.x r31, com.p314xaae8f345.mm.p2621x8fb0427b.l4 r32) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf5.g0.a(int, yf5.n, yf5.x, com.tencent.mm.storage.l4):void");
    }

    public final void b(yf5.n holder, android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        android.widget.ImageView imageView = (android.widget.ImageView) contentView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        holder.f543447a = imageView;
        imageView.getViewTreeObserver().addOnPreDrawListener(new yf5.d0(holder));
        holder.f543463q = contentView.findViewById(com.p314xaae8f345.mm.R.id.f565477cj1);
        holder.f543464r = contentView.findViewById(com.p314xaae8f345.mm.R.id.f565476cj0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) contentView.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        holder.f543448b = c21526xca364659;
        c21526xca364659.m79257x600eea91(this.f543417i);
        holder.f543449c = contentView.findViewById(com.p314xaae8f345.mm.R.id.f568816ve5);
        holder.f543450d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22361x72e80a33) contentView.findViewById(com.p314xaae8f345.mm.R.id.spo);
        holder.f543451e = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.otg);
        holder.f543452f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) contentView.findViewById(com.p314xaae8f345.mm.R.id.f567011ht5);
        holder.f543453g = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.o_u);
        holder.f543454h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) contentView.findViewById(com.p314xaae8f345.mm.R.id.h_5);
        holder.f543458l = contentView.findViewById(com.p314xaae8f345.mm.R.id.a_h);
        holder.f543455i = (android.widget.ImageView) contentView.findViewById(com.p314xaae8f345.mm.R.id.f81554int);
        holder.f543456j = (android.widget.ImageView) contentView.findViewById(com.p314xaae8f345.mm.R.id.jwh);
        holder.f543457k = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) contentView.findViewById(com.p314xaae8f345.mm.R.id.f568240m74);
        holder.f543465s = (android.widget.ImageView) contentView.findViewById(com.p314xaae8f345.mm.R.id.mj_);
        holder.f543466t = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.g_u);
        holder.f543468v = (android.widget.LinearLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.f565476cj0);
        holder.f543469w = (android.widget.LinearLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.ciy);
        android.widget.TextView textView = holder.f543453g;
        android.content.Context context = this.f543409a;
        textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(context));
        holder.f543453g.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(context));
        contentView.setTag(holder);
        contentView.setTag(com.p314xaae8f345.mm.R.id.ohu, new int[2]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder", "initViewHolder", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/conversation/adapter/ConversationItemBuilder", "initViewHolder", "(Lcom/tencent/mm/ui/conversation/adapter/ConvViewHolder;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        holder.f543452f.i(0, this.f543415g);
        holder.f543448b.i(0, this.f543414f);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca3646592 = holder.f543452f;
        android.content.res.ColorStateList[] colorStateListArr = this.f543411c;
        c21526xca3646592.m79272x1c5c5ff4(colorStateListArr[0]);
        holder.f543451e.setTextColor(colorStateListArr[4]);
        holder.f543448b.m79272x1c5c5ff4(colorStateListArr[3]);
        holder.f543452f.m79266x3b2de958(true);
        holder.f543448b.m79266x3b2de958(true);
        if (holder.f543448b.m79227x74f59ea8() != null) {
            com.p314xaae8f345.mm.ui.bk.r0(holder.f543448b.m79227x74f59ea8(), 0.1f);
        }
        holder.f543451e.setGravity(5);
    }
}
