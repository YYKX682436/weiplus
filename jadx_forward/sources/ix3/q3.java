package ix3;

/* loaded from: classes5.dex */
public final class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f377069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.s3 f377070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f377071f;

    public q3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ix3.s3 s3Var, l15.c cVar) {
        this.f377069d = f9Var;
        this.f377070e = s3Var;
        this.f377071f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f377069d;
        if (f9Var != null) {
            ix3.s3 s3Var = this.f377070e;
            em.j3 T6 = s3Var.T6();
            if (T6.f336006b == null) {
                T6.f336006b = (android.widget.EditText) T6.f336005a.findViewById(com.p314xaae8f345.mm.R.id.f569017vk2);
            }
            java.lang.Integer h17 = r26.h0.h(T6.f336006b.getText().toString());
            if (h17 == null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = s3Var.m158354x19263085();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
                e4Var.f293309c = "请输入有效的type值";
                e4Var.c();
                yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int intValue = h17.intValue();
            l15.c cVar = this.f377071f;
            v05.b k17 = cVar.k();
            if (k17 != null) {
                k17.set(k17.f449898d + 6, java.lang.Integer.valueOf(intValue));
            }
            f9Var.d1(cVar.m126747x696739c());
            pt0.f0.f439742b1.s(f9Var.Q0(), f9Var.m124847x74d37ac6(), f9Var);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = s3Var.m158354x19263085();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x192630852);
            e4Var2.f293309c = "appMsg type 已修改为 " + intValue;
            e4Var2.c();
            em.j3 T62 = s3Var.T6();
            if (T62.f336007c == null) {
                T62.f336007c = (android.widget.TextView) T62.f336005a.findViewById(com.p314xaae8f345.mm.R.id.t2a);
            }
            T62.f336007c.setText(java.lang.String.valueOf(intValue));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerMsgTypeDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
