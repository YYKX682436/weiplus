package vw3;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        super(1);
        this.f522686d = repairerBlockDetectUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ix3.p0 state = (ix3.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof ix3.h0)) {
            ix3.h0 h0Var = (ix3.h0) dVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("时间点: ");
            sb7.append(h0Var.f376962b.f376953e.f376904a);
            sb7.append('(');
            ix3.g0 g0Var = h0Var.f376962b;
            sb7.append(k35.m1.e(g0Var.f376953e.f376904a));
            sb7.append(")\n");
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Block时间: ");
            ix3.c cVar = g0Var.f376953e;
            sb8.append(cVar.f376905b);
            sb8.append("ms\n");
            sb6.append(sb8.toString());
            sb6.append("堆栈:\n");
            for (java.lang.StackTraceElement stackTraceElement : cVar.f376906c) {
                sb6.append("    ");
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = this.f522686d;
            android.content.Intent intent = new android.content.Intent(repairerBlockDetectUI.mo55332x76847179(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI.class);
            pf5.j0.a(intent, ix3.e0.class);
            intent.putExtra("TraceInfo", sb6.toString());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = repairerBlockDetectUI.mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$5", "invoke", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerBlockDetectState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$5", "invoke", "(Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerBlockDetectState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
