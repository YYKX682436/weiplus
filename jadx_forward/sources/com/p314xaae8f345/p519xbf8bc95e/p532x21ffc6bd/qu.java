package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f132601a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f132602b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f132603c;

    public qu(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar, java.lang.String str) {
        this.f132603c = bdVar;
        if (str == null) {
            this.f132601a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        } else {
            this.f132601a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(context, str);
        }
        if (!a()) {
            bdVar.i().c(false);
        } else {
            this.f132602b = this.f132601a.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.E);
            bdVar.i().c(this.f132602b);
        }
    }

    public static boolean a() {
        java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
        return (strArr == null || strArr.length == 0) ? false : true;
    }

    private void b() {
        if (!a()) {
            this.f132603c.i().c(false);
        } else {
            this.f132602b = this.f132601a.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.E);
            this.f132603c.i().c(this.f132602b);
        }
    }

    private void a(boolean z17) {
        if (a()) {
            this.f132602b = z17;
            this.f132601a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.E, z17);
            this.f132603c.i().c(this.f132602b);
            return;
        }
        this.f132603c.i().c(false);
    }
}
