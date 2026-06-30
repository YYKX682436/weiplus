package m22;

/* loaded from: classes12.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m22.o f404590d;

    public m(m22.o oVar) {
        this.f404590d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m22.o oVar = this.f404590d;
        m22.p pVar = (m22.p) oVar.f404579d;
        if (pVar != null) {
            oVar.m8183xf806b362();
            m22.j jVar = (m22.j) oVar.f404592e;
            jVar.getClass();
            boolean z17 = pVar instanceof m22.l;
            android.content.Context context = jVar.f404584a;
            if (z17) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.f179372f;
                java.lang.String field_key = ((m22.l) pVar).f404588a.f68543x4b6e619a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_key, "field_key");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13318xb8345878.class);
                intent.putExtra("type", "type_list_ip_set");
                intent.putExtra("ip_set_key", field_key);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/emoji/ui/EmojiSortUI$Companion", "showIpList", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (pVar instanceof m22.k) {
                r45.qj0 qj0Var = new r45.qj0();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = ((m22.k) pVar).f404587a;
                java.lang.String str = c21051xbc71d247.f68396x5bec8145;
                qj0Var.f465565d = str;
                qj0Var.f465567f = c21051xbc71d247.f68391x4a7ba5e9;
                qj0Var.f465577s = c21051xbc71d247.f68384x3e47b329;
                qj0Var.f465575q = c21051xbc71d247.f68385x346f9696;
                qj0Var.f465568g = c21051xbc71d247.f68386x4a7729ef;
                qj0Var.f465570i = c21051xbc71d247.f68392x51cf1ab;
                qj0Var.f465571m = c21051xbc71d247.f68395x4a7eba98;
                qj0Var.f465572n = c21051xbc71d247.f68388x4a782aca;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                d22.d0 d0Var = new d22.d0(str, qj0Var, null);
                d0Var.f445731g = jVar.f404586c;
                d0Var.f445688a = jVar.f404585b;
                d22.u.f307409a.a(context, d0Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/widget/EmojiMineItemSimpleViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
