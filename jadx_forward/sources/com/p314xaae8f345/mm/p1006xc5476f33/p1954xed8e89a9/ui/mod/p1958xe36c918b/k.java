package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 f235620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 i0Var) {
        super(1);
        this.f235620d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.i0 i0Var = this.f235620d;
        com.p314xaae8f345.mm.p670x38b72420.o U6 = i0Var.U6();
        if (U6 != null) {
            java.util.List list = i0Var.f235605s;
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
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = i0Var.m158354x19263085();
                boolean X6 = i0Var.X6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Contact remark image: ");
                yq3.v vVar = (yq3.v) U6;
                sb6.append((java.lang.String) vVar.f546085w.a(vVar, yq3.v.f546062z[4]));
                sb6.append(", path: ");
                sb6.append(kz5.n0.g0(arrayList2, ", ", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.k2.f235046d, 30, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901.class);
                intent.putExtra("Contact_User", vVar.h());
                intent.putExtra("remark_image_path", arrayList2);
                intent.putExtra("selected_item", indexOf);
                intent.putExtra("view_only", X6);
                android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    intent2.putExtras(extras);
                }
                pf5.j0.a(intent2, fi5.h.class);
                if (X6) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent2);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/contact/IWxContact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/contact/IWxContact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList4.add(400);
                    arrayList4.add(intent2);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.k(context, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ProfileUtilsKt", "jumpToImageGallery", "(Lcom/tencent/mm/contact/IWxContact;Landroid/content/Context;ILjava/util/ArrayList;Z)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
