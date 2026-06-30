package ry4;

/* loaded from: classes.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(ry4.d1 d1Var) {
        super(2);
        this.f483216d = d1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 item = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ry4.d1 d1Var = this.f483216d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = d1Var.m158354x19263085();
        java.lang.String username = d1Var.f483141d;
        boolean z17 = d1Var.f483148n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        intent.putExtra("extra_username", username);
        intent.putExtra("extra_edit_item", item);
        intent.putExtra("extra_edit_position", intValue);
        intent.putExtra("extra_read_only", z17);
        pf5.j0.a(intent, ry4.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForEdit", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandEditUI", "startForEdit", "(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandItem;IZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        return jz5.f0.f384359a;
    }
}
