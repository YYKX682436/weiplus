package oc5;

/* loaded from: classes12.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f426027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 f426028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(oc5.g0 g0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
        super(0);
        this.f426027d = g0Var;
        this.f426028e = c5886xd11a0be7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oc5.g0 g0Var = this.f426027d;
        g0Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = this.f426028e;
        java.lang.String str = c5886xd11a0be7.f136194g.f87901a;
        if (str == null) {
            str = "";
        }
        java.util.HashMap hashMap = g0Var.f425954e;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(str);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pm0.v.X(new oc5.c0((oc5.n) it.next(), c5886xd11a0be7));
            }
        }
        oc5.t tVar = (oc5.t) g0Var.f425953d.remove(str);
        if (tVar != null) {
            g0Var.e(tVar);
        } else {
            tVar = null;
        }
        hashMap.remove(str);
        if (g0Var.a(tVar)) {
            java.util.HashMap hashMap2 = g0Var.f425955f;
            oc5.u uVar = (oc5.u) hashMap2.get(str);
            if (uVar == null) {
                oc5.u uVar2 = new oc5.u();
                uVar2.f426016a = c5886xd11a0be7;
                uVar2.f426017b = null;
                uVar2.f426018c = true;
                hashMap2.put(str, uVar2);
            } else {
                uVar.f426016a = c5886xd11a0be7;
                uVar.f426017b = null;
                uVar.f426018c = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
