package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class m8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(in5.s0 s0Var) {
        super(1);
        this.f185512d = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Intent i17 = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "i");
        i17.putExtra("keyFromSource", 2);
        in5.s0 s0Var = this.f185512d;
        i17.setClass(s0Var.f374654e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13981x5704e39f.class);
        android.content.Context context = s0Var.f374654e;
        if (context != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(i17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/convert/FinderFeedFriendLikeConvert$onBindViewHolder$1$1", "invoke", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
