package p13;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f432626a;

    /* renamed from: b, reason: collision with root package name */
    public p13.r f432627b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f432628c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f432629d;

    /* renamed from: g, reason: collision with root package name */
    public float f432632g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f432633h;

    /* renamed from: e, reason: collision with root package name */
    public p13.g f432630e = p13.g.Foreground;

    /* renamed from: f, reason: collision with root package name */
    public int f432631f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f432634i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f432635j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f432636k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f432637l = "";

    public static final p13.i a(java.lang.CharSequence charSequence, java.lang.String str, boolean z17, boolean z18) {
        p13.i iVar = new p13.i();
        iVar.f432626a = charSequence;
        iVar.f432627b = p13.r.b(str, false);
        iVar.f432628c = z17;
        iVar.f432629d = z18;
        return iVar;
    }

    public static final p13.i b(java.lang.CharSequence charSequence, p13.r rVar) {
        p13.i iVar = new p13.i();
        iVar.f432626a = charSequence;
        iVar.f432627b = rVar;
        return iVar;
    }

    public static final p13.i c(java.lang.CharSequence charSequence, p13.r rVar, float f17, android.text.TextPaint textPaint) {
        return e(charSequence, rVar, false, false, f17, textPaint);
    }

    public static final p13.i d(java.lang.CharSequence charSequence, p13.r rVar, boolean z17, boolean z18) {
        return e(charSequence, rVar, z17, z18, 0.0f, null);
    }

    public static final p13.i e(java.lang.CharSequence charSequence, p13.r rVar, boolean z17, boolean z18, float f17, android.text.TextPaint textPaint) {
        p13.i iVar = new p13.i();
        iVar.f432626a = charSequence;
        iVar.f432627b = rVar;
        iVar.f432628c = z17;
        iVar.f432629d = z18;
        iVar.f432632g = f17;
        iVar.f432633h = textPaint;
        return iVar;
    }
}
