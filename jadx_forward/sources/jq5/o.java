package jq5;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final jq5.o f382816a = new jq5.o();

    public final java.lang.String a(android.content.Context context, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i19 > 0) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsk, java.lang.Integer.valueOf(i19));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        if (i17 > 0 && i18 > 0) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nso, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 > 0) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nss, java.lang.Integer.valueOf(i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            return string3;
        }
        if (i18 <= 0) {
            return "";
        }
        java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nzf, java.lang.Integer.valueOf(i18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        return string4;
    }

    public final void b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            intent.setDataAndType(android.net.Uri.fromFile(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS)), "resource/folder");
        } else {
            intent.setDataAndType(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI, "vnd.android.document/directory");
        }
        intent.setFlags(268435456);
        intent.addFlags(1);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/utils/WeDropUtils", "goToDownload", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropUtils", "goToDownload", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.WeDropUtils", "goToDownload: " + e17);
        }
    }

    public final void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("vnd.android.cursor.dir/image");
        intent.addFlags(268435456);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/utils/WeDropUtils", "goToSystemAlbum", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropUtils", "goToSystemAlbum", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.WeDropUtils", "goToSystemAlbum use image/*");
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.PICK");
            intent2.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            intent2.setType("image/*");
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/wedrop/utils/WeDropUtils", "goToSystemAlbum", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropUtils", "goToSystemAlbum", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeDrop.WeDropUtils", "open album fail: " + e17.getMessage());
            }
        }
    }
}
