package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 f235479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 j0Var) {
        super(1);
        this.f235479d = j0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 j0Var = this.f235479d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 U6 = j0Var.U6();
        if (U6 != null) {
            java.util.List list = j0Var.f235464s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                java.lang.String str = ((mr3.l) it6.next()).f412412h;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            int indexOf = arrayList2.indexOf(it.f412412h);
            if (indexOf >= 0 && !arrayList2.isEmpty()) {
                if (arrayList2.size() <= indexOf) {
                    indexOf = arrayList2.size() - 1;
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = j0Var.m158354x19263085();
                boolean Y6 = j0Var.Y6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "Contact remark image: " + U6.f318124z1 + ", path: " + kz5.n0.g0(arrayList2, ", ", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.j2.f235040d, 30, null));
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901.class);
                intent.putExtra("Contact_User", U6.d1());
                intent.putExtra("remark_image_path", arrayList2);
                intent.putExtra("selected_item", indexOf);
                intent.putExtra("view_only", Y6);
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                pf5.j0.a(intent2, fi5.h.class);
                if (Y6) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent2);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList4.add(400);
                    arrayList4.add(intent2);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.k(context, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/storage/Contact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
