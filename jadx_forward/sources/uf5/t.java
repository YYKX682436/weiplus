package uf5;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f508831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uf5.x xVar) {
        super(2);
        this.f508831d = xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List dialogAllList = (java.util.List) obj;
        java.util.Set dialogCheckedSet = (java.util.Set) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogAllList, "dialogAllList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogCheckedSet, "dialogCheckedSet");
        j75.f Q6 = this.f508831d.Q6();
        if (Q6 != null) {
            Q6.B3(new uf5.c2(dialogAllList, dialogCheckedSet));
        }
        return jz5.f0.f384359a;
    }
}
