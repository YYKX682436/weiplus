package y12;

/* loaded from: classes9.dex */
public abstract class k {
    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_title", str);
        intent.putExtra("KContentObjDesc", str2);
        intent.putExtra("Ksnsupload_imgurl", str3);
        intent.putExtra("Ksnsupload_link", str4);
        intent.putExtra("KUploadProduct_UserData", str5);
        intent.putExtra("Ksnsupload_type", i17);
        java.lang.String a17 = c01.n2.a("emoje_stroe");
        c01.n2.d().c(a17, true).i("prePublishId", "emoje_stroe");
        intent.putExtra("reportSessionId", a17);
        j45.l.k(context, "sns", ".ui.SnsUploadUI", intent, false);
    }
}
