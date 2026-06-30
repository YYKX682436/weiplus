package kr5;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f393069a = 5;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f393070b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f393071c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f393072d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f393073e = 2000;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f393074f = "DesHttp";

    /* renamed from: g, reason: collision with root package name */
    public int f393075g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f393076h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f393077i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f393078j = false;

    public kr5.g a() {
        if (android.text.TextUtils.isEmpty(this.f393071c)) {
            throw new java.lang.IllegalArgumentException("dnsId".concat(" can not be empty"));
        }
        if (this.f393074f != "Https" && android.text.TextUtils.isEmpty(this.f393072d)) {
            throw new java.lang.IllegalArgumentException("dnsKey".concat(" can not be empty"));
        }
        if (this.f393074f == "Https" && android.text.TextUtils.isEmpty("")) {
            throw new java.lang.IllegalArgumentException("token".concat(" can not be empty"));
        }
        return new kr5.g(this.f393069a, this.f393070b, "", false, this.f393071c, this.f393072d, "", this.f393073e, null, null, true, null, null, this.f393074f, false, false, this.f393075g, null, null, this.f393076h, null, this.f393077i, this.f393078j, "", java.lang.Boolean.FALSE, null);
    }

    public synchronized kr5.f b(or5.c cVar) {
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("logNode".concat(" can not be null"));
        }
        if (this.f393076h == null) {
            this.f393076h = new java.util.ArrayList();
        }
        this.f393076h.add(cVar);
        return this;
    }
}
