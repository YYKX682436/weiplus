package jf2;

/* loaded from: classes3.dex */
public final class t implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f380929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jf2.u f380930e;

    public t(java.util.List list, jf2.u uVar, java.lang.String str) {
        this.f380929d = list;
        this.f380930e = uVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        jf2.h hVar = (jf2.h) obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.mo58036x368f3a());
        java.util.List list = this.f380929d;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list.indexOf(valueOf));
        if (!(valueOf2.intValue() >= 0)) {
            valueOf2 = null;
        }
        int intValue = valueOf2 != null ? valueOf2.intValue() : Integer.MAX_VALUE;
        jf2.u uVar = this.f380930e;
        java.lang.String str = uVar.f380931m;
        hVar.mo58036x368f3a();
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue);
        jf2.h hVar2 = (jf2.h) obj2;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(list.indexOf(java.lang.Integer.valueOf(hVar2.mo58036x368f3a())));
        java.lang.Integer num = valueOf4.intValue() >= 0 ? valueOf4 : null;
        int intValue2 = num != null ? num.intValue() : Integer.MAX_VALUE;
        java.lang.String str2 = uVar.f380931m;
        hVar2.mo58036x368f3a();
        return mz5.a.b(valueOf3, java.lang.Integer.valueOf(intValue2));
    }
}
