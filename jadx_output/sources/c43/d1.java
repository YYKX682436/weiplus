package c43;

/* loaded from: classes2.dex */
public final class d1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38414e;

    public d1(java.lang.String str, java.lang.String str2) {
        this.f38413d = str;
        this.f38414e = str2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            c43.e1.f38420a.put(new jz5.l(this.f38413d, this.f38414e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return 0;
        }
        db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        return 0;
    }
}
