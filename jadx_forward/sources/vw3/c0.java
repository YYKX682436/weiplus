package vw3;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f522437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f522438f;

    public c0(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        this.f522436d = str;
        this.f522437e = z3Var;
        this.f522438f = a3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n                username:");
        java.lang.String str = this.f522436d;
        sb6.append(str);
        sb6.append("\n                nickname:");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f522437e;
        sb6.append(z3Var.P0());
        sb6.append("\n                remark:");
        sb6.append(z3Var.f318122y1);
        sb6.append("\n                type:");
        sb6.append(java.lang.Integer.toBinaryString(z3Var.m124896xfb85f7b0()));
        sb6.append("\n                memberCount:");
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f522438f;
        sb6.append(a3Var.f69098xbcb1bed0);
        sb6.append("\n                memberStatus:");
        sb6.append(java.lang.Integer.toBinaryString(a3Var.f69084x8729abea));
        sb6.append("\n                memberFlag:");
        sb6.append(java.lang.Integer.toBinaryString(a3Var.f69086x7ba563ee));
        sb6.append("\n                memberList:");
        sb6.append(a3Var.f69099x6941929d);
        sb6.append("\n            ");
        java.lang.String b17 = r26.b0.b(sb6.toString());
        java.lang.String format = java.lang.String.format("chatroom_info_%s_%s.txt", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Long.valueOf(c01.id.c())}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
        byte[] bytes = b17.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        ((zc0.h) i1Var).aj(format, bytes, true);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerChatroomDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
