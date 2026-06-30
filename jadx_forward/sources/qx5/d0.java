package qx5;

/* loaded from: classes13.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.e0 f449021d;

    public d0(qx5.e0 e0Var) {
        this.f449021d = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qx5.e0 e0Var = this.f449021d;
        android.content.Context mo161096x76847179 = e0Var.f449022d.mo161096x76847179();
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = e0Var.f449022d.f449070c;
        java.io.File externalCacheDir = mo161096x76847179.getExternalCacheDir();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(externalCacheDir.getAbsolutePath());
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append("xweb_dump");
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.io.File file = new java.io.File(sb7);
        if (!file.exists()) {
            file.mkdir();
        }
        java.util.Date date = new java.util.Date();
        java.lang.String str2 = sb7 + new java.text.SimpleDateFormat("yyyy-MM-dd-HH_mm_ss").format(date);
        java.io.File file2 = new java.io.File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        java.lang.String str3 = str2 + str + "main.html";
        java.lang.String str4 = str2 + str + "resource";
        if (c27816xac2547f9 != null) {
            boolean mo120174x847491ac = c27816xac2547f9.mo120174x847491ac(str3, str4, 1);
            by5.c4.f("XWebSavePageHelper", "savePage, result:" + mo120174x847491ac + ", mainFile:" + str3);
            if (!mo120174x847491ac) {
                return;
            }
        }
        yu5.c.a(new qx5.i0(str2));
    }
}
