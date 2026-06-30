package pk2;

/* loaded from: classes3.dex */
public final class x8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(pk2.o9 o9Var, int i17) {
        super(1);
        this.f437907d = o9Var;
        this.f437908e = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [pk2.o9] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Bundle, android.os.BaseBundle] */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ?? r27;
        java.util.List list = (java.util.List) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            r27 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (r26.i0.o((java.lang.String) obj2, "@chatroom", false, 2, null)) {
                    r27.add(obj2);
                }
            }
        } else {
            r27 = kz5.p0.f395529d;
        }
        arrayList.addAll(r27);
        if (!arrayList.isEmpty()) {
            qo0.b bVar = qo0.b.Z4;
            ?? bundle = new android.os.Bundle();
            bundle.putInt("requestCode", this.f437908e);
            bundle.putBoolean("is_share_success", kz5.n0.Z(arrayList) != null);
            bundle.putStringArrayList("current_group_select", arrayList);
            this.f437907d.j(bVar, bundle);
        }
        return jz5.f0.f384359a;
    }
}
