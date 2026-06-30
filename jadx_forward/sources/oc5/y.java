package oc5;

/* loaded from: classes12.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f426025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 f426026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(oc5.g0 g0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
        super(0);
        this.f426025d = g0Var;
        this.f426026e = c5885x60bd3c7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oc5.g0 g0Var = this.f426025d;
        g0Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7 = this.f426026e;
        java.lang.String str = c5885x60bd3c7.f136193g.f87811a;
        if (str == null) {
            str = "";
        }
        oc5.t tVar = (oc5.t) g0Var.f425953d.remove(str);
        if (tVar != null) {
            g0Var.e(tVar);
            c5885x60bd3c7.f136193g.getClass();
        } else {
            tVar = null;
        }
        java.util.HashMap hashMap = g0Var.f425954e;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(str);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pm0.v.X(new oc5.b0((oc5.n) it.next(), c5885x60bd3c7));
            }
        }
        hashMap.remove(str);
        if (g0Var.a(tVar)) {
            java.util.HashMap hashMap2 = g0Var.f425955f;
            oc5.u uVar = (oc5.u) hashMap2.get(str);
            if (uVar == null) {
                oc5.u uVar2 = new oc5.u();
                uVar2.f426017b = c5885x60bd3c7;
                uVar2.f426016a = null;
                uVar2.f426018c = false;
                hashMap2.put(str, uVar2);
            } else {
                uVar.f426017b = c5885x60bd3c7;
                uVar.f426016a = null;
                uVar.f426018c = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
