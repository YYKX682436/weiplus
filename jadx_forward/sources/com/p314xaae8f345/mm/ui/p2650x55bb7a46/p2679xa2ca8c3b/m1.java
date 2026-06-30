package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c3 f286076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f286077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk5.l7 f286078f;

    public m1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c3 c3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, dk5.l7 l7Var) {
        this.f286076d = c3Var;
        this.f286077e = k0Var;
        this.f286078f = l7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsg", "introduce View click confirm!");
        this.f286076d.f285220a = true;
        this.f286077e.u();
        dk5.l7 l7Var = this.f286078f;
        if (l7Var != null) {
            l7Var.a();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
