package r14;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f450147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r14.y yVar) {
        super(1);
        this.f450147d = yVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        byte[] bArr;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f450147d.f450166a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.net.Uri b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(context, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(it)));
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQShareUtil", "shareToQQ() called ".concat(it));
        } else {
            context.grantUriPermission("com.tencent.mobileqq", b17, 1);
            java.lang.String uri = b17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "toString(...)");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uri)) {
                try {
                    java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                    bArr = uri.getBytes(forName);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                } catch (java.io.UnsupportedEncodingException e17) {
                    byte[] bytes = uri.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQShareUtil", "getBytes fail, throw : %s", e17.getMessage());
                    bArr = bytes;
                }
                uri = android.util.Base64.encodeToString(bArr, 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uri, "encodeToString(...)");
            }
            java.lang.String format = java.lang.String.format("mqqapi://share/to_fri?file_type=news&share_id=1103188687&file_uri=%s&app_name=5b6u5L+h&req_type=NQ==", java.util.Arrays.copyOf(new java.lang.Object[]{uri}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(format));
            intent.putExtra("pkg_name", "com.tencent.mm");
            intent.setFlags(268435456);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(context, intent, true, false)) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQQ", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/utils/QQShareUtil", "shareToQQ", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (android.content.ActivityNotFoundException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QQShareUtil", e18, "", new java.lang.Object[0]);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
