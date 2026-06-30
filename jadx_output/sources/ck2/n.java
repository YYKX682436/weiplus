package ck2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ck2.o oVar, java.lang.String str) {
        super(0);
        this.f42431d = oVar;
        this.f42432e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.un unVar = (df2.un) this.f42431d.controller(df2.un.class);
        if (unVar != null) {
            unVar.d7(this.f42432e);
        }
        return jz5.f0.f302826a;
    }
}
