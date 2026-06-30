package s72;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f485515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f485516b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f485517c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f485518d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f485519e;

    public a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f485515a = i17;
        this.f485516b = i18;
        this.f485517c = str;
        this.f485518d = v0Var;
        this.f485519e = bArr;
    }

    /* renamed from: equals */
    public boolean m164047xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s72.a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.sync.FavSyncRequestWrapper.CgiResult");
        s72.a aVar = (s72.a) obj;
        return this.f485515a == aVar.f485515a && this.f485516b == aVar.f485516b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f485517c, aVar.f485517c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f485518d, aVar.f485518d) && java.util.Arrays.equals(this.f485519e, aVar.f485519e);
    }

    /* renamed from: hashCode */
    public int m164048x8cdac1b() {
        int i17 = ((this.f485515a * 31) + this.f485516b) * 31;
        java.lang.String str = this.f485517c;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = this.f485518d;
        return ((hashCode + (v0Var != null ? v0Var.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f485519e);
    }

    /* renamed from: toString */
    public java.lang.String m164049x9616526c() {
        return "CgiResult(errType=" + this.f485515a + ", errCode=" + this.f485516b + ", errMsg=" + this.f485517c + ", rr=" + this.f485518d + ", cookie=" + java.util.Arrays.toString(this.f485519e) + ')';
    }
}
