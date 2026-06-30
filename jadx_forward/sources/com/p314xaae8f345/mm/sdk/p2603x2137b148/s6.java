package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class s6 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 f274501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274503c;

    public s6(com.p314xaae8f345.mm.sdk.p2603x2137b148.y6 y6Var, java.lang.String str, android.content.Context context) {
        this.f274501a = y6Var;
        this.f274502b = str;
        this.f274503c = context;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void a(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        java.lang.String str = "/" + this.f274503c.getPackageName() + "/";
        java.lang.String str2 = this.f274502b;
        if (str2.contains(str)) {
            b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z6(str2));
        } else {
            super.a(a7Var);
            this.f274501a.a(a7Var);
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.y6
    public void b(com.p314xaae8f345.mm.sdk.p2603x2137b148.a7 a7Var) {
        this.f274501a.b(a7Var);
    }
}
