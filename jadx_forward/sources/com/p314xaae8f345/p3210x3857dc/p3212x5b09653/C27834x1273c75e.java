package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.XWebTraceFileListPreference */
/* loaded from: classes13.dex */
public class C27834x1273c75e extends p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839 implements qx5.m {

    /* renamed from: l1, reason: collision with root package name */
    public static final android.webkit.ValueCallback f301789l1 = new qx5.C30008x608481d();

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.String f301790y0;

    public C27834x1273c75e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61418x81f55412);
        this.f301790y0 = obtainStyledAttributes.getString(com.p314xaae8f345.p3222x9cba06de.R.C27878x6ba0728b.f61419x71e5e286);
        obtainStyledAttributes.recycle();
        this.X = new java.lang.String[0];
        this.Y = new java.lang.String[0];
    }

    @Override // qx5.m
    public qx5.a a(qx5.l lVar, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.p3210x3857dc.t0.f302127a.a()) {
            yu5.b.f547447a.a(new qx5.RunnableC30009x608481e(str));
        } else {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Need local debug permission");
        }
        return qx5.a.b();
    }

    @Override // qx5.m
    public qx5.a b(qx5.l lVar) {
        java.lang.String str = (java.lang.String) tx5.j.d(80038, new java.lang.Object[0]);
        if (android.text.TextUtils.isEmpty(str)) {
            return qx5.a.a();
        }
        java.io.File[] listFiles = new java.io.File(str).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return qx5.a.a();
        }
        java.util.Arrays.sort(listFiles, new qx5.C30010x608481f());
        java.lang.String[] strArr = new java.lang.String[listFiles.length];
        for (int i17 = 0; i17 < listFiles.length; i17++) {
            strArr[i17] = listFiles[i17].getName();
        }
        this.X = strArr;
        this.Y = strArr;
        return qx5.a.b();
    }

    @Override // qx5.m
    public java.lang.String h() {
        return this.f301790y0;
    }
}
