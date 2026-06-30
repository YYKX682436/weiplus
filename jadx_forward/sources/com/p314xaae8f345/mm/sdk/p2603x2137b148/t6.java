package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class t6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 f274518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274520c;

    public t6(com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var, java.lang.String str, android.content.Context context) {
        this.f274518a = y6Var;
        this.f274519b = str;
        this.f274520c = context;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        java.lang.String str = "/" + this.f274520c.getPackageName() + "/";
        java.lang.String str2 = this.f274519b;
        if (str2.contains(str)) {
            b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z6(str2));
        } else {
            super.a(a7Var);
            this.f274518a.a(a7Var);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        this.f274518a.b(a7Var);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public boolean c() {
        return true;
    }
}
