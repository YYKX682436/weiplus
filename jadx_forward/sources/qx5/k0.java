package qx5;

/* loaded from: classes12.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f449031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449034g;

    public k0(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f449031d = c27816xac2547f9;
        this.f449032e = str;
        this.f449033f = str2;
        this.f449034g = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f449032e;
        by5.f4.c(str, this.f449033f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        java.lang.String str3 = this.f449034g;
        sb6.append(str3.substring(0, str3.lastIndexOf(".zip")));
        sb6.append(str2);
        sb6.append("main.html");
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("XWebSavePageHelper", "loadSavedPage, htmlPath:" + sb7);
        this.f449031d.mo32265x141096a9("file://" + sb7);
    }
}
