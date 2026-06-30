package k91;

/* loaded from: classes4.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f387238e;

    public o4(k91.m4 m4Var, java.lang.String str, java.lang.String str2) {
        this.f387237d = str;
        this.f387238e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k91.r1.b(this.f387238e, k91.h3.a(new org.json.JSONObject(this.f387237d)).f467736d, true);
        } catch (java.lang.Exception unused) {
        }
    }
}
